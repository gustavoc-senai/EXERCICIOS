package Ex_Nível4;

import java.util.Scanner;

public class CorridaMaluca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Perguntar os nomes dos corredores
        System.out.print("Digite o nome do primeiro corredor: ");
        String corredor1 = scanner.nextLine();
        System.out.print("Digite o nome do segundo corredor: ");
        String corredor2 = scanner.nextLine();
        System.out.print("Digite o nome do terceiro corredor: ");
        String corredor3 = scanner.nextLine();

        int volta = 5; // Número de voltas
        int[] posicoes = new int[3]; // Para armazenar a posição de cada corredor

        // Simulação da corrida
        for (int i = 1; i <= volta; i++) {
            System.out.println("\nVolta " + i + ":");
            posicoes[0] = (int)(Math.random() * 100); // Posição aleatória do corredor 1
            posicoes[1] = (int)(Math.random() * 100); // Posição aleatória do corredor 2
            posicoes[2] = (int)(Math.random() * 100); // Posição aleatória do corredor 3

            // Mostrar a posição de cada corredor na volta
            System.out.printf("%s está na posição: %d%n", corredor1, posicoes[0]);
            System.out.printf("%s está na posição: %d%n", corredor2, posicoes[1]);
            System.out.printf("%s está na posição: %d%n", corredor3, posicoes[2]);
        }

        // Determinar o campeão com base na última volta
        int melhorPosicao = Math.max(Math.max(posicoes[0], posicoes[1]), posicoes[2]);
        String vencedor = "";
        
        if (melhorPosicao == posicoes[0]) {
            vencedor = corredor1;
        } else if (melhorPosicao == posicoes[1]) {
            vencedor = corredor2;
        } else {
            vencedor = corredor3;
        }

        System.out.println("\nO campeão da corrida é: " + vencedor + " com a posição " + melhorPosicao + "!");
        scanner.close();
    }
}
