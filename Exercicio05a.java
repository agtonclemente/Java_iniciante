// Conversão metros para centímetros
package aula01;

import java.util.Scanner;


public class Exercicio05a {

    
    public static void main(String[] args) {
        
        double metro;
        double cm;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("");
        metro = scan.nextDouble();
        
        cm = 100 * metro;
        
        System.out.println(cm);
        System.out.println();
        
        System.out.println("Metrso " + metro + "corresponde a " + cm);
        
    }
    
}
