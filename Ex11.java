
package aula04;

import java.util.Scanner;


public class Ex11 {

    
    public static void main(String[] args) {
        int num1;
        int num2;
        double num3;
        double produto;
        double soma;
        double cubo;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Número 1: ");
        num1 = scan.nextInt();
        
        System.out.println("Número 2: ");
        num2 = scan.nextInt();
        
        System.out.println("Número 3: ");
        num3 = scan.nextDouble();
        
        produto = (num1 * 2) * (num2 / 2);
        
        soma = (num1 * 3) + (num3);
        
        cubo = Math.pow(num3, 3);
        
        System.out.println("O produto é: " + produto);
        System.out.println("A soma é: " + soma);
        System.out.println("O cubo é: " + cubo);
        
    }
    
}
