//ClasseAluno
package aula10;

/**
 *
 * @author agton
 */
public class Aluno {
    String nome;
    String curso;
    String matricula;
    String[] nomeDisciplinas = new String[3];
    double[][] notasDisciplinas = new double [3][3];

    public Aluno(String nome, String curso, String matricula) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }

    public Aluno() {
    }
    
    
    
    void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome do curso: " + curso);
        for (int i=0; i<notasDisciplinas[i].length; i++) {
            System.out.println("Nome das Disciplinas: " + nomeDisciplinas);
            
            for (int j=0; j<notasDisciplinas[i].length; j++) {
                System.out.println(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
