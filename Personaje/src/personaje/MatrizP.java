/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaje;

/**
 *
 * @author arilo
 */
import static personaje.FrmPersonaje.*;

public class MatrizP
{
     public int [][] caminar1={{w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
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
            {w,w,w,w,w,w,w,w,w,w,w,b,gr,w,gr,b,b,b,gr,gr,b,b,b,mo,gr,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,b,gr,b,gr,gr,mo,gr,b,w,w,b,b,gr,gr,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,b,b,b,b,b,b,b,b,b,b,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
            {w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,b,b,b,b,b,w,b,b,b,b,b,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w},
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
    
}
