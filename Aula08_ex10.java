//Vetor % 2
package aula08;

import java.io.InputStream;
import java.util.Scanner;


public class Aula08_ex10 {

    
    public static void main(String[] args) {
        Scanner scan = Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorC = new int[vetorA.length];
        int[] vetorB = null;
        for (int i=0; i < vetorA.length; i++) {
        System.out.println("Valor da posição: " + i);
        vetorA[i] = scan.nextInt();
        vetorB[i] = vetorA[i] % 2;
    }
        System.out.println("Vetor A: ");
        for (int i=0; i < vetorA.length; i++) {
        System.out.println(vetorA + " ");
    }
        System.out.println();
       

    
    }

    
    }
    
}
