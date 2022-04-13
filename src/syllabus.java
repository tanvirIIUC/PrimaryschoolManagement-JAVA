/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
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
public class syllabus extends javax.swing.JFrame {

    /**
     * Creates new form LibrarianLogin
     */
    public syllabus() {
      
        initComponents(); 
        connect();
   
        
    }
    
    Connection con ;
    PreparedStatement login , pst , down;
    String filepath;
    
    public void connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/primarySchool","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(syllabus.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(syllabus.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cancelBtn = new javax.swing.JButton();
        downloadBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(70, 72, 235));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sohan\\Downloads\\primary school\\logo.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 232, 242));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 390));

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        downloadBtn.setBackground(new java.awt.Color(70, 72, 235));
        downloadBtn.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        downloadBtn.setForeground(new java.awt.Color(254, 254, 254));
        downloadBtn.setText("Download");
        downloadBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                downloadBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                downloadBtnMouseEntered(evt);
            }
        });
        downloadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadBtnActionPerformed(evt);
            }
        });
        jPanel2.add(downloadBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 120, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sohan\\Downloads\\primary school\\What-is-the-UPSC-NDA-Exam-Syllabus-1-600x480.jpg")); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 390, 290));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 440, 390));

        setSize(new java.awt.Dimension(772, 415));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseExited
        // TODO add your handling code here:

        
    }//GEN-LAST:event_cancelBtnMouseExited

    private void cancelBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseEntered
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cancelBtnMouseEntered

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        new mainpage().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_cancelBtnActionPerformed

    private void downloadBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downloadBtnMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_downloadBtnMouseExited

    private void downloadBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downloadBtnMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_downloadBtnMouseEntered

    private void downloadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadBtnActionPerformed
       
        try {
            // TODO add your handling code here:
            con = DriverManager.getConnection("jdbc:mysql://localhost/primaryschool","root","");
            down = con.prepareStatement("select location from syllabus where id=?");
            down.setString(1, "admin");
            ResultSet rs = down.executeQuery();
            if(rs.next()){
                filepath = rs.getString("location");
                System.out.println(filepath);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(syllabus.class.getName()).log(Level.SEVERE, null, ex);
        }
        Desktop browser = Desktop.getDesktop();
        try {
            
          browser.browse(new URI(filepath));
            
        } catch (IOException e) {
            
            
        }catch(URISyntaxException err){
            
        }
    }//GEN-LAST:event_downloadBtnActionPerformed
 
    
    
    

    

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
            java.util.logging.Logger.getLogger(syllabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(syllabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(syllabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(syllabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new syllabus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton downloadBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}