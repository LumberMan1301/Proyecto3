package proyecto3.grafos;

import java.awt.Point;

public class Nodo {    
   private  int nombre ;
   private boolean visitado ;
   private boolean etiqueta;
   private int acumulado; // lleva el acumulado de cada nodo
   private Nodo Predecesor;
   private static Point punto;//localizacion del nodo en el plano

   
   public Nodo(){
       this.nombre =-1;
       this.visitado = false;
       this.etiqueta = false;
       this.Predecesor  = null;
       this.acumulado =0;
       punto = new Point();       

   }

     public int getNombre() {
        return nombre;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public boolean isEtiqueta() {
        return etiqueta;
    }

    public int getAcumulado() {
        return acumulado;
    }

    public Nodo getPredecesor() {
        return Predecesor;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public void setEtiqueta(boolean etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void setAcumulado(int acomulado) {
        this.acumulado = acomulado;
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
