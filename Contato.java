//ClasseContatoAula12
package aula12;

/**
 *
 * @author agton
 */
public class Contato {
    private String nome;
    //private String endereco;
    private Endereco endereco;
    //private String telefone;
    private Telefone[] telefones;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

    

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }

   
    
    
    
}
