//Ex_Lamapda
package aula09;


public class Lampada {
    private double preco;
    int potencia;
    double tamanho;
    String marca;
    String cor;
    private String modelo;

    Lampada(String bmw, String branco, String aSuper, int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getModelo() {
        return modelo;
    }
    public void  setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getTamanho() {
        return tamanho;
    }
    public void setTamanho() {
        this.tamanho = tamanho;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
}
