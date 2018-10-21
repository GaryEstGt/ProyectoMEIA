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
import java.io.RandomAccessFile;

/**
 *
 * @author luise
 */
public class EscritorListaUsuario {
    public static boolean Escribir(String strPath,String strContenido, int posicion, int tamaño)
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
                fichero.writeChars(strContenido);
                fichero.close();
                return true;
        }
        catch(IOException ex)
        {
            return false;
        } 
        
    }
}
