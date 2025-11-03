package JDBC;

import java.sql.*;

public class Main {
    public static void main(String[] args)  {

        //address of your database — that tells Java where your database lives and how to connect.
        String url = "jdbc:mysql://localhost:3306/mydb";
        //The database account name you log in with — not your system login, but a MySQL (or other DB) user.
        String username = "root";
        //The password for the user you specified in username.
        String password = "root@123";

        String q = "select * from employee";
        //Class - built in class - represent metadata of a class
        //      - load classes(here - mysql jdbc driver), and create instances at runtime
        //forName - static method of the class 'class'
        //        - load the class into memory when given the class name as a string
        //        - takes one argument - the fully qualified class name (package + class)

        try {
            Class.forName("com.mysql.jdbc.Driver"); //load this class into the JVM
            // "com.mysql.jdbc.Driver" - fully qualified name of the MySQL JDBC driver class.
            // It exists inside the MySQL Connector/J JAR file
            // When loaded, this class registers itself with the JDBC DriverManager

            System.out.println("Driver loaded successfully");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            //Driver Manager - A class in the java.sql package that manages the list of available JDBC drivers and
            // hands you a live Connection when you ask for it.

            //Connection - An interface that represents a live session with the database.

            //JDBC Driver - A software component / class provided by database vendors (like MySQL, Oracle, PostgreSQL).
            //Knows how to talk to that specific database (convert Java calls → DB protocol).
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established successfully");

            //Statement interface is used to create a statement on which a query has to be executed against a db.
            Statement stmt = conn.createStatement();

            //ResultSet is used to store the result of the query on the statement

            // executeQuery -> Used for SELECT statements — i.e., when you want to read data from the database.
            //It is used to fetch data and returns the result in a ResultSet object.
            //Return Type:ResultSet
            ResultSet rs = stmt.executeQuery(q);
            while (rs.next()) {
                //Move to the next row in the result table.
                //The first time, it moves to the first row -> Then second row, and so on...
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String job_title = rs.getString("job_title");
                double salary = rs.getDouble("salary");
                System.out.println("id : " + id + " name : " + name + " job title : " + job_title + " salary : " + salary);
            }
            rs.close();
            stmt.close();
            conn.close();
            System.out.println("All connections closed successfully");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
