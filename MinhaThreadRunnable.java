/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinhathreadRunnable;

import MinhaThread.MinhaThread;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agton
 */
public class MinhaThreadRunnable implements Runnable  {
    private String nome;
    private int tempo;

    public MinhaThreadRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        Thread t = new Thread(this);
        t.start();
    }
    
    

    @Override
    public void run() {
         try {
        for (int i=0; i<6; i++) {
            
                System.out.println(nome + "contador" +i);
                Thread.sleep(tempo);
            
        }//System.out.println("A executar a thread");
            catch (InterruptedException ex) {
                Logger.getLogger(MinhaThread.class.getName()).log(Level.SEVERE, null, ex);
            }
             System.out.println("Terminou a execução");
        }
       
    }
    
    
}
