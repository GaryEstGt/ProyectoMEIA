/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomeia;

import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luise
 */
public class Lista_Usuario {                        
    
    public static void AsociarNuevoUsuario(Lista lista, Usuario usuario, Usuario usuarioAsociado) throws IOException{
        boolean resultado = false;
        UsuarioLista nuevo = new UsuarioLista(lista.getNombreLista(), usuario.getUsuario(),usuarioAsociado.getUsuario(),lista.getDescripcion(),1);                
        DescriptorUsuarioLista descriptor = obtenerDescriptorUsuarioLista();
        
        if(obtenerDescriptorUsuarioLista().getNumRegistros() == 0){
            Escritor.Escribir("C:/MEIA/Lista_usuario.txt", nuevo.toFixedSizeString());
            Date fecha = new Date();
            descriptor.setFechaCreacion(fecha.toString());
            descriptor.setUsuarioCreacion(usuario.getUsuario());
            resultado = true;
        }
        else{
            if(!verSiExisteUsuarioLista(nuevo)){                
                Escritor.Escribir("C:/MEIA/Lista_usuario.txt", Lector.Obtener("C:/MEIA/Lista_usuario.txt") + nuevo.toFixedSizeString());
                resultado = true;
            }                        
        }
        
        if(resultado){            
            descriptor.setNumRegistros(descriptor.getNumRegistros() + 1);
            descriptor.setRegistrosActivos(descriptor.getRegistrosActivos() + 1);
            
            rellenarDescriptorUsuarioLista(descriptor);
            
            AgregarNuevoIndice(nuevo);                        
            
            actualizarCantidadUsuarios(lista, true);
        }                    
    }
    
    public static boolean EliminarUsuario(Lista lista, Usuario usuario, Usuario usuarioAsociado) throws IOException{
        UsuarioLista UsuarioEliminar = new UsuarioLista(lista.getNombreLista(), usuario.getUsuario(),usuarioAsociado.getUsuario(),"",1);                
        DescriptorUsuarioLista descriptorUsuarioLista = obtenerDescriptorUsuarioLista();
        
        Indice indiceEliminar = new Indice(0, "", lista.getNombreLista(), usuario.getUsuario(), usuarioAsociado.getUsuario(), 0, 0);
        DescriptorIndice descriptorIndice = obtenerDescriptorIndice();
        
        if(verSiExisteUsuarioLista(UsuarioEliminar)){
            LinkedList<Indice> indices = obtenerIndiceListasUsuario();            
                        
            int posicion = descriptorIndice.getRegistroInicio() - 1;
            int anterior = -1;
            
            while(true){
                if(indiceEliminar.getNombreLista().equals(indices.get(posicion).getNombreLista()) 
                        && indiceEliminar.getUsuario().equals(indices.get(posicion).getUsuario())
                        && indiceEliminar.getUsuarioAsociado().equals(indices.get(posicion).getUsuarioAsociado())){
                    break;
                }
                else{
                    anterior = posicion;
                    posicion = indices.get(posicion).getSiguiente() - 1;
                }                
            }
            
            if(anterior == -1){
                if(indices.get(posicion).getSiguiente() != 0){
                    descriptorIndice.setRegistroInicio(indices.get(posicion).getSiguiente());                    
                }
                else{
                    descriptorIndice.setRegistroInicio(0);                    
                }                
            }
            else{                
                indices.get(anterior).setSiguiente(indices.get(posicion).getSiguiente());                                            
            }            
            
            indices.get(posicion).setEstatus(0);
            indices.get(posicion).setSiguiente(0);                
                                    
            descriptorIndice.setRegistrosActivos(descriptorIndice.getRegistrosActivos() - 1);
            descriptorIndice.setRegistrosInactivos(descriptorIndice.getRegistrosInactivos() + 1);
            
            rellenarDescriptorIndice(descriptorIndice);
            rellenarIndiceListasUsuario(indices);  
            
            //Eliminar de Lista_Usuario                        
            LinkedList<UsuarioLista> listasUsuario = obtenerListasUsuario();
            
            if (listasUsuario != null) {
                for (int i = 0; i < listasUsuario.size(); i++) {
                    if(listasUsuario.get(i).getNombreLista().equals(UsuarioEliminar.getNombreLista()) && 
                            listasUsuario.get(i).getUsuario().equals(UsuarioEliminar.getUsuario()) && 
                            listasUsuario.get(i).getUsuarioAsociado().equals(UsuarioEliminar.getUsuarioAsociado())){
                        listasUsuario.get(i).setEstatus(0);
                        descriptorUsuarioLista.setRegistrosActivos(descriptorUsuarioLista.getRegistrosActivos() - 1);
                        descriptorUsuarioLista.setRegistrosInactivos(descriptorUsuarioLista.getRegistrosInactivos() + 1);
                        break;
                    }
                }
            }            
            
            rellenarListasUsuario(listasUsuario);
            rellenarDescriptorUsuarioLista(descriptorUsuarioLista);
            actualizarCantidadUsuarios(lista, false);
            
            return true;
        }
        else{
            return false;
        }                                         
    }            
    
