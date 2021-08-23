
package Ficheiros;

import java.io.File;

/**
 *
 * @author agton
 */
public class Ficheiro {

   
    public static void main(String[] args) {
        String nomeFicheiro = "C:" + File.pathSeparator + "teste.txt";
        
        File fich = new File(nomeFicheiro);
        System.out.println(nomeFicheiro + "existe?" + fich.exists());
        
    }
    
}
