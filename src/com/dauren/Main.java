package com.dauren;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    static Connection connection = Database.connection;
    public static void main(String[] args){
        try {
            Class.forName(Database.driver);
            connect();
            //User dauren = new User("dauka", "123", "Dauren", "Ashim");
            User dauren = User.getUser("dauka", "123");
            //User steve = new User("steve", "222", "Steve", "Jobs");
            User steve = User.getUser("steve", "222");
            dauren.addFriend(steve);
            dauren.showFriends();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
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
