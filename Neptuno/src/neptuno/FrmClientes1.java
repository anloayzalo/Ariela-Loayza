package neptuno;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Daniel Moreano
 */
public class FrmClientes1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmClientes
     */
    public FrmClientes1() 
    {
        initComponents();
        JButton[] botones= {btnGuardar,btnEliminar,btnImprimir,btnModificar};
        for(JButton btn: botones)
        {
            btn.setEnabled(false);
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        lblMantenimiento = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblIdClienteMantenimiento = new javax.swing.JLabel();
        lblNombreContacto = new javax.swing.JLabel();
        lblNombreCompania = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        lblDirección = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        lblRegión = new javax.swing.JLabel();
        txtIdClienteMantenimiento = new javax.swing.JTextField();
        txtNombreContacto = new javax.swing.JTextField();
        txtNombreCompania = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtRegión = new javax.swing.JTextField();
        txtRegión1 = new javax.swing.JTextField();
        lblCódigoPostal = new javax.swing.JLabel();
        txtCódigoPostal = new javax.swing.JTextField();
        lblPaís = new javax.swing.JLabel();
        txtPaís = new javax.swing.JTextField();
        lblTeléfono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblFax = new javax.swing.JLabel();
        txtFax = new javax.swing.JTextField();
        lblBusqueda = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblIdClienteBusqueda = new javax.swing.JLabel();
        txtIdClienteBusqueda = new javax.swing.JTextField();
        lblNombreCompaniaBusqueda = new javax.swing.JLabel();
        txtNombreCompaniaBusqueda = new javax.swing.JTextField();
        tblBusqueda = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo);
        btnNuevo.setBounds(30, 30, 30, 30);
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(110, 30, 33, 30);
        getContentPane().add(btnModificar);
        btnModificar.setBounds(70, 30, 33, 30);
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(150, 30, 33, 30);
        getContentPane().add(btnImprimir);
        btnImprimir.setBounds(190, 30, 33, 30);

        lblMantenimiento.setText("Mantenimiento: ");
        getContentPane().add(lblMantenimiento);
        lblMantenimiento.setBounds(10, 80, 93, 16);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(140, 80, 350, 10);

        lblIdClienteMantenimiento.setText("IdCliente");
        getContentPane().add(lblIdClienteMantenimiento);
        lblIdClienteMantenimiento.setBounds(10, 130, 90, 16);

        lblNombreContacto.setText("Nombre Contacto");
        getContentPane().add(lblNombreContacto);
        lblNombreContacto.setBounds(12, 168, 150, 16);

        lblNombreCompania.setText("Nombre Compania");
        getContentPane().add(lblNombreCompania);
        lblNombreCompania.setBounds(10, 210, 106, 16);

        lblCargo.setText("Cargo");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(10, 250, 34, 16);

        lblDirección.setText("Direccion");
        getContentPane().add(lblDirección);
        lblDirección.setBounds(10, 290, 80, 16);

        lblCiudad.setText("Ciudad");
        getContentPane().add(lblCiudad);
        lblCiudad.setBounds(10, 330, 39, 16);

        lblRegión.setText("Region");
        getContentPane().add(lblRegión);
        lblRegión.setBounds(10, 370, 39, 16);

        txtIdClienteMantenimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdClienteMantenimientoKeyReleased(evt);
            }
        });
        getContentPane().add(txtIdClienteMantenimiento);
        txtIdClienteMantenimiento.setBounds(160, 120, 200, 30);
        getContentPane().add(txtNombreContacto);
        txtNombreContacto.setBounds(160, 160, 203, 30);
        getContentPane().add(txtNombreCompania);
        txtNombreCompania.setBounds(160, 200, 203, 31);
        getContentPane().add(txtCargo);
        txtCargo.setBounds(160, 240, 200, 30);
        getContentPane().add(txtDireccion);
        txtDireccion.setBounds(160, 282, 200, 30);
        getContentPane().add(txtCiudad);
        txtCiudad.setBounds(160, 320, 200, 30);
        getContentPane().add(txtRegión);
        txtRegión.setBounds(-20, -130, 6, 22);
        getContentPane().add(txtRegión1);
        txtRegión1.setBounds(160, 360, 200, 30);

        lblCódigoPostal.setText("Codigo Postal");
        getContentPane().add(lblCódigoPostal);
        lblCódigoPostal.setBounds(10, 410, 77, 16);
        getContentPane().add(txtCódigoPostal);
        txtCódigoPostal.setBounds(160, 400, 200, 30);

        lblPaís.setText("País");
        getContentPane().add(lblPaís);
        lblPaís.setBounds(10, 450, 23, 16);
        getContentPane().add(txtPaís);
        txtPaís.setBounds(160, 440, 200, 30);

        lblTeléfono.setText("Teléfono");
        getContentPane().add(lblTeléfono);
        lblTeléfono.setBounds(10, 490, 50, 16);
        getContentPane().add(txtTelefono);
        txtTelefono.setBounds(160, 480, 200, 30);

        lblFax.setText("Fax");
        getContentPane().add(lblFax);
        lblFax.setBounds(10, 520, 20, 16);
        getContentPane().add(txtFax);
        txtFax.setBounds(160, 520, 200, 30);

        lblBusqueda.setText("Busqueda: ");
        getContentPane().add(lblBusqueda);
        lblBusqueda.setBounds(20, 580, 64, 16);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(100, 580, 590, 20);

        lblIdClienteBusqueda.setText("IdCliente");
        getContentPane().add(lblIdClienteBusqueda);
        lblIdClienteBusqueda.setBounds(20, 630, 50, 16);
        getContentPane().add(txtIdClienteBusqueda);
        txtIdClienteBusqueda.setBounds(90, 622, 210, 30);

        lblNombreCompaniaBusqueda.setText("Nombre Compania");
        getContentPane().add(lblNombreCompaniaBusqueda);
        lblNombreCompaniaBusqueda.setBounds(350, 630, 106, 16);
        getContentPane().add(txtNombreCompaniaBusqueda);
        txtNombreCompaniaBusqueda.setBounds(490, 622, 220, 30);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblBusqueda.setViewportView(jTable2);

        getContentPane().add(tblBusqueda);
        tblBusqueda.setBounds(40, 690, 730, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        JTextField[] nuevo = {txtCargo,txtCiudad,txtCódigoPostal,txtDireccion,txtFax,txtIdClienteBusqueda,
            txtIdClienteBusqueda,txtIdClienteMantenimiento,txtNombreCompaniaBusqueda,
            txtNombreCompania,txtNombreContacto,txtPaís,txtRegión,txtTelefono};
        for(JTextField txt:nuevo)
        {
            txt.setText("");
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtIdClienteMantenimientoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdClienteMantenimientoKeyReleased
        if(txtIdClienteMantenimiento.getText().length() <=5)
        {
            txtIdClienteMantenimiento.setText(txtIdClienteMantenimiento.getText().toUpperCase());
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Maximo 5 caracteres.");
            txtIdClienteMantenimiento.setText(txtIdClienteMantenimiento.getText().substring(0, 5));
        }
    }//GEN-LAST:event_txtIdClienteMantenimientoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblBusqueda;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblCódigoPostal;
    private javax.swing.JLabel lblDirección;
    private javax.swing.JLabel lblFax;
    private javax.swing.JLabel lblIdClienteBusqueda;
    private javax.swing.JLabel lblIdClienteMantenimiento;
    private javax.swing.JLabel lblMantenimiento;
    private javax.swing.JLabel lblNombreCompania;
    private javax.swing.JLabel lblNombreCompaniaBusqueda;
    private javax.swing.JLabel lblNombreContacto;
    private javax.swing.JLabel lblPaís;
    private javax.swing.JLabel lblRegión;
    private javax.swing.JLabel lblTeléfono;
    private javax.swing.JScrollPane tblBusqueda;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCódigoPostal;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFax;
    private javax.swing.JTextField txtIdClienteBusqueda;
    private javax.swing.JTextField txtIdClienteMantenimiento;
    private javax.swing.JTextField txtNombreCompania;
    private javax.swing.JTextField txtNombreCompaniaBusqueda;
    private javax.swing.JTextField txtNombreContacto;
    private javax.swing.JTextField txtPaís;
    private javax.swing.JTextField txtRegión;
    private javax.swing.JTextField txtRegión1;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
