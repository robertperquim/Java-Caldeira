package com.github.javacaldeira;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Exercise09 {

    /**
     * Exercício 08:
     * Crie um programa em Java que peça ao usuário para inserir seu ano de nascimento
     * e, em seguida, calcule e exiba a idade.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu ano de nascimento:");
        int birthYear = scanner.nextInt();

        // Obtém o ano atual utilizando o método 'now' da classe LocalDateTime
        int year = LocalDateTime.now().getYear();

        int idade = year - birthYear;

        System.out.println("Sua idade é: " + idade + " anos");

        scanner.close();
    }
}
