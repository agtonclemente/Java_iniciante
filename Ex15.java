// Maior de 2 números
package aula04;

import java.util.Scanner;


public class Ex15 {

    
    public static void main(String[] args) {
        
        // declarar variáveis
        int num1;
        int num2;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Primeiro número: ");
        num1 = entrada.nextInt();
        
        System.out.println("Segundo número: ");
        num2 = entrada.nextInt();
        
        /*se num1 > num2 imprimir maior num1
        senao imprimir maior num2
*/
        if (num1 > num2){
            System.out.println("O maior número é o número 1: " + num1);
        }        
        else{
            System.out.println("O maior número é o número 2: " + num2);
        }
        // declarar classe Scanner
        
        // pedir dados de entrada
        
    }
    
}
