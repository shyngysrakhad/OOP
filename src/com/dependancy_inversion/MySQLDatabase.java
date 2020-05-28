package com.dependancy_inversion;

public class MySQLDatabase implements Database{
    Database mySQL = new MySQL();
    @Override
    public void connect() {
        mySQL.connect();
    }

    @Override
    public void disconnect() {
        mySQL.disconnect();
    }
}
