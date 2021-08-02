
package aula04;

import java.util.Scanner;


public class Ex09 {

    
    public static void main(String[] args) {
        
        double fHef, cElsius;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduza a temperatura: ");
        fHef = input.nextDouble();
        
        cElsius = (5 * (fHef - 32) / 9);
        
        System.out.printf("Temperatura em celsius é: %.2f", cElsius);
        
        
        
    }
    
}
