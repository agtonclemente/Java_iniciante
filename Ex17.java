//Média nota aluno aprovado/reprovado
package aula04;

import java.util.Scanner;


public class Ex17 {

   
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double media;
        double soma;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Primeira nota: ");
        nota1 = scan.nextDouble();
        
        System.out.println("Segunda nota: ");
        nota2 = scan.nextDouble();
        
        soma = nota1 + nota2;
        
        media = soma / 2;
        
        /* se media >= 18
        imprimir (Aprovado com distinção)
        senao
             se media >= 10
                        imprimir (Aprovado)
        
        senao imprimir (Reprovado)
        */
        */
        
    }
    
}
