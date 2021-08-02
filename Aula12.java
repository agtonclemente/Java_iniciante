//Aula_12
package aula12;

/**
 *
 * @author agton
 */
public class Aula12 {

    
    public static void main(String[] args) {
        
        Contato contato = new Contato();
        
        contato.setNome("Agton");
        
        System.out.println(contato.getNome());
        System.out.println(contato.getEndereco());
        
        Endereco endereco = new Endereco();
        
        endereco.setRua("Da Vinha");
        endereco.setNumero("XX");
        endereco.setCodPostal("XXXXX");
        endereco.setCidade("Lisboa");
        
        contato.setEndereco(endereco);
        
        Telefone telefone = new Telefone();
        
        telefone.setNumero("XXXX");
        telefone.setTipo("Móvel");
        
        Telefone telefone2 = new Telefone();
        telefone2.setNumero("XXXX");
        telefone2.setTipo("Móvel");
        
        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone;
        
        contato.setTelefones(telefones);     
        
        if (contato != null && contato.getEndereco() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println(t.getNumero());
                //System.out.println(t.getTipo());
            }
            
            //System.out.println(contato.getEndereco().getCidade());
        }
        //Telefone[] telefones = new Telefone[]; 
        
        //System.out.println(endereco.getNumero());
        //System.out.println(endereco.getCodPostal());
        //System.out.println(endereco.getCidade());
        
    }
    
}
