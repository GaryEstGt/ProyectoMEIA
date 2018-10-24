/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomeia;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author garya
 */
public class SecuencialLista {
     public static LinkedList<Lista> obtenerListas(int OpcionObtener){
        String contenido="";
        if(OpcionObtener==1){
             contenido=Lector.Obtener("C:/MEIA/bitacora_lista.txt");
        }
        else if(OpcionObtener==2){
            contenido=Lector.Obtener("C:/MEIA/lista.txt");
        }
        
        if(!contenido.isEmpty()){
            String[] listas=contenido.split("\n");
            LinkedList<Lista> lista=new LinkedList<>();
            for (int i = 0; i < listas.length; i++){
                String[] camposlistas=listas[i].split("\\|");
                Lista listaObtenida=new Lista(camposlistas[0].trim(),camposlistas[1].trim(),camposlistas[2].trim(),Integer.parseInt(camposlistas[3].trim()),camposlistas[4].trim(),Integer.parseInt(camposlistas[5].trim()));
                lista.add(listaObtenida);
            }
            return lista;            
        }   
        else{
            return null;
        }
    }
     
    public static void rellenarListas(LinkedList<Lista> lista){
        String textoEscribir="";
        for(Lista list:lista){
            textoEscribir+=list.toString()+"\n";
        }
        Escritor.Escribir("C:/MEIA/lista.txt", textoEscribir);
    }
    
    public static void rellenarListasMaestro(LinkedList<Lista> listas){
        String textoEscribir="";
        for(Lista list:listas){
            textoEscribir+=list.toFixedSizeString()+"\n";
        }
        Escritor.Escribir("C:/MEIA/lista.txt", textoEscribir);
    }
    
    public static DescriptorLista obtenerDescriptorLista(int OpcionObtener){
          String contenido="";
        if(OpcionObtener==1){
            contenido=Lector.Obtener("C:/MEIA/desc_lista.txt");
        }
        else if(OpcionObtener==2){
            contenido=Lector.Obtener("C:/MEIA/desc_listabitacora.txt");
        }
        String[] campos=contenido.split("\n");
        
        return new DescriptorLista(campos[0],campos[1],campos[2],campos[3],campos[4],Integer.parseInt(campos[5]),Integer.parseInt(campos[6]),Integer.parseInt(campos[7]),Integer.parseInt(campos[8]));
      
    }
    public static void rellenarDescriptorLista(DescriptorLista descriptor,int OpcionObtener){
        if(OpcionObtener==1){
            Escritor.Escribir("C:/MEIA/desc_lista.txt", descriptor.toString());
        }
        else if(OpcionObtener==2){
           Escritor.Escribir("C:/MEIA/desc_listabitacora.txt", descriptor.toString()); 
        }
        
    }   
    
    public static void LlenarListasMaestro() throws IOException{
       
        LinkedList<Lista> listaBitacora=obtenerListas(1);
        LinkedList<Lista> listaListas=obtenerListas(2);

        DescriptorLista descListas=obtenerDescriptorLista(1);
        DescriptorLista descBitacora=obtenerDescriptorLista(2);
        LinkedList<Lista> nuevaLista=new LinkedList<>();
        if(descListas.getNumRegistros()!=0 && descBitacora.getNumRegistros()!=0){
            listaBitacora.forEach((list) -> {nuevaLista.add(list);});
            listaListas.forEach((list) -> {nuevaLista.add(list);}); 
        }else if(descBitacora.getNumRegistros()==0){
            listaListas.forEach((list) -> {nuevaLista.add(list);}); 
        }
        else{
             listaBitacora.forEach((list) -> {nuevaLista.add(list);});
        }
        EliminarLista(nuevaLista);
        Collections.sort(nuevaLista, new CompareLista());
        rellenarListasMaestro(nuevaLista);
        Date fecha=new Date();
        descBitacora.setFechaModificacion(fecha.toString());
        descBitacora.setNumRegistros(0);
        descBitacora.setRegistrosActivos(0);
        descBitacora.setRegistrosInactivos(0);
        File bitacora=new File("C:/MEIA/bitacora_lista.txt");
        bitacora.delete();
        bitacora.createNewFile();
        descListas.setFechaModificacion(fecha.toString());
        descListas.setNumRegistros(nuevaLista.size());
        descListas.setFechaCreacion(fecha.toString());
        descListas.setUsuarioCreacion("Sistema");
        descListas.setRegistrosActivos(contarActivos(nuevaLista,1));
        descListas.setRegistrosInactivos(contarActivos(nuevaLista,2));
        rellenarDescriptorLista(descListas,1);
        rellenarDescriptorLista(descBitacora,2); 
        
    }
    public static void EliminarLista(LinkedList<Lista> nuevaLista) throws IOException{
        LinkedList<UsuarioLista> usuarios=Lista_Usuario.obtenerListasUsuario();
            for (int i = 0; i < nuevaLista.size(); i++) {
                if(nuevaLista.get(i).getEstatus()==0){
                    for (int j = 0; j < usuarios.size(); j++) {
                        
                            if(nuevaLista.get(i).getNombreLista().equals(usuarios.get(i).getNombreLista())){
                                Usuario usuarioAsociado=Lista_Usuario.buscarUsuario(usuarios.get(i).getUsuarioAsociado());
                                Usuario usuarioDueño=Lista_Usuario.buscarUsuario(usuarios.get(i).getUsuario());
                                Lista_Usuario.EliminarUsuario(nuevaLista.get(i), usuarioDueño, usuarioAsociado);
                            }                      
                    } 
                    nuevaLista.remove(i);
                }
               
            }
    }
    

    /**
     *
     * @param lista
     * @param retorno
     * @return
     */
    public static int contarActivos(LinkedList<Lista> lista,int retorno){
        int contActivos=0;
        int contInactivos=0;
        int contretorno=0;
        for(Lista list:lista){
            if(list.getEstatus()==1){
                contActivos++;
            }      
            else if(list.getEstatus()==0){
                contInactivos++;
            }
                
        }
        if(retorno==1){
            contretorno=contActivos;
        }
        else if(retorno==2){
            contretorno=contInactivos;
        }
        return contretorno;
    }
}
