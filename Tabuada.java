//Tabuad
package aula07;

import java.util.Scanner;


public class Tabuada {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número para a tabuada: ");
        int num = scan.nextInt();
        System.out.println("Tabuada de " + num + ":");
        for (int i=1; i<=10; i++) {
            System.out.println(num +" x " + i + "=" + (num*i));
        }
    }
    
}
