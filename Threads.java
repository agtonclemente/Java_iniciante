//threads
package MinhaThread;

/**
 *
 * @author agton
 */
public class Threads {

   
    public static void main(String[] args) {
        
        MinhaThread thread = new MinhaThread("thread #1", 500);
        MinhaThread thread2 = new MinhaThread("thread #2", 800);
        MinhaThread thread3 = new MinhaThread("thread #3", 700);
        
        thread.start();
        
    }
    
}
