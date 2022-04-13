/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import java.awt.Color;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author user
 */
public class ChangeSyllabus extends javax.swing.JFrame {

    /**
     * Creates new form LibrarianLogin
     */
    public ChangeSyllabus() {
      
        initComponents(); 
        connect();
     
        
    }
    
    Connection con ;
    PreparedStatement login , pst;
    String filepath;
    
    public void connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/primarySchool","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ChangeSyllabus.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ChangeSyllabus.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
   /* public void tableLoad() {
        
  
        
    }
    */

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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        changeBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        txtFilePath = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(70, 72, 235));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sohan\\Downloads\\primary school\\logo.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 232, 242));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 380));

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 270, 10));

        changeBtn.setBackground(new java.awt.Color(70, 72, 235));
        changeBtn.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        changeBtn.setForeground(new java.awt.Color(254, 254, 254));
        changeBtn.setText("Change");
        changeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changeBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changeBtnMouseEntered(evt);
            }
        });
        changeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeBtnActionPerformed(evt);
            }
        });
        jPanel2.add(changeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 90, 30));

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

        txtFilePath.setBackground(new java.awt.Color(254, 254, 254));
        txtFilePath.setFont(new java.awt.Font("URW Bookman L", 1, 14)); // NOI18N
        txtFilePath.setForeground(new java.awt.Color(70, 72, 235));
        txtFilePath.setText("Enter the Syllabus Link");
        txtFilePath.setBorder(null);
        txtFilePath.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFilePathFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFilePathFocusLost(evt);
            }
        });
        txtFilePath.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFilePathMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFilePathMouseClicked(evt);
            }
        });
        txtFilePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilePathActionPerformed(evt);
            }
        });
        jPanel2.add(txtFilePath, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 270, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 440, 390));

        setSize(new java.awt.Dimension(785, 401));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void changeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeBtnMouseExited
        // TODO add your handling code here:

       
    }//GEN-LAST:event_changeBtnMouseExited

    private void changeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeBtnMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_changeBtnMouseEntered

    private void changeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeBtnActionPerformed
        filepath = txtFilePath.getText();
        try {
            // TODO add your handling code here:
              con = DriverManager.getConnection("jdbc:mysql://localhost/primaryschool","root","");
            pst = con.prepareStatement("UPDATE syllabus SET location=?");
            pst.setString(1, filepath);
            pst.executeUpdate();
            txtFilePath.setText("Enter the Syllabus Link");
            
        } catch (SQLException ex) {
            Logger.getLogger(ChangeSyllabus.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_changeBtnActionPerformed

    private void cancelBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseExited
        // TODO add your handling code here:
         
    }//GEN-LAST:event_cancelBtnMouseExited

    private void cancelBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cancelBtnMouseEntered

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        new admininterpage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void txtFilePathFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFilePathFocusGained
        // TODO add your handling code here:
        if(txtFilePath.getText().equals("Enter the Syllabus Link"))
            txtFilePath.setText("");
        
    }//GEN-LAST:event_txtFilePathFocusGained

    private void txtFilePathMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFilePathMousePressed
        // TODO add your handling code here:
        //user.setFocusable(true);
    }//GEN-LAST:event_txtFilePathMousePressed

    private void txtFilePathMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFilePathMouseClicked
        // TODO add your handling code here:
        //user.setFocusable(true);
    }//GEN-LAST:event_txtFilePathMouseClicked

    private void txtFilePathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilePathActionPerformed

    }//GEN-LAST:event_txtFilePathActionPerformed

    private void txtFilePathFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFilePathFocusLost
        // TODO add your handling code here:
         if(txtFilePath.getText().equals(""))
            txtFilePath.setText("Enter the Syllabus Link");
    }//GEN-LAST:event_txtFilePathFocusLost
 
    
    
    

    

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
            java.util.logging.Logger.getLogger(ChangeSyllabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeSyllabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeSyllabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeSyllabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ChangeSyllabus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton changeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtFilePath;
    // End of variables declaration//GEN-END:variables
}
