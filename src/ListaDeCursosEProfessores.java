import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCursosEProfessores {
    public static void main(String[] args) {
        // crinado ArrayList pra armazenar lista de cursos e professores e cursos concluidos

        ArrayList<String> cursos = new ArrayList<>();
        ArrayList<String> professores = new ArrayList<>();
        ArrayList<String> concluidos = new ArrayList<>();

        // laço de repetição pro usuário informar alguns cursos e professores

        Scanner entrada = new Scanner(System.in);
        int opcao = 0;

        while (true) {
            System.out.println("1 - Adicionar Professor");
            System.out.println("2 - Adicionar Curso");
            System.out.println("3 - Listar");
            System.out.println("4 - Marcar como concluído");
            System.out.println("5 - Listar concluídos");
            System.out.println("6 - Remover");
            System.out.println("0 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = entrada.nextInt();

            if (opcao == 1) {
                adicionarProfessor(professores);
            } else if (opcao == 2) {
                adicionarCurso(cursos);
            }
            else if (opcao == 3){
                listarCursosEProfessores(cursos, professores);
            }
            else if (opcao == 4) {
                marcarComoConcluido(cursos, professores, concluidos);
            }
            else if (opcao == 5) {
                listarConcluidos(concluidos);
            }
            else if (opcao == 6) {
                removerItemLista(cursos, professores);
            }
            else if (opcao == 0) {
                System.out.println("Programa finalizado");
                break;
            } else {
                System.out.println("Opção inválida!");

            }

        }

    }




    // Função pra adicionar um curso na lista

    public static void adicionarCurso( ArrayList<String> cursos) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome do curso: ");
        String curso = entrada.nextLine();
        cursos.add(curso);
        System.out.println("Curso adicionado com sucesso!");

    }

    // Função pra adicinar um professor na lista
    public static void adicionarProfessor( ArrayList<String> professores) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome do professor: ");
        String professor = entrada.nextLine();
        professores.add(professor);
        System.out.println("Professor adicionado com sucesso!");

    }

    // Função pra listar cursos e professores
    public static void listarCursosEProfessores(ArrayList<String> cursos, ArrayList<String> professores) {
        System.out.println("Lista de cursos e professores");
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println((i + 1) + ". " + cursos.get(i) + " - " + professores.get(i));


        }
    }

    // Função pra remover um item da lista de curso e professor usando indice

    public static void removerItemLista(ArrayList<String> cursos, ArrayList<String> professores) {
        int indice = listarPedirIndice(cursos, professores);
        removerItem(cursos, professores, indice);
    }
    // Função pra remover um item da lita de cursos e professores

    public static void removerItem(ArrayList<String> cursos, ArrayList<String> professores, int indice) {
        if (indice >= 1 && indice <= cursos.size()) {  // verifica se o índice é válido
            cursos.remove(indice - 1);  // remove o item existente
            professores.remove(indice - 1);
            System.out.println("Item removido com sucesso!");
        }
        else {
            System.out.println("Item inválido!");
        }

    }

    // Função pra listar os cursos e professores e pedir pro usuário escolher un índice

    public static int listarPedirIndice(ArrayList<String> cursos, ArrayList<String> professores) {
        Scanner entrada = new Scanner(System.in);
        listarCursosEProfessores(cursos, professores);  // usa a função de listagem
        System.out.print("Digite o número do item que deseja remover: ");    // pede pro usuário escolher um item da lista
        int indice = entrada.nextInt();
        return indice;   // retorna o índice escolhido

    }

    // Função pra marcar um curso como concluído e mover pra lista de concluídos

    public static void marcarComoConcluido(ArrayList<String> cursos, ArrayList<String> professores, ArrayList<String> concluidos) {
        int indice = listarPedirIndice(cursos, professores);   // utiliza a função listarPedirIndice e armazena o índice retornado
        if (indice >= 1 && indice <= cursos.size()) {   // verifica se o índice é válido
            concluidos.add(cursos.get(indice - 1));     // adiciona na lista de concluidos o curso escolhido
            removerItem(cursos, professores, indice);   // remove o curso da lista usando a função removerItem
            System.out.println("Curso marcado como concluído com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }

    // Função pra listar os cursos concluídos

    public static void listarConcluidos(ArrayList<String> concluidos) {
        System.out.println("Lista de cursos concluídos:");
        for (int i = 0; i < concluidos.size(); i++) {
            System.out.println((i + 1) + ". " + concluidos.get(i)); // exibe o indice do lado de cada item
        }

    }

}


