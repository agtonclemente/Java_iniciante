//Muiltiplos_5_Array
package aula08;
import java.util.Scanner;

public class Ex13 {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        
        int multCinco = 0;
        for (int i=0; i < vetorA.length; i++) {
        System.out.println("Vetor A = " + i);
        vetorA[i] = scan.nextInt();
        if (vetorA[i] % 5 == 0) {
            multCinco++;
        }
    }
        System.out.println("Vetor A = ");
        for (int i=0; i<vetorA.length; i++) {
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Multiplos de 5: " + multCinco);
        
        
    }
    
}
