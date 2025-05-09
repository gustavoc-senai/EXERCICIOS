package Ex_Nível1;

import java.util.Random;
import java.util.Scanner;


public class AdivinhacaoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(10) + 1;
        System.out.println("Tente adivinhar o número entre 1 e 10:");
        int tentativa = scanner.nextInt();

        if (tentativa == numeroSecreto) {
            System.out.println("Acertou!");
        } else if (tentativa < numeroSecreto) {
            System.out.println("Tente um número maior.");
        } else {
            System.out.println("Tente um número menor.");
        }

        scanner.close();
    }
}