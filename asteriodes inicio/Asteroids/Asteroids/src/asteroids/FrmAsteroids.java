
package asteroids;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Timer;

public class FrmAsteroids extends javax.swing.JFrame implements KeyListener
{
    int coordXFondo=0;
    BufferedImage nebula=null;
    BufferedImage AsterFondo=null;
    BufferedImage Nave=null;
    BufferedImage Bala=null;
    BufferedImage Asteroide=null;
    BufferedImage Explosion=null;
    int angulo=0;
    double coordX=355;
    double coordY=255;
    int encendido=0;
    double aceleracionX;
    double aceleracionY;
    double factor=2;
    double[] distanciaN={0,0,0,0,0,0};
    int vidas=3;
    int Teclas[]={0,0,0,0};
    double[] coordXBala={900,900,900,900,900,900,900,900,900,900};
    double [] coordYBala={900,900,900,900,900,900,900,900,900,900};
    int[] EstadoBala={0,0,0,0,0,0,0,0,0,0};
    double aceleracionXBala[]={0,0,0,0,0,0,0,0,0,0};
    double aceleracionYBala[]={0,0,0,0,0,0,0,0,0,0};
    double factorBala=40;
    int[] Vida={10,10,10,10,10,10,10,10,10,10};
    int[] EstadoAsteroide={0,0,0,0,0,0};
    int[] anguloAsteroide={0,0,0,0,0,0};
    double[] coordXAsteroide={0,0,0,0,0,0};
    double []coordYAsteroide={0,0,0,0,0,0};
    double aceleracionXAsteroide[]={0,0,0,0,0,0};
    double aceleracionYAsteroide[]={0,0,0,0,0,0};
    double factorAsteroide;
    int[] velocidadDeGiro={1,1,1,1,1,1};
    int [] sentidoGiro={1,1,1,1,1,1};
    int cont=50;
    double distancia;
    int[] eExplosion={0,0,0,0,0,0};
    int[] imgX={-100,-100,-100,-100,-100,-100};
    int [] imgY={0,0,0,0,0,0};
    int puntos=0;

