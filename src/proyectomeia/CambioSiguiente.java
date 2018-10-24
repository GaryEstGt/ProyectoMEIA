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
public class CambioSiguiente {
    int numAnterior, numNuevo;

    public CambioSiguiente(int numAnterior, int numNuevo) {
        this.numAnterior = numAnterior;
        this.numNuevo = numNuevo;
    }

    public int getNumAnterior() {
        return numAnterior;
    }

    public void setNumAnterior(int numAnterior) {
        this.numAnterior = numAnterior;
    }

    public int getNumNuevo() {
        return numNuevo;
    }

    public void setNumNuevo(int numNuevo) {
        this.numNuevo = numNuevo;
    }
}
