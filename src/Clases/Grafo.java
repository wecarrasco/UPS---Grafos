/**                       ** 
 *                         *
 * Autor: Walther Carrasco *
 *                         *
 **                       **/

package Clases;

import java.util.ArrayList;

public class Grafo {
    ArrayList <Nodo> nodos;

    public Grafo(ArrayList<Nodo> nodos) {
        this.nodos = nodos;
    }

    public Grafo() {
    }

    public ArrayList<Nodo> getNodos() {
        return nodos;
    }

    public void setNodos(ArrayList<Nodo> nodos) {
        this.nodos = nodos;
    }
    
    
}
