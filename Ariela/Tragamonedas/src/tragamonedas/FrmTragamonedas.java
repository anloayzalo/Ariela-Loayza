
package tragamonedas;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;





public class FrmTragamonedas extends javax.swing.JFrame
{
    int aleatorio1;
    int aleatorio2;
    int aleatorio3;
    int con;
    int tiem;
    int tiem1;
    int tiem2;
    int valorfinal;
    int valorfinal1;
    int valorfinal2;
    int saldoinicial;
    int saldofinal;
    int apuesta;
    int x;
   AudioClip cancion1;

            
    Timer tiempo = new Timer(1, new ActionListener()
    {
        public void actionPerformed (ActionEvent e)
        {
           aleatorio1=(int)(Math.random()*10+1);
           aleatorio2= (int)(Math.random()*10+1);
           aleatorio3=(int)(Math.random()*10+1);
           con++;
           tiem= con%250;
           tiem1= con %150;
           tiem2= con%50;
           
           if (con<=4000)
           {
               if (tiem==0)
               {
                  switch (aleatorio1)
                  {
                      case 1: lbl1.setIcon(new ImageIcon(this.getClass().getResource("a.PNG")));
                      break;
                      case 2: lbl1.setIcon(new ImageIcon(this.getClass().getResource("b.PNG")));
                      break;
                      case 3: lbl1.setIcon(new ImageIcon(this.getClass().getResource("c.PNG")));
                      break;
                      case 4: lbl1.setIcon(new ImageIcon(this.getClass().getResource("d.PNG")));
                      break;
                      case 5: lbl1.setIcon(new ImageIcon(this.getClass().getResource("e.PNG")));
                      break;
                      case 6: lbl1.setIcon(new ImageIcon(this.getClass().getResource("f.PNG")));
                      break;
                      case 7: lbl1.setIcon(new ImageIcon(this.getClass().getResource("g.PNG")));
                      break;
                      case 8: lbl1.setIcon(new ImageIcon(this.getClass().getResource("h.PNG")));
                      break;
                      case 9: lbl1.setIcon(new ImageIcon(this.getClass().getResource("i.PNG")));
                      break;
                      case 10: lbl1.setIcon(new ImageIcon(this.getClass().getResource("j.PNG")));
                      break;              
                  } 
               }
            }
            if (con<=2000)
            {
                if (tiem1 == 0)
                {
                    switch(aleatorio2)
                    {
                      case 1: lbl2.setIcon(new ImageIcon(this.getClass().getResource("a.PNG")));
                      break;
                      case 2: lbl2.setIcon(new ImageIcon(this.getClass().getResource("b.PNG")));
                      break;
                      case 3: lbl2.setIcon(new ImageIcon(this.getClass().getResource("c.PNG")));
                      break;
                      case 4: lbl2.setIcon(new ImageIcon(this.getClass().getResource("d.PNG")));
                      break;
                      case 5: lbl2.setIcon(new ImageIcon(this.getClass().getResource("e.PNG")));
                      break;
                      case 6: lbl2.setIcon(new ImageIcon(this.getClass().getResource("f.PNG")));
                      break;
                      case 7: lbl2.setIcon(new ImageIcon(this.getClass().getResource("g.PNG")));
                      break;
                      case 8: lbl2.setIcon(new ImageIcon(this.getClass().getResource("h.PNG")));
                      break;
                      case 9: lbl2.setIcon(new ImageIcon(this.getClass().getResource("i.PNG")));
                      break;
                      case 10: lbl2.setIcon(new ImageIcon(this.getClass().getResource("j.PNG")));
                      break;
                    }
                }
            }
            if (con<=1000)
            {
                if (tiem2==0)
                {
                    switch(aleatorio3)
                    {
                      case 1: lbl3.setIcon(new ImageIcon(this.getClass().getResource("a.PNG")));
                      break;
                      case 2: lbl3.setIcon(new ImageIcon(this.getClass().getResource("b.PNG")));
                      break;
                      case 3: lbl3.setIcon(new ImageIcon(this.getClass().getResource("c.PNG")));
                      break;
                      case 4: lbl3.setIcon(new ImageIcon(this.getClass().getResource("d.PNG")));
                      break;
                      case 5: lbl3.setIcon(new ImageIcon(this.getClass().getResource("e.PNG")));
                      break;
                      case 6: lbl3.setIcon(new ImageIcon(this.getClass().getResource("f.PNG")));
                      break;
                      case 7: lbl3.setIcon(new ImageIcon(this.getClass().getResource("g.PNG")));
                      break;
                      case 8: lbl3.setIcon(new ImageIcon(this.getClass().getResource("h.PNG")));
                      break;
                      case 9: lbl3.setIcon(new ImageIcon(this.getClass().getResource("i.PNG")));
                      break;
                      case 10: lbl3.setIcon(new ImageIcon(this.getClass().getResource("j.PNG")));
                      break;
                    }
                }
            }
            if (con == 4000)
            {
                valorfinal = aleatorio1;
            }
            if (con==1950)
            {
                valorfinal1= aleatorio2;
            }
            if (con == 1000)
            {
                valorfinal2 = aleatorio3;
            }
            if (con == 4001)
            {
                System.out.print(valorfinal);
                System.out.print(valorfinal1);
                System.out.print(valorfinal2);
                cancion1.stop();
                if((valorfinal == 9) && (valorfinal2== 9) && (valorfinal2 == 9))
                {
                    apuesta = Integer.parseInt((String) cbxSaldo.getSelectedItem());
                    saldoinicial = Integer.valueOf(txtapuesta.getText());
                    saldofinal = saldoinicial+ (apuesta*3);
                    txtapuesta.setText(String.valueOf(saldofinal)); 
                    JOptionPane.showMessageDialog(null, "Gana el triple de lo apostado");
                    tiempo.stop();  
                    con = 0;    
                }                 
                else if((valorfinal == valorfinal1) && (valorfinal1 == valorfinal2))
                {
                    apuesta = Integer.parseInt((String) cbxSaldo.getSelectedItem());
                    saldoinicial = Integer.valueOf(txtapuesta.getText());
                    saldofinal = saldoinicial + (apuesta*2);
                    txtapuesta.setText(String.valueOf(saldofinal)); 
                    JOptionPane.showMessageDialog(null, "Gana el doble de lo apostado");
                    tiempo.stop();
                    con = 0;
                    
                } 
                else if(((valorfinal == 9)&&(valorfinal1 == valorfinal2)) || ((valorfinal1 == 9)&&(valorfinal == valorfinal2)) || ((valorfinal2 == 9)&&(valorfinal == valorfinal1)))
                {
                    apuesta = Integer.parseInt((String) cbxSaldo.getSelectedItem());
                    saldoinicial = Integer.valueOf(txtapuesta.getText());
                    saldofinal = saldoinicial + apuesta;
                    txtapuesta.setText(String.valueOf(saldofinal)); 
                    JOptionPane.showMessageDialog(null, "Gana lo apostado");
                    tiempo.stop();
                    con = 0;
                }
                else
                {
                    apuesta = Integer.parseInt((String) cbxSaldo.getSelectedItem());
                    saldoinicial = Integer.valueOf(txtapuesta.getText());
                    saldofinal = saldoinicial - apuesta;
                    txtapuesta.setText(String.valueOf(saldofinal));                    
                    JOptionPane.showMessageDialog(null , "Perdiste");
                    tiempo.stop();
                    con = 0;    
                } 
                
            }
        }                
    });
    
