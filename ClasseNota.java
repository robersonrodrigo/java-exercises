import java.util.Scanner;

public class ClasseNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir nome
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        // Pedir primeira nota
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        // Pedir segunda nota
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        // Calcular média
        double media = (nota1 + nota2) / 2;

        // Verificar resultado
        if (media >= 70) {
            System.out.println(nome + " foi Aprovado com média " + media);
        } else {
            System.out.println(nome + " foi Reprovado com média " + media);
        }

        scanner.close();
    }
}
