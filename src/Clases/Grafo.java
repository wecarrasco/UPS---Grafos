/**                       ** 
 *                         *
 * Autor: Walther Carrasco *
 *                         *
 **                       **/

package Clases;

import java.util.ArrayList;

public class Grafo {
    ArrayList <Nodo> nodos = new ArrayList<>();

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
    
    public void addNodo(Nodo nodo){
        boolean esta = false;
            for (int l = 0; l < nodos.size(); l++) {
                if(nodos.get(l).getLetra().contentEquals(nodo.getLetra())){
                    esta = true;
                }
            }
            
            if (esta == false) {
                nodos.add(nodo);
                System.out.println("Agregado: "+nodo.getLetra());
            }
    }
    
    public int getCantidadNodos(){
        return nodos.size();
    }

    @Override
    public String toString() {
        String texto = "";
        for (int i = 0; i < nodos.size(); i++) {
            texto += nodos.get(i).getLetra();
            texto += " -- ";
            for (int j = 0; j < nodos.get(i).getAristas().size(); j++) {
                texto += nodos.get(i).getAristas().get(j).getPeso() + " --> " + nodos.get(i).getAristas().get(j).getDestino().getLetra();
            }
            texto +="\n";
        }
        
        
        
        return texto;
    }
    
    
    
}
