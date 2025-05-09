package Ex_Nível3;

import java.util.Scanner;

public class MiniQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pontuacao = 0;

        System.out.println("Pergunta 1: Qual a capital do Brasil?");
        System.out.println("1) Rio de Janeiro\n2) Brasília\n3) São Paulo");
        int resposta1 = scanner.nextInt();
        switch (resposta1) {
            case 2:
                pontuacao++;
                break;
            default:
                break;
        }

        System.out.println("Pergunta 2: Qual é o resultado de 3 x 4?");
        System.out.println("1) 7\n2) 12\n3) 9");
        int resposta2 = scanner.nextInt();
        switch (resposta2) {
            case 2:
                pontuacao++;
                break;
            default:
                break;
        }

        System.out.println("Pergunta 3: Qual linguagem estamos usando?");
        System.out.println("1) Python\n2) JavaScript\n3) Java");
        int resposta3 = scanner.nextInt();
        switch (resposta3) {
            case 3:
                pontuacao++;
                break;
            default:
                break;
        }

        System.out.println("Sua pontuação: " + pontuacao + "/3");
        scanner.close();
    }
}
