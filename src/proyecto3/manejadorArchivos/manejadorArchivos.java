/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3.manejadorArchivos;



import java.io.IOException;
import java.util.Enumeration;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import proyecto3.EstructurasDeDatos.Lista.ListaSimple;
import proyecto3.interfaz.Principal.pantallaP;


/**
 *
 * @author 13mariano
 */
public class manejadorArchivos {
    private static String dependencias;
    ListaSimple<String> imports = new ListaSimple<>();
    
    
    
    public static void leerArchivo(String ruta){
        try {
            JarFile jf = new JarFile(ruta);//ruta es el path del jar    
            System.out.println(jf.getName()); 
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
                }
           }
            jf.close();  
        } catch (IOException ex) {}
    }
    public static void llenarImports(){
        if (dependencias != null){
            for(int i = 0; i<dependencias.length(); i++){
                if(dependencias.charAt(i) == ){
                    
                }
            }
        }
    }
    
    
    
}
