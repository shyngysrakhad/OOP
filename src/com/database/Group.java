package com.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Group {
    private int id;
    private String name;
    private ArrayList<String> users;

    private Statement statement;
    private ResultSet result;

    public Group(){
        this.id = -1;
        this.name = "No group";
        this.users = null;
    }

    public Group(String name) throws SQLException {
        this.users = new ArrayList<>();
        if (!isExistGroup(name)){
            String sql = "INSERT INTO assignment.group (name) VALUES (?);";
            PreparedStatement preparedStatement = Database.connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, name);
            preparedStatement.executeUpdate();
            result = preparedStatement.getGeneratedKeys();
            while (result.next()){
                this.id = result.getInt(1);
                this.name = name;
                this.users = new ArrayList<>();
            }
            System.out.println(name + " is successfully created!");
        }else{
            statement = Database.connection.createStatement();
            result = statement.executeQuery("select * from assignment.group where name = '" + name + "'");
            while (result.next()){
                this.id = result.getInt(1);
                this.name = name;
            }
            result = statement.executeQuery("select * from assignment.groups_users gu inner join assignment.group g " +
                    "on gu.group_id = g.id inner join assignment.user u " +
                    "on gu.user_id = u.id where g.name = '" + name + "'");
            while (result.next()){
                this.users.add(result.getString(6));
                this.id = result.getInt(1);
                this.name = result.getString(4);
            }
            System.out.println(name + " is loaded");
        }
    }

    private boolean isExistGroup(String name) throws SQLException {
        statement = Database.connection.createStatement();
        result = statement.executeQuery("select * from assignment.group where name = '" + name + "'");
        return result.isBeforeFirst();
    }

    public ArrayList<String> getList() {
        return users;
    }

    public void setList(ArrayList<String> list) {
        this.users = list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showUsers(){
        System.out.println("Users of " + this.name + " are the following:");
        for (int i = 0; i < users.size(); ++i){
            System.out.println((i + 1) + ") " + users.get(i));
        }
    }
}
