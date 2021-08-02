
package aula01;

import java.util.Scanner;

public class Exercicio4 {

   
    public static void main(String[] args) {
        
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;
        
        Scanner entrada = new Scanner(System.in);
        //boolean nota1 = false;
        
        System.out.println("nota1");
        nota1 = entrada.nextDouble();
        
        System.out.println("nota2");
        nota2 = entrada.nextDouble();
        
        System.out.println("nota3");
        nota3 = entrada.nextDouble();
        
        System.out.println("nota4");
        nota4 = entrada.nextDouble();
        
        media = (nota1+nota2+nota3+nota4) / 4;
        
        System.out.println(media);
        
    }
    
}
