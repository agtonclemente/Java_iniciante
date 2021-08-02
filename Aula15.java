//Aula_15_exe01
package aula15;

import java.util.Scanner;

public class Aula15 {

    public static int indiceCarroBarato(Veiculos car[]) {
        int indice = 0;
        double preco;
        preco = car[0].getPreco();
        for (int i = 1; i < car.length; i++) {
            if (car[i].getPreco() < preco) {
                preco = car[i].getPreco();
                indice = i;
            }

        }
        return indice;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String marca;
        String modelo;
        double preco;
        int numVeiculos;
        int indiceBarato;
        
        System.out.println("Número de veículos: ");
        numVeiculos = scan.nextInt();
        
        Veiculos car[] = new Veiculos[numVeiculos];
        
        scan.nextLine();
        
        for(int i=0; i<car.length; i++) {
        System.out.println("Características do carro: " + (i+1));
        
        System.out.println("marca: ");
        marca = scan.nextLine();
        
        System.out.println("Modelo: ");
        modelo = scan.nextLine();
        
        System.out.println("Preço: ");
        preco = scan.nextDouble();
        
        car[i] = new Veiculos(marca, modelo, preco);
        
        }
        
        indiceBarato =  indiceCarroBarato(car);
        
        System.out.println("O carro mais barato é: ");
        System.out.println(car[indiceBarato].mostrardados());
      
    }
    
}
