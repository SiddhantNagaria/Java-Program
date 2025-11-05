package JDBC;

import java.sql.*;

public class PreparedStatement {
    public static void main(String[] args) {

        //Prepared Statements -
        //  these are used in JDBC and other data access libraries.
        //  They are used to execute SQL queries with placeholders for parameters.
        //  These placeholders are then filled with specific values when the query is executed.
        //
        //  Advantages :
        //  Protection against SQL injection
        //  Improved performance
        //  Code readability and maintainability
        //  Automatic data type handling
        //  Portability
        //  Compiled only once.


        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String pwd = "root@123";

        String q = "select * from employee where id = ?";
        String q2 = "INSERT INTO employee(id, name, job_title, salary) values (?,?,?,?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL Driver loaded successfully");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection con = DriverManager.getConnection(url, user, pwd);
            System.out.println("Connection established");
            //Prepared Statement
            java.sql.PreparedStatement ps = con.prepareStatement(q2);
            // ps.setInt(1, 2);
            ps.setInt(1,8);
            ps.setString(2, "Rahul Goel");
            ps.setString(3,"customer executive");
            ps.setDouble(4,25000.00);
           // ResultSet rs = ps.executeQuery();

            int rows = ps.executeUpdate();

            if(rows>0){
                System.out.println("insertion successful");
            }else{
                System.out.println("insertion failed");
            }


            //  .next() -> moves the cursor to the next row in your SQL query result.
            //          - returtn true if there is next row OR false if no more rows
            //          - will be true until data exists
//            while (rs.next()) {
//                //  left side - java variables || right side - SQL Variables
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                String job_title = rs.getString("job_title");
//                double salary = rs.getDouble("salary");
//                System.out.println("ID " + id + " Name  " + name + " Job Title " + job_title + " salary " + salary);
//            }
//            rs.close();
            ps.close();
            con.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


}
