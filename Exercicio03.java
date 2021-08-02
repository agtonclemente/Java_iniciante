// Programa que apresenta a soma de dois números
package aula01;

import java.util.Scanner;

public class Exercicio03 {

   
    public static void main(String[] args) {
        
        int numero1;
        int numero2;
        int soma;
        
        Scanner leDados = new Scanner(Sytem.in);
        
        System.out.println("Número 1? ");
        numero1 = leDados.nextInt();
        
        System.out.println("Número 2? ");
        numero2 = leDados.nextInt();
        
        soma = numero1 + numero2;
        System.out.println("A soma é: " + soma);
        
        
        
        
    }
    
}
