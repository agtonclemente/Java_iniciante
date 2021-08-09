//Classe_Contato
package Contato;

/**
 *
 * @author agton
 */
public class Contato {
    private String nome;
    private int telefone;

    public Contato() {
    }

    public Contato(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public boolean iguais(Contato c) {
        if (this.nome.equalsIgnoreCase(c.getNome())) {
        return true;
    }
        return false;
    }

    @Override
    public String toString() {
        return "Contato{" +"nome=" + nome + ", telefone=" + telefone + '}';
    }
    
    
    
}
