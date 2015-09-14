/**                       ** 
 *                         *
 * Autor: Walther Carrasco *
 *                         *
 **                       **/

package Clases;

public class Stack<Nodo> {

    private int Tope = -1;
    private int Max;
    private int Pila[];
    public int DatoPila;

    public Stack(int CantMax) {
        Pila = new int[CantMax];
        Max = CantMax;
    }

    private boolean PilaVacia() {
        boolean resp = false;
        if (Tope == -1) {
            resp = true;
        }
        return resp;
    }

    private boolean PilaLlena() {
        boolean resp = false;
        if ((Tope - 1) == Max) {
            resp = true;
        }
        return resp;
    }

    public boolean psuh(int Dato) {
        boolean resp = false;
        if (!PilaLlena()) {
            Tope++;
            Pila[Tope] = Dato;
            resp = true;
        }
        return resp;
    }

    public boolean pull() {
        boolean resp = false;
        if (!PilaVacia()) {
            DatoPila = Pila[Tope];
            Tope--;
            resp = true;
        }
        return resp;
    }

    public boolean VerPila() {
        boolean resp = false;
        if (!PilaVacia()) {
            DatoPila = Pila[Tope];
            resp = true;
        }
        return resp;
    }
}
