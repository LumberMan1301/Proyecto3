/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3.EstructurasDeDatos.grafos;

import proyecto3.EstructurasDeDatos.Lista.ListaSimple;
import proyecto3.EstructurasDeDatos.matriz.Matriz;

/**
 *
 * @author 13mariano
 */
public class Grafo {
    
    
    public Matriz matriz;
    public ListaSimple<Integer> cordeX;
    public ListaSimple<Integer> cordeY;
    public ListaSimple<Integer> nombre;
    public Grafo(int valor){
        this.matriz = new Matriz(valor);
        cordeX = new ListaSimple<Integer>();
        cordeY = new ListaSimple<Integer>();
        nombre = new ListaSimple<Integer>();
    }
    
    public int getmAdyacencia(int i, int j){
        return this.getmAdyacencia(i, j);
    }
    
    public int getCordeX(int i){
        return cordeX.get(i);
    }
    
    public int getCordeY(int i){
        return cordeY.get(i);
    }
    
    public int getNombre(int i){
        return nombre.get(i);
    }
    
    public void setmAdyacencia(int i, int j, int valor){
        this.setmAdyacencia(i, j, valor);
        
    }
    
    public void setCordeX(int i, int valor){
        this.cordeX.getNode(i).setData(valor);
    }
    
    public void setCordeY(int i, int valor){
        this.cordeY.getNode(i).setData(valor);
    }
    public void setNombre ( int i, int valor){
        this.nombre.getNode(i).setData(valor);
        
    }

    public ListaSimple<Integer> getCordeX() {
        return cordeX;
    }

    public ListaSimple<Integer> getCordeY() {
        return cordeY;
    }

    public ListaSimple<Integer> getNombre() {
        return nombre;
    }
    
    
    
    
}
