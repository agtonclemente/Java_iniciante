//BaseExpoente
package aula07;

import java.util.Scanner;


public class Ex09 {

   
    public static void main(String[] args) {
        int num;
        int exp;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Base: ");
        num = scan.nextInt();
        System.out.println("Expoente: ");
        exp = scan.nextInt();
        int resultado = num;
        for (int i=1; i<exp; i++){
            resultado *= num;
        }
        System.out.println("Resultado: " + resultado);
        
        
    }
    
}
