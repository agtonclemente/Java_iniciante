//Classe_Contato_Da_Agenda
package Contato;

import javax.swing.JOptionPane;

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
    
    public Contato[] getContatos() {
        return contatos;
    }
    
    public void inserirContato(Contato c) {
        if (existeContato(c)) {
            JOptionPane.showMessageDialog(null, "Já existe esse nome na agenda");
        }else if (agendaCheia()) {
            JOptionPane.showMessageDialog(null, "Agenda cheia, não se pode inserir");
        }else{
        boolean encontrou = false;
        
        for(int i = 0; i < contatos.length && !encontrou; i++) {
            if(contatos[i] == null) {
                contatos[i] = c;
                encontrou = true;
                
            }
        }
        if(encontrou) {
            JOptionPane.showMessageDialog(null, "Contato inserido");
        }else{
            JOptionPane.showMessageDialog(null, "Contato não inserido");
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
                JOptionPane.showMessageDialog(null, contatos[i]);
            }
        }
    }
    
    public void buscarPorNome (String nome) {
        boolean encontrou = false;
        for (int i = 0; i < contatos.length && !encontrou; i++) {
            if (contatos[i] != null && contatos[i].getNome().equalsIgnoreCase(nome)) {
                JOptionPane.showMessageDialog(null, "Telefone " + contatos[i].getTelefone());
                encontrou = true;
            }
        }
        
        if (!encontrou) {
            JOptionPane.showMessageDialog(null, "não se encontrou o contato.");
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
            JOptionPane.showMessageDialog(null, "Contato eliminado");
        }else{
            JOptionPane.showMessageDialog(null, "Contato não eliminado");
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
