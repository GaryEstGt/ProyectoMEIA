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
        int nodo = -1;
        
        if(obtenerNodos() != null){
            nodos = obtenerNodos();
        }        
        
        if(nodos.size() > 0){
            for (int i = 0; i < nodos.size(); i++) {
                if(nodos.get(i).getCorreo().Compare(correo) == 0){
                    nodo = i;
                    break;
                }
            }
        }        
        
        boolean tieneNodoDerecha = nodos.get(nodo).getDerecho() != -1 ? true : false;
        boolean tieneNodoIzquierda = nodos.get(nodo).getIzquierdo() != -1 ? true : false;
        
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
    
    protected static void removeNodoCaso1(int nodo, LinkedList<Nodo> nodos)
        {       
            DescriptorCorreo descriptorCorreo = obtenerDescriptorCorreo();
            int Padre = -1;
            
            boolean derecho = false;
            
            for (int i = 0; i < nodos.size(); i++) {
                if(nodos.get(i).getDerecho() == (nodo + 1)){
                    derecho = true;
                    Padre = i;
                }
                else if(nodos.get(i).getIzquierdo() == (nodo + 1)){
                    derecho = false;
                    Padre = i;
                }
            }
            
            if (nodos.get(nodo).getPosicion() != descriptorCorreo.getRaiz())
            {
                if (derecho)
                    nodos.get(Padre).setDerecho(-1);
                else
                    nodos.get(Padre).setIzquierdo(-1);
            }
            else
            {
                descriptorCorreo.setRaiz(0);
            }
        
            nodos.get(nodo).getCorreo().setEstatus(0);
            descriptorCorreo.setActivos(descriptorCorreo.getActivos() - 1);
            descriptorCorreo.setInactivos(descriptorCorreo.getInactivos() + 1);        
            rellenarDescriptorCorreo(descriptorCorreo);
            rellenarNodos(nodos);
        }
    
        protected static void removeNodoCaso2(int nodo, LinkedList<Nodo> nodos)
        {
            DescriptorCorreo descriptorCorreo = obtenerDescriptorCorreo();
            int Padre = -1;
            
            boolean derecho = false;
            
            for (int i = 0; i < nodos.size(); i++) {
                if(nodos.get(i).getDerecho() == (nodo + 1)){
                    derecho = true;
                    Padre = i;
                }
                else if(nodos.get(i).getIzquierdo() == (nodo + 1)){
                    derecho = false;
                    Padre = i;
                }
            }
            
            if (nodos.get(nodo).getPosicion() != descriptorCorreo.getRaiz())
            {                
                if (nodos.get(nodo).getDerecho() != -1)
                {                    
                    if (derecho)
                        nodos.get(Padre).setDerecho(nodos.get(nodo).getDerecho());
                    else
                        nodos.get(Padre).setIzquierdo(nodos.get(nodo).getDerecho());
                }
                else
                {                    
                    if (derecho)
                        nodos.get(Padre).setDerecho(nodos.get(nodo).getIzquierdo());
                    else
                        nodos.get(Padre).setIzquierdo(nodos.get(nodo).getIzquierdo());
                }
            }
            else
            {
                if (nodos.get(nodo).getDerecho() != -1)
                {
                    descriptorCorreo.setRaiz(nodos.get(nodo).getDerecho());                    
                }
                else
                {
                    descriptorCorreo.setRaiz(nodos.get(nodo).getIzquierdo());
                }
            }
            
            nodos.get(nodo).getCorreo().setEstatus(0);
            descriptorCorreo.setActivos(descriptorCorreo.getActivos() - 1);
            descriptorCorreo.setInactivos(descriptorCorreo.getInactivos() + 1);        
            rellenarDescriptorCorreo(descriptorCorreo);
            rellenarNodos(nodos);
        }
        
        protected static void removeNodoCaso3(int nodo, LinkedList<Nodo> nodos)
        {
            DescriptorCorreo descriptorCorreo = obtenerDescriptorCorreo();                        
            int aux = nodos.get(nodo).getIzquierdo() - 1;
            int Padre = -1;
            
            boolean derecho = false;
            
            for (int i = 0; i < nodos.size(); i++) {
                if(nodos.get(i).getDerecho() == (nodo + 1)){
                    derecho = true;
                    Padre = i;
                }
                else if(nodos.get(i).getIzquierdo() == (nodo + 1)){
                    derecho = false;
                    Padre = i;
                }
            }

            while (nodos.get(aux).getDerecho() != -1)
            {
                Padre = aux;
                aux = nodos.get(aux).getDerecho() - 1;                                
            }

            if (nodos.get(nodo).getDerecho() != (aux + 1) && nodos.get(nodo).getIzquierdo() != (aux + 1))
            {
                for (int i = 0; i < nodos.size(); i++) {
                    if(nodos.get(i).getDerecho() == (aux + 1)){
                        nodos.get(i).setDerecho(nodos.get(aux).getIzquierdo());
                        break;
                    }
                }                
            }
            else
            {
                for (int i = 0; i < nodos.size(); i++) {
                    if(nodos.get(i).getDerecho() == (aux + 1)){
                        nodos.get(i).setIzquierdo(nodos.get(aux).getIzquierdo());
                        break;
                    }
                }                             
            }                            

            nodos.get(aux).setDerecho(nodos.get(nodo).getDerecho());            
            nodos.get(aux).setIzquierdo(nodos.get(nodo).getIzquierdo());                        

            if ((nodo + 1) != descriptorCorreo.getRaiz())
            {                                
                if (derecho)
                    nodos.get(Padre).setDerecho(aux + 1);
                else
                    nodos.get(Padre).setIzquierdo(aux + 1);
            }
            else
            {                
                descriptorCorreo.setRaiz(aux + 1);
            }
            
            nodos.get(nodo).getCorreo().setEstatus(0);
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
