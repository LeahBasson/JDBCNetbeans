

package za.ac.cput.jdbcprac13;

/**
 *
 * @author 230146740
 */

import javax.swing.JFrame;
import za.ac.cput.jdbcprac13.gui.AddSubjectGui;

public class JDBCPrac13 {

    public static void main(String[] args) {
        AddSubjectGui myApp = new AddSubjectGui();

        // Method to enable you to close frame
        myApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Size of frame
        myApp.setSize(750, 500);

        // Frame is invisible by default, method to make it visible.
        myApp.setVisible(true); 
            
    }// end of main
}// end of class
