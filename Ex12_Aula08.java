//Array_aula08
package aula08;
import java.util.Scanner;

public class Ex12_Aula08 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int soma = 0;
        for (int i=0; i < vetorA.length; i++) {
        soma += vetorA[i];
        }
        System.out.println("Vetor A = ");
        for (int i=0; i<vetorA.length; i++) {
            System.out.println(vetorA + " ");
        }
        System.out.println();
        System.out.println("Soma: " + soma);
        
    }
    
}
