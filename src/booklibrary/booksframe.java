/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booklibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/**
 *
 * @author safi
 */
public class booksframe extends javax.swing.JFrame {

    /**
     * Creates new form booksframe
     */
    public booksframe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        trentprice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tauthor = new javax.swing.JTextField();
        tbookprice = new javax.swing.JTextField();
        tbooktybe = new javax.swing.JTextField();
        tbookname = new javax.swing.JTextField();
        tbookqunt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tbookid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Bfirst = new javax.swing.JButton();
        Bback = new javax.swing.JButton();
        Bnext = new javax.swing.JButton();
        Blast = new javax.swing.JButton();
        Baddbook = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTable();
        tsearchname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tsearchauthoe = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tsearchtype = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setLayout(null);

        trentprice.setBackground(new java.awt.Color(51, 51, 51));
        trentprice.setForeground(new java.awt.Color(255, 255, 255));
        trentprice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(trentprice);
        trentprice.setBounds(170, 190, 180, 30);

        jLabel6.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Author :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 250, 80, 18);

        jLabel5.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Rent Price :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 200, 100, 20);

        tauthor.setBackground(new java.awt.Color(51, 51, 51));
        tauthor.setForeground(new java.awt.Color(255, 255, 255));
        tauthor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(tauthor);
        tauthor.setBounds(170, 240, 180, 30);

        tbookprice.setBackground(new java.awt.Color(51, 51, 51));
        tbookprice.setForeground(new java.awt.Color(255, 255, 255));
        tbookprice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(tbookprice);
        tbookprice.setBounds(170, 140, 180, 30);

        tbooktybe.setBackground(new java.awt.Color(51, 51, 51));
        tbooktybe.setForeground(new java.awt.Color(255, 255, 255));
        tbooktybe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(tbooktybe);
        tbooktybe.setBounds(170, 290, 180, 30);

        tbookname.setBackground(new java.awt.Color(51, 51, 51));
        tbookname.setForeground(new java.awt.Color(255, 255, 255));
        tbookname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbookname.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(tbookname);
        tbookname.setBounds(170, 90, 180, 30);

        tbookqunt.setBackground(new java.awt.Color(51, 51, 51));
        tbookqunt.setForeground(new java.awt.Color(255, 255, 255));
        tbookqunt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(tbookqunt);
        tbookqunt.setBounds(170, 340, 180, 30);

        jLabel8.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Book Quantity :");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 350, 160, 18);

        jLabel4.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Book Price  :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 150, 110, 20);

        jLabel7.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Book Type :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 290, 110, 40);

        tbookid.setBackground(new java.awt.Color(51, 51, 51));
        tbookid.setForeground(new java.awt.Color(255, 255, 255));
        tbookid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbookid.setCaretColor(new java.awt.Color(0, 0, 0));
        tbookid.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(tbookid);
        tbookid.setBounds(170, 40, 180, 30);

        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Book Name  :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 100, 110, 18);

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Book ID :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 50, 90, 18);

        Bfirst.setBackground(new java.awt.Color(0, 51, 51));
        Bfirst.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        Bfirst.setForeground(new java.awt.Color(0, 0, 0));
        Bfirst.setText("First");
        Bfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BfirstActionPerformed(evt);
            }
        });
        jPanel1.add(Bfirst);
        Bfirst.setBounds(30, 410, 70, 20);

        Bback.setBackground(new java.awt.Color(0, 51, 51));
        Bback.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        Bback.setForeground(new java.awt.Color(0, 0, 0));
        Bback.setText("Back");
        Bback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbackActionPerformed(evt);
            }
        });
        jPanel1.add(Bback);
        Bback.setBounds(120, 410, 80, 20);

        Bnext.setBackground(new java.awt.Color(0, 51, 51));
        Bnext.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        Bnext.setForeground(new java.awt.Color(0, 0, 0));
        Bnext.setText("Next");
        Bnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnextActionPerformed(evt);
            }
        });
        jPanel1.add(Bnext);
        Bnext.setBounds(200, 410, 80, 20);

        Blast.setBackground(new java.awt.Color(0, 51, 51));
        Blast.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        Blast.setForeground(new java.awt.Color(0, 0, 0));
        Blast.setText("Last");
        Blast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlastActionPerformed(evt);
            }
        });
        jPanel1.add(Blast);
        Blast.setBounds(300, 410, 70, 20);

        Baddbook.setBackground(new java.awt.Color(0, 51, 51));
        Baddbook.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        Baddbook.setForeground(new java.awt.Color(0, 0, 0));
        Baddbook.setText("Add New Book");
        Baddbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaddbookActionPerformed(evt);
            }
        });
        jPanel1.add(Baddbook);
        Baddbook.setBounds(30, 460, 150, 20);

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Update Book ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(220, 460, 150, 20);

        Delete.setBackground(new java.awt.Color(0, 51, 51));
        Delete.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        Delete.setForeground(new java.awt.Color(0, 0, 0));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Delete);
        Delete.setBounds(30, 510, 340, 20);

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Go to Main Window( X )");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(520, 10, 220, 20);

        ta1.setBackground(new java.awt.Color(51, 51, 51));
        ta1.setForeground(new java.awt.Color(255, 255, 255));
        ta1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Price", "Author", "Type", "Quantity", "Rent Price"
            }
        ));
        jScrollPane1.setViewportView(ta1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(400, 270, 360, 260);

        tsearchname.setBackground(new java.awt.Color(51, 51, 51));
        tsearchname.setForeground(new java.awt.Color(255, 255, 255));
        tsearchname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsearchnameActionPerformed(evt);
            }
        });
        tsearchname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tsearchnameKeyReleased(evt);
            }
        });
        jPanel1.add(tsearchname);
        tsearchname.setBounds(420, 70, 310, 30);

        jLabel9.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Search By Book Name :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(420, 50, 190, 18);

        tsearchauthoe.setBackground(new java.awt.Color(51, 51, 51));
        tsearchauthoe.setForeground(new java.awt.Color(255, 255, 255));
        tsearchauthoe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsearchauthoeActionPerformed(evt);
            }
        });
        tsearchauthoe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tsearchauthoeKeyReleased(evt);
            }
        });
        jPanel1.add(tsearchauthoe);
        tsearchauthoe.setBounds(420, 130, 310, 30);

        jLabel10.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Search By Author Name :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(420, 110, 200, 20);

        tsearchtype.setBackground(new java.awt.Color(51, 51, 51));
        tsearchtype.setForeground(new java.awt.Color(255, 255, 255));
        tsearchtype.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tsearchtypeKeyReleased(evt);
            }
        });
        jPanel1.add(tsearchtype);
        tsearchtype.setBounds(420, 190, 310, 30);

        jLabel11.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Search By Book Type :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(420, 170, 170, 18);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booklibrary/book2.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-10, -30, 870, 690);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
