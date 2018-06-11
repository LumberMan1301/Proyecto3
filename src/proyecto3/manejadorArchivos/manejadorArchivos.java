/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3.manejadorArchivos;

import java.io.IOException;
import java.util.jar.JarFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 13mariano
 */
public class manejadorArchivos {
    public static void leerArchivo(String ruta){
        try {
            JarFile jf = new JarFile(ruta);
            jf.getManifest();
        } catch (IOException ex) {
            Logger.getLogger(manejadorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
