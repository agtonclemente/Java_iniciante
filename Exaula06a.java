//Nota Válida
package aula06;

import java.util.Scanner;

public class Exaula06a {

   
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        boolean notaValida = false;
        do {
            System.out.println("Nota: ");
            double nota =input.nextDouble();
            if (nota >= 0 && nota <= 10){
                notaValida = true;
                System.out.println("Nota inserida: " + nota);
            } else {
                System.out.println("Nota inválida, digite novamente");
            }
        } while (!notaValida);
        
    }
    
}
