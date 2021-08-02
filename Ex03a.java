//Genero
package aula05;

import java.util.Scanner;


public class Ex03a {

   
    public static void main(String[] args) {
        String letra;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira uma letra [F/M]");
        letra = input.next();
        
        
        if (letra.equalsIgnoreCase("f")) {
            System.out.println("Feminino");
        }
        else if (letra.equalsIgnoreCase("m")) {
            System.out.println("Masculino");
        }
        else {
            System.out.println("Genero indisponível");
        }
    }
    
}
