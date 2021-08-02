//VetoresPares
package aula08;
import java.util.Scanner;


public class Aula08_ex11 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Scanner scan = Scanner(System.in);
        
        int[] vetorA = new int[10];
        
        int qtdPares = 0;
        for (int i=0; i < vetorA.length; i++) {
        System.out.println("Vetor A = " + i);
        vetorA[i] = scan.nextInt();
        if (vetorA[i] % 2 == 0) {
            qtdPares++;
        }
    }
        System.out.println("Vetor A = ");
        for (int i=0; i<vetorA.length; i++) {
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Quantidade de números pares: " + qtdPares);
        
    }

    
    }
    

