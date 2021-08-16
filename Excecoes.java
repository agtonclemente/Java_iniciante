
package excecoes;

/**
 *
 * @author agton
 */
public class Excecoes {
    public static void main(String[] args) {
        try {
            int[] vetor = new int[3];
            System.out.println("Antes da exceção");

            vetor[4] = 1;
            System.out.println("Esta msg não será impressa");

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exeção ao aceder ao indice do vetor");
        }
        System.out.println("Esta msg é impressa depois da exceção");
        // int[] vetor = new int[3];

       // vetor[4] = 1;
    }
    
}
