package spaceinvaders1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class FrmSpaceInvaders1 extends javax.swing.JFrame implements KeyListener{

    ImageIcon img=new ImageIcon(("C:\\Users\\arilo\\Documents\\2do semestre\\Informatica\\SpaceInvaders1\\src\\icon.png"));
    Image Icon=img.getImage();
    int tanque_x=270;
    int tanque_y=470;
    int derecha=0;
    int izquierda=0;
    int disparar=0;
    int bala_x;
    int bala_y;
    int bal2_x=0;
    int bal2_y=0;
    int x,y;
    int estado=0;
    static int size=2;
    int filas,columnas;
    int cont=0;
    int ejex=0;
    int alien_x=60;
    int alien_y=60;
    int signo=-1;
    int comp=0;
    int mult=1;
    int mov=0;
    int contador=1;
    int puntaje_aleatorio=0;
    static int pos=1;
    int aleatorio=(int)Math.rint(Math.random()*300+1);
    int aleatorio2=(int)Math.rint(Math.random()*600+200);
    int al_x=0;
    int al_y=0;
    int frec=300;
    int perd=0;
    int cont_ganar=0;
    int cont_perd=0;
    int alien4_x=-100;
    int alien4_y=40;
    int disparo[][]=new int[5][10];
    int dis_alien=0;
    int comenzar=0;
    int choque[]=new int[16];
    
    
    
    
    static int escudo_x[]={20*size,25*size,60*size,65*size,65*size,55*size,55*size,45*size,40*size,30*size,30*size,20*size};
    static int escudo_y[]={250*size,245*size,245*size,250*size,275*size,275*size,265*size,255*size,255*size,265*size,275*size,275*size};
    
    BufferedImage imgMenu=null;
    ClaseChoque clase_choque[]=new ClaseChoque[16];
    ClaseEscudo clase_escudo=new ClaseEscudo();
    ClaseAliens clase_aliens[][]=new ClaseAliens[5][8];
    Rectangle rect_escudo[]=new Rectangle[16];
    Rectangle rect_aliens[][]=new Rectangle[5][8];
    Rectangle limite1=new Rectangle(-90,0,100,500);
    Rectangle limite2=new Rectangle(580,0,100,500);
    Rectangle bal_alien=new Rectangle();
    public FrmSpaceInvaders1() 
    {
      
     initComponents();
        this.setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK);        
        this.setIconImage(Icon);
        addKeyListener(this);
        try {
             imgMenu=ImageIO.read(new File("C:\\Users\\arilo\\Documents\\2do semestre\\Informatica\\SpaceInvaders1\\src\\menu.png"));
         } catch (IOException ex) {
             Logger.getLogger(FrmSpaceInvaders1.class.getName()).log(Level.SEVERE, null, ex);
         }
      

        x=y=0;
        tanque_x=270;
        tanque_y=470;
        derecha=0;
        izquierda=0;
        disparar=0; 
        bal2_x=0;
        bal2_y=0;
        estado=0;
        cont=0;
        ejex=0;
        alien_x=60;
        alien_y=60;
        signo=-1;
        comp=0;
        mult=1;
        mov=0;
        contador=1;
        puntaje_aleatorio=0;
        pos=1;
        aleatorio=(int)Math.rint(Math.random()*300+1);
        aleatorio2=(int)Math.rint(Math.random()*600+200);
        al_x=0;
        al_y=0;
        frec=300;
        perd=0;
        cont_ganar=0;
        cont_perd=0;
        alien4_x=-100;
        alien4_y=40;
        dis_alien=0;
        comenzar=0;
        lblLives.setText("3");
        lblScore1.setText("0");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<8;j++)
            {
                disparo[i][j]=0;
                
                clase_aliens[i][j]=new ClaseAliens(alien_x,alien_y);
                alien_x+=60;
            }
            alien_x=60;
            alien_y+=40;
        }
        for(int i=0;i<16;i++)
        {
            choque[i]=0;
        }
        for(int i=0;i<8;i+=2)
        {
            clase_choque[i]=new ClaseChoque(50+ejex,360,45,35,0);
            clase_choque[i+1]=new ClaseChoque(95+ejex,360,45,35,0);
            rect_escudo[i]=new Rectangle(50+ejex,360,45,30);
            rect_escudo[i+1]=new Rectangle(95+ejex,360,45,30);
            ejex+=130;
        }
        ejex=0;
        for(int i=8;i<16;i+=2)
        {
            clase_choque[i]=new ClaseChoque(50+ejex,390,25,30,0);
            clase_choque[i+1]=new ClaseChoque(95+ejex+20,390,25,30,0);
            rect_escudo[i]=new Rectangle(50+ejex,390,25,30);
            rect_escudo[i+1]=new Rectangle(95+ejex+20,390,25,30);
            ejex+=130;
        }
        
        bala_x=tanque_x+16;
        bala_y=tanque_y-10;   
    }

     public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e)
    {
        if(e.getKeyCode()==37)
        {
            izquierda=0;
        }
        else if(e.getKeyCode()==39)
        {
            derecha=0;
        }
        
    }
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode()==37)
        {
            izquierda=1;
       
        }
        else if(e.getKeyCode()==39)
        {
            derecha=1;
        }
        if((e.getKeyCode()==32)&&(comenzar==1))
        {
            disparar=1;
        }
        else if((e.getKeyCode()==32)&&(comenzar!=1))
        {
            comenzar=1;            
            x=y=0;
            tanque_x=270;
            tanque_y=470;
            derecha=0;
            izquierda=0;
            disparar=0; 
            bal2_x=0;
            bal2_y=0;
            estado=0;
            cont=0;
            ejex=0;
            alien_x=60;
            alien_y=60;
            signo=-1;
            comp=0;
            mult=1;
            mov=0;
            contador=1;
            puntaje_aleatorio=0;
            pos=1;
            aleatorio=(int)Math.rint(Math.random()*300+1);
            aleatorio2=(int)Math.rint(Math.random()*600+200);
            al_x=0;
            al_y=0;
            frec=300;
            perd=0;
            cont_ganar=0;
            cont_perd=0;
            alien4_x=-100;
            alien4_y=40;
            dis_alien=0;
            lblLives.setText("3");
            lblScore.setText("0");
            for(int i=0;i<5;i++)
            {
                for(int j=0;j<8;j++)
                {
                    disparo[i][j]=0;

                    clase_aliens[i][j]=new ClaseAliens(alien_x,alien_y);
                    alien_x+=60;
                }
                alien_x=60;
                alien_y+=40;
            }
            for(int i=0;i<16;i++)
            {
                choque[i]=0;
            }
            for(int i=0;i<8;i+=2)
            {
                clase_choque[i]=new ClaseChoque(50+ejex,360,45,35,0);
                clase_choque[i+1]=new ClaseChoque(95+ejex,360,45,35,0);
                rect_escudo[i]=new Rectangle(50+ejex,360,45,30);
                rect_escudo[i+1]=new Rectangle(95+ejex,360,45,30);
                ejex+=130;
            }
            ejex=0;
            for(int i=8;i<16;i+=2)
            {
                clase_choque[i]=new ClaseChoque(50+ejex,390,25,30,0);
                clase_choque[i+1]=new ClaseChoque(95+ejex+20,390,25,30,0);
                rect_escudo[i]=new Rectangle(50+ejex,390,25,30);
                rect_escudo[i+1]=new Rectangle(95+ejex+20,390,25,30);
                ejex+=130;
            }

            bala_x=tanque_x+16;
            bala_y=tanque_y-10;
            temporizador.start();
            repaint();
        }
    }
   
    Timer temporizador=new Timer(60,new ActionListener()
    {
        public void actionPerformed(ActionEvent evento)
        {
          
            contador++;
            if(contador>=60000)
            {
                contador=0;
            }
            if(contador%(15-mult)==0)
            {
                pos*=-1;            
            }           

            if(disparar==0)
            {
                bala_x=tanque_x+16;
            }
            else if(bala_y<=10)
            {
                disparar=0;
                bala_y=tanque_y-10;
                bala_x=tanque_x+16;
            }      

            if((derecha==1)&&(tanque_x<=545))
            {
                tanque_x+=10;

            }
            else if((izquierda==1)&&(tanque_x>=15))
            {
                tanque_x-=10;                
            }

               
            repaint();
           
        }
    });
    
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        if(comenzar!=1)
        {
            if(comenzar==0)
            {
                temporizador.stop();
                g.drawImage(imgMenu, 180, 200, this);
                g.setColor(Color.WHITE);
                g.drawString("PRESS SPACE", 260, 350); 
            }
            else if(comenzar==2)
            {
                Font font = new Font("Verdana", Font.BOLD, 24);
                g.setFont(font);
                g.setColor(Color.WHITE);
                g.drawString("YOU WIN!", 230, 300);
                font = new Font("Verdana", Font.BOLD, 12);
                g.setFont(font);
                g.drawString("PRESS SPACE", 260, 350); 
            }
            
        }
        else if(comenzar==1)
        {
            aleatorio2=(int)Math.rint(Math.random()*600+1);
            Rectangle Tanque=new Rectangle(tanque_x,tanque_y,35,10); 
            Rectangle bala=new Rectangle(bala_x, bala_y-10, 2, 10);
            Rectangle alien4=new Rectangle(alien4_x-5,alien4_y,60,20);


            if((contador%aleatorio2==0)&&(perd<3))
            {           
                mov=1;           
            }
            if(bala.intersects(alien4))
            {
                puntaje_aleatorio=(int)Math.rint(Math.random()*190+10);
                g.setColor(Color.YELLOW);
                g.fillRect(alien4_x+13, alien4_y, 5, 5);
                g.fillRect(alien4_x+30, alien4_y, 5, 5);       
                g.fillRect(alien4_x+17, alien4_y+7, 5, 5);
                g.fillRect(alien4_x+25, alien4_y+7, 5, 5);
                g.fillRect(alien4_x-5, alien4_y+5, 5, 5);
                g.fillRect(alien4_x+47, alien4_y+5, 5, 5);
                g.fillRect(alien4_x,alien4_y+10, 5, 5);
                g.fillRect(alien4_x+42,alien4_y+10,5,5);
                g.fillRect(alien4_x+5, alien4_y+15, 10, 5);
                g.fillRect(alien4_x+32, alien4_y+15, 10, 5);
                g.fillRect(alien4_x, alien4_y+20, 5, 5);
                g.fillRect(alien4_x+42, alien4_y+20, 5, 5);
                g.fillRect(alien4_x+17, alien4_y+22, 5, 5);
                g.fillRect(alien4_x+25, alien4_y+22, 5, 5);
                g.fillRect(alien4_x-5, alien4_y+25, 5, 5);
                g.fillRect(alien4_x+47, alien4_y+25, 5, 5);
                g.fillRect(alien4_x+13, alien4_y+30, 5, 5);
                g.fillRect(alien4_x+30, alien4_y+30, 5, 5);
                lblScore.setText(String.valueOf(Integer.valueOf(lblScore.getText())+puntaje_aleatorio));
                alien4_x=-100;
                mov=0;
            }
            else if((mov==1)&&(alien4_x<700)&&(perd<3))
            {
                Alien4(g);
                alien4_x+=5;
            }
            else if((mov==1)&&(alien4_x>=700)&&(perd<3))
            {
                alien4_x=-100;
                mov=0;
            }
            aleatorio=(int)Math.rint(Math.random()*frec+1);
            al_x=(int)Math.rint(Math.random()*4);
            al_y=(int)Math.rint(Math.random()*7);
            if((contador%aleatorio==0)&&(aleatorio!=0)&&(dis_alien==0)&&(disparo[al_x][al_y]==0))
            {

                dis_alien=1;
                bal2_x=20+clase_aliens[al_x][al_y].getEjeX();
                bal2_y=clase_aliens[al_x][al_y].getEjeY();
                System.out.println(al_x+"   "+al_y); 
                aleatorio=0;
            }

            Rectangle bal_alien=new Rectangle(bal2_x, bal2_y, 2, 15);
            if(bal_alien.intersects(Tanque))
            {
                bal2_y=clase_aliens[al_x][al_y].getEjeY();
                dis_alien=0; 
                perd++;
                if(Integer.valueOf(lblLives.getText())>0)
                {
                    lblLives.setText(String.valueOf(Integer.valueOf(lblLives.getText())-1));
                }
        
                cont_perd++;
            }
            else if((cont_perd%4==0)&&(perd<3))
            {
                tanque(g);
                if(cont_perd==0)
                {
                    x+=signo*mult;
                }          
            }
            if((cont_perd<20)&&(cont_perd!=0))
            {
                cont_perd++;
            }
            else
            {
                cont_perd=0;
            }
            alien_x=60;
            alien_y=60;
            Escudos(g);
            if((dis_alien==1)&&(cont_perd==0)&&(perd<3))
            {
                g.setColor(Color.WHITE);

                g.fillRect(bal2_x, bal2_y, 2, 15);
                bal2_y+=10;
                if(bal2_y>=500)
                {
                    bal2_y=clase_aliens[al_x][al_y].getEjeY();
                    dis_alien=0;              
                }
            }

            for(int i=0;i<16;i++)
            {
                if((bala.intersects(rect_escudo[i]))&&(choque[i]<8))
                {
                    disparar=0;
                    bala_y=tanque_y-10;
                    bala_x=tanque_x+16;
                    choque[i]+=1;     
                }
                if((bal_alien.intersects(rect_escudo[i]))&&(choque[i]<8))
                {
                    bal2_y=clase_aliens[al_x][al_y].getEjeY();
                    dis_alien=0;
                    choque[i]+=1;  
                }
                clase_choque[i].setChoque(choque[i]);
                clase_choque[i].paint(g);           
            }
 
            for(int i=0;i<5;i++)
            {
                for(int j=0;j<8;j++)
                {
                    clase_aliens[i][j].setEjeY(alien_y+y);
                    if(disparo[i][j]==0)
                    {                                     
                        rect_aliens[i][j]=new Rectangle(alien_x+x, alien_y+y, 45, 35);
                        clase_aliens[i][j].setEjeX(alien_x+2+x);                   
                        //g.drawRect(alien_x+2+x, alien_y+y, 40, 35);
                    } 
                    else if((disparo[i][j]<5))
                    {  
                        rect_aliens[i][j]=new Rectangle(alien_x+2+x, alien_y+y, 0, 0);
                        clase_aliens[i][j].explosion(g);
                        disparo[i][j]++;  
                    }

                    if((bala.intersects(rect_aliens[i][j]))&&(disparo[i][j]==0))
                    {
                        disparar=0;
                        bala_y=tanque_y-10;
                        bala_x=tanque_x+16;
                        disparo[i][j]=1;
                        cont++;
                        if(cont>=3)
                        {
                            mult++;
                            cont=0;
                            if(frec>=10)
                            {
                                frec=(int)Math.rint(frec/2);
                            }
                        }  
                        if(i==0)
                        {
                            lblScore.setText(String.valueOf(Integer.valueOf(lblScore.getText())+40));
                        }
                        else if((i>0)&&(i<3))
                        {
                            lblScore.setText(String.valueOf(Integer.valueOf(lblScore.getText())+20));
                        }
                        else if((i>2)&&(i<5))
                        {
                            lblScore.setText(String.valueOf(Integer.valueOf(lblScore.getText())+10));
                        }
                        cont_ganar++;

                    }
                    if((limite1.intersects(rect_aliens[i][j]))||(limite2.intersects(rect_aliens[i][j])))
                    {
                        comp=1;
                    }          

                    alien_x+=60;

                }            

                alien_x=60;
                alien_y+=40;
            }


            if((comp==1)&&(cont_perd==0)&&(perd<3))
            {

                signo*=-1;
                y+=5;
                comp=0;
            }
            for(int i=0;i<8;i++)
            {
                if(disparo[0][i]==0)
                {
                    clase_aliens[0][i].Alien3(g);

                }           
            }
            for (int i=0;i<2;i++)
            {
                for(int j=0;j<8;j++)
                {
                    if(disparo[i+1][j]==0)
                    {
                        clase_aliens[i+1][j].Alien2(g);
                    }                
                }
            }
            for(int i=0;i<2;i++)
            {
                for(int j=0;j<8;j++)
                {
                    if(disparo[i+3][j]==0)
                    {
                        clase_aliens[i+3][j].Alien1(g);
                    }              
                }
            }
            alien_x=60;
            alien_y=60;


            if((disparar==1)&&(perd<3))
            {
                disparo_tanque(g);
            }
            if(cont_ganar>=40)
            {
                
                comenzar=2;
                temporizador.stop();
                repaint();
                
            }
        }
        
        
    }
  
    
    public void disparo_tanque(Graphics g)
    {
        g.setColor(Color.WHITE);
        g.fillRect(bala_x, bala_y-10, 2, 10);        
        bala_y-=20;       
    }
    public void tanque(Graphics g)
    {
        g.setColor(Color.BLUE);       
        g.fillRect(tanque_x, tanque_y, 35, 10);
        g.fillRect(tanque_x+2, tanque_y-2, 31, 2);
        g.fillRect(tanque_x+14,tanque_y-7,7,7);
        g.fillRect(tanque_x+16, tanque_y-10, 3, 3);  
        g.setColor(Color.ORANGE);
        g.fillRect(tanque_x+7, tanque_y, 5, 3);
        g.fillRect(tanque_x+24, tanque_y, 5, 3);
    }
    
    public void Escudos(Graphics g)
    {
        g.setColor(Color.GREEN);        
        g.fillPolygon(clase_escudo.escudo1x, clase_escudo.escudo1y, 12);
        g.fillPolygon(clase_escudo.escudo2x, clase_escudo.escudo1y, 12);
        g.fillPolygon(clase_escudo.escudo3x, clase_escudo.escudo1y, 12);
        g.fillPolygon(clase_escudo.escudo4x, clase_escudo.escudo1y, 12);
    }
    public void Alien4(Graphics g)
    {
        g.setColor(Color.red);
        g.fillRect(alien4_x+15, alien4_y, 20, 5);
        g.fillRect(alien4_x+5, alien4_y+5, 40, 5);
        g.fillRect(alien4_x, alien4_y+10, 50, 5);
        g.fillRect(alien4_x-5, alien4_y+15, 60, 5);
        g.fillRect(alien4_x+10, alien4_y+20, 5, 5);
        g.fillRect(alien4_x+35, alien4_y+20, 5, 5);
        g.setColor(Color.WHITE);
        g.fillRect(alien4_x+5, alien4_y+10, 5, 5);
        g.fillRect(alien4_x+15, alien4_y+10, 5, 5);
        g.fillRect(alien4_x+30, alien4_y+10, 5, 5);
        g.fillRect(alien4_x+40, alien4_y+10, 5, 5);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblScore1 = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        lblLives1 = new javax.swing.JLabel();
        lblLives = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 500));

        lblScore1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblScore1.setForeground(new java.awt.Color(255, 255, 255));
        lblScore1.setText("SCORE");

        lblScore.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblScore.setForeground(new java.awt.Color(255, 255, 255));
        lblScore.setText("0");

        lblLives1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblLives1.setForeground(new java.awt.Color(255, 255, 255));
        lblLives1.setText("LIVES");

        lblLives.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblLives.setForeground(new java.awt.Color(255, 255, 255));
        lblLives.setText("3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblScore1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblScore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 454, Short.MAX_VALUE)
                .addComponent(lblLives1)
                .addGap(26, 26, 26)
                .addComponent(lblLives)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblScore1)
                    .addComponent(lblScore)
                    .addComponent(lblLives1)
                    .addComponent(lblLives))
                .addContainerGap(437, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmSpaceInvaders1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSpaceInvaders1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSpaceInvaders1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSpaceInvaders1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSpaceInvaders1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblLives;
    private javax.swing.JLabel lblLives1;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel lblScore1;
    // End of variables declaration//GEN-END:variables
}
