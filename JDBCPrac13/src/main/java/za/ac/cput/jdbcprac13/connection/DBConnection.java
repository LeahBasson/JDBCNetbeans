
package za.ac.cput.jdbcprac13.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    public static void derbyConnection() throws SQLException{
        String dbURL = "jdbc:derby://localhost:1527/University";
        String username = "administrator";
        String password = "admin";
        
        System.out.println("About to get a connection....");
        Connection con = DriverManager.getConnection(dbURL, username, password);
        System.out.println("Connection Established Successfully....");
    }
}// end of class
