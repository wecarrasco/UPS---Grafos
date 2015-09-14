/**                       ** 
 *                         *
 * Autor: Walther Carrasco *
 *                         *
 **                       **/

package Clases;

public class Punto {
    int x;
    int y;
    Nodo nodo;

    public Punto(int x, int y, Nodo nodo) {
        this.x = x;
        this.y = y;
        this.nodo = nodo;
    }

    public Punto() {
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

    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }
    
    
}
