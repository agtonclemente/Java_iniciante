//Teste
package Contato;

import java.util.Scanner;

/**
 *
 * @author agton
 */
public class Teste {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        boolean sair = false;
        
        AgendaCont agenda = new AgendaCont(3);
        String nome;
        int telefone;
        Contato c;
        
        while (!sair) {
            System.out.println("1 - Inserir contato: ");
            System.out.println("2 - Listar contato: ");
            System.out.println("3 - Procurar contato: ");
            System.out.println("4 - Existe contato: ");
            System.out.println("5 - Eliminar contato: ");
            System.out.println("6 - Espaço disponível: ");
            System.out.println("7 - Sair: ");  
            
            try {
                System.out.println("Escolha uma das opções: ");
                opcao = scan.nextInt();
                
                switch (opcao) {
                    case 1:
                        System.out.println("Nome: ");
                        nome = scan.next();
                        System.out.println("Telefone: ");
                        telefone = scan.nextInt();
                        c = new Contato(nome, telefone);
                        agenda.inserirContato(c);
                    break;
                    case 2:
                        agenda.listaContatos();
                    break;
                    case 3:
                        System.out.println("Nome: ");
                        nome = scan.next();
                        agenda.buscarPorNome(nome);
                    break;
                    case 4:
                        System.out.println("Nome: ");
                        nome = scan.next();
                        c = new Contato(nome, 0);
                        if (agenda.existeContato(c)) {
                            System.out.println("O contato não existe.");
                        }else{
                            System.out.println("O contato existe.");
                        }
                    break;
                    case 5:
                        System.out.println("Nome: ");
                        nome = scan.next();
                        c = new Contato(nome);
                        agenda.eliminarContato(c);
                    break;
                    case 6:
                        System.out.println("Existem " +agenda.espacoLivre() + "espaços livres: ");
                    break;
                    case 7:
                        if (agenda.agendaCheia()) {
                            System.out.println("A agenda está cheia.");
                        }else{
                            System.out.println("Ainda pode inserir contatos.");
                        }
                        //agenda.agendaCheia();
                    break;
                    case 8:
                        sair = true;
                    break;    
                    default:System.out.println("Insira números entre 1 e 7 ");
                }
            }
                catch (Exception e) {
                        System.out.println("Insira um número: ");
                        scan.next();
                        }
            }
        }
        
        
        
        
        
        
    }
    

