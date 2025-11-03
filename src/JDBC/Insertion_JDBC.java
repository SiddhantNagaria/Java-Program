package JDBC;

import java.sql.*;

public class Insertion_JDBC {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "root@123";

        String q = "INSERT INTO employee(id, name, job_title, salary) values (7, 'Siddhant Nagaria', 'Developer', 80000.00)";


        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded successfully");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established successfully");
            Statement stmt = conn.createStatement();
            //  executeUpdate -> Used for INSERT, UPDATE, DELETE, and DDL (CREATE, DROP, ALTER) statements.
            //          It is used when your SQL changes data or structure — not when it reads data.
            //          Return Type -> int — the number of rows affected by the SQL statement.
            int rows = stmt.executeUpdate(q);

            if (rows > 0) {
                System.out.println("Insertion successful. " + rows + " row(s) added.");
            } else {
                System.out.println("Insertion failed");
            }

            stmt.close();
            conn.close();
            System.out.println("All connections closed successfully");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