Connection c ;
Statement s ;
ResultSet r ;
    
    void showdata()
    {
        try {
            
             tbookid.setText(r.getInt("Book ID")+"");
        tbookname.setText(r.getString("book name"));
        tbookprice.setText(r.getDouble("book price")+"");
        tauthor.setText(r.getString("book author"));
        tbooktybe.setText(r.getString("book type"));
        tbookqunt.setText(r.getInt("book quantity")+"");
        trentprice.setText(r.getDouble("book rent price")+"");    
        } catch (Exception e)
        {
        tbookid.setText("No Record");
            tbookid.disable();
            tbookname.setText("No Record");
            tbookprice.setText("No Record");
            tauthor.setText("No Record");
            tbooktybe.setText("No Record");
            tbookqunt.setText("No Record");
            trentprice.setText("No Record");
        }
    
      
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.setVisible(false);
new ChoseFrame().setVisible(true);       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

try{
c =DriverManager.getConnection("jdbc:ucanaccess:/media/root/Data1/LibertyBookDatabase.accdb"); 
  s =c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
  r =s.executeQuery("select * from books");
  //r.next();
  
  
 int rowcount=0;
  while (r.next())
           {
           ta1.setValueAt(r.getInt("Book ID"), rowcount,0);
           ta1.setValueAt(r.getString("book name"), rowcount,1);
           ta1.setValueAt(r.getDouble("book price"), rowcount,2);
           ta1.setValueAt(r.getString("book author"), rowcount,3);
           ta1.setValueAt(r.getString("book type"), rowcount,4);
           ta1.setValueAt(r.getInt("book quantity"), rowcount,5);
           ta1.setValueAt(r.getDouble("book rent price"), rowcount,6);
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
        
    }//GEN-LAST:event_formWindowActivated

    private void BnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnextActionPerformed
        try{
        r.next();
        showdata();
       
        }
        catch(Exception e)
        {
       e.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_BnextActionPerformed

    private void BlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlastActionPerformed
try{
r.last();
showdata();


}
catch(Exception e)
{
e.printStackTrace();

}



    }//GEN-LAST:event_BlastActionPerformed

    private void BfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BfirstActionPerformed

        try{
        r.first();
        showdata();
        }
        catch(Exception e)
        {
        e.printStackTrace();
        }
    }//GEN-LAST:event_BfirstActionPerformed

    private void BbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbackActionPerformed

        try{
        r.previous();
        showdata();
        }
        catch(Exception e)
        {
        e.printStackTrace();
        }
    }//GEN-LAST:event_BbackActionPerformed

    private void BaddbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaddbookActionPerformed

        try{
            
            
        r.moveToInsertRow();
        tbookid.disable();
        r.updateString("book name", tbookname.getText());
        r.updateDouble("book price",Double.parseDouble(tbookprice.getText()));
        r.updateString("book author",tauthor.getText());
        r.updateString("book type",tbooktybe.getText());
        r.updateInt("book quantity",Integer.parseInt(tbookqunt.getText()));
        r.updateDouble("book rent price",Double.parseDouble(trentprice.getText()));
        
        r.insertRow();
        r=s.executeQuery("select * from books");  
        }
        catch(Exception e)
        {
        
            e.printStackTrace();
        }
    }//GEN-LAST:event_BaddbookActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       try{
           
       r.updateString("book name", tbookname.getText());
        r.updateDouble("book price",Double.parseDouble(tbookprice.getText()));
        r.updateString("book author",tauthor.getText());
        r.updateString("book type",tbooktybe.getText());
        r.updateInt("book quantity",Integer.parseInt(tbookqunt.getText()));
        r.updateDouble("book rent price",Double.parseDouble(trentprice.getText()));
        r.updateRow();
        r=s.executeQuery("select * from books");
        
       }
       catch(Exception e)
       {
       e.printStackTrace();
       }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed

        try{
        r.deleteRow();
        
            tbookid.setText("Data Deleted");
            tbookname.setText("Data Deleted");
            tbookprice.setText("Data Deleted");
            tauthor.setText("Data Deleted");
            tbooktybe.setText("Data Deleted");
            tbookqunt.setText("Data Deleted");
            trentprice.setText("Data Deleted");
            r=s.executeQuery("select * from books");
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null,"No Data To Delete");
             
        }
        
    }//GEN-LAST:event_DeleteActionPerformed

    private void tsearchnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tsearchnameKeyReleased
