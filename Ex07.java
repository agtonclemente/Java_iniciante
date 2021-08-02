// Calcula área do quadrado
package aula04;

import java.util.Scanner;


public class Ex07 {

   
    public static void main(String[] args) {
        double area;
        double lado;
        double dobroarea;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Lado: ");
        lado = entrada.nextDouble();
        
        area = Math.pow(lado, 2);
        
        dobroarea = 2 * area;
        
        System.out.println("Area: " + area);
        System.out.println("O dobro da área é: " + dobroarea);
        
        System.out.println("");        
    }
    
}
