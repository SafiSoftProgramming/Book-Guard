/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booklibrary;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;






/**
 *
 * @author safi
 */
public class CustomerFrame extends javax.swing.JFrame {

    /**
     * Creates new form CustomerFrame
     */
    public CustomerFrame() {
        initComponents();
        
        
       
    }
    
    
    
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tcustid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tcustname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tcustadress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tcustphone = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Bback1 = new javax.swing.JButton();
        Bfirst1 = new javax.swing.JButton();
        Blast1 = new javax.swing.JButton();
        Bnext1 = new javax.swing.JButton();
        Baddcust = new javax.swing.JButton();
        bupdatecust = new javax.swing.JButton();
        bdeledecust = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTable();
        radname = new javax.swing.JRadioButton();
        tsearch = new javax.swing.JTextField();
        radphone = new javax.swing.JRadioButton();
        radid = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Customer ID :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 30, 110, 40);

        tcustid.setBackground(new java.awt.Color(51, 51, 51));
        tcustid.setForeground(new java.awt.Color(255, 255, 255));
        tcustid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcustidActionPerformed(evt);
            }
        });
        jPanel1.add(tcustid);
        tcustid.setBounds(180, 30, 180, 30);

        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Customer Name :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 90, 130, 15);

        tcustname.setBackground(new java.awt.Color(51, 51, 51));
        tcustname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tcustname);
        tcustname.setBounds(180, 79, 180, 30);

        jLabel4.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Customer Address :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 190, 160, 15);

        tcustadress.setBackground(new java.awt.Color(51, 51, 51));
        tcustadress.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tcustadress);
        tcustadress.setBounds(30, 210, 340, 30);

        jLabel5.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Customer Phone :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 140, 160, 15);

        tcustphone.setBackground(new java.awt.Color(51, 51, 51));
        tcustphone.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tcustphone);
        tcustphone.setBounds(180, 130, 180, 30);

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Go to Main Window( X )");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(530, 10, 220, 20);

        Bback1.setBackground(new java.awt.Color(0, 51, 51));
        Bback1.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        Bback1.setForeground(new java.awt.Color(0, 0, 0));
        Bback1.setText("Back");
        Bback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bback1ActionPerformed(evt);
            }
        });
        jPanel1.add(Bback1);
        Bback1.setBounds(120, 290, 80, 20);

        Bfirst1.setBackground(new java.awt.Color(0, 51, 51));
        Bfirst1.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        Bfirst1.setForeground(new java.awt.Color(0, 0, 0));
        Bfirst1.setText("First");
        Bfirst1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bfirst1ActionPerformed(evt);
            }
        });
        jPanel1.add(Bfirst1);
        Bfirst1.setBounds(30, 290, 70, 20);

        Blast1.setBackground(new java.awt.Color(0, 51, 51));
        Blast1.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        Blast1.setForeground(new java.awt.Color(0, 0, 0));
        Blast1.setText("Last");
        Blast1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Blast1ActionPerformed(evt);
            }
        });
        jPanel1.add(Blast1);
        Blast1.setBounds(300, 290, 70, 20);

        Bnext1.setBackground(new java.awt.Color(0, 51, 51));
        Bnext1.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        Bnext1.setForeground(new java.awt.Color(0, 0, 0));
        Bnext1.setText("Next");
        Bnext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bnext1ActionPerformed(evt);
            }
        });
        jPanel1.add(Bnext1);
        Bnext1.setBounds(200, 290, 80, 20);

        Baddcust.setBackground(new java.awt.Color(0, 51, 51));
        Baddcust.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        Baddcust.setForeground(new java.awt.Color(0, 0, 0));
        Baddcust.setText("Add New Customer");
        Baddcust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaddcustActionPerformed(evt);
            }
        });
        jPanel1.add(Baddcust);
        Baddcust.setBounds(30, 400, 340, 20);

        bupdatecust.setBackground(new java.awt.Color(0, 51, 51));
        bupdatecust.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        bupdatecust.setForeground(new java.awt.Color(0, 0, 0));
        bupdatecust.setText("Update  Customer");
        bupdatecust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bupdatecustActionPerformed(evt);
            }
        });
        jPanel1.add(bupdatecust);
        bupdatecust.setBounds(30, 460, 340, 20);

        bdeledecust.setBackground(new java.awt.Color(0, 51, 51));
        bdeledecust.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        bdeledecust.setForeground(new java.awt.Color(0, 0, 0));
        bdeledecust.setText("Delete Customer");
        bdeledecust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdeledecustActionPerformed(evt);
            }
        });
        jPanel1.add(bdeledecust);
        bdeledecust.setBounds(30, 520, 340, 20);

        ta1.setBackground(new java.awt.Color(51, 51, 51));
        ta1.setForeground(new java.awt.Color(255, 255, 255));
        ta1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cust.Id", "Cust.Name", "Cust.Address", "Cust.Phone"
            }
        ));
        jScrollPane1.setViewportView(ta1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(410, 210, 340, 330);

        buttonGroup1.add(radname);
        radname.setText("Name");
        jPanel1.add(radname);
        radname.setBounds(530, 130, 120, 22);

        tsearch.setBackground(new java.awt.Color(51, 51, 51));
        tsearch.setForeground(new java.awt.Color(255, 255, 255));
        tsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsearchActionPerformed(evt);
            }
        });
        tsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tsearchKeyReleased(evt);
            }
        });
        jPanel1.add(tsearch);
        tsearch.setBounds(410, 170, 340, 30);

        buttonGroup1.add(radphone);
        radphone.setText("Phone");
        jPanel1.add(radphone);
        radphone.setBounds(660, 130, 90, 22);

        buttonGroup1.add(radid);
        radid.setText("ID");
        jPanel1.add(radid);
        radid.setBounds(410, 130, 80, 22);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Search by ID set by default :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(410, 80, 240, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booklibrary/book2 - Copy.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 780, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
Connection c ;
Statement s ;
ResultSet r ;
String state;
    
    void showdata()
    {
        try {
            
        tcustid.setText(r.getInt("customer ID")+"");
        tcustname.setText(r.getString("customer name"));
        tcustphone.setText(r.getString("customer PHONE"));
        tcustadress.setText(r.getString("customer address"));
          
        } catch (Exception e)
        {
           
        tcustid.setText("No Record");
            tcustname.setText("No Record");
            tcustphone.setText("No Record");
           tcustadress.setText("No Record");
           
        }
    
      
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.setVisible(false);
new ChoseFrame().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

   
    
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
try{
    c =DriverManager.getConnection("jdbc:ucanaccess:///media/root/PROGRAMMING/LibertyBookDatabase.accdb"); 
  s =c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
  r =s.executeQuery("select * from customer");
 //r.next();
  
  int rowcount=0;
  while (r.next())
           {
           ta1.setValueAt(r.getInt("customer ID"), rowcount,0);
           ta1.setValueAt(r.getString("customer name"), rowcount,1);
           ta1.setValueAt(r.getString("customer address"), rowcount,2);
           ta1.setValueAt(r.getString("customer phone"), rowcount,3);
           
           rowcount ++ ;
           DefaultTableModel dm=(DefaultTableModel)ta1.getModel();
               dm.addRow(new Object[0]);
           }
    r.first();
  
  

  showdata();
  
}
catch(Exception e)
{
e.printStackTrace();

}




        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void Bnext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bnext1ActionPerformed
         try{
        r.next();
        showdata();
       
        }
        catch(Exception e)
        {
       e.printStackTrace();
        }
        
    }//GEN-LAST:event_Bnext1ActionPerformed

    private void Blast1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Blast1ActionPerformed
        try{
r.last();
showdata();


}
catch(Exception e)
{
e.printStackTrace();

}

    }//GEN-LAST:event_Blast1ActionPerformed

    private void Bfirst1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bfirst1ActionPerformed
        try{
        r.first();
        showdata();
        }
        catch(Exception e)
        {
        e.printStackTrace();
        }
    }//GEN-LAST:event_Bfirst1ActionPerformed

    private void Bback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bback1ActionPerformed
        try{
        r.previous();
        showdata();
        }
        catch(Exception e)
        {
        e.printStackTrace();
        }
    }//GEN-LAST:event_Bback1ActionPerformed

    private void BaddcustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaddcustActionPerformed
        try{
            
        r.moveToInsertRow();
        
        tcustid.disable();
        r.updateString("customer name", tcustname.getText());
        r.updateString("customer phone",tcustphone.getText());
        r.updateString("customer address", tcustadress.getText());
        
        
        r.insertRow();
        r=s.executeQuery("select * from customer");  
        }
        catch(Exception e)
        {
        
            e.printStackTrace();
        }
    }//GEN-LAST:event_BaddcustActionPerformed

    private void bupdatecustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bupdatecustActionPerformed
        try{
            
        
        
        tcustid.disable();
        r.updateString("customer name", tcustname.getText());
        r.updateString("customer phone",tcustphone.getText());
        r.updateString("customer address", tcustadress.getText());
        
        
        r.updateRow();
        r=s.executeQuery("select * from customer");  
        }
        catch(Exception e)
        {
        
            e.printStackTrace();
        }
    }//GEN-LAST:event_bupdatecustActionPerformed

    private void bdeledecustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdeledecustActionPerformed
       
        
         try{
            
        
        
        r.deleteRow();
        tcustname.setText("Data Deleted");
        tcustphone.setText("Data Deleted");
        tcustadress.setText("Data Deleted");
        
        
        
        r=s.executeQuery("select * from customer");  
        }
        catch(Exception e)
        {
        e.printStackTrace();
           // JOptionPane.showMessageDialog(null,"No Data To Delete");
        }
    }//GEN-LAST:event_bdeledecustActionPerformed

    private void tcustidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcustidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcustidActionPerformed

    private void tsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tsearchKeyReleased
