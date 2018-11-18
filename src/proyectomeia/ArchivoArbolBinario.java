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
        LinkedList<Nodo> nodos = new LinkedList<Nodo>();
        
        if(obtenerNodos() != null){
            nodos = obtenerNodos();
        }        
        
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
    
    public static void eliminarCorreo(Correo correo){        
        DescriptorCorreo descriptorCorreo = obtenerDescriptorCorreo();
        LinkedList<Nodo> nodos = new LinkedList<Nodo>();
        Nodo nodo = null;
        
        if(obtenerNodos() != null){
            nodos = obtenerNodos();
        }        
        
        if(nodos.size() > 0){
            for (int i = 0; i < nodos.size(); i++) {
                if(nodos.get(i).getCorreo().Compare(correo) == 0){
                    nodo = nodos.get(i);
                    break;
                }
            }
        }        
        
        boolean tieneNodoDerecha = nodo.getDerecho() != -1 ? true : false;
        boolean tieneNodoIzquierda = nodo.getIzquierdo() != -1 ? true : false;
        
        if (!tieneNodoDerecha && !tieneNodoIzquierda)
            {
                removeNodoCaso1(nodo, nodos);
            }


            if (tieneNodoDerecha && !tieneNodoIzquierda)
            {
                removeNodoCaso2(nodo, nodos);
            }


            if (!tieneNodoDerecha && tieneNodoIzquierda)
            {
                removeNodoCaso2(nodo, nodos);
            }

            /* Caso 3: Tiene ambos hijos */
            if (tieneNodoDerecha && tieneNodoIzquierda)
            {
                removeNodoCaso3(nodo, nodos);
            }                        
    }
    
    protected static void removeNodoCaso1(Nodo nodo, LinkedList<Nodo> nodos)
        {       
            DescriptorCorreo descriptorCorreo = obtenerDescriptorCorreo();
            Nodo Padre = null;
            
            boolean derecho = false;
            
            for (int i = 0; i < nodos.size(); i++) {
                if(nodos.get(i).getDerecho() == nodo.getPosicion()){
                    derecho = true;
                    Padre = nodos.get(i);
                }
                else if(nodos.get(i).getIzquierdo() == nodo.getPosicion()){
                    derecho = false;
                    Padre = nodos.get(i);
                }
            }
            
            if (nodo.getPosicion() != descriptorCorreo.getRaiz())
            {
                if (derecho)
                    Padre.setDerecho(-1);
                else
                    Padre.setIzquierdo(-1);
            }
            else
            {
                descriptorCorreo.setRaiz(0);
            }
        
            nodos.get(nodo.getPosicion() - 1).getCorreo().setEstatus(0);
            descriptorCorreo.setActivos(descriptorCorreo.getActivos() - 1);
            descriptorCorreo.setInactivos(descriptorCorreo.getInactivos() + 1);        
            rellenarDescriptorCorreo(descriptorCorreo);
            rellenarNodos(nodos);
        }
    
        protected static void removeNodoCaso2(Nodo nodo, LinkedList<Nodo> nodos)
        {
            DescriptorCorreo descriptorCorreo = obtenerDescriptorCorreo();
            Nodo Padre = null;
            
            boolean derecho = false;
            
            for (int i = 0; i < nodos.size(); i++) {
                if(nodos.get(i).getDerecho() == nodo.getPosicion()){
                    derecho = true;
                    Padre = nodos.get(i);
                }
                else if(nodos.get(i).getIzquierdo() == nodo.getPosicion()){
                    derecho = false;
                    Padre = nodos.get(i);
                }
            }
            
            if (nodo.getPosicion() != descriptorCorreo.getRaiz())
            {                
                if (nodo.getDerecho() != -1)
                {                    
                    if (derecho)
                        Padre.setDerecho(nodo.getDerecho());
                    else
                        Padre.setIzquierdo(nodo.getDerecho());
                }
                else
                {                    
                    if (derecho)
                        Padre.setDerecho(nodo.getIzquierdo());
                    else
                        Padre.setIzquierdo(nodo.getIzquierdo());
                }
            }
            else
            {
                if (nodo.getDerecho() != -1)
                {
                    descriptorCorreo.setRaiz(nodo.getDerecho());                    
                }
                else
                {
                    descriptorCorreo.setRaiz(nodo.getIzquierdo());
                }
            }
            
            nodos.get(nodo.getPosicion() - 1).getCorreo().setEstatus(0);
            descriptorCorreo.setActivos(descriptorCorreo.getActivos() - 1);
            descriptorCorreo.setInactivos(descriptorCorreo.getInactivos() + 1);        
            rellenarDescriptorCorreo(descriptorCorreo);
            rellenarNodos(nodos);
        }
        
        protected static void removeNodoCaso3(Nodo nodo, LinkedList<Nodo> nodos)
        {
            DescriptorCorreo descriptorCorreo = obtenerDescriptorCorreo();                        
            Nodo aux = nodos.get(nodo.getIzquierdo() - 1);
            Nodo Padre = null;
            
            boolean derecho = false;
            
            for (int i = 0; i < nodos.size(); i++) {
                if(nodos.get(i).getDerecho() == nodo.getPosicion()){
                    derecho = true;
                    Padre = nodos.get(i);
                }
                else if(nodos.get(i).getIzquierdo() == nodo.getPosicion()){
                    derecho = false;
                    Padre = nodos.get(i);
                }
            }

            while (aux.getDerecho() != -1)
            {
                Padre = aux;
                aux = nodos.get(aux.getDerecho() - 1);                                
            }

            if (nodo.getDerecho() != aux.getPosicion() && nodo.getIzquierdo() != aux.getPosicion())
            {
                for (int i = 0; i < nodos.size(); i++) {
                    if(nodos.get(i).getDerecho() == aux.getPosicion()){
                        nodos.get(i).setDerecho(aux.getIzquierdo());
                        break;
                    }
                }                
            }
            else
            {
                for (int i = 0; i < nodos.size(); i++) {
                    if(nodos.get(i).getDerecho() == aux.getPosicion()){
                        nodos.get(i).setIzquierdo(aux.getIzquierdo());
                        break;
                    }
                }                             
            }                            

            aux.setDerecho(nodo.getDerecho());            
            aux.setIzquierdo(nodo.getIzquierdo());                        

            if (nodo.getPosicion() != descriptorCorreo.getRaiz())
            {                                
                if (derecho)
                    Padre.setDerecho(aux.getPosicion());
                else
                    Padre.setIzquierdo(aux.getPosicion());
            }
            else
            {                
                descriptorCorreo.setRaiz(aux.getPosicion());
            }
            
            nodos.get(nodo.getPosicion() - 1).getCorreo().setEstatus(0);
            descriptorCorreo.setActivos(descriptorCorreo.getActivos() - 1);
            descriptorCorreo.setInactivos(descriptorCorreo.getInactivos() + 1);        
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
                Nodo nodo = new Nodo(Integer.parseInt(campos[0].trim()), Integer.parseInt(campos[1].trim()),Integer.parseInt(campos[2].trim()),Correo.toCorreo(campos[3]));
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