    private static void AgregarNuevoIndice(UsuarioLista nuevo){
        boolean resultado = true;
        Indice indiceNuevo = new Indice((obtenerDescriptorIndice().getNumRegistros() + 1), "1." + (obtenerDescriptorIndice().getNumRegistros() + 1), 
                nuevo.getNombreLista(), nuevo.getUsuario(), nuevo.getUsuarioAsociado(), 0, 1);
        DescriptorIndice descriptorIndice = obtenerDescriptorIndice();
                
        if(obtenerDescriptorIndice().getNumRegistros() == 0){            
            Escritor.Escribir("C:/MEIA/indice_Lista_usuario.txt", indiceNuevo.toFixedSizeString());            
            descriptorIndice.setNumRegistros(1);
            descriptorIndice.setRegistroInicio(1);
            descriptorIndice.setRegistrosActivos(1);       
            
            rellenarDescriptorIndice(descriptorIndice);
        }else{     
            LinkedList<Indice> indices = obtenerIndiceListasUsuario();            
                        
            int posicion = descriptorIndice.getRegistroInicio() - 1;
            
            while(true){
                if(indiceNuevo.getNombreLista().compareTo(indices.get(posicion).getNombreLista()) <= -1){
                    break;
                }
                else if(indiceNuevo.getNombreLista().compareTo(indices.get(posicion).getNombreLista()) == 0){
                    if(indiceNuevo.getUsuario().compareTo(indices.get(posicion).getUsuario()) == -1){
                        break;
                    }
                    else if(indiceNuevo.getUsuario().compareTo(indices.get(posicion).getUsuario()) == 0){
                        if(indiceNuevo.getUsuarioAsociado().compareTo(indices.get(posicion).getUsuarioAsociado()) <= -1){
                            break;
                        }          
                        else if(indiceNuevo.getUsuarioAsociado().compareTo(indices.get(posicion).getUsuarioAsociado()) >= 1){
                            if(indices.get(posicion).getSiguiente() == 0){                                
                                break;
                            }
                            else if(indiceNuevo.getUsuarioAsociado().compareTo(indices.get(indices.get(posicion).getSiguiente() - 1).getUsuarioAsociado()) <= -1){
                                break;
                            }
                            else{
                                posicion = indices.get(posicion).getSiguiente() - 1;
                            }                            
                        }
                    }
                    else if(indiceNuevo.getUsuario().compareTo(indices.get(posicion).getUsuario()) >= 1){
                        if(indices.get(posicion).getSiguiente() == 0){                                
                                break;
                            }
                            else if(indiceNuevo.getUsuario().compareTo(indices.get(indices.get(posicion).getSiguiente() - 1).getUsuario()) <= -1){
                                break;
                            }
                            else{
                                posicion = indices.get(posicion).getSiguiente() - 1;
                            }                            
                    }
                }
                else if(indiceNuevo.getNombreLista().compareTo(indices.get(posicion).getNombreLista()) >= 1){
                    if(indices.get(posicion).getSiguiente() == 0){                                
                                break;
                            }
                            else if(indiceNuevo.getNombreLista().compareTo(indices.get(indices.get(posicion).getSiguiente() - 1).getNombreLista()) <= -1){
                                break;
                            }
                            else{
                                posicion = indices.get(posicion).getSiguiente() - 1;
                            }                            
                }
            }
            
            if(indices.get(posicion).getSiguiente() != 0){
                if((posicion == (descriptorIndice.getRegistroInicio() - 1)) && (indiceNuevo.getNombreLista().compareTo(indices.get(0).getNombreLista()) <= -1 ||
                        indiceNuevo.getUsuario().compareTo(indices.get(0).getUsuario()) <= -1 || indiceNuevo.getUsuarioAsociado().compareTo(indices.get(0).getUsuarioAsociado()) <= -1)){
                    descriptorIndice.setRegistroInicio(indiceNuevo.getNumeroRegistro());
                    indiceNuevo.setSiguiente(indices.get(posicion).getNumeroRegistro());
                }
                else{
                    indiceNuevo.setSiguiente(indices.get(posicion).getSiguiente());
                    indices.get(posicion).setSiguiente(indiceNuevo.getNumeroRegistro());
                }                        
            }
            else{
                indices.get(posicion).setSiguiente(indiceNuevo.getNumeroRegistro());
            }            
            
            indices.add(indiceNuevo);
            descriptorIndice.setNumRegistros(descriptorIndice.getNumRegistros() + 1);
            descriptorIndice.setRegistrosActivos(descriptorIndice.getRegistrosActivos() + 1);
            
            rellenarDescriptorIndice(descriptorIndice);
            rellenarIndiceListasUsuario(indices);            
        }
    }        
    
