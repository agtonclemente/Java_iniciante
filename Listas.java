
package excecoes;

import java.util.ArrayList;

/**
 *
 * @author agton
 */
public class Listas {

    
    public static void main(String[] args) {
        /*String[] frutas = new String[3];
        frutas[0] = "maçã";
        frutas[1] = "morango";
        frutas[2] = "melão";
        frutas[3] = "melancia";
        
        System.out.println(frutas[3]);*/
        
        ArrayList frutaLista = new ArrayList();
        
        frutaLista.add("manga");
        frutaLista.add("melancia");
        frutaLista.add("morango");
        
        System.out.println(frutaLista);
        
        frutaLista.remove("morango");
        
        System.out.println(frutaLista);
        
        frutaLista.clear();
        
        System.out.println(frutaLista);
        System.out.println(frutaLista.contains("melancia"));
        System.out.println("limão");
        
        ArrayList <Empregado> empregado = new ArrayList <Empregado>();
        
        //empregado.add(args)
        
       
    }
    
}
