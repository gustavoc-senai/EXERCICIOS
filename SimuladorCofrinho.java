package Ex_Nível3;

import java.util.Scanner;

public class SimuladorCofrinho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int quantidade = 0;
        String continuar;

        do {
            System.out.println("Digite o valor da moeda a adicionar:");
            double valor = scanner.nextDouble();
            total += valor;
            quantidade++;

            System.out.println("Deseja adicionar outra moeda? (s/n):");
            continuar = scanner.next();
        } while (continuar.equals("s") || continuar.equals("S"));

        System.out.println("Quantidade de moedas: " + quantidade);
        System.out.println("Total no cofrinho: R$ " + total);

        scanner.close();
    }
}