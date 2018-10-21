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
public class DescriptorIndice {    
       int numRegistros,registrosActivos,registrosInactivos,registroInicio;

    @Override
    public String toString() {
        return numRegistros + "\n" + registroInicio + "\n" + registrosActivos + "\n" + registrosInactivos;
    }       

    public int getNumRegistros() {
        return numRegistros;
    }

    public void setNumRegistros(int numRegistros) {
        this.numRegistros = numRegistros;
    }

    public int getRegistrosActivos() {
        return registrosActivos;
    }

    public void setRegistrosActivos(int registrosActivos) {
        this.registrosActivos = registrosActivos;
    }

    public int getRegistrosInactivos() {
        return registrosInactivos;
    }

    public void setRegistrosInactivos(int registrosInactivos) {
        this.registrosInactivos = registrosInactivos;
    }  

    public DescriptorIndice(int numRegistros, int resitroInicio, int registrosActivos, int registrosInactivos) {        
        this.numRegistros = numRegistros;
        this.registroInicio = registroInicio;
        this.registrosActivos = registrosActivos;
        this.registrosInactivos = registrosInactivos;        
    }
}
