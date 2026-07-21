
package za.ac.cput.jdbcprac2.gui;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AddSubjectGui extends JFrame{
    // panels
    private JPanel pnlDivider;
    private JPanel pnlTxtField;
    private JPanel pnlButtons;
    
    // labels
    private JLabel lblSubCode;
    private JLabel lblSubDesc;
    
    // textfields
    private JTextField txtSubCode;
    private JTextField txtSubDesc;
    
    // table
    DefaultTableModel tableModel;
    JTable table;
    
    // buttons
    private JButton btnSave;
    private JButton btnCancel;
    private JButton btnRead;
    private JButton btnFillCombo;
    
    public AddSubjectGui(){
        super("Add a subject");
        
        setLayout(new GridLayout(2, 1));
        
        // panels
        pnlDivider = new JPanel();
        pnlTxtField = new JPanel();
        pnlButtons = new JPanel();
        
        pnlDivider.setLayout(new GridLayout(1, 2));
        pnlTxtField.setLayout(new GridLayout(2, 2, 5, 5));
        
        // labels
        lblSubCode = new JLabel("Subject Code:");
        lblSubDesc = new JLabel("Subject Description:");
        
        // textfields
        txtSubCode = new JTextField(10);
        txtSubDesc = new JTextField(10);
        
        // table
        tableModel = new DefaultTableModel();
        table = new JTable(tableModel);
        
        // button
        btnSave = new JButton("Save");
        btnCancel = new JButton("Cancel");
        btnRead = new JButton("Read");
        btnFillCombo = new JButton("Fill Combo");
        
        pnlTxtField.add(lblSubCode);
        pnlTxtField.add(txtSubCode);
        pnlTxtField.add(lblSubDesc);
        pnlTxtField.add(txtSubDesc);
        
        pnlDivider.add(pnlTxtField);
        
        setGui();
        
        pnlDivider.add(new JScrollPane(table));
        add(pnlDivider);
        
        pnlButtons.add(btnSave);
        pnlButtons.add(btnCancel);
        pnlButtons.add(btnRead);
        pnlButtons.add(btnFillCombo);
        add(pnlButtons);
    }
    
    public void setGui() {
        tableModel.addColumn("Subject Code");
        tableModel.addColumn("Description");
    }
   
}// end of class
