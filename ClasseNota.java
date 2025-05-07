import java.util.Scanner;

public class ClasseNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 70) {
            System.out.println(nome + " foi Aprovado com média " + media);
        } else {
            System.out.println(nome + " foi Reprovado com média " + media);
        }

        scanner.close();
    }
}
