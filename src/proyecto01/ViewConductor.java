/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto01;

import javax.swing.JOptionPane;

/**
 *
 * @author Thomas y Felipe
 */
public class ViewConductor extends javax.swing.JFrame {

    Conductor[] listaConductor;

    int contador;

    public ViewConductor() {
        initComponents();

        listaConductor = new Conductor[10];
        contador = 0;
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
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        BtnGuardarConductor = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        txtEmail = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        SpinnerExp = new javax.swing.JSpinner();
        BtnVolver = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtLicencia = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        txtCedula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(73, 181, 172));
        jPanel1.setPreferredSize(new java.awt.Dimension(370, 470));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto01/img/Logo.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 370, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 440));

        jPanel2.setBackground(new java.awt.Color(33, 45, 62));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cedula");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 112, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 182, -1, -1));

        txtNombre.setBackground(new java.awt.Color(33, 45, 62));
        txtNombre.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        txtNombre.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 150, 20));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Experiencia");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        txtCodigo.setBackground(new java.awt.Color(33, 45, 62));
        txtCodigo.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setBorder(null);
        txtCodigo.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 150, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Codigo Empresa");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        txtTelefono.setBackground(new java.awt.Color(33, 45, 62));
        txtTelefono.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.setBorder(null);
        txtTelefono.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 150, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Conductor");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 164, 150, 7));

        jSeparator2.setBackground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 239, 150, 10));

        jSeparator3.setBackground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 150, 10));

        BtnGuardarConductor.setBackground(new java.awt.Color(73, 181, 172));
        BtnGuardarConductor.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        BtnGuardarConductor.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardarConductor.setText("GUARDAR");
        BtnGuardarConductor.setBorder(null);
        BtnGuardarConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarConductorActionPerformed(evt);
            }
        });
        jPanel2.add(BtnGuardarConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 99, 30));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Numero De Licencia");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, -1));

        txtApellido.setBackground(new java.awt.Color(33, 45, 62));
        txtApellido.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido.setBorder(null);
        txtApellido.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 150, -1));

        jSeparator5.setBackground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 150, 10));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefono");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        jSeparator7.setBackground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 150, 10));

        txtEmail.setBackground(new java.awt.Color(33, 45, 62));
        txtEmail.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(null);
        txtEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 150, -1));

        jSeparator8.setBackground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 150, 10));
        jPanel2.add(SpinnerExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 150, -1));

        BtnVolver.setBackground(new java.awt.Color(73, 181, 172));
        BtnVolver.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        BtnVolver.setForeground(new java.awt.Color(255, 255, 255));
        BtnVolver.setText("x");
        BtnVolver.setBorder(null);
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });
        jPanel2.add(BtnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 0, 30, 30));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Email");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Apellido");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        txtLicencia.setBackground(new java.awt.Color(33, 45, 62));
        txtLicencia.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtLicencia.setForeground(new java.awt.Color(255, 255, 255));
        txtLicencia.setBorder(null);
        txtLicencia.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtLicencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 150, -1));

        jSeparator10.setBackground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 150, 10));

        txtCedula.setBackground(new java.awt.Color(33, 45, 62));
        txtCedula.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(255, 255, 255));
        txtCedula.setBorder(null);
        txtCedula.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 150, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, -30, 650, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarConductorActionPerformed

        if (contador < listaConductor.length) {
            String cedula = txtCedula.getText();
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            String email = txtCodigo.getText();
            String telefono = txtTelefono.getText();
            int codigoEmpresa = Integer.parseInt(txtCodigo.getText());
            String licencia = txtLicencia.getText();
            int expreriencia = Integer.parseInt(SpinnerExp.getValue().toString());

            Conductor objConductor = new Conductor(expreriencia, licencia, codigoEmpresa, cedula, nombre, apellido, telefono, email);

            listaConductor[contador] = objConductor;
            contador++;

            JOptionPane.showMessageDialog(this, "Te Has Registrado Con Exito");
        } else {
            JOptionPane.showMessageDialog(this, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
        ViewBuses open = new ViewBuses();
        open.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnGuardarConductorActionPerformed

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        ViewBuses open = new ViewBuses();
        open.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(ViewConductor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewConductor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewConductor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewConductor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewConductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardarConductor;
    private javax.swing.JButton BtnVolver;
    private javax.swing.JSpinner SpinnerExp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLicencia;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
