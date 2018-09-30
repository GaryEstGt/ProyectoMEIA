/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomeia;

import java.util.LinkedList;

/**
 *
 * @author garya
 */
public class OperacionesSecuencial {
        public static LinkedList<Usuario> obtenerUsuarios(int OpcionObtener){
        String contenido="";
        if(OpcionObtener==1){
             contenido=Lector.Obtener("C:/MEIA/bitacora_usuario.txt");
        }
        else if(OpcionObtener==2){
            contenido=Lector.Obtener("C:/MEIA/usuario.txt");
        }
        
        String[] usuarios=contenido.split(",");
        LinkedList<Usuario> users=new LinkedList<>();
        for (int i = 0; i < usuarios.length; i++){
            String[] camposUsuario=usuarios[i].split("|");
            Usuario usuarioObtenido=new Usuario(camposUsuario[0],camposUsuario[1],camposUsuario[2],camposUsuario[3],camposUsuario[4],camposUsuario[5],camposUsuario[6],Integer.parseInt(camposUsuario[7]),Integer.parseInt(camposUsuario[8]));
            usuarioObtenido.setRol(Integer.parseInt(camposUsuario[9]));
            users.add(usuarioObtenido);
        }
        return users;
    }
    public static void rellenarUsuarios(LinkedList<Usuario> usuarios){
        String textoEscribir="";
        for(Usuario user:usuarios){
            textoEscribir+=user.toString()+",";
        }
        Escritor.Escribir("C:/MEIA/usuario.txt", textoEscribir);
    }
    /*public static DescriptorUsuario obtenerDescriptorUsuario(int OpcionObtener){
          String contenido="";
        if(OpcionObtener==1){
            contenido=Lector.Obtener("C:/MEIA/desc_usuario.txt");
        }
        else if(OpcionObtener==2){
            contenido=Lector.Obtener("C:/MEIA/desc_usuariobitacora.txt");
        }
        String[] campos=contenido.split("|");
      
    }*///Metodo en proceso, falta terminar
}
