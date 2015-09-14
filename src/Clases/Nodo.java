/**
 * **
 *                         *
 * Autor: Walther Carrasco * * *                       *
 */
package Clases;

import java.util.ArrayList;

public class Nodo {

    String letra;
    boolean estaChallenger = false;
    boolean origen = false;
    ArrayList<Arista> aristas = new ArrayList<>();
    int contadorOrigenes = 0;
    int x, y;

    public Nodo(String letra) {
        this.letra = letra;
    }

    public ArrayList<Arista> getAristas() {
        return aristas;
    }

    public void setAristas(ArrayList<Arista> aristas) {
        this.aristas = aristas;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public boolean isEstaChallenger() {
        return estaChallenger;
    }

    public void setEstaChallenger(boolean estaChallenger) {
        this.estaChallenger = estaChallenger;
    }

    public boolean isOrigen() {
        return origen;
    }

    public void setOrigen(boolean origen) {
        this.origen = origen;
    }

    public void addArista(Nodo destino, int peso) {
        Arista a = new Arista(this, destino, peso);
        destino.contadorOrigenes++;
        aristas.add(a);
    }

    @Override
    public String toString() {
        return "Nodo{" + "letra=" + letra + ", estaChallenger=" + estaChallenger + ", origen=" + origen + "}\n";
    }

}
