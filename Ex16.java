
package aula04;

import java.util.Scanner;


public class Ex16 {

    
    public static void main(String[] args) {
        int num;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira um número: ");
        num = scan.nextInt();
        
        /* se num >= 0
        imprimir msg (o número é positivo)
        senao (o número é negativo)
        */
        
        if(num > 0) {
            System.out.println("O número é positivo: " + num);
        }
        else {
            System.out.println("O número é negativo: " + num);
        }
        
    }
    
}
