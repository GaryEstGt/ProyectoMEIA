/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomeia;

import java.util.LinkedList;

/**
 *
 * @author luise
 */
public class ArchivoArbolBinario {
    
    public static void EnviarCorreo(Correo correo){
        
    }
                
    public static LinkedList<Nodo> obtenerNodos(){
        String contenido="";        
        contenido=Lector.Obtener("C:/MEIA/correos.txt");
        
        if(!contenido.isEmpty()){
            String[] datos=contenido.split("\n");
            LinkedList<Nodo> lista=new LinkedList<>();
            for (int i = 0; i < datos.length; i++){   
                String[] campos = datos[i].split("\\|");
                Nodo nodo = new Nodo(Integer.parseInt(campos[0].trim()), -1, Integer.parseInt(campos[1].trim()),Integer.parseInt(campos[2].trim()),Correo.toCorreo(campos[3].trim()));
                lista.add(nodo);
            }
            return lista;            
        }   
        else{
            return null;
        }
    }        
    
    public static void rellenarNodos(LinkedList<Nodo> lista){
        String textoEscribir="";
        for(Nodo list:lista){
            textoEscribir+=list.toString()+"\n";
        }
        Escritor.Escribir("C:/MEIA/correos.txt", textoEscribir);
    }
    
    public static DescriptorCorreo obtenerDescriptorCorreo(){
        String contenido="";                                   
        contenido=Lector.Obtener("C:/MEIA/desc_correos.txt");        
        String[] campos=contenido.split("\n");        
        return new DescriptorCorreo(campos[0],Integer.parseInt(campos[1]),Integer.parseInt(campos[2]),Integer.parseInt(campos[3]),Integer.parseInt(campos[4]));      
    }
    
    public static void rellenarDescriptorCorreo(DescriptorCorreo descriptor){        
        Escritor.Escribir("C:/MEIA/desc_correos.txt", descriptor.toString());                        
    }
    
}