    public FrmTragamonedas()
    {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lblsaldo = new javax.swing.JLabel();
        lblapuesta = new javax.swing.JLabel();
        cbxSaldo = new javax.swing.JComboBox<>();
        btnjugar = new javax.swing.JButton();
        txtapuesta = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnRecargar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(lbl1);
        lbl1.setBounds(150, 270, 140, 130);
        getContentPane().add(lbl2);
        lbl2.setBounds(300, 280, 150, 130);
        getContentPane().add(lbl3);
        lbl3.setBounds(450, 280, 140, 120);

        lblsaldo.setText("SALDO");
        getContentPane().add(lblsaldo);
        lblsaldo.setBounds(130, 456, 70, 30);

        lblapuesta.setText("APUESTA");
        getContentPane().add(lblapuesta);
        lblapuesta.setBounds(130, 486, 70, 30);

        cbxSaldo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "15", "20", "50", "60", "70", "80", "85", "90", "95", "100", " " }));
        cbxSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSaldoActionPerformed(evt);
            }
        });
        getContentPane().add(cbxSaldo);
        cbxSaldo.setBounds(240, 460, 48, 22);

        btnjugar.setText("JUGAR");
        btnjugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnjugar);
        btnjugar.setBounds(510, 470, 110, 30);

        txtapuesta.setText("100");
        txtapuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapuestaActionPerformed(evt);
            }
        });
        getContentPane().add(txtapuesta);
        txtapuesta.setBounds(240, 500, 27, 22);

        btnSalir.setText("X");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(650, 10, 70, 50);

        btnRecargar.setText("RECARGAR");
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRecargar);
        btnRecargar.setBounds(500, 510, 140, 25);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tragamonedas/maquina.PNG"))); // NOI18N
        lblFondo.setText("jLabel1");
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, 0, 730, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnjugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjugarActionPerformed
        tiempo.start();  
        cancion1 = java.applet.Applet.newAudioClip(getClass().getResource("maquina.wav"));
        cancion1.play();
    }//GEN-LAST:event_btnjugarActionPerformed

    private void txtapuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapuestaActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void cbxSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSaldoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        btnRecargar.show(false);
        btnjugar.show(true);
        for( int Valor = 5; Valor <= 100 ; Valor = Valor + 5 ){
            cbxSaldo.addItem( Integer.toString( Valor ) );
        }
        txtapuesta.setText("100");
    }//GEN-LAST:event_btnRecargarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmTragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTragamonedas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRecargar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnjugar;
    private javax.swing.JComboBox<String> cbxSaldo;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblapuesta;
    private javax.swing.JLabel lblsaldo;
    private javax.swing.JTextField txtapuesta;
    // End of variables declaration//GEN-END:variables
}