try{
  Statement stapl =c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
  ResultSet rtapl =stapl.executeQuery("select * from Books where [book name]  like "+"'"+tsearchname.getText()+"%'");
  rtapl.next();
  
  tsearchauthoe.setText("");
  tsearchtype.setText("");
  
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
                ta1.setValueAt(rtapl.getInt("book ID"), rowcount,0);
           ta1.setValueAt(rtapl.getString("book name"), rowcount,1);
           ta1.setValueAt(rtapl.getDouble("book price"), rowcount,2);
           ta1.setValueAt(rtapl.getString("book author"), rowcount,3);
           ta1.setValueAt(rtapl.getString("book type"), rowcount,4);
           ta1.setValueAt(rtapl.getInt("book quantity"), rowcount,5);
           ta1.setValueAt(rtapl.getDouble("book rent price"), rowcount,6);
                rowcount ++;
               //  DefaultTableModel dm=(DefaultTableModel)jTable1.getModel();
             //  dm.addRow(new Object[4]);
            }
  
 
}
catch(Exception e)
{
e.printStackTrace();
}



      
    }//GEN-LAST:event_tsearchnameKeyReleased

    private void tsearchnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsearchnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tsearchnameActionPerformed

    private void tsearchauthoeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsearchauthoeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tsearchauthoeActionPerformed

    private void tsearchauthoeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tsearchauthoeKeyReleased
