//Classe_NaoPeresivel
package Exe02Heranca;

/**
 *
 * @author agton
 */
public class NaoPeresivel extends Produto {
    private String tipo;

    public NaoPeresivel(String tipo, String nome, double preco) {
        super(nome, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "tipo=" + tipo;
    }
    
    
    
}
