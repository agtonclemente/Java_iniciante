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
        if (existeContato(c)) {
            System.out.println("Já existe esse nome na agenda");
        }else if (agendaCheia()) {
            System.out.println("Agenda cheia, não se pode inserir");
        }else{
        boolean encontrou = false;
        
        for(int i = 0; i < contatos.length && !encontrou; i++) {
            if(contatos[i] == null) {
                contatos[i] = c;
                encontrou = true;
                
            }
        }
        if(encontrou) {
            System.out.println("Contato inserido");
        }else{
            System.out.println("Contato não inserido");
        }       
    }
    }
    public boolean existeContato (Contato c) {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null && c.iguais(contatos[i])) {
                contatos[i] = c;
                return true;
            }
        }
        
        return false;
    }
    
    public void listaContatos() {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                System.out.println(contatos[i]);
            }
        }
    }
    
    public void buscarPorNome (String nome) {
        boolean encontrou = false;
        for (int i = 0; i < contatos.length && !encontrou; i++) {
            if (contatos[i] != null && contatos[i].getNome().equalsIgnoreCase(nome)) {
                System.out.println("Telefone " + contatos[i].getTelefone());
                encontrou = true;
            }
        }
        
        if (!encontrou) {
            System.out.println("não se encontrou o contato.");
        }
    }
    
    public boolean agendaCheia () {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos == null) {
                return false;
            }
        }
        
        return true;
    }
    
    public void eliminarContato (Contato c) {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null && contatos[i].iguais(c)) {
                contatos[i] = null;
                boolean encontrou = true;
            }
        }
        boolean encontrou = false;
        
        if (encontrou) {
            System.out.println("Contato eliminado");
        }else{
            System.out.println("Contato não eliminado");
        }
    }
    
    public int espacoLivre() {
        int contadorLivre = 0;
        for (int i = 0; i < contatos.length; i++) {
            if (contatos == null) {
                contadorLivre++;
            }
        }
        return contadorLivre;
    }
}
