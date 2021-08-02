//Classe_Mamifero
package exeavaliacaoheranca;

/**
 *
 * @author agton
 */
public class Mamifero extends Animais {
    private String alimento;

    public Mamifero(String alimento) {
        super();
        this.setAmbienta("Terra");
        //this.alimento = "Mel";
        this.setCor("Castanha");
        this.alimento = "Mel";
    }

    Mamifero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "\nAlimento: " + alimento;
        
        return s;
        
        //return "Mamifero{" + "alimento=" + alimento + '}';
    }

    private void setAmbienta(String terra) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
