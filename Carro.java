
package aula09;


public class Carro {
    String marca;
    String modelo;
    int numPassageiro;
    double capCombustivel;
    double conCombustivel;
    
    public Carro() {
        numPassageiro = 4;
    }
    Carro(String marca_)
    
    // declaração do método para mostrar a autonomia do carro
    
    void mostrarAutonomia() {
        System.out.println("Autonomia do carro: " + capCombustivel * conCombustivel + "Km");
    }
    double ObterAutonomia() {
        return capCombustivel * conCombustivel;
        
    }
    
    
    
    
    
}
