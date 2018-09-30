/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomeia;

import java.util.LinkedList;
import java.util.Set;

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
        
        if(!contenido.isEmpty()){
            String[] usuarios=contenido.split(",");
            LinkedList<Usuario> users=new LinkedList<>();
            for (int i = 0; i < usuarios.length; i++){
                String[] camposUsuario=usuarios[i].split("\\|");
                Usuario usuarioObtenido=new Usuario(camposUsuario[0].trim(),camposUsuario[1].trim(),camposUsuario[2].trim(),camposUsuario[3].trim(),camposUsuario[4].trim(),camposUsuario[5].trim(),camposUsuario[6].trim(),Integer.parseInt(camposUsuario[7].trim()),Integer.parseInt(camposUsuario[9].trim()));
                usuarioObtenido.setRol(Integer.parseInt(camposUsuario[8].trim()));
                users.add(usuarioObtenido);
            }
            return users;            
        }   
        else{
            return null;
        }
    }
    public static void rellenarUsuarios(LinkedList<Usuario> usuarios){
        String textoEscribir="";
        for(Usuario user:usuarios){
            textoEscribir+=user.toString()+",";
        }
        Escritor.Escribir("C:/MEIA/usuario.txt", textoEscribir);
    }
    public static DescriptorUsuario obtenerDescriptorUsuario(int OpcionObtener){
          String contenido="";
        if(OpcionObtener==1){
            contenido=Lector.Obtener("C:/MEIA/desc_usuario.txt");
        }
        else if(OpcionObtener==2){
            contenido=Lector.Obtener("C:/MEIA/desc_usuariobitacora.txt");
        }
        String[] campos=contenido.split(",");
        
        return new DescriptorUsuario(campos[0],campos[1],campos[2],campos[3],campos[4],Integer.parseInt(campos[5]),Integer.parseInt(campos[6]),Integer.parseInt(campos[7]),Integer.parseInt(campos[8]));
      
    }
    public static void rellenarDescriptorUsuario(DescriptorUsuario descriptor,int OpcionObtener){
        if(OpcionObtener==1){
            Escritor.Escribir("C:/MEIA/desc_usuario.txt", descriptor.toString());
        }
        else if(OpcionObtener==2){
           Escritor.Escribir("C:/MEIA/desc_usuariobitacora.txt", descriptor.toString()); 
        }
        
    }
    public static DescriptorBitacoraBackup obtenerDescriptorBB(){
        String contenido="";
            contenido=Lector.Obtener("C:/MEIA/desc_bitacora_backup.txt");
        
        String[] campos=contenido.split(",");
       DescriptorBitacoraBackup desc=new DescriptorBitacoraBackup();
       desc.setNombre(campos[0]);
       desc.setFechaCreacion(campos[1]);
       desc.setUsuarioCreacion(campos[2]);
       desc.setFechaModificacion(campos[3]);
       desc.setUsuarioModificacion(campos[4]);
       desc.setNumRegistros(Integer.parseInt(campos[5]));
        return desc;
    }
}
