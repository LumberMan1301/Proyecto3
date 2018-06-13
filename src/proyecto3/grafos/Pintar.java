/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto3.grafos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.MONOSPACED;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;

public class Pintar {   
    Color color;
    
    static Point p1 = new Point();
    static Point p2 = new Point();
     
   
    public Pintar(){
        
        
    }
    
   public static void pintarCirculo(Graphics g,int x,int y,String n){
        //g.drawOval(x, y-10, 20, 20);
       ((Graphics2D)g).setColor(Color.white);
        ((Graphics2D)g).setStroke(new BasicStroke(2));//leda el grosor al circulo        
        ((Graphics2D)g).fillOval(x, y, 30, 30);        
        ((Graphics2D)g).setColor(Color.blue);
        ((Graphics2D)g).drawOval(x, y, 30, 30);
        
        ((Graphics2D)g).setColor(Color.green);
        Font fuente=new Font("Monospaced",Font.BOLD, 16);
        g.setFont(fuente);
        ((Graphics2D)g).drawString(n, x, y);
         
    }    
  
  public static void pintarLinea(Graphics g, int x1,int y1,int x2,int y2,int tam){
        int xAux = 0; int yAux = 0; 
        ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(2);
        ((Graphics2D)g).setStroke(stroke);         
       ((Graphics2D)g).drawLine(x1+10, y1+10, x2+10, y2+10);
       if(x1<=x2)
           xAux=((x2-x1)/2)+x1;       
        if(x1>x2)
           xAux=((x1-x2)/2)+x2;
        if(y1<y2)
           yAux=((y2-y1)/2)+y1;
        if(y1>=y2)
            yAux=((y1-y2)/2)+y2;        
        // ((Graphics2D)g).setColor(Color.black);
        Font fuente=new Font("Monospaced",Font.PLAIN, 12);
        g.setFont(fuente);
      ((Graphics2D)g).drawString(String.valueOf(tam), xAux, yAux);
      
        Point punto1=null,punto2=null;
        
        //p1.x = x1;
        //p1.y = y1;
        //p2.x = x2;
        //p2.y = y2;
        double ang=0.0, angSep=0.0;
        double tx,ty;
        int dist=0;

        //defino dos puntos extremos
        punto1=new Point(p2.x+10,p2.y+10);
        punto2=new Point(p1.x+5,p1.y+5);

        //tamaño de la punta de la flecha
        dist=30;
        angSep = 30.0;

        
        ty=-(y1-punto2.y)*1.0;
        tx=(x1-punto2.x)*1.0;
        //angulo
        ang=Math.atan (ty/tx);

        if(tx<0)
        {// si tx es negativo aumentar 180 grados
           ang+=Math.PI;
        }
        
        p1.x=(int)(x2+dist*Math.cos (ang-Math.toRadians (angSep)));
        p1.y=(int)(y2-dist*Math.sin (ang-Math.toRadians (angSep)));
        p2.x=(int)(x2+dist*Math.cos (ang+Math.toRadians (angSep)));
        p2.y=(int)(y2-dist*Math.sin (ang+Math.toRadians (angSep)));
        
        //dibujar la punta
        g.drawLine (p1.x,p1.y,x2,y2);
        g.drawLine (p2.x,p2.y,x2,y2);
  }
  
  public static void pintarCamino(Graphics g, int x1,int y1,int x2,int y2, Color color){
      ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(2);
        ((Graphics2D)g).setStroke(stroke);
        g.setColor(color);
        g.drawLine(x1+10, y1+10, x2+10, y2+10);
        //g.drawString(String.valueOf(tam), x1, y1);
  }
   public static void clickSobreNodo(Graphics g,int x,int y,String n,Color co){
        //g.drawOval(x, y-10, 20, 20);
        ((Graphics2D)g).setColor(co);
        ((Graphics2D)g).setStroke(new BasicStroke(4));//leda el grosor al circulo        
        ((Graphics2D)g).fillOval(x, y, 15, 15);        
        ((Graphics2D)g).setColor(Color.BLACK);
        ((Graphics2D)g).drawOval(x, y, 15, 15);
         
    }
   
    
}
