
package aula04;

import java.util.Scanner;


public class Ex08 {

    
    public static void main(String[] args) {
        
        double valorHora;
        double numhoraTrabalhada;
        double salario;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Inserir valor/hora: ");
        valorHora = scan.nextDouble();
        
        System.out.println("Inserir número de horas: ");
        numhoraTrabalhada = scan.nextDouble();
        
        salario = valorHora *  numhoraTrabalhada;
        
        System.out.println("Salário: " + salario);
        
        
    }
    
}
