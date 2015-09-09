/**                       ** 
 *                         *
 * Autor: Walther Carrasco *
 *                         *
 **                       **/

package Clases;

import java.util.ArrayList;

public class Nodo {
    char letra;
    boolean estaChallenger;
    boolean origen = false;
    ArrayList <Arista> aristas;

    public Nodo(char letra, boolean estaChallenger, ArrayList<Arista> aristas) {
        this.letra = letra;
        this.estaChallenger = estaChallenger;
        this.aristas = aristas;
    }

    public ArrayList<Arista> getAristas() {
        return aristas;
    }

    public void setAristas(ArrayList<Arista> aristas) {
        this.aristas = aristas;
    }
    
    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
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

    @Override
    public String toString() {
        return "Nodo{" + "letra=" + letra + ", estaChallenger=" + estaChallenger + ", origen=" + origen + '}';
    }
    
    
}
