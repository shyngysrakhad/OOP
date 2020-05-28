package com.dependancy_inversion;

public class OracleDatabase implements Database{
    Database oracleDatabase = new OracleDatabase();
    @Override
    public void connect() {
        oracleDatabase.connect();
    }

    @Override
    public void disconnect() {
        oracleDatabase.disconnect();
    }
}
