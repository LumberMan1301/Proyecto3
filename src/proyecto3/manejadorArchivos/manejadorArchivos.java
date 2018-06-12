/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3.manejadorArchivos;

import java.io.File;


/**
 *
 * @author 13mariano
 */
public class manejadorArchivos {
    public static void leerArchivo(String ruta){
        File jarfile = new File(ruta);
        File[] ficheros = jarfile.listFiles();
        System.out.println(ficheros);
    
    }
    
}
