//ExeAvaliacao_Heranca
package exeavaliacaoheranca;

/**
 *
 * @author agton
 */
public class ExeAvaliacaoHeranca {
    public static void main(String[] args) {
        Animais camelo = new Animais();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        //camelo.setPatas(4);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2);
        
        Peixe tubarao = new Peixe();
        //tubarao.getAmbiente("Mar");
        //tubarao.setCaracteristicas(caracteristicas);
        tubarao.setNome("Tubarão");
        tubarao.setVelocidade(1.5);
        tubarao.setComprimento(300);
        
        Mamifero urso = new Mamifero();
        //urso.setAlimento(alimento);
        urso.setNome("Urso-do-Canadá");
        urso.setComprimento(180);
        urso.setCor("Cinzento");
        urso.setVelocidade(0.5);
        
        Animais animais = new Animais();
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;
        
        for (Animais animal : animais) {
        System.out.println("---------------");
        System.out.println(animal); 
            System.out.println("----------------");
        }
        
        
        
       
    }
    
}
