package pptls;

import javax.swing.JOptionPane;

public class Frmpptls extends javax.swing.JFrame {
    
    int aleatorio;
 
    public Frmpptls() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnpiedra = new javax.swing.JButton();
        btnpapel = new javax.swing.JButton();
        btntijeras = new javax.swing.JButton();
        btnspock = new javax.swing.JButton();
        btnlsgsrto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnpiedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pptls/piedra.PNG"))); // NOI18N
        btnpiedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpiedraActionPerformed(evt);
            }
        });

        btnpapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pptls/papel.PNG"))); // NOI18N
        btnpapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpapelActionPerformed(evt);
            }
        });

        btntijeras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pptls/tijeras.PNG"))); // NOI18N
        btntijeras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntijerasActionPerformed(evt);
            }
        });

        btnspock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pptls/spock.PNG"))); // NOI18N
        btnspock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnspockActionPerformed(evt);
            }
        });

        btnlsgsrto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pptls/lagarto.PNG"))); // NOI18N
        btnlsgsrto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlsgsrtoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnpiedra, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(btnpapel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btntijeras, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(btnlsgsrto))
                    .addComponent(btnspock, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnpapel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnpiedra, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnlsgsrto, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(btntijeras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addComponent(btnspock, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntijerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntijerasActionPerformed
        
      if ( aleatorio == 3 )  
      {
          JOptionPane.showMessageDialog(null, "Empate");
      }
      else if ((aleatorio == 2) || (aleatorio == 4))
      {
          JOptionPane.showMessageDialog(null,"Ganaste");
      }
      else
      {
          JOptionPane.showMessageDialog(null, "Perdiste");
      }
            
    }//GEN-LAST:event_btntijerasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
               
        aleatorio =(int)(Math.random()*5+1);
        System.out.print(aleatorio);

    }//GEN-LAST:event_formWindowOpened

    private void btnpiedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpiedraActionPerformed
        
        if(aleatorio == 1)
        {
            JOptionPane.showMessageDialog(null, "Empate");
        }
        else if((aleatorio == 3 ) || (aleatorio ==4 ))
        {
            JOptionPane.showMessageDialog(null, "Ganaste");
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Perdiste");
        }
        
        
    }//GEN-LAST:event_btnpiedraActionPerformed

    private void btnpapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpapelActionPerformed
        
        if (aleatorio == 2)
        {
            JOptionPane.showMessageDialog(null,"Empastate");
        }
        else if ((aleatorio == 1) || (aleatorio == 5))
        {
            JOptionPane.showMessageDialog(null,"Ganaste");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Perdiste");
        }
        
    }//GEN-LAST:event_btnpapelActionPerformed

    private void btnlsgsrtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlsgsrtoActionPerformed
        
        if (aleatorio == 4)
        {
            JOptionPane.showMessageDialog(null,"Empastate");
        }
        else if ((aleatorio == 2) || (aleatorio == 5))
        {
            JOptionPane.showMessageDialog(null,"Ganaste");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Perdiste");
        }
    }//GEN-LAST:event_btnlsgsrtoActionPerformed

    private void btnspockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnspockActionPerformed
        if (aleatorio == 5)
        {
            JOptionPane.showMessageDialog(null,"Empastate");
        }
        else if ((aleatorio == 1) || (aleatorio == 3))
        {
            JOptionPane.showMessageDialog(null,"Ganaste");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Perdiste");
        }
    }//GEN-LAST:event_btnspockActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmpptls().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlsgsrto;
    private javax.swing.JButton btnpapel;
    private javax.swing.JButton btnpiedra;
    private javax.swing.JButton btnspock;
    private javax.swing.JButton btntijeras;
    // End of variables declaration//GEN-END:variables
}
