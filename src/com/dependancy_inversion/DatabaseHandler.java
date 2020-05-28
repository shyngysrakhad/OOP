package com.dependancy_inversion;

public class DatabaseHandler {
    public static void main(String[] args) {
        Database oracle = new OracleDatabase();
        Database sql = new MySQLDatabase();
        oracle.connect();
        sql.connect();
    }
}
