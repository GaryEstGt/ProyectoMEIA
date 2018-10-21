/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomeia;

/**
 *
 * @author luise
 */
public class Lista_Usuario {            
    public static int FixedSize = 116;
    
    public static String toFixedSizeString(String nombreLista, String usuario, String usuarioAsociado, String descripcion, int estatus){
        return String.format("%-30s", nombreLista) + "|" + String.format("%-20s", usuario) + "|" + String.format("%-20s", usuarioAsociado) +
                "|" + String.format("%-40s", descripcion) +"|" + estatus + "\n";
    }
    
    public static void AsociarUsuario(Lista lista, Usuario usuario){
        String nuevo = toFixedSizeString(lista.nombreLista, ProyectoMEIA.usuarioEnUso.getUsuario(),usuario.getUsuario(),lista.getDescripcion(),1);        
        EscritorListaUsuario.Escribir("C:/MEIA/bitacora_usuario.txt", nuevo,obtenerDescriptorUsuarioLista().numRegistros + 1, FixedSize);
        DescriptorUsuarioLista descriptor = obtenerDescriptorUsuarioLista();
        descriptor.setNumRegistros(descriptor.getNumRegistros() + 1);
        descriptor.setRegistrosActivos(descriptor.getRegistrosActivos() + 1);
        rellenarDescriptorUsuarioLista(descriptor);
    }
    
    public static DescriptorUsuarioLista obtenerDescriptorUsuarioLista(){
        String contenido="";                                   
        contenido=Lector.Obtener("C:/MEIA/desc_usuarioLista.txt");        
        String[] campos=contenido.split("\n");        
        return new DescriptorUsuarioLista(campos[0],campos[1],Integer.parseInt(campos[2]),Integer.parseInt(campos[3]),Integer.parseInt(campos[4]));      
    }
    
    public static void rellenarDescriptorUsuarioLista(DescriptorUsuarioLista descriptor){        
        Escritor.Escribir("C:/MEIA/desc_usuarioLista.txt", descriptor.toString());                        
    }
    
}
