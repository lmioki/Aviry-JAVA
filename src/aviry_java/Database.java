package aviry_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class Database {
     
    public static Connection createConnection() throws SQLException{
        String url = "jdbc:mysql://localhost:5000/aviry";
        String user = "admin"; 
        String password = "rootroot";
         
        Connection conn = null;
        conn = DriverManager.getConnection(url, user, password);
         
        return conn;
    }
}