
package tragamonedas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;


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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblsaldo.setText("SALDO");

        lblapuesta.setText("APUESTA");

        cbxSaldo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "20", "50", "100", " " }));

        btnjugar.setText("JUGAR");
        btnjugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjugarActionPerformed(evt);
            }
        });

        txtapuesta.setText("100");
        txtapuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapuestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblapuesta)
                    .addComponent(lblsaldo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtapuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnjugar)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(lbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsaldo)
                    .addComponent(cbxSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblapuesta)
                    .addComponent(txtapuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnjugar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnjugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjugarActionPerformed
        tiempo.start();
    }//GEN-LAST:event_btnjugarActionPerformed

    private void txtapuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapuestaActionPerformed

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
    private javax.swing.JButton btnjugar;
    private javax.swing.JComboBox<String> cbxSaldo;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lblapuesta;
    private javax.swing.JLabel lblsaldo;
    private javax.swing.JTextField txtapuesta;
    // End of variables declaration//GEN-END:variables
}
