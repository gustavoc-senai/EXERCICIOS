package Ex_Nível1;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma operação (+, -, *, /):");
        String operacao = scanner.next();
        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        switch (operacao) {
            case "+":
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Erro: divisão por zero");
                }
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }

        scanner.close();
    }
}
