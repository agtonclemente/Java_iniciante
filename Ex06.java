//Calculo raio
package aula01;

import java.util.Scanner;

public class Ex06 {

    
    public static void main(String[] args) {
        
        double raio;
        double area;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o raio: ");
        raio = entrada.nextDouble();
        //area = 3.14 * raio * raio;
        area = Math.PI * Math.pow(raio, 2);
        
        //System.out.println("Area = " + area);
        
        System.out.printf("Area = %.2f", area);
             
        
    }
    
}
