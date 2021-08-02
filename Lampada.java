//Lamapada Ligar Desligar
package aula10;
class Lampada {
    double preco;
    int potencia;
    double tamanho;
    String marca;
    String cor;
    String modelo;

    boolean ligar;

    void ligar() {
        boolean ligada = true;
    }

    void desligar() {
        boolean ligada = false;
    }

    void mostrarEstado();
    if (ligada) {
                System.out.println("A lampada está ligada.");
    }

    
        else {
                System.out.println("A lampada está desligada.");
    }
        void mudarEstado();
        if (ligada) {
           desligar();
}
        else {
           ligar();
}
}
