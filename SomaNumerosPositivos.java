package Ex_Nível2;

import java.util.Scanner;

public class SomaNumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        do {
            System.out.println("Digite um número (negativo para sair):");
            numero = scanner.nextInt();
            if (numero >= 0) {
                soma += numero;
            }
        } while (numero >= 0);

        System.out.println("Soma total dos números positivos: " + soma);
        scanner.close();
    }
}