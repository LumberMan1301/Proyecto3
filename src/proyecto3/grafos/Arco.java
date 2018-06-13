
package proyecto3.grafos;

public class Arco {
    
    public Arco() {
        
    }  
    private Nodo origen;//nodo origen
    private Nodo destino;// Nodo destino
    private int peso;// peso del arco

    //getters setters

    public Nodo getOrigen() {
        return origen;
    }

    public Nodo getDestino() {
        return destino;
    }

    public int getPeso() {
        return peso;
    }

    public void setOrigen(Nodo origen) {
        this.origen = origen;
    }

    public void setDestino(Nodo destino) {
        this.destino = destino;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    

}
