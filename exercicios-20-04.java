import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 6.0) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }

        scanner.close();
    }
}
===============================================================================

import java.util.Scanner;

public class MaioreMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número (a): ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número (b): ");
        int b = scanner.nextInt();

        System.out.print("Digite o terceiro número (c): ");
        int c = scanner.nextInt();

        int maior = a;

        if (b > maior) {
            maior = b;
        }

        if (c > maior) {
            maior = c;
        }

        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}
================================================================================

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}

===================================================================================

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        break;
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int opcao = scanner.nextInt();

        double resultado = calcular(num1, num2, opcao);
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }

    public static double calcular(double a, double b, int operacao) {
        switch (operacao) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                    return 0;
                }
            default:
                System.out.println("Operação inválida.");
                return 0;
        }
    }
}
