package com.github.javacaldeira;

import java.util.Scanner;

public class Exercise12 {

    /**
     * Exercicio 12:
     * Crie um programa que converta uma quantia em dólares para outra moeda, como euros ou reais.
     * Peça ao usuário para inserir a quantia em dólares e a taxa de câmbio atual.
     * Em seguida, calcule e exiba o valor convertido.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantia em dólares:");
        double dollarAmount = scanner.nextDouble();

        System.out.println("Digite a taxa de câmbio:");
        double exchangeRate = scanner.nextDouble();

        double convertedAmount = dollarAmount * exchangeRate;

        System.out.println("A quantia convertida é: " + convertedAmount);

        scanner.close();
    }
}
