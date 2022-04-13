/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author user
 */
public class GuardianList extends javax.swing.JFrame {

    /**
     * Creates new form LibrarianLogin
     */
    public GuardianList() {
      
        initComponents(); 
        connect();
        tableLoad();
        
    }
    
    Connection con ;
    PreparedStatement login , pst;
    
    public void connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/primarySchool","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GuardianList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GuardianList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void tableLoad() {
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/primaryschool","root","");
            pst = con.prepareStatement("select * from guardian");
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            DefaultTableModel df = (DefaultTableModel) TeacherTable.getModel();
            df.setRowCount(0);
            while (rs.next()) {   
                
                String id = rs.getString("id");
                String nameString = rs.getString("name");
                String emailString = rs.getString("email");
                String phoneString = rs.getString("password");
                String positionString = rs.getString("contact");
                 
                String tbData[] = {id,nameString,emailString,phoneString,positionString};
                df.addRow(tbData);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(GuardianList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        searchTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TeacherTable = new javax.swing.JTable();
        jSeparator4 = new javax.swing.JSeparator();
        cancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(70, 72, 235));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sohan\\Downloads\\primary school\\logo.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 232, 242));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 380));

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchTxt.setBackground(new java.awt.Color(254, 254, 254));
        searchTxt.setBorder(null);
        searchTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTxtActionPerformed(evt);
            }
        });
        searchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTxtKeyReleased(evt);
            }
        });
        jPanel2.add(searchTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 360, 30));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 30, 30));

        TeacherTable.setBackground(new java.awt.Color(254, 254, 254));
        TeacherTable.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        TeacherTable.setForeground(new java.awt.Color(70, 72, 235));
        TeacherTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Child's ID", "Name", "E-mail", "Password", "Contact"
            }
        ));
        TeacherTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TeacherTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TeacherTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 390, 260));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 360, 10));

        cancelBtn.setBackground(new java.awt.Color(70, 72, 235));
        cancelBtn.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(254, 254, 254));
        cancelBtn.setText("Cancel");
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelBtnMouseEntered(evt);
            }
        });
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel2.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 80, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 440, 390));

        setSize(new java.awt.Dimension(772, 401));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTxtActionPerformed

    private void searchTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTxtKeyReleased
       DefaultTableModel table = (DefaultTableModel) TeacherTable.getModel();
        String search = searchTxt.getText();
        TableRowSorter<DefaultTableModel>tr = new TableRowSorter<DefaultTableModel>(table);
        TeacherTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_searchTxtKeyReleased

    private void TeacherTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeacherTableMouseClicked
        // TODO add your handling code here:
     DefaultTableModel d=  (DefaultTableModel)TeacherTable.getModel();
     int selectedindex = TeacherTable.getSelectedRow();
     if(TeacherTable.getRowSorter()!= null){
         selectedindex = TeacherTable.getRowSorter().convertRowIndexToModel(selectedindex);
     
     }
     String id = d.getValueAt(selectedindex, 0).toString();
     String name = d.getValueAt(selectedindex, 1).toString();
     String email = d.getValueAt(selectedindex, 2).toString();
     String phone = d.getValueAt(selectedindex, 3).toString();
     String position = d.getValueAt(selectedindex, 4).toString();
     
     JOptionPane.showMessageDialog(this, "Id : "+id+"\n"+"Name : "+name+"\n"+"E-mail : "+email+"\n"+"Phone : "+phone+"\n"+"Position : "+position);
    }//GEN-LAST:event_TeacherTableMouseClicked

    private void cancelBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseExited
        // TODO add your handling code here:

       
    }//GEN-LAST:event_cancelBtnMouseExited

    private void cancelBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseEntered
        // TODO add your handling code here:
      
    }//GEN-LAST:event_cancelBtnMouseEntered

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        new TeacherUserInterface().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_cancelBtnActionPerformed
 
    
    
    

    

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
            java.util.logging.Logger.getLogger(GuardianList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuardianList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuardianList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuardianList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuardianList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TeacherTable;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField searchTxt;
    // End of variables declaration//GEN-END:variables
}
