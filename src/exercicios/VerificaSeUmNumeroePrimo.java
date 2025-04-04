package exercicios;

import java.util.Scanner;

public class VerificaSeUmNumeroePrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int N = scanner.nextInt();

        boolean ehPrimo = true;// Variável para indicar se o número é primo

        if (N <= 1) {
            ehPrimo = false;// Números menores ou iguais a 1 não são primos
        } else {
            for (int i = 2; i < N; i++) {// Testa de 2 até N-1
                if (N % i == 0) {// Se for divisível por algum número além de 1 e ele mesmo
                    ehPrimo = false;
                    break;// Não precisa continuar testando
                }
            }
        }
        if (ehPrimo) {

            System.out.println(N + " é um número primo.");
        } else {
            System.out.println(N + " não é um número primo.");
        }
scanner.close();
    }
}
