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
        DescriptorCorreo descriptorCorreo = obtenerDescriptorCorreo();
        LinkedList<Nodo> nodos = obtenerNodos();
        
        Nodo nuevo = new Nodo(descriptorCorreo.cantidad + 1, correo);
        
        if(descriptorCorreo.getRaiz() == 0){
            descriptorCorreo.setRaiz(nuevo.getPosicion());              
        }
        else{
            Nodo aux = nodos.get(descriptorCorreo.getRaiz() - 1);
            Nodo Padre = nodos.get(descriptorCorreo.getRaiz() - 1);
            boolean derecha = false;
            
            while(aux != null){
                Padre = aux;
                if(nuevo.getCorreo().Compare(aux.getCorreo()) == 1){
                    if(aux.getDerecho() != -1){
                        aux = nodos.get(aux.getDerecho() - 1);
                    }
                    else{
                        aux = null;
                    }
                    
                    derecha = true;
                }
                else{
                    if(aux.getIzquierdo() != -1){
                        aux = nodos.get(aux.getIzquierdo() - 1);
                    }
                    else{
                        aux = null;
                    }
                    
                    derecha = false;
                }                
            }
            
            int posicionPadre = 0;
            for (int i = 0; i < nodos.size(); i++) {
                if(nodos.get(i).equals(Padre)){
                    posicionPadre = i;
                    break;
                }
            }
            
            if(derecha){
                nodos.get(posicionPadre).setDerecho(nuevo.getPosicion());
            }
            else{
                nodos.get(posicionPadre).setIzquierdo(nuevo.getPosicion());
            }                        
        }
        
        descriptorCorreo.setCantidad(descriptorCorreo.getCantidad() + 1);
        descriptorCorreo.setActivos(descriptorCorreo.getActivos() + 1);
        nodos.add(nuevo);
        rellenarDescriptorCorreo(descriptorCorreo);
        rellenarNodos(nodos);
    }
                
    public static LinkedList<Nodo> obtenerNodos(){
        String contenido="";        
        contenido=Lector.Obtener("C:/MEIA/correos.txt");
        
        if(!contenido.isEmpty()){
            String[] datos=contenido.split("\n");
            LinkedList<Nodo> lista=new LinkedList<>();
            for (int i = 0; i < datos.length; i++){   
                String[] campos = datos[i].split("\\|");
                Nodo nodo = new Nodo(Integer.parseInt(campos[0].trim()), Integer.parseInt(campos[1].trim()),Integer.parseInt(campos[2].trim()),Correo.toCorreo(campos[3].trim()));
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
