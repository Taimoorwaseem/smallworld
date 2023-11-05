package general;
import org.testng.annotations.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.*;

public class DBTest {
    public  Connection conn;
    public  Statement stmt;
    public  ResultSet resultSet;

    String dbURL = "jdbc:mysql://sonar-metrics.c87wxijx5ezi.us-east-1.rds.amazonaws.com:3306/sonardb ";
    String dbUsername = "sonardb_sarosh_user";
    String dbPassword="WGWi0IIIIi0IdUOY4GWUOkY";


    @Test
    public void DBconnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL,dbUsername, dbPassword );
            String query = "Select * from automation_report";
            Statement stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery(query);
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occurred while loading the driver of JDBC");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
