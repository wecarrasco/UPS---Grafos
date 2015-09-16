/**                       ** 
 *                         *
 * Autor: Walther Carrasco *
 *                         *
 **                       **/

package Hilo;

import javax.swing.JProgressBar;

public class Inicio extends Thread {

    JProgressBar progreso;

    public Inicio(JProgressBar progreso) {
        super();
        this.progreso = progreso;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            progreso.setValue(i);
            if (i < 50) //pausa(60);
            {
                pausa(60);
            } else //pausa(45);
            {
                pausa(45);
            }
        }
    }

    public void pausa(int mlSeg) {
        try {
            Thread.sleep(mlSeg);
        } catch (InterruptedException e) {

        }
    }
}
