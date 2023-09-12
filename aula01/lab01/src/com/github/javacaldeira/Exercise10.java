package com.github.javacaldeira;

import java.util.Scanner;

public class Exercise10 {

    /**
     * Exercício 10:
     * Crie um programa em Java que peça ao usuário para inserir uma temperatura em graus Celsius e,
     * em seguida, converta essa temperatura em graus Fahrenheit usando a fórmula:
     * Fahrenheit = (Celsius * 9/5) + 32.
     * Exiba o resultado na tela.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius:");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);

        scanner.close();
    }
}
