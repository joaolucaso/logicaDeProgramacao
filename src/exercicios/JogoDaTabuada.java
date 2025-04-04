package exercicios;

import java.util.Scanner;

public class JogoDaTabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 1;
        do {
            System.out.println("Digite um número de 1 até 10: ");
            N = scanner.nextInt();
            if (N < 1 || N > 10) {

                System.out.println("Número inválido! tente novamente.");
            }
        } while (N < 1 || N > 10);
        System.out.println("\nTabuada do " + N + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = N * i;
            System.out.println(N + "X" + i + "=" + resultado);
        }
        scanner.close();
    }
}

