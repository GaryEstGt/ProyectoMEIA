/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomeia;

/**
 *
 * @author garya
 */
public class DescriptorLista {
    String nombre, fechaCreacion,usuarioCreacion,fechaModificacion,usuarioModificacion;
       int numRegistros,registrosActivos,registrosInactivos,maxReorganizacion;

    @Override
    public String toString() {
        return nombre + "\n" + fechaCreacion + "\n" + usuarioCreacion + "\n" + fechaModificacion + "\n" + usuarioModificacion + "\n" + numRegistros + "\n" + registrosActivos + "\n" + registrosInactivos + "\n" + maxReorganizacion;
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

    public String getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
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

    public int getMaxReorganizacion() {
        return maxReorganizacion;
    }

    public void setMaxReorganizacion(int maxReorganizacion) {
        this.maxReorganizacion = maxReorganizacion;
    }

    public DescriptorLista(String nombre, String fechaCreacion, String usuarioCreacion, String fechaModificacion, String usuarioModificacion, int numRegistros, int registrosActivos, int registrosInactivos, int maxReorganizacion) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.usuarioCreacion = usuarioCreacion;
        this.fechaModificacion = fechaModificacion;
        this.usuarioModificacion = usuarioModificacion;
        this.numRegistros = numRegistros;
        this.registrosActivos = registrosActivos;
        this.registrosInactivos = registrosInactivos;
        this.maxReorganizacion = maxReorganizacion;
    }
}
