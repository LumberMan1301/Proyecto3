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
public class matriz extends ListaSimple{
    
    private int tamanio;
    
    public matriz(int tamanio){
        this.tamanio = tamanio;
        llenarMatriz(tamanio);
    }
    
    public void llenarMatriz(int t){
        llenarMatrizAux(t);
    }
    
    private ListaSimple llenarMatrizAux(int t){
        
        ListaSimple i = new ListaSimple();
        for (int a = 0; a<t; a++){
            ListaSimple j = new  ListaSimple();
            i.add(j);
            llenarJ((ListaSimple) i.get(a), t);
            
        }
        return i;
    }
    
    
    private ListaSimple llenarJ(ListaSimple j, int t){
        for(int b=0; b<t; b++){
            j.add(0);
        }
        j.print();
        return j;
    }
    
    public static void main(String[] args) {
        matriz m = new matriz(3);
    }
    
    
    
    
        
}
