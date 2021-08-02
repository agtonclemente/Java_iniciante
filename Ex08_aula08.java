//Vetores_ex08_aula08
package aula08;

import java.util.Scanner;
public class Ex08_aula08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorC = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        for (int i=0; i<vetorA.length; i++) {
            System.out.println("O valor do vetor A na posição: " + i);
            vetorA[i] = scan.nextInt();
        }
        for (int i=0; i<vetorB.length; i++) {
            System.out.println("O valor do vetor B na posição: " + i);
            vetorB[i] = scan.nextInt();
        }
        for (int i=0; i<vetorC.length; i++) {
            vetorC[i] = vetorA[i] * vetorB[i];
        }
        System.out.println("Vetor A = ");
        for (int i=0; i<vetorA.length; i++) {
            System.out.println(vetorA[i] + " ");
        }
         System.out.println("Vetor B = ");
        for (int i=0; i<vetorB.length; i++) {
            System.out.println(vetorB[i] + " ");
        }
         System.out.println();
    }
    
}
