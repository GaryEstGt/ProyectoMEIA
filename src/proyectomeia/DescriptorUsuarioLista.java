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
public class DescriptorUsuarioLista {
    String usuarioCreacion, fechaCreacion;
       int numRegistros,registrosActivos,registrosInactivos;

    @Override
    public String toString() {
        return usuarioCreacion + "\n" + fechaCreacion + "\n" + numRegistros + "\n" + registrosActivos + "\n" + registrosInactivos;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
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

    public DescriptorUsuarioLista(String usuarioCreacion, String fechaCreacion, int numRegistros, int registrosActivos, int registrosInactivos) {        
        this.fechaCreacion = fechaCreacion;
        this.usuarioCreacion = usuarioCreacion;        
        this.numRegistros = numRegistros;
        this.registrosActivos = registrosActivos;
        this.registrosInactivos = registrosInactivos;        
    }
}
