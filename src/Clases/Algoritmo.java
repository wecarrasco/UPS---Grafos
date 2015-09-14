/**                       ** 
 *                         *
 * Autor: Walther Carrasco *
 *                         *
 **                       **/

package Clases;

public class Algoritmo {
    Grafo grafo;
    Object [][] matriz = new Object [grafo.getCantidadNodos()+1][];
    int total = 0;
    Nodo origen;
    Nodo destino;

    public Algoritmo(Grafo grafo, Nodo origen, Nodo destino) {
        this.grafo = grafo;
        this.origen = origen;
        this.destino = destino;
        PathFinder();
    }

    public Grafo getGrafo() {
        return grafo;
    }

    public void setGrafo(Grafo grafo) {
        this.grafo = grafo;
    }

    public Object[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(Object[][] matriz) {
        this.matriz = matriz;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
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
    
    public void PathFinder(){
        origen.estaChallenger = true;
        Nodo temp = null;
        do{
            
        }while(!(temp.getLetra().contentEquals(destino.getLetra())));
    }
}
