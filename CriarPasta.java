
package Ficheiros;

import java.io.File;

/**
 *
 * @author agton
 */
public class CriarPasta {
    public static void main(String[] args) {
        String nomeFicheiro = "C:" + File.pathSeparator + "Lixo" + File.separator + "Pasta" + File.separator + "teste.txt";
        File pasta = new File(nomeFicheiro);
        pasta.mkdirs();
    }
    
}