try{
    state ="[customer id]";
         
    if(radid.isSelected())
    {
    state ="[customer id]";
    }
            
    if (radname.isSelected())
   {
    state ="[customer name]";
   
   }
    if(radphone.isSelected())
        state="[customer phone]";
  
       
  Statement stapl =c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
  ResultSet rtapl =stapl.executeQuery("select * from customer where "+state+"  like "+"'"+tsearch.getText()+"%'");
  rtapl.next();
  
  int rowcount =0;
   rtapl.last();
            int databaserowcount =rtapl.getRow();//get coun of databaserows
            int tabelrowcount= ta1.getModel().getRowCount();//get count of table roes
            
            for(int j=tabelrowcount-1;j>=0;j--)
            {
            DefaultTableModel dm =(DefaultTableModel)ta1.getModel();
            dm.removeRow(j);
            }
            
            
           for(int i=0;i<databaserowcount;i++)
          {
              DefaultTableModel dm=(DefaultTableModel)ta1.getModel();
              dm.addRow(new Object[0]);
            }
           
          
           
         
            rtapl.beforeFirst();
            while(rtapl.next())
            {
                ta1.setValueAt(rtapl.getInt("customer id"), rowcount,0);
           ta1.setValueAt(rtapl.getString("customer name"), rowcount,1);
           ta1.setValueAt(rtapl.getString("customer address"), rowcount,2);
           ta1.setValueAt(rtapl.getString("customer phone"), rowcount,3);
           
                rowcount ++;
               //  DefaultTableModel dm=(DefaultTableModel)jTable1.getModel();
             //  dm.addRow(new Object[4]);
            }
    
 
}
catch(Exception e)
{
    e.printStackTrace();
//tsearch.setText("chose search option");
}
    }//GEN-LAST:event_tsearchKeyReleased

    private void tsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tsearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Baddcust;
    private javax.swing.JButton Bback1;
    private javax.swing.JButton Bfirst1;
    private javax.swing.JButton Blast1;
    private javax.swing.JButton Bnext1;
    private javax.swing.JButton bdeledecust;
    private javax.swing.JButton bupdatecust;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radid;
    private javax.swing.JRadioButton radname;
    private javax.swing.JRadioButton radphone;
    private javax.swing.JTable ta1;
    private javax.swing.JTextField tcustadress;
    private javax.swing.JTextField tcustid;
    private javax.swing.JTextField tcustname;
    private javax.swing.JTextField tcustphone;
    private javax.swing.JTextField tsearch;
    // End of variables declaration//GEN-END:variables
}