    public static LinkedList<Indice> obtenerIndiceListasUsuario(){
        String contenido="";        
        contenido=Lector.Obtener("C:/MEIA/indice_Lista_usuario.txt");
        
        if(!contenido.isEmpty()){
            String[] datos=contenido.split("\n");
            LinkedList<Indice> lista=new LinkedList<>();
            for (int i = 0; i < datos.length; i++){   
                String[] campos = datos[i].split("\\|");
                Indice indice = new Indice(Integer.parseInt(campos[0].trim()),campos[1].trim(),campos[2].trim(),campos[3].trim(),campos[4].trim(),Integer.parseInt(campos[5].trim()),Integer.parseInt(campos[6].trim()));
                lista.add(indice);
            }
            return lista;            
        }   
        else{
            return null;
        }
    }        
    
    public static void rellenarIndiceListasUsuario(LinkedList<Indice> lista){
        String textoEscribir="";
        for(Indice list:lista){
            textoEscribir+=list.toFixedSizeString()+"\n";
        }
        Escritor.Escribir("C:/MEIA/indice_Lista_Usuario.txt", textoEscribir);
    }
    
    public static LinkedList<UsuarioLista> obtenerListasUsuario(){
        String contenido="";        
        contenido=Lector.Obtener("C:/MEIA/Lista_usuario.txt");
                        
        if(!contenido.isEmpty()){
            String[] datos=contenido.split("\n");
            LinkedList<UsuarioLista> lista=new LinkedList<>();
            for (int i = 0; i < datos.length; i++){                                
                String[] campos = datos[i].split("\\|");
                UsuarioLista usuarioLista = new UsuarioLista(campos[0].trim(),campos[1].trim(),campos[2].trim(),campos[3].trim(),Integer.parseInt(campos[4].trim()));
                lista.add(usuarioLista);
            }
            return lista;            
        }   
        else{
            return null;
        }
    }
    
