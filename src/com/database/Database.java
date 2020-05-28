package com.database;

import java.sql.Connection;

public class Database {
    public static final String url = "jdbc:mysql://localhost:3306/assignment?autoReconnect=true&useSSL=false";
    public static final String user = "root";
    public static final String password = "Chinga18";
    public static final String driver = "com.mysql.jdbc.Driver";
    public static Connection connection;
}
