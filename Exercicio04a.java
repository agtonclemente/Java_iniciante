// Calculo de média de 4 números
package aula01;

import java.util.Scanner;

public class Exercicio04a {

    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;
        
        System.out.println("Nota 1: ");
        nota1 = scan.nextDouble();
        
        System.out.println("Nota 2: ");
        nota2 = scan.nextDouble();
        
        System.out.println("Nota 3: ");
        nota3 = scan.nextDouble();
        
        System.out.println("Nota 4: ");
        nota4 = scan.nextDouble();
        
        double soma = nota1+nota2+nota3+nota4;
        media = soma / 4;
        
        System.out.println("A média é: " + media);
        
        
        
        
    }
    
}
