//Classe_veiculos
package aula15;

/**
 *
 * @author agton
 */
public class Veiculos {
    private String marca;
    private String modelo;
    private double preco;

    public Veiculos(String marca, String modelo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /*@Override
    public String toString() {
        return "Veiculos{" + "marca=" + marca + ", modelo=" + modelo + ", preco=" + preco + '}';
    }*/
    
    public String mostrardados() {
        return "\nMarca: " + marca + "\nModelo: " + modelo + "\nPreço: " + preco;  
    }
    
}