try{
  Statement stapl =c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
  ResultSet rtapl =stapl.executeQuery("select * from Books where [book author]  like "+"'"+tsearchauthoe.getText()+"%'");
  rtapl.next();
  tsearchname.setText("");
  tsearchtype.setText("");
  
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
                ta1.setValueAt(rtapl.getInt("book ID"), rowcount,0);
           ta1.setValueAt(rtapl.getString("book name"), rowcount,1);
           ta1.setValueAt(rtapl.getDouble("book price"), rowcount,2);
           ta1.setValueAt(rtapl.getString("book author"), rowcount,3);
           ta1.setValueAt(rtapl.getString("book type"), rowcount,4);
           ta1.setValueAt(rtapl.getInt("book quantity"), rowcount,5);
           ta1.setValueAt(rtapl.getDouble("book rent price"), rowcount,6);
                rowcount ++;
               //  DefaultTableModel dm=(DefaultTableModel)jTable1.getModel();
             //  dm.addRow(new Object[4]);
            }
  
 
}
catch(Exception e)
{
e.printStackTrace();
}


        
    }//GEN-LAST:event_tsearchauthoeKeyReleased

    private void tsearchtypeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tsearchtypeKeyReleased
try{
  Statement stapl =c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
  ResultSet rtapl =stapl.executeQuery("select * from Books where [book type]  like "+"'"+tsearchtype.getText()+"%'");
  rtapl.next();
  
  tsearchname.setText("");
  tsearchauthoe.setText("");
  
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
                ta1.setValueAt(rtapl.getInt("book ID"), rowcount,0);
           ta1.setValueAt(rtapl.getString("book name"), rowcount,1);
           ta1.setValueAt(rtapl.getDouble("book price"), rowcount,2);
           ta1.setValueAt(rtapl.getString("book author"), rowcount,3);
           ta1.setValueAt(rtapl.getString("book type"), rowcount,4);
           ta1.setValueAt(rtapl.getInt("book quantity"), rowcount,5);
           ta1.setValueAt(rtapl.getDouble("book rent price"), rowcount,6);
                rowcount ++;
               
            }
  
 
}
catch(Exception e)
{
e.printStackTrace();
}


        
                                            




        // TODO add your handling code here:
    }//GEN-LAST:event_tsearchtypeKeyReleased

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
            java.util.logging.Logger.getLogger(booksframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(booksframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(booksframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(booksframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new booksframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Baddbook;
    private javax.swing.JButton Bback;
    private javax.swing.JButton Bfirst;
    private javax.swing.JButton Blast;
    private javax.swing.JButton Bnext;
    private javax.swing.JButton Delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable ta1;
    private javax.swing.JTextField tauthor;
    private javax.swing.JTextField tbookid;
    private javax.swing.JTextField tbookname;
    private javax.swing.JTextField tbookprice;
    private javax.swing.JTextField tbookqunt;
    private javax.swing.JTextField tbooktybe;
    private javax.swing.JTextField trentprice;
    private javax.swing.JTextField tsearchauthoe;
    private javax.swing.JTextField tsearchname;
    private javax.swing.JTextField tsearchtype;
    // End of variables declaration//GEN-END:variables
}
