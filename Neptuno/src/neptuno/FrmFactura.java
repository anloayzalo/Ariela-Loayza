package neptuno;

import javax.swing.JButton;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrmFactura extends javax.swing.JInternalFrame {


    public FrmFactura() 
    {   initComponents();

        JButton[] botones = {btnNuevo,btnGuardar,btnModificar,btnEliminar,btnImprimir};
        int xbotones =10;
        
        for(JButton btn:botones)
        {
            btn.setBounds(xbotones,0,40,40);
            xbotones += 50;
        }

        JTextField[] fila1 = {txtDescripcion,txtCantidad,txtPrecio,txtSubtotal};
        JTextField[] fila2 = {txtDescripcion1,txtCantidad1,txtPrecio1,txtSubtotal1};
        JTextField[] fila3 = {txtDescripcion2,txtCantidad2,txtPrecio2,txtSubtotal2};
        JTextField[] fila4 = {txtDescripcion3,txtCantidad3,txtPrecio3,txtSubtotal3};
        int xtexField = 110;
        int ytexField = 260;
        
        for(JTextField txt:fila1)
        {
            txt.setBounds(xtexField,ytexField,100,20);
            xtexField += 110;
        }    
        xtexField = 110;
        ytexField = 260;
        
        for(JTextField txt:fila2)
            
        {
            txt.setBounds(xtexField,ytexField+30,100,20);
            xtexField += 110;
        }   
        
        xtexField = 110;
        ytexField = 260;
        
        for(JTextField txt:fila3)
            
        {
            txt.setBounds(xtexField,ytexField+60,100,20);
            xtexField += 110;
        } 
        
        xtexField = 110;
        ytexField = 260;
        
        for(JTextField txt:fila4)
            
        {
            txt.setBounds(xtexField,ytexField+90,100,20);
            xtexField += 110;
        }    
        
        JComboBox[] colCantidad = {cbxCodigo,cbxCliente,cbxCliente2,cbxCliente3};
        int xcombBox = 30;
        int ycombBox = 260;
        for(JComboBox cbx:colCantidad)
        {
            cbx.setBounds(xcombBox,ycombBox,60,20);
            ycombBox += 30;
        }
        //Labels tabla
        JLabel[] Titulos = {lblCantidad,lblDescripcion,lblCantidad,lblPrecio,lblSubtotal};
        int xlbl = 30;
        int ylbl = 240;
        for(JLabel lbl:Titulos)
        {
            lbl.setBounds(xlbl,ylbl,100,20);
            xlbl += 110;
        }    

        JLabel[] Abajo = {lblSubtotalfinal,lblDescuento,lblIVA,lblTotal};
        int xlblA = 300;
        int ylblA = 390;
        for(JLabel lbl:Abajo)
        {
            lbl.setBounds(xlblA,ylblA,100,20);
            ylblA += 25;
        } 

        JTextField[] DesIva = {txtDesc,txtIvades};
        int xtxtDesIva = 370;
        int ytxtDesIva = 415;
        for(JTextField txt:DesIva)
        {
            txt.setBounds(xtxtDesIva,ytxtDesIva,20,20);
            ytxtDesIva += 25;
        } 

//        JLabel[] porc = {lblPorc,lblPorc1};
//        int xtxtPorc = 395;
//        int ytxtPorc = 415;
//        for(JLabel txt:porc)
//        {
//            txt.setBounds(xtxtPorc,ytxtPorc,20,20);
//            ytxtPorc += 25;
//        } 
        //txt de abajo
        JTextField[] texAbajo = {txtSubtotal4,txtDescuento,txtIVA,txtTotal};
        int xtxtA = 410;
        int ytxtA = 390;
        for(JTextField txt:texAbajo)
        {
            txt.setBounds(xtxtA,ytxtA,80,20);
            ytxtA += 25;
        } 

        JLabel[] datosArribaIzq = {lblCliente,lblDireccion};
        int xlblArr = 50;
        int ylblArr = 80;
        for(JLabel lbl:datosArribaIzq)
        {
            lbl.setBounds(xlblArr, ylblArr, 80, 20);
            ylblArr += 30;
        }

        JLabel[] datosArribaDer = {lblFecha,lblTelefono};
        xlblArr = 350;
        ylblArr = 80;
        for(JLabel lbl:datosArribaDer)
        {
            lbl.setBounds(xlblArr, ylblArr, 80, 20);
            ylblArr += 30;
        }

        JTextField[] texArribaDer = {txtFecha,txtTelefono};
        int xtxtArr = 410;
        int ytxtArr = 80;
        for(JTextField txt:texArribaDer)
        {
            txt.setBounds(xtxtArr,ytxtArr,100,20);
            ytxtArr += 30;
        } 

        txtDireccion.setBounds(120, 110, 100, 20);
 
        cbxCliente.setBounds(120, 80, 100, 20);      
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCliente = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        cbxCodigo = new javax.swing.JComboBox<>();
        lblDescripcion = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();
        cbxCliente = new javax.swing.JComboBox<>();
        lblSubtotalfinal = new javax.swing.JLabel();
        lblDescuento = new javax.swing.JLabel();
        lblIVA = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        cbxCliente1 = new javax.swing.JComboBox<>();
        cbxCliente2 = new javax.swing.JComboBox<>();
        cbxCliente3 = new javax.swing.JComboBox<>();
        txtDescripcion1 = new javax.swing.JTextField();
        txtDescripcion2 = new javax.swing.JTextField();
        txtDescripcion3 = new javax.swing.JTextField();
        txtCantidad1 = new javax.swing.JTextField();
        txtCantidad2 = new javax.swing.JTextField();
        txtCantidad3 = new javax.swing.JTextField();
        txtPrecio1 = new javax.swing.JTextField();
        txtPrecio2 = new javax.swing.JTextField();
        txtPrecio3 = new javax.swing.JTextField();
        txtSubtotal1 = new javax.swing.JTextField();
        txtSubtotal2 = new javax.swing.JTextField();
        txtSubtotal3 = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        txtIvades = new javax.swing.JTextField();
        txtSubtotal4 = new javax.swing.JTextField();
        txtDescuento = new javax.swing.JTextField();
        txtIVA = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        lblFactura = new javax.swing.JLabel();
        lblFac = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 800));
        getContentPane().setLayout(null);

        lblCliente.setText("CLIENTE");
        getContentPane().add(lblCliente);
        lblCliente.setBounds(20, 130, 48, 16);

        lblDireccion.setText("DIRECCION");
        getContentPane().add(lblDireccion);
        lblDireccion.setBounds(20, 170, 64, 16);

        lblFecha.setText("FECHA");
        getContentPane().add(lblFecha);
        lblFecha.setBounds(320, 120, 38, 16);

        lblTelefono.setText("TELEFONO");
        getContentPane().add(lblTelefono);
        lblTelefono.setBounds(320, 170, 61, 16);

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(txtDireccion);
        txtDireccion.setBounds(100, 170, 180, 22);

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        getContentPane().add(txtFecha);
        txtFecha.setBounds(410, 120, 90, 22);
        getContentPane().add(txtTelefono);
        txtTelefono.setBounds(410, 160, 90, 22);

        lblCodigo.setText("CODIGO");
        getContentPane().add(lblCodigo);
        lblCodigo.setBounds(20, 210, 46, 16);

        cbxCodigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(cbxCodigo);
        cbxCodigo.setBounds(20, 250, 64, 22);

        lblDescripcion.setText("DESCRIPCION");
        getContentPane().add(lblDescripcion);
        lblDescripcion.setBounds(100, 210, 79, 16);

        lblCantidad.setText("CANTIDAD");
        getContentPane().add(lblCantidad);
        lblCantidad.setBounds(210, 210, 60, 16);

        lblPrecio.setText("PRECIO");
        getContentPane().add(lblPrecio);
        lblPrecio.setBounds(310, 210, 43, 16);

        lblSubtotal.setText("SUBTOTAL");
        getContentPane().add(lblSubtotal);
        lblSubtotal.setBounds(410, 210, 62, 16);
        getContentPane().add(txtDescripcion);
        txtDescripcion.setBounds(100, 250, 79, 22);
        getContentPane().add(txtCantidad);
        txtCantidad.setBounds(200, 250, 83, 22);
        getContentPane().add(txtPrecio);
        txtPrecio.setBounds(300, 250, 80, 22);
        getContentPane().add(txtSubtotal);
        txtSubtotal.setBounds(400, 250, 80, 22);

        cbxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbxCliente);
        cbxCliente.setBounds(110, 130, 64, 22);

        lblSubtotalfinal.setText("SubTotal");
        getContentPane().add(lblSubtotalfinal);
        lblSubtotalfinal.setBounds(202, 413, 51, 16);

        lblDescuento.setText("Descuento");
        getContentPane().add(lblDescuento);
        lblDescuento.setBounds(202, 439, 59, 16);

        lblIVA.setText("IVA");
        getContentPane().add(lblIVA);
        lblIVA.setBounds(202, 471, 20, 16);

        lblTotal.setText("Total");
        getContentPane().add(lblTotal);
        lblTotal.setBounds(202, 494, 29, 16);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neptuno/nuevo.PNG"))); // NOI18N
        getContentPane().add(btnNuevo);
        btnNuevo.setBounds(10, 20, 40, 30);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neptuno/guardar.PNG"))); // NOI18N
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(60, 20, 40, 31);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neptuno/editas.PNG"))); // NOI18N
        getContentPane().add(btnModificar);
        btnModificar.setBounds(110, 20, 30, 30);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neptuno/eliminar.PNG"))); // NOI18N
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(150, 20, 40, 30);

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neptuno/imprimir.PNG"))); // NOI18N
        getContentPane().add(btnImprimir);
        btnImprimir.setBounds(200, 20, 30, 30);

        cbxCliente1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbxCliente1);
        cbxCliente1.setBounds(20, 290, 64, 22);

        cbxCliente2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbxCliente2);
        cbxCliente2.setBounds(20, 330, 64, 22);

        cbxCliente3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbxCliente3);
        cbxCliente3.setBounds(20, 370, 64, 22);
        getContentPane().add(txtDescripcion1);
        txtDescripcion1.setBounds(100, 290, 79, 22);

        txtDescripcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcion2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtDescripcion2);
        txtDescripcion2.setBounds(100, 330, 79, 22);
        getContentPane().add(txtDescripcion3);
        txtDescripcion3.setBounds(100, 370, 79, 22);
        getContentPane().add(txtCantidad1);
        txtCantidad1.setBounds(200, 290, 83, 22);
        getContentPane().add(txtCantidad2);
        txtCantidad2.setBounds(200, 330, 83, 22);
        getContentPane().add(txtCantidad3);
        txtCantidad3.setBounds(200, 370, 83, 22);
        getContentPane().add(txtPrecio1);
        txtPrecio1.setBounds(300, 290, 80, 22);
        getContentPane().add(txtPrecio2);
        txtPrecio2.setBounds(300, 330, 80, 22);
        getContentPane().add(txtPrecio3);
        txtPrecio3.setBounds(300, 370, 80, 22);
        getContentPane().add(txtSubtotal1);
        txtSubtotal1.setBounds(400, 290, 80, 22);
        getContentPane().add(txtSubtotal2);
        txtSubtotal2.setBounds(400, 330, 80, 22);
        getContentPane().add(txtSubtotal3);
        txtSubtotal3.setBounds(400, 370, 80, 22);
        getContentPane().add(txtDesc);
        txtDesc.setBounds(270, 440, 20, 22);
        getContentPane().add(txtIvades);
        txtIvades.setBounds(270, 470, 20, 20);

        txtSubtotal4.setText("jTextField1");
        getContentPane().add(txtSubtotal4);
        txtSubtotal4.setBounds(330, 410, 69, 22);

        txtDescuento.setText("jTextField2");
        getContentPane().add(txtDescuento);
        txtDescuento.setBounds(330, 440, 69, 22);

        txtIVA.setText("jTextField3");
        getContentPane().add(txtIVA);
        txtIVA.setBounds(330, 470, 69, 22);

        txtTotal.setText("jTextField5");
        getContentPane().add(txtTotal);
        txtTotal.setBounds(330, 500, 69, 22);

        lblFactura.setText("Factura:");
        getContentPane().add(lblFactura);
        lblFactura.setBounds(80, 70, 60, 16);

        lblFac.setText("XXXXXX");
        getContentPane().add(lblFac);
        lblFac.setBounds(130, 70, 60, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void cbxCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCodigoActionPerformed

    private void txtDescripcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcion2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbxCliente;
    private javax.swing.JComboBox<String> cbxCliente1;
    private javax.swing.JComboBox<String> cbxCliente2;
    private javax.swing.JComboBox<String> cbxCliente3;
    private javax.swing.JComboBox<String> cbxCodigo;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFac;
    private javax.swing.JLabel lblFactura;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblIVA;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblSubtotalfinal;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCantidad1;
    private javax.swing.JTextField txtCantidad2;
    private javax.swing.JTextField txtCantidad3;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDescripcion1;
    private javax.swing.JTextField txtDescripcion2;
    private javax.swing.JTextField txtDescripcion3;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtIvades;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecio1;
    private javax.swing.JTextField txtPrecio2;
    private javax.swing.JTextField txtPrecio3;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtSubtotal1;
    private javax.swing.JTextField txtSubtotal2;
    private javax.swing.JTextField txtSubtotal3;
    private javax.swing.JTextField txtSubtotal4;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
