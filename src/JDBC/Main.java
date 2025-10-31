package JDBC;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        //Class - built in class - represent metadata of a class
        //      - load classes(here - mysql jdbc driver), and create instances at runtime
        //forName - static method of the class 'class'
        //        - load the class into memory when given the class name as a string

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded successfully");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
