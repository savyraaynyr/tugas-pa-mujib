package belajarjavasv;

import javax.swing.JOptionPane;

/**
 * A simple login form with username and password fields.
 */
public class modul3 extends javax.swing.JFrame {

    /**
     * Creates new form
     */
    public modul3() {
        initComponents();
    }

    /**
     * Initialize the form.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ePassword = new javax.swing.JPasswordField();
        eUser = new javax.swing.JTextField();
        bLogin = new javax.swing.JButton();
        bBatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Form");

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        bLogin.setText("Login");
        bLogin.addActionListener(evt -> loginActionPerformed(evt));

        bBatal.setText("Cancel");
        bBatal.addActionListener(evt -> cancelActionPerformed(evt));

        // Layout setup
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(eUser, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(ePassword))
                .addGap(81, 81, 81))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(bLogin)
                .addGap(39, 39, 39)
                .addComponent(bBatal)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(eUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bLogin)
                    .addComponent(bBatal))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }

    /**
     * Handles login button click event.
     */
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String username = eUser.getText();
        String password = new String(ePassword.getPassword());
        
        // Validate credentials (simple example)
        if ("sahru".equals(username) && "123".equals(password)) {
            JOptionPane.showMessageDialog(null, 
                "Selamat Anda Berhasil Login\nUsername: " + username + "\nPassword: " + password, 
                "Login Success", JOptionPane.INFORMATION_MESSAGE);
            // Open new form
            new Java2().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, 
                "Maaf user dan password salah", 
                "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    } 

    /**
     * Handles cancel button click event.
     */
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {                                       
        eUser.setText("");
        ePassword.setText("");
    }                                      

    /**
     * Main method to start the application.
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(modul3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new modul3().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton bBatal;
    private javax.swing.JButton bLogin;
    private javax.swing.JPasswordField ePassword;
    private javax.swing.JTextField eUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration                   
}