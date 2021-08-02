//Aluno_Notas_Disciplinas
package aula10;
//Aluno_Nota_Disciplina
import java.util.Scanner;

/**
 *
 * @author agton
 */
public class Ex02_Aula10 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aluno aluno = new Aluno();
        
        System.out.println("Nome do aluno: ");
        aluno.nome = input.next();
        
        System.out.println("Nome do curso: ");
        aluno.curso = input.next();
        
        System.out.println("Matrícula: ");
        aluno.matricula = input.next();
        
        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            System.out.println("Nome da disciplina: " + i);
            aluno.nomeDisciplinas[i] = input.next();
        }
        
        for (int i=0; i<aluno.notasDisciplinas.length; i++) {
            System.out.println("Inserir nota da disciplina: " + aluno.notasDisciplinas[i]);
            
            for (int j=0; j<aluno.notasDisciplinas.length; j++){
                System.out.println("Insira a nota: " + (j+1));
                aluno.notasDisciplinas[i][j] = input.nextDouble();
            }
            
        }
            
        aluno.mostrarInfo();
        
        
    }
    
}
