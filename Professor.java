
package exeentregar;

/**
 *
 * @author agton
 */
public class Professor extends Pessoa {
    private double salario;
    private boolean fixo;
    private int IRS;
    private int ant;
    private double bonus;
    private int sal;

    public Professor() {
    }

    public Professor(double salario, boolean fixo, int IRS, int ant, double bonus, int sal) {
        this.salario = salario;
        this.fixo = fixo;
        this.IRS = IRS;
        this.ant = ant;
        this.bonus = bonus;
        this.sal = sal;
    }

    public Professor(double salario, boolean fixo, int IRS, int ant, double bonus, int sal, String nome, int NIF) {
        super(nome, NIF);
        this.salario = salario;
        this.fixo = fixo;
        this.IRS = IRS;
        this.ant = ant;
        this.bonus = bonus;
        this.sal = sal;
    }
    
    public int getIRS() {
        return IRS;
    }

    public void setIRS(int IRS) {
        this.IRS = IRS;
    }

    public int getAnt() {
        return ant;
    }

    public void setAnt(int ant) {
        this.ant = ant;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isFixo() {
        return fixo;
    }

    public void setFixo(boolean fixo) {
        this.fixo = fixo;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
    
    public void calcularSal(int IRS, int ant) {
        if (ant != 0) {
            int sal = 0;
            this.sal = sal - (sal * IRS / 100 + (ant * 50));
        }
    }
    
}
