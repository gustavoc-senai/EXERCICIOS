package Ex_Nível1;

import java.util.Scanner;

public class VerificadorTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três lados do triângulo:");
        int lado1 = scanner.nextInt();
        int lado2 = scanner.nextInt();
        int lado3 = scanner.nextInt();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Não é um triângulo");
        }

        scanner.close();
    }
}
