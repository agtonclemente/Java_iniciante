
package aula05;

import java.util.Scanner;


public class Ex11aula05 {

    
    public static void main(String[] args) {
       int dia;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira o dia da semana [1...7]");
        dia = input.nextInt();
        
        switch (dia) {
            case 1: System.out.println("Hoje é Domingo.");
            break;
            case 2: System.out.println("Hoje é Segunda-Feira.");
            break;
            case 3: System.out.println("Hoje é Terça-feira.");
            break;
            case 4: System.out.println("Hoje é Quarta-Feira.");
            break;
            case 5: System.out.println("Hoje é Quinta-feira.");
            break;
            case 6: System.out.println("Hoje é Sexta-Feira.");
            break;
            case 7: System.out.println("Hoje é Sábado.");
            break;
            default: System.out.println("Não é um dia da semana válido.");
        }
    }
    
}
