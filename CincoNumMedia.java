//CincoNUmMedia
package aula06;

import java.util.Scanner;

public class CincoNumMedia {

    
    public static void main(String[] args) {
        double media;
        int i;
        int num;
        double media;
        int soma = 0;
         Scanner scan = new Scanner(System.in);
        for (i = 1; i <= 5; i++){
           Scanner scan = new Scanner(System.in);
           num = scan.nextInt();
           
           soma += num;
           
            }
        media = soma / 5;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
    
}
