
package neptuno;

public class FrmPrincipal extends javax.swing.JFrame {

    
    public FrmPrincipal() 
    {
        initComponents();
        setBounds(0,0,3000,3000);
        setLocationRelativeTo(null);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jdpContenedor = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MnuClientes = new javax.swing.JMenuItem();
        MnuEmpleados = new javax.swing.JMenuItem();
        MnuCompanias = new javax.swing.JMenuItem();
        MnuProveedores = new javax.swing.JMenuItem();
        MnuCategorias = new javax.swing.JMenuItem();
        MnuProductos = new javax.swing.JMenuItem();
        MnuFactura = new javax.swing.JMenu();
        Mnufactura = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 700));
        getContentPane().setLayout(null);

        javax.swing.GroupLayout jdpContenedorLayout = new javax.swing.GroupLayout(jdpContenedor);
        jdpContenedor.setLayout(jdpContenedorLayout);
        jdpContenedorLayout.setHorizontalGroup(
            jdpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jdpContenedorLayout.setVerticalGroup(
            jdpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        getContentPane().add(jdpContenedor);
        jdpContenedor.setBounds(0, 0, 800, 800);

        jMenu1.setText("Mantenimiento");

        MnuClientes.setText("Clientes");
        MnuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuClientesActionPerformed(evt);
            }
        });
        jMenu1.add(MnuClientes);

        MnuEmpleados.setText("Empleados");
        MnuEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuEmpleadosActionPerformed(evt);
            }
        });
        jMenu1.add(MnuEmpleados);

        MnuCompanias.setText("Compañias de envio");
        jMenu1.add(MnuCompanias);

        MnuProveedores.setText("Proveedores");
        MnuProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuProveedoresActionPerformed(evt);
            }
        });
        jMenu1.add(MnuProveedores);

        MnuCategorias.setText("Categorias");
        jMenu1.add(MnuCategorias);

        MnuProductos.setText("Productos");
        jMenu1.add(MnuProductos);

        jMenuBar1.add(jMenu1);

        MnuFactura.setText("Facturacion");

        Mnufactura.setText("Factura");
        Mnufactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnufacturaActionPerformed(evt);
            }
        });
        MnuFactura.add(Mnufactura);

        jMenuBar1.add(MnuFactura);

        jMenu3.setText("Reportes");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Acerca de");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnuEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnuEmpleadosActionPerformed

    private void MnuProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuProveedoresActionPerformed

    }//GEN-LAST:event_MnuProveedoresActionPerformed

    private void MnufacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnufacturaActionPerformed
        FrmFactura frmfactura  = new FrmFactura();
        frmfactura.setVisible(true);
        jdpContenedor.add(frmfactura);
    }//GEN-LAST:event_MnufacturaActionPerformed

    private void MnuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuClientesActionPerformed
        FrmClientes1 frmclientes1 = new FrmClientes1();
        frmclientes1.setVisible (true);
        jdpContenedor.add(frmclientes1);
    }//GEN-LAST:event_MnuClientesActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MnuCategorias;
    private javax.swing.JMenuItem MnuClientes;
    private javax.swing.JMenuItem MnuCompanias;
    private javax.swing.JMenuItem MnuEmpleados;
    private javax.swing.JMenu MnuFactura;
    private javax.swing.JMenuItem MnuProductos;
    private javax.swing.JMenuItem MnuProveedores;
    private javax.swing.JMenuItem Mnufactura;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JDesktopPane jdpContenedor;
    // End of variables declaration//GEN-END:variables
}
