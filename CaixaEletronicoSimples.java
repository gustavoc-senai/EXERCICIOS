package Ex_Nível4;

import java.util.Scanner;

public class CaixaEletronicoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;
        int opcao;

        do {
            System.out.println("\n1. Ver saldo\n2. Depositar\n3. Sacar\n4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo: R$ %.2f%n", saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor para depósito: R$ ");
                    saldo += scanner.nextDouble();
                    break;
                case 3:
                    System.out.print("Digite o valor para saque: R$ ");
                    double saque = scanner.nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
