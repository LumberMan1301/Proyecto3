/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3.EstructurasDeDatos.matriz;

import proyecto3.EstructurasDeDatos.Lista.ListaSimple;

/**
 *
 * @author 13mariano
 */
public class Matriz extends ListaSimple{
    
    private int tamanio;
    
    public Matriz(int tamanio){
        this.tamanio = tamanio;
        System.out.println("Manda a llamar a llenarMatriz"+tamanio);
        this.llenarMatriz(tamanio);
        
    }
    
    private ListaSimple llenarMatriz(int t){
        System.out.println("va a llenar la lista i");
        
        for (int a = 0; a<t; a++){
            ListaSimple<Integer> lista = new ListaSimple<>();
            this.add(lista);
            for(int b = 0; b<t;b++){
                    lista.add(0);
            }
        }
        return this;
    }
    
    
    
    
    public static void main(String[] args) {
        Matriz m = new Matriz(10);
        m.imprimirM();
        m.set(1, 1, 45);
        m.imprimirM();
        m.get(1, 1);
        
    }
    
    public void set(int i, int j, int valor){
        ListaSimple aux = (ListaSimple) this.get(i);
        aux.getNode(j).setData(valor);
    }
    
    public Integer get(int i, int j){
        ListaSimple aux = (ListaSimple) this.get(i);
        int valor = (int)aux.get(j);
        System.out.println(valor);
        return valor;
    }
    
    public void imprimirM(){
        for (int i = 0; i<this.size();i++){
            ListaSimple aux = (ListaSimple) this.get(i);
            aux.print();
            
        }
        System.out.println("\n");
    }
    
    
    
        
}
