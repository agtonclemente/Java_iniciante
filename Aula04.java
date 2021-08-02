//Vogal ou Consoante
package aula04;

import java.awt.BorderLayout;
import java.util.Scanner;

public class Aula04 {

   
    public static void main(String[] args) {
        String letra;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira a letra:");
        letra = input.next();
        
        if (letra.equalsIgnoreCase("a" || letra.equalsIgnoreCase("e" || letra.equalsIgnoreCase("i" || letra.equalsIgnoreCase("o" || letra.equalsIgnoreCase("u")))))){
            System.out.println("Vogal");
        }
        else {
            System.out.println("Consoante");
        }
    }
    
}
