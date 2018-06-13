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
import proyecto3.interfaz.Principal.pantallaP;


/**
 *
 * @author 13mariano
 */
public class manejadorArchivos {
    
    
    
    public static void leerArchivo(String ruta){
        try {
            JarFile jf = new JarFile(ruta);//ruta es el path del jar    
            System.out.println(jf.getName()); 
            Manifest manifest = jf.getManifest();
            Attributes attributes = manifest.getMainAttributes();
            System.out.println(attributes.getValue("Manifest-Version"));
            
            
            
            
            Enumeration<? extends ZipEntry> entries = jf.entries();

            while(entries.hasMoreElements()){
                ZipEntry entry = entries.nextElement();
                if(entry.isDirectory()){
                    pantallaP.llenarCont("dir  : " + entry.getName()+"\n");
                } else if(entry.getName().endsWith(".class")) {
                    pantallaP.llenarCont1("file : " + entry.getName()+"\n");
                }
           }
           
        } catch (IOException ex) {
            Logger.getLogger(manejadorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    
    }
    
    
    
}
