package pptls;

import java.applet.AudioClip;
import javax.swing.JOptionPane;

public class Frmpptls extends javax.swing.JFrame {
    
    int aleatorio;
 
    public Frmpptls() 
    {
        initComponents();
        btnpiedra.setOpaque(false);
        btnpiedra.setContentAreaFilled(false);
        btnpiedra.setBorderPainted(false);
        btnpapel.setOpaque(false);
        btnpapel.setContentAreaFilled(false);
        btnpapel.setBorderPainted(false);
        btnlagarto.setOpaque(false);
        btnlagarto.setContentAreaFilled(false);
        btnlagarto.setBorderPainted(false);
        btnspock.setOpaque(false);
        btnspock.setContentAreaFilled(false);
        btnspock.setBorderPainted(false);
        btntijeras.setOpaque(false);
        btntijeras.setContentAreaFilled(false);
        btntijeras.setBorderPainted(false);
        this.setLocationRelativeTo(null);
      
    }

    void perdiste()
        {
        lblper.setText(String.valueOf(Integer.valueOf(lblper.getText())+1));
        }
    
    void ganaste()
        {
        lblvic.setText(String.valueOf(Integer.valueOf(lblvic.getText())+1));
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnpapel = new javax.swing.JButton();
        btntijeras = new javax.swing.JButton();
        btnspock = new javax.swing.JButton();
        btnlagarto = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        btnpiedra = new javax.swing.JButton();
        lblresultados = new javax.swing.JLabel();
        lblvitorias = new javax.swing.JLabel();
        lvlperdidas = new javax.swing.JLabel();
        lblvic = new javax.swing.JLabel();
        lblper = new javax.swing.JLabel();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        btnpapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpapelActionPerformed(evt);
            }
        });
        getContentPane().add(btnpapel);
        btnpapel.setBounds(230, 190, 100, 80);

        btntijeras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntijerasActionPerformed(evt);
            }
        });
        getContentPane().add(btntijeras);
        btntijeras.setBounds(120, 110, 100, 80);

        btnspock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnspockActionPerformed(evt);
            }
        });
        getContentPane().add(btnspock);
        btnspock.setBounds(20, 190, 90, 80);

        btnlagarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlagartoActionPerformed(evt);
            }
        });
        getContentPane().add(btnlagarto);
        btnlagarto.setBounds(60, 330, 100, 70);

        btnexit.setText("EXIT");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        getContentPane().add(btnexit);
        btnexit.setBounds(385, 387, 59, 25);

        btnpiedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpiedraActionPerformed(evt);
            }
        });
        getContentPane().add(btnpiedra);
        btnpiedra.setBounds(190, 320, 100, 80);
        getContentPane().add(lblresultados);
        lblresultados.setBounds(410, 170, 120, 110);

        lblvitorias.setText("VICTORIAS");
        getContentPane().add(lblvitorias);
        lblvitorias.setBounds(230, 30, 90, 20);

        lvlperdidas.setText("PERDIDAS");
        getContentPane().add(lvlperdidas);
        lvlperdidas.setBounds(340, 30, 70, 16);

        lblvic.setText("0");
        getContentPane().add(lblvic);
        lblvic.setBounds(250, 60, 50, 20);

        lblper.setText("0");
        getContentPane().add(lblper);
        lblper.setBounds(360, 60, 40, 20);

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pptls/pptlsi.png"))); // NOI18N
        getContentPane().add(lblfondo);
        lblfondo.setBounds(0, 0, 550, 510);

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
          ganaste();
      }
      else
      {
          JOptionPane.showMessageDialog(null, "Perdiste");
          perdiste();
      }
       if(aleatorio==1)
        {
            lblresultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("piedra.PNG")));
        }
        else if(aleatorio==2)
        {
            lblresultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("papel.PNG")));
        }
        else if(aleatorio==3)
        {
            lblresultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("tijera.PNG")));
        }
        else if(aleatorio==4)
        {
            lblresultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("lagarto.PNG")));
        }
        else if(aleatorio==5)
        {
            lblresultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("spock.PNG")));
        }     
    }//GEN-LAST:event_btntijerasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
               
        aleatorio =(int)(Math.random()*5+1);
        System.out.print(aleatorio);
        AudioClip cancion1;
        cancion1 = java.applet.Applet.newAudioClip(getClass().getResource("pptls.wav"));
        cancion1.play();
        lblresultados.setBackground(null);

    }//GEN-LAST:event_formWindowOpened

    private void btnpiedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpiedraActionPerformed
        
        if(aleatorio == 1)
        {
            JOptionPane.showMessageDialog(null, "Empate");
        }
        else if((aleatorio == 3 ) || (aleatorio ==4 ))
        {
            JOptionPane.showMessageDialog(null, "Ganaste");
            ganaste();
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Perdiste");
            perdiste();
        }
         if(aleatorio==1)
        {
            lblresultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("piedra.PNG")));
        }
        else if(aleatorio==2)
        {
            lblresultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("papel.PNG")));
        }
        else if(aleatorio==3)
        {
            lblresultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("tijera.PNG")));
        }
        else if(aleatorio==4)
        {
            lblresultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("lagarto.PNG")));
        }
        else if(aleatorio==5)
        {
            lblresultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("spock.PNG")));
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
            ganaste();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Perdiste");
            perdiste();
        }
         if(aleatorio==1)
        {
            lblresultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("piedra.PNG")));
        }
        else if(aleatorio==2)
        {
            lblresultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("papel.PNG")));
        }
        else if(aleatorio==3)
        {
            lblresultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("tijera.PNG")));
        }
        else if(aleatorio==4)
        {
            lblresultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("lagarto.PNG")));
        }
        else if(aleatorio==5)
        {
            lblresultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("spock.PNG")));
        }     
    }//GEN-LAST:event_btnpapelActionPerformed

    private void btnlagartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlagartoActionPerformed
        
        if (aleatorio == 4)
        {
            JOptionPane.showMessageDialog(null,"Empastate");
        }
        else if ((aleatorio == 2) || (aleatorio == 5))
        {
            JOptionPane.showMessageDialog(null,"Ganaste");
            ganaste();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Perdiste");
            perdiste();
        }
         if(aleatorio==1)
        {
            lblresultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("piedra.PNG")));
        }
        else if(aleatorio==2)
        {
            lblresultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("papel.PNG")));
        }
        else if(aleatorio==3)
        {
            lblresultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("tijera.PNG")));
        }
        else if(aleatorio==4)
        {
            lblresultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("lagarto.PNG")));
        }
        else if(aleatorio==5)
        {
            lblresultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("spock.PNG")));
        }     
    }//GEN-LAST:event_btnlagartoActionPerformed

    private void btnspockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnspockActionPerformed
        if (aleatorio == 5)
        {
            JOptionPane.showMessageDialog(null,"Empastate");
        }
        else if ((aleatorio == 1) || (aleatorio == 3))
        {
            JOptionPane.showMessageDialog(null,"Ganaste");
            ganaste();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Perdiste");
            perdiste();
        }
         if(aleatorio==1)
        {
            lblresultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("piedra.PNG")));
        }
        else if(aleatorio==2)
        {
            lblresultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("papel.PNG")));
        }
        else if(aleatorio==3)
        {
            lblresultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("tijera.PNG")));
        }
        else if(aleatorio==4)
        {
            lblresultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("lagarto.PNG")));
        }
        else if(aleatorio==5)
        {
            lblresultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("spock.PNG")));
        }     
    }//GEN-LAST:event_btnspockActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmpptls().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnlagarto;
    private javax.swing.JButton btnpapel;
    private javax.swing.JButton btnpiedra;
    private javax.swing.JButton btnspock;
    private javax.swing.JButton btntijeras;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JLabel lblper;
    private javax.swing.JLabel lblresultados;
    private javax.swing.JLabel lblvic;
    private javax.swing.JLabel lblvitorias;
    private javax.swing.JLabel lvlperdidas;
    // End of variables declaration//GEN-END:variables
}
