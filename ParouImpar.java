//ParouImpar
package aula07;

import java.util.Scanner;

public class ParouImpar {

   
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        int num;
        int pares = 0;
        int impares = 0;
        for (int i=0; i<10; i++) {
            System.out.println("Número: ");
            num = scan.nextInt();
            if (num % 2 == 0) {
                pares++;
            }
            else {
                impares++;
            }
        }
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
        
    }
    
}
