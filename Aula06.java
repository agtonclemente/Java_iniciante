//Calculadora
package aula06;

import java.util.Scanner;


public class Aula06 {

    
    public static void main(String[] args) {
        int num1;
        int num2;
        String operacao;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num1 = (int) input.nextDouble();
        System.out.println("Insira um número: ");
        int num2 = (int) input.nextDouble();
        System.out.println("");
        String operacao = input.next();
        double resultado = 0;
        switch (operacao){
            case "+": resultado = num1 + num2; break;
            case "-": resultado = num1 - num2; break;
            case "*": resultado = num1 * num2; break;
            case "/": resultado = num1 / num2; break;
            default: System.out.println("Operação inválida");
        }
       
    }
    
}
