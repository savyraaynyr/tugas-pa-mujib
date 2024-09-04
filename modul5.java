package belajarjavasv;

import javax.swing.JOptionPane;

/**
 * A simple form to place food and drink orders.
 */
public class Modul5 extends javax.swing.JFrame {

    /**
     * Creates new form Modul5
     */
    public Modul5() {
        initComponents();
    }

    /**
     * Initialize the form.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        eNAMA = new javax.swing.JTextField();
        eALAMAT = new javax.swing.JTextField();
        cbPasta = new javax.swing.JCheckBox();
        cbFrenchFries = new javax.swing.JCheckBox();
        cbSusu = new javax.swing.JCheckBox();
        cbChocolate = new javax.swing.JCheckBox();
        ePESAN = new javax.swing.JButton();
        eCLEAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaPesan = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Order Form");

        jLabel1.setText("Name");

        jLabel2.setText("Address");

        jLabel3.setText("Food");

        jLabel4.setText("Drink");

        cbPasta.setText("Pasta");

        cbFrenchFries.setText("French Fries");

        cbSusu.setText("Milk");

        cbChocolate.setText("Chocolate");

        ePESAN.setText("Order");
        ePESAN.addActionListener(evt -> ePESANActionPerformed(evt));

        eCLEAR.setText("Clear");
        eCLEAR.addActionListener(evt -> eCLEARActionPerformed(evt));

        AreaPesan.setColumns(20);
        AreaPesan.setRows(5);
        jScrollPane1.setViewportView(AreaPesan);

        // Layout setup
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eALAMAT, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eNAMA, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(ePESAN)
                                .addGap(18, 18, 18)
                                .addComponent(eCLEAR))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbPasta)
                            .addComponent(cbFrenchFries)
                            .addComponent(cbSusu)
                            .addComponent(cbChocolate))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(eNAMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(eALAMAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbPasta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFrenchFries)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbSusu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbChocolate)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ePESAN)
                    .addComponent(eCLEAR))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }

    /**
     * Handle 'Order' button click event.
     */
    private void ePESANActionPerformed(java.awt.event.ActionEvent evt) {
        StringBuilder daftarMakanan = new StringBuilder();
        StringBuilder daftarMinuman = new StringBuilder();

        if (cbPasta.isSelected()) {
            daftarMakanan.append(cbPasta.getText()).append(", ");
        }
        if (cbFrenchFries.isSelected()) {
            daftarMakanan.append(cbFrenchFries.getText()).append(", ");
        }
        if (cbSusu.isSelected()) {
            daftarMinuman.append(cbSusu.getText()).append(", ");
        }
        if (cbChocolate.isSelected()) {
            daftarMinuman.append(cbChocolate.getText()).append(", ");
        }

        // Remove trailing comma and space
        if (daftarMakanan.length() > 0) {
            daftarMakanan.setLength(daftarMakanan.length() - 2);
        }
        if (daftarMinuman.length() > 0) {
            daftarMinuman.setLength(daftarMinuman.length() - 2);
        }

        AreaPesan.setText(
            "Name: " + eNAMA.getText() + "\n" +
            "Address: " + eALAMAT.getText() + "\n" +
            "Food: " + daftarMakanan + "\n" +
            "Drink: " + daftarMinuman
        );
    }

    /**
     * Handle 'Clear' button click event.
     */
    private void eCLEARActionPerformed(java.awt.event.ActionEvent evt) {
        eNAMA.setText("");
        eALAMAT.setText("");
        cbPasta.setSelected(false);
        cbFrenchFries.setSelected(false);
        cbSusu.setSelected(false);
        cbChocolate.setSelected(false);
        AreaPesan.setText("");
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
            java.util.logging.Logger.getLogger(Modul5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Modul5().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextArea AreaPesan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbChocolate;
    private javax.swing.JCheckBox cbFrenchFries;
    private javax.swing.JCheckBox cbPasta;
    private javax.swing.JCheckBox cbSusu;
    private javax.swing.JTextField eALAMAT;
    private javax.swing.JButton eCLEAR;
    private javax.swing.JTextField eNAMA;
    private javax.swing.JButton ePESAN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}
