/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

import java.util.Scanner;

/**
 *
 * @author agton
 */
public class Exe_Aval02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double peso;
        double altura;
        double imc;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira peso: ");
        peso = scan.nextDouble();
        System.out.println("Insira altura: ");
        altura = scan.nextDouble();
        imc = peso / (altura * altura);
        System.out.printf("O IMC é: " + imc);
        if (imc > 20.7 && imc < 26.4) {
            System.out.println("Parabens!");
        }
        if (imc > 26.4 && imc < 27.8) {
            System.out.println("Pouco acima do peso.");
        }
        if (imc > 27.8 && imc < 31.1) {
            System.out.println("Acima do peso.");
        }
        if (imc > 31.1) {
            System.out.println("Obeso!");
        }
        
        
        
    }
    
}
