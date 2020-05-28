package com.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class User {
    private int id;
    private String username;
    private ArrayList<String> groups;

    public User() {
        this.id = -1;
        this.username = "no user";
        this.groups = null;
    }

    public User(String username) throws SQLException {
        this.groups = new ArrayList<>();
        ResultSet result;
        if (!isExistUser(username)){
            String sql = "INSERT INTO assignment.user (username) VALUES (?);";
            PreparedStatement preparedStatement = Database.connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, username);
            preparedStatement.executeUpdate();
            result = preparedStatement.getGeneratedKeys();
            while (result.next()){
                this.id = result.getInt(1);
                this.username = username;
                this.groups = new ArrayList<>();
            }
            System.out.println(username + " is successfully created!");
        }else{
            Statement statement = Database.connection.createStatement();
            result = statement.executeQuery("select * from assignment.user where username = '" + username + "'");
            while (result.next()){
                this.id = result.getInt(1);
                this.username = username;
            }
            result = statement.executeQuery("select * from assignment.groups_users gu inner join assignment.group g " +
                    "on gu.group_id = g.id inner join assignment.user u " +
                    "on gu.user_id = u.id where u.username = '" + username + "'");
            while (result.next()){
                this.groups.add(result.getString(4));
            }
            System.out.println("Logged in as " + username);
        }
    }

    private boolean isExistUser(String username) throws SQLException {
        Statement statement = Database.connection.createStatement();
        ResultSet result = statement.executeQuery("select * from assignment.user where username = '" + username + "'");
        return result.isBeforeFirst();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public void setGroups(ArrayList<String> groups) {
        this.groups = groups;
    }

    public void joinGroup(Group group) throws SQLException {
        if (isJoined(group.getName())){
            System.out.println(username + " is already joined to " + group.getName());
        }else{
            String sql = "INSERT INTO assignment.groups_users(group_id, user_id) values (" + group.getId() + ", " + this.getId() + ")";
            Statement statement = Database.connection.createStatement();
            statement.executeUpdate(sql);
            groups.add(group.getName());
        }
    }

    private boolean isJoined(String name) throws SQLException {
        Statement statement = Database.connection.createStatement();
        ResultSet result = statement.executeQuery("select * from assignment.groups_users gu inner join assignment.group g " +
                "on gu.group_id = g.id where gu.user_id = '" + id + "' and g.name = '" + name + "'");
        return result.isBeforeFirst();
    }

    public void showGroups(){
        System.out.println("Groups of " + this.username + " are the following:");
        for (int i = 0; i < groups.size(); ++i){
            System.out.println((i + 1) + ") " + groups.get(i));
        }
    }
}
