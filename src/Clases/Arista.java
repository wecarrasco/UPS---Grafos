/**
 * **
 *                         *
 * Autor: Walther Carrasco * * *                       *
 */
package Clases;

public class Arista {

    Nodo origen;
    Nodo destino;
    int peso;
    boolean recorrido = false;

    public Arista(Nodo origen, Nodo destino, int peso) {
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
    }

    public Arista() {
    }

    public Nodo getOrigen() {
        return origen;
    }

    public void setOrigen(Nodo origen) {
        this.origen = origen;
    }

    public Nodo getDestino() {
        return destino;
    }

    public void setDestino(Nodo destino) {
        this.destino = destino;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isRecorrido() {
        return recorrido;
    }

    public void setRecorrido(boolean recorrido) {
        this.recorrido = recorrido;
    }

    @Override
    public String toString() {
        return "Origen: " + origen + ", Destino: " + destino + ", Peso: " + peso;
    }

}
