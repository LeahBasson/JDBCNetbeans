/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package za.ac.cput.samplemavenproject;

import java.sql.*;

/**
 *
 * @author 230146740
 */
public class SampleMavenProject {

    public static void main(String[] args) {
        String create_Table_stmt = "create table Student (Student_ID INTEGER, Name VARCHAR(30))";
        String insert_Values_stmt = "insert into Student values   (302,'Tristan'),(303,'Reece')";
        String update_Values_stmt = "UPDATE Student SET NAME='Tamia'      WHERE Student_ID=300";
        String delete_Values_stmt = "DELETE FROM Student WHERE  Student_ID =   303";
        String retrieve_Values_qry = "SELECT * FROM Student ";

        try {
            String dbURL = "jdbc:derby://localhost:1527/University";
            String username = "administrator";
            String password = "admin";
            //specify the full pathname of the database

            System.out.println("About to get a connection....");
            Connection con = DriverManager.getConnection(dbURL, username, password);
            System.out.println("Connection Established Successfully....");
            // create a java.sql.Statement so we can run queries
            System.out.println("Creating statement Object....");
            Statement s = con.createStatement();
            System.out.println("Statement object created Successfully....");

            System.out.println("About to execute SQL stmt....");
            s.executeUpdate(delete_Values_stmt); // execute the SQL statement

//----------------------------------------------------
//        ResultSet rs = s.executeQuery(retrieve_Values_qry); 
            //select the data from the table
//      int row = 0;
//       if (rs != null) 
//       while ( rs.next() ) 
            //this will step through our data row-by-row
            //      {
            //          row++;
            //         System.out.println("Data from row " + row + ": " 
            //          + rs.getInt(1) + " "+rs.getString(2) );
            //      }//end while
            //      rs.close();
//----------------------------------------------------
            System.out.println("SQL statement executed  Successfully....");

            System.out.println("About to close Statement....");
            s.close(); // close the Statement to let the database know we're done with it
            con.close(); // close the Connection to let the database know we're done with it
            System.out.println("Statement closed successfully....");
        } catch (SQLException err) {
            System.out.println("ERROR: " + err);
        }
    } // end of main
} // end of class
