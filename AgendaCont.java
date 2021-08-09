//Classe_Contato_Da_Agenda
package Contato;

/**
 *
 * @author agton
 */
public class AgendaCont {
    Contato[] contatos;

    public AgendaCont() {
        this.contatos = new Contato[10];
    }
    
    public AgendaCont(int tamanho) {
        this.contatos = new Contato[tamanho];
    }
    
    public void inserirContato(Contato c) {
        boolean encotrou = false;
        
        for(int i = 0; i < contatos.length && !encontrou; i++) {
            if(contatos[i] == null) {
                contatos[i] = c;
                encotrou = true;
                
            }
        }
        if(encontrou) {
            System.out.println("Contato inserido");
        }else{
            System.out.println("Contato não inserido");
        }
    }
}
