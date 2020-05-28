package com.dependancy_inversion.test;

import com.dependancy_inversion.Database;
import com.dependancy_inversion.MySQLDatabase;
import com.dependancy_inversion.Oracle;
import com.dependancy_inversion.OracleDatabase;
import org.junit.jupiter.api.Test;

public class DatabaseTest {
    @Test
    public void Database(){
        MySQLDatabase sql = new MySQLDatabase();
        sql.connect();
        sql.disconnect();

        OracleDatabase oracleDatabase = new OracleDatabase();
        oracleDatabase.connect();
        oracleDatabase.disconnect();
    }
}
