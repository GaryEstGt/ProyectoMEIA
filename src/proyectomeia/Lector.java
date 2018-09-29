/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomeia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author garya
 */
public class Lector {
    public static String Obtener(String strPath,String strError)
    {
        File Archivo=new File(strPath);
        String cadena = "";
        if(Archivo.exists()==true)
        {
            FileReader LecturaArchivo;
            try {
                LecturaArchivo = new FileReader(Archivo);
                BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo);
                String Linea;
                try {
                    Linea=LeerArchivo.readLine();
                    cadena += Linea;                    
                    while(Linea != null)
                    {
                        Linea=LeerArchivo.readLine();
                        cadena += Linea;
                    }

                    LecturaArchivo.close();
                    LeerArchivo.close();                                        
                    return cadena;
                    
                } catch (IOException ex) {
                    return ex.getMessage();                    
                }
            } catch (FileNotFoundException ex) {
                return ex.getMessage();                
            }            
        }
        else
        {
            return "No existe el archivo";            
        }
}

}
