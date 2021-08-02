// Par ou Ímpar?
package aula05;

import java.util.Scanner;


public class Ex22aula05 {

    
    public static void main(String[] args) {
        int num;
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira um número: ");
        num = input.nextInt();
        if (num % 2 == 0){
          System.out.println("O número é par");
        
        }
        else {
            System.out.println("O número é impar");
        }
    }
    
}