    public static void rellenarListasUsuario(LinkedList<UsuarioLista> lista){
        String textoEscribir="";
        for(UsuarioLista list:lista){
            textoEscribir+=list.toFixedSizeString()+"\n";
        }
        Escritor.Escribir("C:/MEIA/Lista_Usuario.txt", textoEscribir);
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
    
    public static DescriptorIndice obtenerDescriptorIndice(){
        String contenido="";                                   
        contenido=Lector.Obtener("C:/MEIA/desc_indice.txt");        
        String[] campos=contenido.split("\n");        
        return new DescriptorIndice(Integer.parseInt(campos[0]), Integer.parseInt(campos[1]),Integer.parseInt(campos[2]),Integer.parseInt(campos[3]));      
    }
    
    public static void rellenarDescriptorIndice(DescriptorIndice descriptor){        
        Escritor.Escribir("C:/MEIA/desc_indice.txt", descriptor.toString());                        
    }
    
    public static boolean verSiExisteUsuarioLista(UsuarioLista usuarioLista){
        boolean resultado = false;
        LinkedList<UsuarioLista> lista = obtenerListasUsuario();
        
        for (int posicion = 0; posicion < lista.size(); posicion++) {
            if(usuarioLista.getNombreLista().compareTo(lista.get(posicion).getNombreLista()) == 0){
                if(usuarioLista.getUsuario().compareTo(lista.get(posicion).getUsuario()) == 0){
                    if(usuarioLista.getUsuarioAsociado().compareTo(lista.get(posicion).getUsuarioAsociado()) == 0){
                        if(lista.get(posicion).getEstatus() != 0){
                            resultado = true;
                        }                        
                    }
                }                
            }            
        }        
        
        return resultado;
    }      
    
    public static Lista EncontrarLista(String nombre,String usuario) throws IOException{
        Lista ListaEncontrada=null;
              SecuencialLista.LlenarListasMaestro();        
        for(Lista list:SecuencialLista.obtenerListas(2)){
            if(list.getNombreLista().equals(nombre)&&list.getUsuario().equals(usuario)){
                ListaEncontrada=list;
            }
        }
        return ListaEncontrada;
    }
    
    public static Usuario buscarUsuario(String usuario) throws IOException{
        
        DescriptorUsuario descBitacora=OperacionesSecuencial.obtenerDescriptorUsuario(2);
            if(descBitacora.getNumRegistros()!=0){
                try {
                    OperacionesSecuencial.LlenarUsuariosMaestro();                
                } catch (IOException ex) {
                    Logger.getLogger(ManejoUsuariosEnListas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        LinkedList<Usuario> usuarios=OperacionesSecuencial.obtenerUsuarios(2);
                        
        Usuario UsuarioEncontrado=null;   
        
        for(Usuario list:usuarios){
            if(list.getUsuario().equals(usuario)){
                UsuarioEncontrado=list;
            }
        }
        return UsuarioEncontrado;
    }
    
    public static LinkedList<UsuarioLista> buscarUsuarioLista(String nombre) throws IOException{
        DescriptorUsuarioLista descriptor = obtenerDescriptorUsuarioLista();        
        LinkedList<UsuarioLista> usuario = new LinkedList();
        
        if(descriptor.getRegistrosActivos() != 0){
            LinkedList<UsuarioLista> lista = obtenerListasUsuario();
            
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).getUsuarioAsociado().equals(nombre) && lista.get(i).getEstatus() != 0){
                    if(!usuario.contains(lista.get(i))){
                        usuario.add(lista.get(i));
                    }                    
                }
            }
        }
        
        return usuario;
    }
    
    public static LinkedList<Lista> buscarListas(String nombre) throws IOException{
        SecuencialLista.LlenarListasMaestro();
        DescriptorLista descriptor = SecuencialLista.obtenerDescriptorLista(1);
        LinkedList<Lista> listasEncontradas = new LinkedList<Lista>();
        if(descriptor.getRegistrosActivos() != 0){
            LinkedList<Lista> listas = SecuencialLista.obtenerListas(2);
            
            for (int i = 0; i < listas.size(); i++) {
                if(listas.get(i).getUsuario().equals(nombre) && listas.get(i).getEstatus() != 0){
                    if(!listasEncontradas.contains(listas.get(i))){
                        listasEncontradas.add(listas.get(i));
                    }                    
                }
            }
        }        
        
        return listasEncontradas;
    }
    
    private static void actualizarCantidadUsuarios(Lista lista, boolean agregar) throws IOException{
        SecuencialLista.LlenarListasMaestro();       
        
            LinkedList<Lista> listas = SecuencialLista.obtenerListas(2);
                                                
            for (int i = 0; i < listas.size(); i++) {
                if(listas.get(i).getNombreLista().equals(lista.getNombreLista()) && listas.get(i).getUsuario().equals(lista.getUsuario())){
                    if(agregar){
                        listas.get(i).setNumeroUsuarios(listas.get(i).getNumeroUsuarios() + 1);
                    }
                    else{
                        listas.get(i).setNumeroUsuarios(listas.get(i).getNumeroUsuarios() - 1);
                    }                    
                    break;
                }
            }
            
            SecuencialLista.rellenarListasMaestro(listas);
    }
}
