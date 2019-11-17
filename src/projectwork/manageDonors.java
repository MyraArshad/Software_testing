package projectwork;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class manageDonors {

    private Connection mycon = null;
    private Statement mystat = null;
    private ResultSet myres = null;
    database obj;

    public manageDonors() {
        obj = new database();
    }

//    public void connect_db(){
//        try {
//            mycon=DriverManager.getConnection("jdbc:derby://localhost:1527/donors");
//        } catch (SQLException ex) {
//            Logger.getLogger(manageDonors.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    
//    
//    
//    }
    public boolean set_data(String a, long b, long c, String d) {
        boolean result = false;

        result = obj.insertDonors(a, b, c, d);
        return result;

    }

    public boolean deleteD(String text) throws SQLException {
        boolean flag = false;
        long dcnic = Long.parseLong(text);
        flag = obj.deleteD(dcnic);
        return flag;

    }

    public boolean updateDemail(String a, String b) throws SQLException {
        boolean flag = false;
        System.out.println("old email : " + a + " new email : " + b);
        flag = obj.updateDonor_information(a, b, 1);

        return flag;
    }

    public boolean updateDname(String a, String b) throws SQLException {
        boolean flag = false;
        System.out.println("old email : " + a + " new email : " + b);

        flag = obj.updateDonor_information(a, b, 2);

        return flag;
    }

    

    public boolean updateDcnum(String a, String b) throws SQLException {
        boolean flag = false;
        flag = obj.updateDonor_information(a, b, 4);

        return flag;

    }

    public ResultSet Selectingdonors() {
        database d = new database();
        ResultSet rs = null;
        try {
            rs = d.Selectdonors();
        } catch (SQLException e) {
            e.getStackTrace();
        }
        return rs;
    }

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
            java.util.logging.Logger.getLogger(manage_donors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manage_donors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manage_donors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manage_donors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_donors().setVisible(true);
            }
        });
    }

}
