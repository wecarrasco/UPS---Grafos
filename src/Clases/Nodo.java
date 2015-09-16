/**
 * **
 *                         *
 * Autor: Walther Carrasco * * *                       *
 */
package Clases;

import java.util.ArrayList;

public class Nodo {

    String letra;
    boolean estaChallenger = false, etiqueta = false;
    boolean origen = false;
    ArrayList<Arista> aristas = new ArrayList<>();
    int contadorOrigenes = 0;
    int x, y;
    int numero, acumulado;
    Nodo anterior;

    public Nodo() {
    }

    
    public Nodo(String letra, int x, int y) {
        this.letra = letra;
        this.x = x;
        this.y = y;
        this.acumulado = 0;
        this.anterior = null;
    }

    public int getAcumulado() {
        return acumulado;
    }

    public boolean isEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(boolean etiqueta) {
        this.etiqueta = etiqueta;
    }

    
    public void setAcumulado(int acumulado) {
        this.acumulado = acumulado;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    

    public int getContadorOrigenes() {
        return contadorOrigenes;
    }

    public void setContadorOrigenes(int contadorOrigenes) {
        this.contadorOrigenes = contadorOrigenes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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
        return letra;
    }

}
