//Converte Temperaturas
package aula04;

import java.util.Scanner;

public class Ex10 {

    
    public static void main(String[] args) {
        
        double c;
        double f;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira temperatura em Celsius: ");
        c = scan.nextDouble();
        f = (c * 1.8) + 32;
        
        System.out.println("f: " + f);
        
        
       
    }
    
}
