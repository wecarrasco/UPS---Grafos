/**                       ** 
 *                         *
 * Autor: Walther Carrasco *
 *                         *
 **                       **/

package Clases;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Algoritmo {
    Grafo grafo;
    ArrayList<Nodo> nodos = new ArrayList<>();
    private Nodo nodo[]; 
    int total = 0;
    Nodo origen;
    Nodo destino;
    Nodo auxNodo;
    Pintar p = new Pintar();
    Graphics g;
    int acumulado, auxAcumulado, subMax;
    
    public Algoritmo(Grafo grafo, Graphics g, Nodo origen, Nodo destino) {
        this.grafo = grafo;
        this.origen = origen;
        this.destino = destino;
        this.g = g;
        nodo = new Nodo[grafo.getNodos().size()+100];
    }

    
    
    public void PathFinder(){
        for (int i = 0; i < grafo.getCantidadNodos()+100; i++) {
            nodo[i] = new Nodo();
        }
        
        if (!(origen.getLetra().contentEquals(destino.getLetra()))) {
            p.clickSobreNodo(g, origen.getX(), origen.getY(), null,Color.GREEN);
            
            nodo[origen.getNumero()].setEstaChallenger(true);
            do{
              acumulado=0;
              auxAcumulado = 2000000000;
              nodo[origen.getNumero()].setEtiqueta(true); 
                for (int i = 0; i < grafo.getCantidadNodos(); i++) {
                    if (grafo.getMatrizAd(i, origen.getNumero()) == 1) {
                        acumulado = nodo[origen.getNumero()].getAcumulado() + grafo.getMatrizCo(i, origen.getNumero());
                        if (acumulado <= nodo[i].getAcumulado() && nodo[i].isEstaChallenger() == true && nodo[i].isEtiqueta() == false) {
                            nodo[i].setAcumulado(acumulado);
                            nodo[i].setEstaChallenger(true);
                            nodo[i].setNumero(i);
                            nodo[i].setAnterior(nodo[origen.getNumero()]);
                        }else if (!nodo[i].isEstaChallenger()) {
                            nodo[i].setAcumulado(acumulado);
                            nodo[i].setEstaChallenger(true);
                            nodo[i].setNumero(i);
                            nodo[i].setAnterior(nodo[origen.getNumero()]);
                        }
                    }
                }
                for (int i = 0; i < grafo.getCantidadNodos(); i++) {
                    if (nodo[i].isEstaChallenger() == true  &&  nodo[i].isEtiqueta() == false) {
                        if (nodo[i].getAcumulado() <= auxAcumulado) {
                            origen.setNumero( nodo[i].getNumero());
                            auxAcumulado = nodo[i].getAcumulado();
                        }
                    }
                }
                subMax++;
            }while(subMax < grafo.getCantidadNodos()+1);
            auxNodo = nodo[destino.getNumero()];
            if (auxNodo.getAnterior() == null) {
                JOptionPane.showMessageDialog(null,"No se Pudo LLegar Al Nodo "+destino.getLetra()); 
            }
            
            while(auxNodo.getAnterior() != null){
                p.pintarCamino(g, grafo.getNodos().get(auxNodo.getNumero()).getX(), grafo.getNodos().get(auxNodo.getNumero()).getY(), grafo.getNodos().get(auxNodo.getAnterior().getNumero()).getX(), grafo.getNodos().get(auxNodo.getAnterior().getNumero()).getY(), Color.GREEN);
                p.clickSobreNodo(g, grafo.getNodos().get(auxNodo.getNumero()).getX(), grafo.getNodos().get(auxNodo.getNumero()).getY(), null,Color.GREEN);
             auxNodo=auxNodo.getAnterior();    
            }
            p.clickSobreNodo(g, grafo.getNodos().get(destino.getNumero()).getX(), grafo.getNodos().get(destino.getNumero()).getY(), null,Color.GREEN);
        }else p.clickSobreNodo(g, grafo.getNodos().get(destino.getNumero()).getX(), grafo.getNodos().get(destino.getNumero()).getY(), null,Color.GREEN);
    }
}