    public FrmAsteroids() 
    {
        initComponents();
        addKeyListener(this);        
    }
       
public void paint(Graphics g)
    {
        try {
           
            nebula=ImageIO.read(new File("C:\\Users\\arilo\\Documents\\2do semestre\\Informatica\\asteriodes\\Asteroids\\Asteroids\\src\\asteroids\\nebula_blue.PNG"));
            AsterFondo=ImageIO.read(new File("C:\\Users\\arilo\\Documents\\2do semestre\\Informatica\\asteriodes\\Asteroids\\Asteroids\\src\\asteroids\\debris2_blue.PNG"));
            Bala=ImageIO.read(new File("C:\\Users\\arilo\\Documents\\2do semestre\\Informatica\\asteriodes\\Asteroids\\Asteroids\\src\\asteroids\\shot2.png" ));
            Asteroide=ImageIO.read(new File("C:\\Users\\arilo\\Documents\\2do semestre\\Informatica\\asteriodes\\Asteroids\\Asteroids\\src\\asteroids\\asteroid_blue.png" ));
            Explosion=ImageIO.read(new File("C:\\Users\\arilo\\Documents\\2do semestre\\Informatica\\asteriodes\\Asteroids\\Asteroids\\src\\asteroids\\explosion_alpha.png" ));
            if (encendido==1)
            {
                Nave=ImageIO.read(new File("C:\\Users\\arilo\\Documents\\2do semestre\\Informatica\\asteriodes\\Asteroids\\Asteroids\\src\\asteroids\\nave2.PNG"));
            }
            else 
            { 
                Nave=ImageIO.read(new File("C:\\Users\\arilo\\Documents\\2do semestre\\Informatica\\asteriodes\\Asteroids\\Asteroids\\src\\asteroids\\nave1.PNG"));
            }
   
        }
        catch (IOException ex) 
        {
            Logger.getLogger(FrmAsteroids.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        super.paint(g);
       
        g.drawImage(nebula,0,0,this);
        g.drawString("Puntos: "+String.valueOf(puntos), 20, 40);
        g.drawString("Vidas: "+String.valueOf(vidas), 700, 40);
        g.drawImage(AsterFondo,coordXFondo,0,this);
        g.drawImage(AsterFondo,coordXFondo-800,0,this);
        
        cont++;
        if(cont>=50)
        {
            cont=0;
            int n2=0;
            while(n2<5 && EstadoAsteroide[n2]==1)
            {
                  n2++;
            }
            EstadoAsteroide[n2]=1;
            coordXAsteroide[n2]=(int) (Math.random()*800)+1;
            coordYAsteroide[n2]=(int) (Math.random()*600)+1;
            anguloAsteroide[n2]=(int) (Math.random()*360)+1;
            while (factorAsteroide<3)
            {
            factorAsteroide=(int) (Math.random()*10)+1;
            }
            if(Math.random()<0.5)
            {
            sentidoGiro[n2]=1;
            } 
            else 
            {
            sentidoGiro[n2]=-1;
            }
            aceleracionXAsteroide[n2]=Math.cos(Math.toRadians(anguloAsteroide[n2]%360))*factorAsteroide;
            aceleracionYAsteroide[n2]=Math.sin(Math.toRadians(anguloAsteroide[n2]%360))*factorAsteroide;
            velocidadDeGiro[n2]=(int) (Math.random()*20)+1;
            }

            if(coordX>750)  
            {
                coordX=-20;
            }
            else if(coordX<-20)
            {
                coordX=700;
            }
            if(coordY>550)
            {
                coordY=0;
            }
            else if(coordY<0)
            {
                coordY=550;
            }

        for (int n=0;n<10;n++){
            if(coordXBala[n]>750){
                coordXBala[n]=0;
            }else if(coordXBala[n]<0){
                coordXBala[n]=700;
            }
            if(coordYBala[n]>550){
                coordYBala[n]=0;
            }else if(coordYBala[n]<0){
                coordYBala[n]=550;
            }
        }
        
        for (int n=0;n<6;n++){
        if(coordXAsteroide[n]>750){
            coordXAsteroide[n]=0;
        }else if(coordXAsteroide[n]<0){
            coordXAsteroide[n]=700;
        }
        if(coordYAsteroide[n]>=550){
            coordYAsteroide[n]=0;
        }else if(coordYAsteroide[n]<=0){
            coordYAsteroide[n]=550;
        }
        }

        double rotationRequired = Math.toRadians(angulo);
        double locationX = Nave.getWidth() / 2;
        double locationY = Nave.getHeight() / 2;
        AffineTransform tx = AffineTransform.getRotateInstance(rotationRequired, locationX, locationY);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
        Graphics2D g2=(Graphics2D) g;
        coordX+=aceleracionX;
        coordY+=aceleracionY;
        g2.drawImage(op.filter(Nave, null), (int)coordX, (int)coordY, null);
        

        for (int n=0;n<10;n++)
        {
            if(EstadoBala[n]==1)
            {
                locationX = Bala.getWidth() / 2;
                locationY = Bala.getHeight() / 2;
                tx = AffineTransform.getRotateInstance(rotationRequired, locationX, locationY);
                op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
                coordXBala[n]+=aceleracionXBala[n];
                coordYBala[n]+=aceleracionYBala[n];
                g2.drawImage(op.filter(Bala, null), (int)coordXBala[n], (int)coordYBala[n], null);
                Vida[n]--;
                if(Vida[n]==0){
                    EstadoBala[n]=0;
                    coordXBala[n]=900;
                    coordYBala[n]=900;
                }
            }
         }
         
        for (int n2=0;n2<6;n2++){
        if(eExplosion[n2]==0){
            
            distanciaN[n2]=Math.sqrt((((coordX+(Nave.getWidth() / 2))-(coordXAsteroide[n2]+(Asteroide.getWidth() / 2)))*((coordX+(Nave.getWidth() / 2))-(coordXAsteroide[n2]+(Asteroide.getWidth() / 2))))
                +(((coordY+(Nave.getHeight() / 2))-(coordYAsteroide[n2]+(Asteroide.getHeight() / 2)))*((coordY+(Nave.getHeight() / 2))-(coordYAsteroide[n2]+(Asteroide.getHeight() / 2)))));
            if(distanciaN[n2]<(Asteroide.getWidth() / 2)+(Nave.getWidth() / 2)){
                eExplosion[n2]=1;
                EstadoAsteroide[n2]=0;
                vidas--;
            }
         
            if(EstadoAsteroide[n2]==1){
            coordXAsteroide[n2]+=aceleracionXAsteroide[n2];
            coordYAsteroide[n2]+=aceleracionYAsteroide[n2];
            g2.drawImage(op.filter(Asteroide, null), (int)coordXAsteroide[n2], (int)coordYAsteroide[n2], null);
            anguloAsteroide[n2]+=velocidadDeGiro[n2]*sentidoGiro[n2];
             }
         
        for(int n=0;n<10;n++){
        distancia=Math.sqrt((((coordXBala[n]+(Bala.getWidth() / 2))-(coordXAsteroide[n2]+(Asteroide.getWidth() / 2)))*((coordXBala[n]+(Bala.getWidth() / 2))-(coordXAsteroide[n2]+(Asteroide.getWidth() / 2))))
                +(((coordYBala[n]+(Bala.getHeight() / 2))-(coordYAsteroide[n2]+(Asteroide.getHeight() / 2)))*((coordYBala[n]+(Bala.getHeight() / 2))-(coordYAsteroide[n2]+(Asteroide.getHeight() / 2)))));
        if(distancia<(Asteroide.getWidth() / 2)){
            eExplosion[n2]=1;
            EstadoBala[n]=0;
            EstadoAsteroide[n2]=0;
            System.out.println("PUNTO");
            puntos++;
        }}
        }
        else if(eExplosion[n2]==1){
            
            g.drawImage(Explosion,(int)coordXAsteroide[n2],(int)coordYAsteroide[n2],(int)coordXAsteroide[n2]+100,(int)coordYAsteroide[n2]+100,imgX[n2],imgY[n2],imgX[n2]+100,imgY[n2]+100,this);
        }
        }
            
        
    }
        Timer temporizador1 = new Timer ( 100 , new ActionListener (){
        public void actionPerformed ( ActionEvent evento ){
        coordXFondo++;
        for(int n=0;n<6;n++){
        if(eExplosion[n]==1){
            imgX[n]+=100;
            if(imgX[n]==900)
            {
                imgX[n]=0;
                imgY[n]+=100;
            }
                if(imgY[n]==900){
                    eExplosion[n]=0;
                    imgX[n]=-100;
                    imgY[n]=0;
                    
                }
            }
            }
            if(coordXFondo==800){
                coordXFondo=0;
            }
          
            if(Teclas[0]==1){
                angulo+=5;
            } 
            if(Teclas[1]==1){
               angulo-=5;
            }  
            if(Teclas[2]==1){
                encendido=1;
                
                aceleracionX=Math.cos(Math.toRadians(angulo%360))*factor;
                aceleracionY=Math.sin(Math.toRadians(angulo%360))*factor;
                if(factor<15){
                factor+=0.5;}
            } else {
                encendido=0;
                factor=2;
                aceleracionX*=0.95;
                aceleracionY*=0.95;
            }
            if(Teclas[3]==1){
             int n=0;
              while(EstadoBala[n]==1){
                  n++;
              }
              EstadoBala[n]=1;
              coordXBala[n]=coordX+40;
              coordYBala[n]=coordY+40;
              aceleracionXBala[n]=Math.cos(Math.toRadians(angulo%360))*factorBala;
              aceleracionYBala[n]=Math.sin(Math.toRadians(angulo%360))*factorBala;
              Vida[n]=10;
            }
            repaint();
        }});
        
public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()==39){
           Teclas[0]=0;
           
       }
       if(e.getKeyCode()==37){
           Teclas[1]=0;
           
       }
       if(e.getKeyCode()==38){
           Teclas[2]=0;
           
       }
       if(e.getKeyCode()==32){
           Teclas[3]=0;
           
       }
        
    }
    public void keyPressed(KeyEvent e)
    {
        
       if(e.getKeyCode()==39){
           Teclas[0]=1;
           
       }
       if(e.getKeyCode()==37){
           Teclas[1]=1;
           
       }
       if(e.getKeyCode()==38){
           Teclas[2]=1;
           
       }
       if(e.getKeyCode()==32){
           Teclas[3]=1;
           
       }


    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        temporizador1.start();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FrmAsteroids.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAsteroids.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAsteroids.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAsteroids.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAsteroids().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
