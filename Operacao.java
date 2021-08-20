//OperacaoClasse
package interfaces;

/**
 *
 * @author agton
 */
public class Operacao implements Inter1, Inter2{

    @Override
    public void multiplicar() {
        System.out.println("Multiplicar");
    }

    @Override
    public void dividir() {
        System.out.println("Dividir");
    }

    @Override
    public void somar() {
        System.out.println("Somar");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void subtrair() {
        System.out.println("Subtrair");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
