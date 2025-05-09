package Ex_Nível4;

import java.util.Scanner;

public class CalculadoraDeMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaNotas = 0.0;
        int quantidadeNotas;

        System.out.print("Quantas notas deseja inserir? ");
        quantidadeNotas = scanner.nextInt();

        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            somaNotas += scanner.nextDouble();
        }

        double media = somaNotas / quantidadeNotas;
        System.out.printf("A média do aluno é: %.2f%n", media);

        if (media >= 7) {
            System.out.println("Status: Aprovado!");
        } else if (media >= 4) {
            System.out.println("Status: Recuperação!");
        } else {
            System.out.println("Status: Reprovado!");
        }

        scanner.close();
    }
}

