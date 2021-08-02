//Escolher letra para dar saudação
package aula05;

import java.util.Scanner;


public class Ex10aula5 {

   
    public static void main(String[] args) {
        String turno;
        Scanner input = new Scanner(System.in);
        System.out.println("");
        turno = input.next();
        switch (turno) {
            case "m":
            case "M": System.out.println("Bom dia!");
            break;
            case "t":
            case "T": System.out.println("Boa tarde!");
            break;
            case "n":
            case"N": System.out.println("Boa noite!");
            break;
            default: System.out.println("Valor inválido!");
                
        }
        
        
             
    }
    
}
