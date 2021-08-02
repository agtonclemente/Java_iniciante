//SuperClasse_animais_Avaliacao
package exeavaliacaoheranca;

/**
 *
 * @author agton
 */
public class Animais {
    private String nome;
    private double comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private double velocidade;

   /* public Animais(String nome, double comprimento, String cor, String ambiente, double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }*/

    public Animais() {
        this.patas = 4;
    }
    
    

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    @Override
    public String toString() {
        String s = "\nAnimal: " + nome;
        s += "\nComprimento: " + comprimento + "cm";
        s += "\nPatas: " + patas;
        s += "\nCor: " + cor;
        s += "\nAmbiente: " + ambiente;
        s += "\nVelocidade: " + velocidade + "M/S";
        
        return s;
        
        
        
        
        //return "Animais{" + "nome=" + nome + ", comprimento=" + comprimento + ", patas=" + patas + ", cor=" + cor + ", ambiente=" + ambiente + ", velocidade=" + velocidade + '}';
    }
    
    
    
}
