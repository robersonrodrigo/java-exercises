import java.util.Scanner;

public class SistemaDeUsuarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Cadastro de Usuários ===");

        // Cadastro do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // limp

        System.out.print("Digite o tipo de usuário (1 - Administrador, 2 - Usuário Comum, 3 - Visitante): ");
        int tipoUsuario = scanner.nextInt();

        // Classificação por idade
        String classificacaoIdade;
        if (idade < 13) {
            classificacaoIdade = "Criança";
        } else if (idade < 18) {
            classificacaoIdade = "Adolescente";
        } else {
            classificacaoIdade = "Adulto";
        }

        // Classificação por tipo de usuário
        String tipo;
        switch (tipoUsuario) {
            case 1:
                tipo = "Administrador";
                break;
            case 2:
                tipo = "Usuário Comum";
                break;
            case 3:
                tipo = "Visitante";
                break;
            default:
                tipo = "Desconhecido";
        }

        // Validação final
        if (!tipo.equals("Desconhecido")) {
            System.out.println("\nUsuário cadastrado com sucesso!");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade + " (" + classificacaoIdade + ")");
            System.out.println("Tipo de Usuário: " + tipo);
        } else {
            System.out.println("\nTipo de usuário inválido! Cadastro não realizado.");
        }

        scanner.close();
    }
}
