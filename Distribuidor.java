//Classe_Distribuidor
package aula14;

/**
 *
 * @author agton
 */
public class Distribuidor extends Empregado {
    private String zona;

    public Distribuidor(String zona, String nome, int idade, double salario) {
        super(nome, idade, salario);
        this.zona = zona;
    }
    
    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return super.toString() + "zona=" + zona;
    }
    
    @Override
    public boolean plus() {
        if (super.getIdade() < 25 && this.zona.equalsIgnoreCase("Zona 3")) {
        double novoSalario = super.getSalario() + super.PLUS;
        super.setSalario(novoSalario);
        System.out.println("Salário acrescido" + super.getNome());
        return true;
    }
        return false;
    }

   
    
    
    
}
