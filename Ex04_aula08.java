//Vetores_ex04_aula08
package aula08;

import java.util.Scanner;

public class Ex04_aula08 {

    
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira 10 números: ");
        for (int i=0; i<vetorA.length; i++) {
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
        }
        for (int i=0; i<vetorA.length; i++) {
            System.out.println("Os valores do vetor A = " + vetorA[i]);
        }
        for (int i=o; i<vetorB.length; i++) {
            int posicao = vetorB[i] * i;
            System.out.println("Os valores do vetor B = " + posicao);
        }
       
    }
    
}
