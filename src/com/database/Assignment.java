package com.database;

import java.sql.*;
import java.util.ArrayList;

public class Assignment {
    private static Connection connection = Database.connection;
    public static void main(String[] args){
        try {
            connect();
            Group writers = new Group("Writers");
            Group programming = new Group("Programming");
            Group memes = new Group("Memes");
            User simple = new User("S1mple");
            User steve = new User("Steve");
            steve.joinGroup(programming);
            steve.joinGroup(memes);
            simple.joinGroup(memes);
            steve.showGroups();
            memes.showUsers();
            connection.close();
        }catch (ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }

    }

    public static void connect() throws ClassNotFoundException, SQLException {
        Class.forName(Database.driver);
        connection = DriverManager.getConnection(Database.url, Database.user, Database.password);
        Database.connection = connection;
        System.out.println("Connected!");
    }
}
