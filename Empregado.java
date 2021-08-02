//Super_Classe_Empregado
package aula14;

/**
 *
 * @author agton
 */
public abstract class Empregado {
    private String nome;
    private int idade;
    private double salario;
    public final double PLUS = 300;

    public Empregado(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "nome: " + nome + ", idade: " + idade + ", salario: " + salario + ", ";
    }
    
    
    
    public abstract boolean plus();
    
}
