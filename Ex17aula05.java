// Ano Bissexto
package aula05;

import java.util.Scanner;


public class Ex17aula05 {

    
    public static void main(String[] args) {
        int ano;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira um ano: ");
        ano = input.nextInt();
        
         if (ano %  400  ==  0  || ano %  4  ==  0  && ano %  100 !=  0 ) {
             System.out.println(ano + " É bissexto");
    }
        
         else {
           System.out.println(ano + " Não é bissexto");
        }
        
        
        
    }
    
}
