package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VeriFicaSeUmNumeroeParouImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite seu número Inteiro:");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) { //Um número inteiro é par se for divisível por 2, ou seja, se o resto da divisão por 2 for zero (numero % 2 == 0).
                System.out.println("Vocé digitou um número PAR");
            } else {     //Caso contrário, ele é ímpar (numero % 2 != 0).
                System.out.println("Vocé digitou um número ÍMPAR");
            }
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("ERRO AO LER SEU ARGUMENTO!");
        }
//Operador % (Módulo) em Java
//O operador % (módulo) retorna o resto da divisão entre dois números.
    }
}
