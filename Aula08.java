//Vetores
package aula08;

import java.util.Scanner;


public class Aula08 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        for (int i=0; i < vetorA.length; i++) {
        System.out.println("Valor da posição: ");
        vetorA[i] = scan.nextInt();
        vetorB[i] = vetorA[i] * 2;
    }
        System.out.println();
        for (int i=0; i<vetorA.length; i++) {
        System.out.println(vetorA[i] + " ");
        
    }
        System.out.println();
        System.out.println("Vetor B = ");
        for (int i=0; i<vetorB.length; i++){
            System.out.println(vetorB[i] + " ");
        }
        System.out.println();
    
    
    }
    
}
