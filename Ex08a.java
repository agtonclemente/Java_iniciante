//Produto mais barato
package aula05;

import java.util.Scanner;

public class Ex08a {


    public static void main(String[] args) {
        
        double p1, p2, p3, maisBarato;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o preço do produto: ");
        p1 = input.nextDouble();
        
        System.out.println("Digite o preço do produto: ");
        p2 = input.nextDouble();
        
        System.out.println("Digite o preço do produto: ");
        p3 = input.nextDouble();
        
        if (p1 <= p2 && p1 <= p3) {
            maisBarato = p1;
        }
        else if(p2 < p3) {
            maisBarato = p2;
        }
        else {
            maisBarato = p3;
        }
        System.out.printf("O mais barato é: %.2f\n", maisBarato);
    }
    
}
