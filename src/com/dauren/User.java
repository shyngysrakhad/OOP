package com.dauren;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class User implements IUser{
    private int id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private ArrayList<String> friends;

    private Statement statement;
    private ResultSet result;
    private String sql;

    static User getUser(String username, String password) throws SQLException {
        if (isCorrect(username, password)){
            String sql1 = "select * from project.user where username = '" + username + "' and password = '" + password + "'";
            String sql2 = "select * from project.friends f \n" +
                    "inner join project.user u1 on f.user_id_1 = u1.id\n" +
                    "inner join project.user u2 on f.user_id_2 = u2.id where u1.username = '" + username + "'";
            Statement statement = Database.connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql1);
            String firstName = "", lastName = "";
            int id = -1;
            ArrayList<String> friends = new ArrayList<>();
            while (resultSet.next()){
                id = resultSet.getInt(1);
                firstName = resultSet.getString("firstName");
                lastName = resultSet.getString("lastName");
            }
            resultSet = statement.executeQuery(sql2);
            while (resultSet.next()){
                friends.add(resultSet.getString(11));
            }
            return new User(id, username, password, firstName, lastName, friends);
        }else
            return new User();
    }

    private User(){
        System.out.println("Username or password incorrect");
    }

    private User(int id, String username, String password, String firstName, String lastName, ArrayList<String> friends){
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.friends = friends;
        System.out.println(username + ": successfully loaded!");
    }


    public User(String username, String password, String firstName, String lastName) throws SQLException {
        if (!isExistUser(username)){
            sql = "INSERT INTO project.user (username, password, firstName, lastName) VALUES (?, ?, ?, ?);";
            PreparedStatement preparedStatement = Database.connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, firstName);
            preparedStatement.setString(4, lastName);
            preparedStatement.executeUpdate();
            result = preparedStatement.getGeneratedKeys();
            while (result.next()){
                this.id = result.getInt(1);
                this.username = username;
                this.firstName = firstName;
                this.lastName = lastName;
                this.password = password;
                this.friends = new ArrayList<>();
            }
            System.out.println(username + " is successfully created!");
        }else{
            System.out.println(username + " is already taken");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<String> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<String> friends) {
        this.friends = friends;
    }

    @Override
    public void showFriends() {
        System.out.println("The friends of " + this.username + " are following:");
        for (int i = 0; i < friends.size(); ++i){
            System.out.println((i + 1) + ") " + friends.get(i));
        }
    }

    @Override
    public void updateUsername(String username) throws SQLException {
        executeUpdate(sqlUpdate("username", username));
        System.out.println(this.username + ": Username is updated!");
        this.username = username;
    }

    @Override
    public void updatePassword(String password) throws SQLException {
        executeUpdate(sqlUpdate("password", password));
        System.out.println(this.username + ": Password is updated!");
        this.password = password;
    }

    @Override
    public void updateFirstName(String firstName) throws SQLException {
        executeUpdate(sqlUpdate("firstName", firstName));
        System.out.println(this.username + ": First name is updated!");
        this.firstName = firstName;
    }

    @Override
    public void updateLastName(String lastName) throws SQLException {
        executeUpdate(sqlUpdate("lastName", lastName));
        System.out.println(this.username + ": Last name is updated!");
        this.lastName = lastName;
    }

    @Override
    public void addFriend(User friend) throws SQLException {
        if (isFriend(friend)){
            System.out.println(this.username + " and " + friend.username + " are already friends");
        }else{
            sql = "INSERT INTO project.friends(user_id_1, user_id_2) values (" + this.id + ", " + friend.getId() + ")";
            executeUpdate(sql);
            friends.add(friend.getUsername());
            System.out.println(friend.getUsername() + " successfully added to the friends of " + this.username);
        }
    }

    @Override
    public void deleteFriend(User friend) throws SQLException {
        if (isFriend(friend)){
            sql = "DELETE FROM project.friends where user_id_1 = " + this.id + " and user_id_2 = " + friend.getId();
            executeUpdate(sql);
            friends.remove(friend.getUsername());
            System.out.println(friend.getUsername() + " is successfully deleted from the friends of " + this.username);
        }else{
            System.out.println(this.username + " and " + friend.getUsername() + " are not friends");
        }
    }

    @Override
    public boolean isExistUser(String username) throws SQLException {
        sql = "select * from project.user where username = '" + username + "'";
        statement = Database.connection.createStatement();
        result = statement.executeQuery(sql);
        return result.isBeforeFirst();
    }

    private static boolean isCorrect(String username, String password) throws SQLException {
        String sql = "select * from project.user where username = '" + username + "' and password = '" + password + "'";
        Statement statement = Database.connection.createStatement();
        ResultSet result = statement.executeQuery(sql);
        return result.isBeforeFirst();
    }

    @Override
    public boolean isFriend(User friend) throws SQLException {
        sql = "select * from project.friends f inner join project.user u " +
                "on f.user_id_1 = u.id where f.user_id_1 = " + id + " and f.user_id_2 = " + friend.getId() + "";
        statement = Database.connection.createStatement();
        result = statement.executeQuery(sql);
        return result.isBeforeFirst();
    }

    void executeUpdate(String sql) throws SQLException {
        statement = Database.connection.createStatement();
        statement.executeUpdate(sql);
    }

    private String sqlUpdate(String column, String value){
        return "UPDATE project.user set " + column + " = '" + value + "' where id = " + this.id;
    }

}
