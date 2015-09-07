 /**                       ** 
 *                         *
 * Autor: Walther Carrasco *
 *                         *
 **                       **/

package Clases;

public class Nodo {
    char letra;
    boolean estaChallenger;
    boolean origen = false;

    public Nodo(char letra, boolean estaChallenger) {
        this.letra = letra;
        this.estaChallenger = estaChallenger;
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
