//Classe_Peresivel
package Exe02Heranca;

/**
 *
 * @author agton
 */
public class Peresivel extends Produto {
    private int diasCaducar;

    public Peresivel(int diasCaducar, String nome, double preco) {
        super(nome, preco);
        this.diasCaducar = diasCaducar;
    }

    public int getDiasCaducar() {
        return diasCaducar;
    }

    public void setDiasCaducar(int diasCaducar) {
        this.diasCaducar = diasCaducar;
    }

    @Override
    public String toString() {
        return super.getNome() + "diasCaducar=" + diasCaducar;
    }

    @Override
    public double clacular(int quantidade) {
        double precoFinal = super.clacular(quantidade);
        switch (diasCaducar) {
            case 1 : precoFinal /= 4;
            break;
            case 2 : precoFinal /= 3;
            break;
            case 3 : precoFinal /= 2;
            break;
            
        }
        return precoFinal;
        //return super.clacular(quantidade); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
}
