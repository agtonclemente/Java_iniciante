//NumeroPrimo
package aula07;

import java.util.Scanner;


public class ExNumPrimo {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Número: ");
        int num = scan.nextInt();
        
        boolean primo = true;
        for (int i=2; i<num; i++) {
            if (num % i == 0) {
                System.out.println("Não é primo - divisível por " + i);
                primo = false;
                
            }
        }
        if (primo) { 
            System.out.println("Número Primo");
        }
    }
    
}
