package proyecto3.EstructurasDeDatos.matriz;

import proyecto3.EstructurasDeDatos.Lista.ListaSimple;
/**
 * Clase que crea la matriz a partir de listas
 * de listas
 */
public class Matriz extends ListaSimple{
    
    private int tamanio;
    
    public Matriz(int tamanio){
        this.tamanio = tamanio;
        this.llenarMatriz(tamanio);
        
    }
    /**
     * Llena la matriz, las listas de listas de 
     * 0 para que tenga elementos y se pueda graficar
     * @param t el tamanio de la matriz
     * @return 
     */
    private ListaSimple llenarMatriz(int t){ 
        for (int a = 0; a<t; a++){
            ListaSimple<Integer> lista = new ListaSimple<>();
            this.add(lista);
            for(int b = 0; b<t;b++){
                    lista.add(0);
            }
        }
        return this;
    }
    /**
     * Permite modificar los valores de la matriz
     * @param i numero de fila
     * @param j numero de columna
     * @param valor para asignarle un nuevo valor
     * al nodo que se ubica en la posicion i,j
     */
    public void set(int i, int j, int valor){
        ListaSimple aux = (ListaSimple) this.get(i);
        aux.getNode(j).setData(valor);
    }
    /**
     * Permite obtener los valores de la matriz
     * @param i numero de fila
     * @param j numero de columna
     */
    public Integer get(int i, int j){
        ListaSimple aux = (ListaSimple) this.get(i);
        int valor = (int)aux.get(j);
        System.out.println(valor);
        return valor;
    }
    /**
     * Imprime la matriz, las listas de listas
     * en modo de matriz
     */
    public void imprimirM(){
        for (int i = 0; i<this.size();i++){
            ListaSimple aux = (ListaSimple) this.get(i);
            aux.print();   
        }
        System.out.println("\n");
    }
    
    
    
        
}
