package proyecto3.manejadorArchivos;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

import java.util.zip.ZipEntry;
import proyecto3.EstructurasDeDatos.Lista.ListaSimple;
import proyecto3.interfaz.Principal.pantallaP;

/**
 * Pemite acceder a los archivos jar y a 
 * los valores dentro de el que necesitamos
 */
public class manejadorArchivos {
    private static String dependencias;
    private static String[] imports;
    private static ListaSimple clases;
    
    
   
    
    
    /**
    * Permite leer el rchivo jar en la ruta escogida en
    * archivos, toma los atributos que se seleccionan para
    * saber cuales son las clases y dependencias y manipularlos
    */
    public static void leerArchivo(String ruta){
        clases = new ListaSimple();
        try {
            JarFile jf = new JarFile(ruta);//ruta es el path del jar    
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
           }clases.print();
            jf.close();  
        } catch (IOException ex) {}
    }
    public static void llenarImports(){
        String s = ";";
        char c = s.charAt(0);
        if (dependencias != null){
            imports = dependencias.split(",");
            for(int i = 0; i < imports.length ; i++){
                pantallaP.llenarCont2(imports[i]+"\n");
            }
            }
        }
    public static void buscarMetodos(){
        for(int i = 0; i < clases.size(); i++){
            File f = new File(String.valueOf(clases.get(i)));
            String metodos = f.getClass().getMethods().toString();
            System.out.println(metodos);
        }
    }
    
    
    
}
