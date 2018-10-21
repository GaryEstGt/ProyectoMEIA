/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomeia;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author luise
 */
public class LectorListaUsuario {
    public static String LeerPosicion(String strPath, int posicion, int tamaño)
    {
        File Archivo = new File(strPath);         
        try
        {
            if(!Archivo.exists()){
            Archivo.createNewFile();
            }
            else{
                Archivo.delete();
                Archivo.createNewFile();
            }                
                RandomAccessFile fichero = new RandomAccessFile (strPath, "rw");
                
                fichero.seek((posicion - 1)*tamaño);                 
                String linea = fichero.readLine();
                fichero.close();
                return linea;
        }
        catch(IOException ex)
        {
            return "";
        }         
    }
    
}
