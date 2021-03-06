package proyecto3.manejadorArchivos;

import java.io.IOException;
import java.util.Enumeration;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

import java.util.zip.ZipEntry;
import proyecto3.EstructurasDeDatos.Lista.ListaSimple;
import proyecto3.EstructurasDeDatos.matriz.Matriz;
import proyecto3.interfaz.Principal.pantallaP;

/**
 * Pemite acceder a los archivos jar y a 
 * los valores dentro de el que necesitamos
 */
public class manejadorArchivos {
    private static String dependencias;
    private static String[] imports;
    private static ListaSimple clases;

    private static ListaSimple aux = new ListaSimple();
    private static Matriz matriz; 
    private static String nombre;

    public static Matriz getMatriz() {
        return matriz;
    }

    public static String getNombre() {
        return nombre;
    }

    public static ListaSimple getAux() {
        return aux;
    }
    
    
    
    /**
    * Permite leer el rchivo jar en la ruta escogida en
    * archivos, toma los atributos que se seleccionan para
    * saber cuales son las clases y dependencias y manipularlos
    */
    public static void leerArchivo(String ruta){
        clases = new ListaSimple();
        try {
            JarFile jf = new JarFile(ruta);//ruta es el path del jar
            nombre = jf.getClass().getName();
            Manifest manifest = jf.getManifest();
            Attributes attributes = manifest.getMainAttributes();
            
            dependencias = attributes.getValue("Import-Package");
            
            Enumeration<? extends ZipEntry> entries = jf.entries();

            while(entries.hasMoreElements()){
                ZipEntry entry = entries.nextElement();
                if(entry.isDirectory()){
                    pantallaP.llenarCont("dir  : " + entry.getName()+"\n");
                } else if(entry.getName().endsWith(".class")) {
                    pantallaP.llenarCont1("file : " + entry.getName()+"\n");
                    clases.add(entry.getName());
                }
           }
            jf.close();  
        } catch (IOException ex) {}
    }
    /**
     * Toma las dependencias del jar y las muestra
     * en pantalla
     */
    public static void llenarImports(){
        
        if (dependencias != null){
            imports = dependencias.split(",");
            
            for(int i = 0; i < imports.length ; i++){
                
                if(imports[i].length()!=3){
                pantallaP.llenarCont2(imports[i]+"\n");
                aux.add(imports[i]);
            }
        }
        }
        aux.print();
        hacerMatriz();
   
    }
    /**
     * Llena la matrz de 1 por cada dependencia que tiene
     * menos a si misma en la matriz
     */
    public static void hacerMatriz(){
        matriz = new Matriz(aux.size()+1);
        for(int i = 1; i< matriz.size(); i++){
            matriz.set(0, i, 1);
        }
        matriz.imprimirM();
    }
    
    
    
    
}
