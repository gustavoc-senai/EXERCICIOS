package Ex_Nível1;

import java.util.Scanner;
import java.util.Random;

public class JogoParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Escolha: par ou impar");
        String escolha = scanner.next().toLowerCase();

        System.out.println("Digite um número:");
        int usuarioNum = scanner.nextInt();

        int sistemaNum = random.nextInt(10) + 1;
        int soma = usuarioNum + sistemaNum;

        System.out.println("Número do sistema: " + sistemaNum);

        if ((soma % 2 == 0 && escolha.equals("par")) || (soma % 2 != 0 && escolha.equals("impar"))) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("O sistema venceu!");
        }

        scanner.close();
    }
}
