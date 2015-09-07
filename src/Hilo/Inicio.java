/**                       ** 
 *                         *
 * Autor: Walther Carrasco *
 *                         *
 **                       **/



package Hilo;

import javax.swing.JProgressBar;

public class Inicio extends Thread {
    JProgressBar progreso;
    public Inicio(JProgressBar progreso){
        super();
        this.progreso=progreso;
    }
    
    
    @Override
    public void run(){
        for(int i=1;i<=100;i++){
            progreso.setValue(i);
            pausa(30);
        }
    }
    
    
    public void pausa(int mlSeg){
        try{
            Thread.sleep(mlSeg);
        }
        catch(InterruptedException e){
            
        }
    }
}
