//Aula09_Class
package aula09;


public class Teste_Carro_Aula09 {

    
    public static void main(String[] args) {
        Carro carrinha = new Carro();
        
        carrinha.marca = "Bulgary";
        carrinha.modelo = "1616";
        //carrinha.numPassageiro = 6;
        carrinha.conCombustivel = 1000;
        carrinha.capCombustivel = 1000;
        
        System.out.println(carrinha.marca);
        System.out.println(carrinha.numPassageiro);
        System.out.println(carrinha.modelo);
        
        Carro car = new Carro();
        
        car.marca = "Ferrary";
        car.capCombustivel = 2000;
        car.numPassageiro = 2;
        car.modelo = "Flutuante";
        car.conCombustivel = 10.000;
        
        System.out.println(car.marca);
        System.out.println(car.modelo);
        System.out.println(car.numPassageiro);
        
        car.mostrarAutonomia();
        System.out.println();
        
        double autonomia = car.ObterAutonomia();
        System.out.println("Autonomia: " + autonomia);
        System.out.println();
        System.out.println("Autonomia: " + car.obterAutonomia());
        
        
        
        
        
    }
    
}
