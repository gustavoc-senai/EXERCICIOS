package Ex_Nível3;

import java.util.Scanner;
import java.util.Random;

public class NumerosMagicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] numerosSorteados = new int[5];
        boolean[] acertou = new boolean[5];
        int acertos = 0;

        System.out.println("Tente adivinhar os 5 números mágicos entre 1 e 50:");

        for (int i = 0; i < 5; i++) {
            numerosSorteados[i] = random.nextInt(50) + 1;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            int tentativa = scanner.nextInt();
            for (int j = 0; j < 5; j++) {
                if (!acertou[j] && tentativa == numerosSorteados[j]) {
                    acertos++;
                    acertou[j] = true;
                    break;
                }
            }
        }

        System.out.println("Você acertou " + acertos + " número(s)!");
        scanner.close();
    }
}