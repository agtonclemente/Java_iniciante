//Classe_Minha_Thread
package MinhaThread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agton
 */
public class MinhaThread extends Threads {
    
    private String nome;
    int tempo;

    public MinhaThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start();
    }

    //@Override
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

    void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
