
package aula02;

import java.util.Scanner;

public class Exe04 {
    
    public static void main(String[] args) {        
        
        double nota1;
        double nota2;
        double nota3;
        double nota4;
      //  double media;
      
      
        
        Scanner entrada = new Scanner(System.in);
     
        System.out.println(" nota1 ? ");
        nota1 = entrada.nextDouble();

        System.out.println(" nota2 ? ");
        nota2 = entrada.nextDouble();

        System.out.println(" nota3 ? ");
        nota3 = entrada.nextDouble();

        System.out.println(" nota4 ? ");
        nota4 = entrada.nextDouble();

       double soma=  (nota1 + nota2 + nota3 + nota4);
       
       double media = soma/4;
        
       // System.out.println(media);
        
        System.out.println("a media é : " +media);
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
