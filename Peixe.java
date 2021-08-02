//Classe_Peixe
package exeavaliacaoheranca;

/**
 *
 * @author agton
 */
public class Peixe extends Animais {
    private String caracteristicas;

    public Peixe() {
        super();
        this.caracteristicas = "Barbatanas e cauda";
        this.setPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzento");
        
        
    }
    
    
    
    /*public Peixe(String nome, double comprimento, String cor, String ambiente, double velocidade) {
        super(nome, comprimento, cor, ambiente, velocidade);
    }*/

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "Características: " + caracteristicas;
        
        return s;
    }
    
    
    
    
}
