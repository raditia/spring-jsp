package com.raditia.springjsp.DAO;

import com.raditia.springjsp.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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

    //Membuat tabel
    public static void createTableUser() {

        try {
            Connection connection  = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "CREATE TABLE IF NOT EXISTS " + table_name +
                            "(id SERIAL PRIMARY KEY NOT NULL, " +
                            "name TEXT NOT NULL ," +
                            "email TEXT)"
            );

            preparedStatement.executeUpdate();
        }
        catch (Exception e) {

            System.out.println(e.toString());
        }
    }

    //Memasukkan data
    public static int insertUser(User user) {

        int status = 0;

        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO " + table_name +
                            "("+ col_name +"," + col_email+") VALUES (?,?)"
            );
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());

            status = preparedStatement.executeUpdate();
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }

        return status;
    }

    //Menampilkan semua user
    public static List<User> getAllUser() {

        List<User> userList = new ArrayList<User>();

        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM " + table_name
            );

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt(col_id));
                user.setName(resultSet.getString(col_name));
                user.setEmail(resultSet.getString(col_email));
                userList.add(user);
            }
        }
        catch (Exception e) {

            System.out.println(e.toString());
        }

        return userList;
    }
}
