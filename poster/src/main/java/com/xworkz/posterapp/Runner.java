package com.xworkz.posterapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Runner {
    public static void main(String[] args) throws SQLException {
        System.out.println("main started");

        String url = "jdbc:mysql://localhost:3306/whats_app";
        String user = "root";
        String password = "chaitanya@21";

        Connection connection = DriverManager.getConnection(url,user,password);
        System.out.println("Connection Established.."+connection);

        String sql = "INSERT INTO whats_app(id,name,age,gender,email,phone_number)\n" +
                "values(3,\"joy\",20,\"male\",\"joy@gmail.com\",7411433777),(4,\"james\",25,\"male\",\"james@gmail.com\",9411433777);";
//        Statement statement = connection.createStatement();
        String sql2 = "INSERT INTO whats_app(id,name,age,gender,email,phone_number)values(5,\"dora\",21,\"female\",\"dora@gmail.com\",2398564735);";
        Statement statement = connection.createStatement();
        int rowAffected = statement.executeUpdate(sql2);

        System.out.println("rowAffected "+rowAffected);


        System.out.println("main ended");
    }
}
