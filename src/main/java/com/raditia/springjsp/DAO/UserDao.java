package com.raditia.springjsp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class UserDao {

    private static final String table_name = "user_data";
    private static final String col_id = "id";
    private static final String col_name = "name";
    private static final String col_email = "email";

    //Membuat koneksi
    public static Connection getConnection() {

        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5433/spring_jsp",
                    "postgres",
                    "password"
            );
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.println("Database opened successfully");

        return connection;
    }
}
