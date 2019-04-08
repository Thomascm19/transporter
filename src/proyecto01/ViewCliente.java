package proyecto01;

import javax.swing.JOptionPane;


public class ViewCliente extends javax.swing.JFrame {

     Cliente[] listaCliente;

    int contador;
    
    public ViewCliente() {
        initComponents();
        //Se inicializa el arrelo
        listaCliente = new Cliente[10];
        //Se inicializa el cotador 
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        BtnGuardarCliente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        rbtEstandar = new javax.swing.JRadioButton();
        rbtVip = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEquipaje = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(73, 181, 172));
        jPanel1.setPreferredSize(new java.awt.Dimension(370, 470));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto01/img/Logo.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 362, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 730));

        jPanel2.setBackground(new java.awt.Color(33, 45, 62));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cedula");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 112, -1, -1));

        txtCedula.setBackground(new java.awt.Color(33, 45, 62));
        txtCedula.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(255, 255, 255));
        txtCedula.setBorder(null);
        txtCedula.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 150, -1));

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
        jLabel4.setText("Email");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        txtEmail.setBackground(new java.awt.Color(33, 45, 62));
        txtEmail.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(null);
        txtEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 150, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad De Equipaje");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, -1, -1));

        txtTelefono.setBackground(new java.awt.Color(33, 45, 62));
        txtTelefono.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.setBorder(null);
        txtTelefono.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 150, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registar Cliente");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 46, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 164, 150, 7));

        jSeparator2.setBackground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 239, 150, 10));

        jSeparator3.setBackground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 150, 10));

        BtnGuardarCliente.setBackground(new java.awt.Color(73, 181, 172));
        BtnGuardarCliente.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        BtnGuardarCliente.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardarCliente.setText("GUARDAR");
        BtnGuardarCliente.setBorder(null);
        BtnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(BtnGuardarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 660, 99, 30));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Apellido");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        txtApellido.setBackground(new java.awt.Color(33, 45, 62));
        txtApellido.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido.setBorder(null);
        txtApellido.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 150, -1));

        jSeparator5.setBackground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 150, 10));

        rbtEstandar.setBackground(new java.awt.Color(33, 45, 62));
        buttonGroup1.add(rbtEstandar);
        rbtEstandar.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        rbtEstandar.setForeground(new java.awt.Color(255, 255, 255));
        rbtEstandar.setText("Estandar");
        jPanel2.add(rbtEstandar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, -1, -1));

        rbtVip.setBackground(new java.awt.Color(33, 45, 62));
        buttonGroup1.add(rbtVip);
        rbtVip.setFont(new java.awt.Font("Yu Gothic Light", 1, 12)); // NOI18N
        rbtVip.setForeground(new java.awt.Color(255, 255, 255));
        rbtVip.setText("V.I.P");
        jPanel2.add(rbtVip, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefono");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo De Cliente");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, -1, -1));

        txtEquipaje.setBackground(new java.awt.Color(33, 45, 62));
        txtEquipaje.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtEquipaje.setForeground(new java.awt.Color(255, 255, 255));
        txtEquipaje.setBorder(null);
        txtEquipaje.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtEquipaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 620, 150, -1));

        jSeparator6.setBackground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 640, 150, 10));

        jSeparator7.setBackground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 150, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 430, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarClienteActionPerformed
           if (contador < listaCliente.length) {
            String cedula = txtCedula.getText();
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();                      
            String email = txtEmail.getText();
            String telefono = txtTelefono.getText();
            boolean tipo = rbtEstandar.isSelected();
            int equipaje = Integer.parseInt(txtEquipaje.getText()); 
            
            

            //Se crea el objeto
            Cliente objCliente = new Cliente();

            objCliente.setCedula(cedula);
            objCliente.setNombre(nombre);            
            objCliente.setApellido(apellido);
            objCliente.setEmail(email);
            objCliente.setTelefono(telefono);
            objCliente.setTipoCliente(tipo);
            objCliente.setCantidadEquipaje(equipaje);
                        
            listaCliente[contador] = objCliente;
            contador++;

            JOptionPane.showMessageDialog(this, "Van " + contador + " Clientes.");
        } else {
            JOptionPane.showMessageDialog(this, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnGuardarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardarCliente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JRadioButton rbtEstandar;
    private javax.swing.JRadioButton rbtVip;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEquipaje;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
