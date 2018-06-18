package proyecto3.EstructurasDeDatos.grafos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.MONOSPACED;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;

/**
 * Clase para dibujar en el plano los nodos, aristas o arcos
 * y para señalar cuando un quiere ser accedido
 */

public class Pintar {   
    Color color;
    
    static Point p1 = new Point();
    static Point p2 = new Point();
     
   
    public Pintar(){
        
        
    }
  /**
 * Permite dibujar en el plano un circulo que representa al nodo del
 * grafo, asi como su identificador 
 */  
   public static void pintarCirculo(Graphics g,int x,int y,String n){
        //g.drawOval(x, y-10, 20, 20);
       ((Graphics2D)g).setColor(Color.white);
        ((Graphics2D)g).setStroke(new BasicStroke(2));//le da el grosor al circulo        
        ((Graphics2D)g).fillOval(x, y, 35, 35);        
        ((Graphics2D)g).setColor(Color.blue);
        ((Graphics2D)g).drawOval(x, y, 35, 35);
        
        ((Graphics2D)g).setColor(Color.orange);
        Font fuente=new Font("Monospaced",Font.BOLD, 16);
        g.setFont(fuente);
        ((Graphics2D)g).drawString(n, x+12, y+22);
         
    }    
  /**
 * Permite dibujar la linea que une a los nodos y representa la 
 * arista y como el grafo es dirigido, se dibuja una flecha
 * en el nodo de destino mediante un angulo que separa dos lineas mas
 * pequeñas formando una flecha
 */
  public static void pintarLinea(Graphics g, int x1,int y1,int x2,int y2){
        int xAux = 0; int yAux = 0; 
        ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(2);
        ((Graphics2D)g).setStroke(stroke);
        ((Graphics2D)g).setColor(Color.darkGray);
       ((Graphics2D)g).drawLine(x1+15, y1+15, x2+15, y2+15);
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
      //((Graphics2D)g).drawString(String.valueOf(tam), xAux, yAux);
      
        Point punto1=null,punto2=null;
        
        p1.x = x2+15;
        p1.y = y2+15;
        p2.x = x1+15;
        p2.y = y1+15;
        double ang=0.0, angSep=0.0;
        double tx,ty;
        int dist=0;

        //defino dos puntos extremos
        punto1=new Point(p2.x,p2.y);
        punto2=new Point(p1.x,p1.y);

        //tamaño de la punta de la flecha
        dist=40;
        Point punto=punto2;
        angSep = 25.0;

        
        ty=-(punto1.y-punto2.y)*1.0;
        tx=(punto1.x-punto2.x)*1.0;
        //angulo
        ang=Math.atan (ty/tx);

        if(tx<0)
        {// si tx es negativo aumentar 180 grados
           ang+=Math.PI;
        }
        
        p1.x=(int)(punto.x+dist*Math.cos (ang-Math.toRadians (angSep)));
        p1.y=(int)(punto.y-dist*Math.sin (ang-Math.toRadians (angSep)));
        p2.x=(int)(punto.x+dist*Math.cos (ang+Math.toRadians (angSep)));
        p2.y=(int)(punto.y-dist*Math.sin (ang+Math.toRadians (angSep)));
        
        //dibujar la punta
        g.drawLine (p1.x,p1.y,x2+15,y2+15);
        g.drawLine (p2.x,p2.y,x2+15,y2+15);
  }
  /**
 * Pinta la arista entre dos nodos a indicar, y el color
 * para señalar el camino que existe entre ambos
 */
  public static void pintarCamino(Graphics g, int x1,int y1,int x2,int y2, Color color){
      ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(2);
        ((Graphics2D)g).setStroke(stroke);
        g.setColor(color);
        g.drawLine(x1+30, y1+30, x2+30, y2+30);
        //g.drawString(String.valueOf(tam), x1, y1);
  }
  /**
 * Pinta el nodo de un color diferente para indicar que se esta
 * seleccionando ese nodo en especifico y hacer una accion en el
 */
   public static void clickSobreNodo(Graphics g,int x,int y,String n,Color co){
        ((Graphics2D)g).setColor(co);
        ((Graphics2D)g).setStroke(new BasicStroke(4));//leda el grosor al circulo        
        ((Graphics2D)g).fillOval(x, y, 15, 15);        
        ((Graphics2D)g).setColor(Color.BLACK);
        ((Graphics2D)g).drawOval(x, y, 15, 15);
         
    }
   
    
}
