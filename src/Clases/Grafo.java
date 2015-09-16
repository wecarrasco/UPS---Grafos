/**
 * **
 *                         *
 * Autor: Walther Carrasco * * * *
 */
package Clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Grafo {

    ArrayList<Nodo> nodos = new ArrayList<>();
    int matrizAd[][] = new int [27][27];
    int matrizCo[][] = new int [27][27];

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

    public void setMatrizAd(int x, int y, int num){
        matrizAd[x][y] = num;
    }
    public void setMatrizCo(int x, int y, int num){
        matrizCo[x][y] = num;
    }

    public int getMatrizAd(int x, int y) {
        return matrizAd[x][y];
    }

    public int getMatrizCo(int x, int y) {
        return matrizCo[x][y];
    }
    
    
    
    public void addNodo(Nodo nodo) {
        boolean esta = false;
        for (int l = 0; l < nodos.size(); l++) {
            if (nodos.get(l).getLetra().contentEquals(nodo.getLetra())) {
                esta = true;
            }
        }

        if (esta == false) {
            nodos.add(nodo);
            nodo.setNumero(nodos.size());
            System.out.println("Agregado: " + nodo.getLetra());
        }
    }

    public int getCantidadNodos() {
        return nodos.size();
    }

    public void guardarGrafo() {
        String texto = nodos.size() + ";";
        int aristas = 0;
        for (int i = 0; i < nodos.size(); i++) {
            for (int j = 0; j < nodos.get(i).getAristas().size(); j++) {
                texto += nodos.get(i).getLetra() + "#" + nodos.get(i).getX() + "-" + nodos.get(i).getY() + ":" + nodos.get(i).getAristas().get(j).getPeso() + ":" + nodos.get(i).getAristas().get(j).getDestino().getLetra() + "#" + nodos.get(i).getAristas().get(j).getDestino().getX() + "-" + nodos.get(i).getAristas().get(j).getDestino().getY() + ";";
            }
        }
        try {
            String nombre = "";
            JFileChooser file = new JFileChooser();
            file.showSaveDialog(null);
            file.setCurrentDirectory(new File("./src/ups/nasa"));
            File guarda = file.getSelectedFile();

            if (guarda != null) {
                FileWriter save = new FileWriter(guarda + ".txt");
                save.write(texto);
                save.close();
                JOptionPane.showMessageDialog(null,
                        "El archivo se a guardado Exitosamente",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Su archivo no se ha guardado",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    
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
            texto += "\n";
        }

        return texto;
    }

}
