package exercicios;

import java.util.Scanner;

public class CalculaaSomaDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seu número: ");
        int n = scanner.nextInt();
        int soma = 0;// Variável para armazenar a soma
        int contador = 1;// Variável que começa em 1 e vai até N
        while (contador <= n) { // Enquanto contador for menor ou igual a N
     soma += contador;// soma = soma + contador
     contador++;//Incrementa o contador
        }

        System.out.println("A soma de 1 até "+ n +" é "+soma);
        scanner.close();
    }
}
