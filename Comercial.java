//Classe_Comercial
package aula14;

/**
 *
 * @author agton
 */
public class Comercial extends Empregado {
    private double comissao;

    public Comercial(double comissao, String nome, int idade, double salario) {
        super(nome, idade, salario);
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return super.toString() + "comissao: " + comissao;
    }
    
    

    @Override
    public boolean plus() {
        if (super.getIdade() > 30 && this.comissao > 200) {
            super.setSalario(super.getSalario() + super.PLUS);
            System.out.println("acrescido salário: " + super.getNome());
            return true;
        }else{
            return false;
        }
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
}
