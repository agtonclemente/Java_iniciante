//EXArray
package aula07;

import java.util.Scanner;


public class ExArray {

    
    public static void main(String[] args) {
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        Scanner scan = new Scanner(System.in);
        for (int i=0; i < vetorA.length; i++) {
        System.out.println("Número: ");
        vetorA[i] = scan.nextInt();
        vetorB[i] = vetorA[i];
    }
        System.out.println("Vetor A: ");
        for (int i=0; i < vetorA.length; i++) {
        System.out.println(vetorA + " ");
    }
        System.out.println();
        
        System.out.println("Vetor B: ");
        for (int i=0; i < vetorB.length; i++) {
        System.out.println(vetorB + " ");
    }     
    }
}
