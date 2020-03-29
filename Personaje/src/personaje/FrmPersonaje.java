
package personaje;

/**
 *
 * @author arilo
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.Timer;
public class FrmPersonaje extends javax.swing.JFrame implements KeyListener
{

  int temp=1;
    int filas,columnas;
    int size=1;
    int mov=0;
    int pos=0;
    int paso=0;
    int caminar=10;
    int salto=0;
    int saltar1=-2;
    int saltar2=-4*(saltar1^2)+240;
    int i,j,aux;
    static int w=new Color(255,255,255).getRGB();
    static int s=new Color(255,255,255).getRGB();
    static int b=new Color(0,0,0).getRGB();
    static int vc=new Color(85,200,0).getRGB();
    static int vo=new Color(1,100,0).getRGB();
    static int y=new Color(250,230,0).getRGB();
    static int o=new Color(250,188,1).getRGB();
    static int gr=new Color(186,186,186).getRGB();
    static int c=new Color(130,80,2).getRGB();
    static int m=new Color(131,84,1).getRGB();
    static int mo=new Color(75,45,27).getRGB();
    static int pc=new Color(250,200,145).getRGB();
    static int po=new Color(238,190,115).getRGB();
    
    int [][] parado1={{w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,b,b,b,b,b,b,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,b,b,vc,vc,vc,vc,vc,vc,b,b,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,b,b,vo,vc,vc,vc,vc,vc,vc,vc,vc,vc,vc,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,m,m,m,m,m,b,b,b,b,b,vo,vc,vc,vc,b,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,m,y,y,y,y,o,o,o,o,o,o,m,vo,vo,vo,vo,b,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,m,y,y,y,y,y,y,y,o,o,o,o,o,m,vo,vo,vo,vo,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,m,y,y,y,y,y,y,y,y,y,o,o,o,o,o,m,vo,vo,vo,b,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,m,y,y,y,y,y,y,m,y,y,o,o,o,m,m,o,o,m,vo,vo,vo,b,w,w,w,w,w,w,w,w,w,w,w,b,b,b,b,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,m,m,m,b,b,m,y,y,y,b,b,m,po,po,m,o,m,vo,vo,vo,b,w,w,w,w,w,w,w,w,w,w,b,b,gr,w,b,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,b,po,b,y,y,b,m,m,po,po,po,m,o,m,vo,vo,vo,b,w,w,w,w,w,w,w,w,w,b,b,gr,b,gr,b,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,b,b,m,m,m,b,b,b,b,po,po,m,o,m,b,b,vo,b,w,w,w,w,w,w,w,w,b,b,gr,b,gr,b,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,b,b,b,b,b,b,b,b,pc,b,gr,b,b,gr,m,po,m,o,m,po,b,vo,b,w,w,w,w,w,w,w,b,b,gr,s,gr,b,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,b,gr,gr,gr,s,mo,s,pc,pc,pc,s,b,b,s,po,po,b,m,po,b,vo,vo,b,w,b,b,w,w,w,b,b,gr,b,gr,b,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,b,gr,mo,mo,mo,b,pc,m,pc,pc,pc,pc,po,po,po,po,b,po,m,vo,vo,b,w,b,b,b,b,s,b,b,gr,b,gr,b,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,b,s,mo,m,m,m,b,pc,pc,pc,pc,pc,po,po,po,po,b,m,y,m,vo,b,w,b,b,gr,b,b,b,gr,b,gr,b,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,b,s,mo,m,m,m,m,b,pc,pc,pc,po,po,po,po,b,vo,vo,vo,vo,b,b,b,b,b,gr,b,b,b,gr,gr,b,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,b,s,mo,m,m,m,b,y,b,b,b,b,b,b,b,vo,vc,vc,vc,b,vc,vc,vc,vc,b,b,b,m,b,b,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,b,s,mo,m,gr,gr,b,gr,vo,vc,vc,b,vo,vc,vo,b,vc,vo,b,vo,vo,vo,vc,vc,vc,b,o,o,m,b,b,b,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,b,s,b,b,gr,w,vo,gr,w,vo,vo,vo,b,vc,b,vc,vc,vo,b,b,b,b,vo,vc,vc,vc,b,m,b,b,b,b,b,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,b,s,b,po,w,w,vc,w,w,b,b,b,vo,b,vc,vc,vc,vo,b,b,w,w,b,b,vo,vo,b,b,b,b,gr,gr,b,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,b,gr,mo,po,gr,w,mo,gr,w,mo,mo,b,vo,vo,vc,vc,vc,vc,b,w,w,w,b,b,b,b,po,po,b,b,b,b,b,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,b,gr,mo,b,gr,gr,po,gr,gr,mo,mo,b,po,o,y,o,po,po,po,b,w,b,b,b,b,b,b,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,b,gr,mo,mo,mo,mo,mo,mo,mo,gr,b,m,y,o,y,m,m,m,b,w,b,gr,b,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,b,w,mo,mo,mo,mo,mo,mo,mo,b,vo,vc,vc,vc,vc,vc,vc,vo,b,w,w,b,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,b,gr,mo,mo,mo,mo,mo,gr,b,vo,vo,vo,vo,vo,vo,vo,vo,vo,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,b,gr,mo,mo,mo,gr,b,b,b,b,b,b,b,b,b,b,b,b,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,b,gr,w,gr,b,b,b,gr,gr,b,w,w,w,b,b,mo,gr,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,b,gr,b,gr,gr,mo,gr,b,w,w,w,w,w,b,b,gr,gr,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,b,po,po,m,mo,b,w,w,w,w,w,w,b,mo,m,po,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,b,mo,m,m,mo,b,w,w,w,w,w,w,w,b,mo,m,m,mo,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,b,b,b,b,b,w,w,w,w,w,w,w,w,w,b,b,b,b,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w}};
    
    int [][] parado2={{w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,b,b,b,b,b,b,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,b,b,vc,vc,vc,vc,vc,vc,b,b,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,b,b,vo,vc,vc,vc,vc,vc,vc,vc,vc,vc,vc,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,m,m,m,m,m,b,b,b,b,b,vo,vc,vc,vc,b,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,m,y,y,y,y,o,o,o,o,o,o,m,vo,vo,vo,vo,b,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,m,y,y,y,y,y,y,y,o,o,o,o,o,m,vo,vo,vo,vo,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,m,y,y,y,y,y,y,y,y,y,o,o,o,o,o,m,vo,vo,vo,b,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,m,y,y,y,y,y,y,m,y,y,o,o,o,m,m,o,o,m,vo,vo,vo,b,w,w,w,w,w,w,w,w,w,w,w,b,b,b,b,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,m,m,m,b,b,m,y,y,y,b,b,m,po,po,m,o,m,vo,vo,vo,b,w,w,w,w,w,w,w,w,w,w,b,b,gr,w,b,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,b,po,b,y,y,b,m,m,po,po,po,m,o,m,vo,vo,vo,b,w,w,w,w,w,w,w,w,w,b,b,gr,b,gr,b,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,b,b,m,m,m,b,b,b,b,po,po,m,o,m,b,b,vo,b,w,w,w,w,w,w,w,w,b,b,gr,b,gr,b,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,b,b,b,b,b,b,b,b,pc,b,gr,b,b,gr,m,po,m,o,m,po,b,vo,b,w,w,w,w,w,w,w,b,b,gr,s,gr,b,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,b,gr,gr,gr,s,mo,s,pc,pc,pc,s,b,b,s,po,po,b,m,po,b,vo,vo,b,w,b,b,w,w,w,b,b,gr,b,gr,b,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,b,gr,mo,mo,mo,b,pc,m,pc,pc,pc,pc,po,po,po,po,b,po,m,vo,vo,b,w,b,b,b,b,s,b,b,gr,b,gr,b,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,b,s,mo,m,m,m,b,pc,pc,pc,pc,pc,po,po,po,po,b,m,y,m,vo,b,w,b,b,gr,b,b,b,gr,b,gr,b,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,b,s,mo,m,m,m,m,b,pc,pc,pc,po,po,po,po,b,vo,vo,vo,vo,b,b,b,b,b,gr,b,b,b,gr,gr,b,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,b,s,mo,m,m,m,b,y,b,b,b,b,b,b,b,vo,vc,vc,vc,b,vc,vc,vc,vc,b,b,b,m,b,b,b,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,b,s,mo,m,gr,gr,b,gr,vo,vc,vc,b,vo,vc,vo,b,vc,vo,b,vo,vo,vo,vc,vc,vc,b,o,o,m,b,b,b,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,b,s,b,b,gr,w,vo,gr,w,vo,vo,vo,b,vc,b,vc,vc,vo,b,b,b,b,vo,vc,vc,vc,b,m,b,b,b,b,b,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,b,s,b,po,w,w,vc,w,w,b,b,b,vo,b,vc,vc,vc,vo,b,b,w,w,b,b,vo,vo,b,b,b,b,gr,gr,b,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,b,gr,mo,po,gr,w,mo,gr,w,mo,mo,b,vo,vo,vc,vc,vc,vc,b,w,w,w,b,b,b,b,po,po,b,b,b,b,b,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,b,gr,mo,b,gr,gr,po,gr,gr,mo,mo,b,po,o,y,o,po,po,po,b,w,b,b,b,b,b,b,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,b,gr,mo,mo,mo,mo,mo,mo,mo,gr,b,m,y,o,y,m,m,m,b,w,b,gr,b,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,b,w,mo,mo,mo,mo,mo,mo,mo,b,vo,vc,vc,vc,vc,vc,vc,vo,b,w,w,b,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,b,gr,mo,mo,mo,mo,mo,gr,b,vo,vo,vo,vo,vo,vo,vo,vo,vo,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,b,gr,mo,mo,mo,gr,b,b,b,b,b,b,b,b,b,b,b,b,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,b,gr,w,gr,b,b,b,gr,gr,b,w,w,w,b,b,mo,gr,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,b,gr,b,gr,gr,mo,gr,b,w,w,w,w,w,b,b,gr,gr,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,b,b,b,b,b,b,w,w,w,w,w,w,b,b,b,b,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,b,b,b,b,b,w,w,w,w,w,w,w,w,w,b,b,b,b,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w}};
    
    
    
    
    int [][] link=parado1;
      
    public FrmPersonaje() 
    {
        initComponents();
         this.setLocationRelativeTo(null);
        addKeyListener(this);
    }

     MatrizP caminar1=new MatrizP();
    Timer temporizador=new Timer(10,new ActionListener()
    {
        public void actionPerformed(ActionEvent evento)
        {
            
            temp++;
            if(temp%20==0)
            {
                temp=1;
                if(mov==0)
                {
                    link=parado1;               
                    mov=1;
                    
                }
                else if(mov==1)
                {
                    link=parado2;
                    mov=0;
                }
               
                
                repaint();
            }
            if(temp%3==0)
            {
                saltar2=-4*(saltar1^2)+240;
                if((salto==1)&&(pos==0))
                {
                    if(saltar1<=2)
                    {         
                        saltar1++;
                        if(caminar<400)
                        {
                            caminar+=3;
                        }
                        
                    }
                    else
                    {
                        saltar2=240;
                        saltar1=-2;
                        salto=0;
                    }
                    repaint();
                }
                else if((salto==1)&&(pos==1))
                {
                    if(saltar1<=2)
                    {                    
                        saltar1++;
                        if(caminar>0)
                        {
                            caminar-=3;
                        }
                    }
                    else
                    {
                        saltar2=240;
                        saltar1=-2;
                        salto=0;
                    }
                    repaint();
                }
            }
            
        }
    });
    
    
    @Override
    public void paint(Graphics g)
    {        
        super.paint(g);    
        if(pos==0)
        {
            for(filas=0;filas<70*size;filas++)
            {
                for(columnas=0;columnas<50*size;columnas++)
                {
                    g.setColor(new Color(link[filas/size][columnas/size]));
                    g.drawRect(40-columnas+caminar,saltar2+filas,0,0);   
                               
                }
            }
        }
        else if(pos==1)
        {
            for(filas=0;filas<70*size;filas++)
            {
                for(columnas=0;columnas<50*size;columnas++)
                {
                    g.setColor(new Color(link[filas/size][columnas/size]));
                    g.drawRect(columnas+caminar,saltar2+filas,0,0);              
                }
            }
        }
        
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
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
        temporizador.start();
    }//GEN-LAST:event_formWindowOpened

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        requestFocus();
    }//GEN-LAST:event_formMouseClicked

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
            java.util.logging.Logger.getLogger(FrmPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPersonaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    
    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyCode());
        if((e.getKeyCode()==39)&&(caminar<400))
        {
            caminar+=5;
            pos=0;
            if(paso==1)
            {
                link=parado2;
                paso=0;
            }
            else if(paso==0)
            {
                link=caminar1.caminar1;
                paso=1;
            }
        }
        else if((e.getKeyCode()==37)&&(caminar>0))
        {
            caminar-=5;
            pos=1;
            if(paso==1)
            {
                link=parado2;
                paso=0;
            }
            else if(paso==0)
            {
                link=caminar1.caminar1;
                paso=1;
            }
        }
        else if(e.getKeyCode()==38)
        {
            salto=1;
        }
        repaint();
    }
    
}
