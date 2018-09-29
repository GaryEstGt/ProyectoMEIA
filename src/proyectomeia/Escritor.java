/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomeia;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author garya
 */
public class Escritor {
    public static boolean Escribir(String strPath,String strContenido,String strError)
    {
        File Archivo = new File(strPath);
        try
        {
            if(!Archivo.exists()){
            Archivo.createNewFile();
            }
                FileWriter Escribir = new FileWriter(Archivo,true);
                BufferedWriter bw = new BufferedWriter(Escribir);
                bw.write(strContenido + System.getProperty( "line.separator" ));
                bw.close();
                Escribir.close();
                
                return true;
        }
        catch(IOException ex)
        {
            strError= ex.getMessage();
            return false;
        } 
        
}

}
