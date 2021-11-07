package com.java.project.connection;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;


public class DatabaseConnection {
    public Connection databaseLink;

    public Connection getConnection() throws SQLException{
        String databaseName ="login";
        String databaseUser ="root";
        String databasePassword ="asdzxc123";
        String url = "jdbc:mysql://127.0.0.1:3306/" + databaseName+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        MysqlDataSource ds = new MysqlDataSource();
        ds.setUrl(url);
        ds.setUser(databaseUser);
        ds.setPassword(databasePassword);
        return ds.getConnection();
    }
}
