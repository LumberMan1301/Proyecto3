package proyecto3.EstructurasDeDatos.grafos;

import java.awt.Point;
/**
 * Clase para crear nodos del grafo, 
 * en esta clase se define el nombre, el acumulado y la 
 * localizacion en el plano de coordenadas
 */
public class Nodo {    
   private  int nombre ;
   private boolean etiqueta;
   private Nodo Predecesor;
   private static Point punto;//localizacion del nodo en el plano

   
   public Nodo(){
       this.nombre =-1;
       this.etiqueta = false;
       this.Predecesor  = null;
       punto = new Point();       

   }

     public int getNombre() {
        return nombre;
    }

    public boolean isEtiqueta() {
        return etiqueta;
    }

    public Nodo getPredecesor() {
        return Predecesor;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public void setEtiqueta(boolean etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void setPredecesor(Nodo Predecesor) {
        this.Predecesor = Predecesor;
    }

    public Point getPunto() {
        return punto;
    }

    public void setPunto(Point punto) {
        this.punto = punto;
    }
}
