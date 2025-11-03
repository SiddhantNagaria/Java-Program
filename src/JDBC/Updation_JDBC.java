package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Updation_JDBC {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "root@123";

        String q = "update employee set  salary=90000.00 where id = 7 ";


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
                System.out.println("Updation successful. " + rows + " row(s) deleted.");
            } else {
                System.out.println("Updation failed");
            }

            stmt.close();
            conn.close();
            System.out.println("All connections closed successfully");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}