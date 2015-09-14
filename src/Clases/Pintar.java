/**                       ** 
 *                         *
 * Autor: Walther Carrasco *
 *                         *
 **                       **/

package Clases;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Pintar {

    public Pintar() {
    }
    
    public void DibujarCirculo(Graphics g, int x, int y, String letra){
        ((Graphics2D)g).setColor(Color.blue);
        ((Graphics2D)g).setStroke(new BasicStroke(4));//leda el grosor al circulo        
        ((Graphics2D)g).fillOval(x, y, 15, 15);        
        ((Graphics2D)g).setColor(Color.WHITE);
        ((Graphics2D)g).drawOval(x, y, 15, 15);
        
        ((Graphics2D)g).setColor(Color.BLACK);
        Font fuente=new Font("Monospaced",Font.BOLD, 16);
        g.setFont(fuente);
        ((Graphics2D)g).drawString(letra, x, y);
    }
    
    public void clickSobreNodo(Graphics g,int x,int y,String n,Color co){
        //g.drawOval(x, y-10, 20, 20);
       ((Graphics2D)g).setColor(co);
        ((Graphics2D)g).setStroke(new BasicStroke(4));//leda el grosor al circulo        
        ((Graphics2D)g).fillOval(x, y, 15, 15);        
        ((Graphics2D)g).setColor(Color.BLACK);
        ((Graphics2D)g).drawOval(x, y, 15, 15);
         
    }
    
    public void DibujarLinea(Graphics g, int x1, int x2, int y1, int y2, int peso){
        
    }
}
