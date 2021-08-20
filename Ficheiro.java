
package Ficheiros;

/**
 *
 * @author agton
 */
public class Ficheiro {

   
    public static void main(String[] args) {
        String nomeFicheiro = new "C:\\teste.txt";
        System.out.println(ficheiro);
        
        Ficheiro fich = Ficheiro(nomeFicheiro);
       
        try {
             fich.createNewFile();
        } catch (Exception e) {
            System.out.println("erro" + fich.getPath());
        }
        
    }
    
}
