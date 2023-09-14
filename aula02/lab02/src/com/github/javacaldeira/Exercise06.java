package com.github.javacaldeira;

import java.util.Scanner;

public class Exercise06 {

    /**
     * Exercicio 06
     * Escreva um programa que receba uma string do usuário e imprima ela ao contrário.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um frase/palavra");
        String input = scanner.nextLine();

        String reverseVersion1 = reverseTextV1(input);
        System.out.println("[Solução 1] A string ao contrário é: " + reverseVersion1);

        String reverseVersion2 = reverseTextV2(input);
        System.out.println("[Solução 2] A string ao contrário é: " + reverseVersion2);

        scanner.close();
    }

    /**
     * Primeira solução - Combinação de for com StringBuilder:
     * Criamos uma instancia da classe StringBuilder para podermos usar o método 'append'
     * Quando trabalhamos com String é melhor utilizar o StringBuilder para manipular o texto pois
     * podemos acumular os caracteres de maneira mais efetiva, segura e evitamos usar o '+='
     */
    public static String reverseTextV1(String text) {
        StringBuilder reverse = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse.append(text.charAt(i));
        }
        return reverse.toString();
    }

    /**
     * Segunda solução - Somente StringBuilder:
     * Criamos uma instancia classe StringBuilder passando o texto no construtor, com esse objeto podemos acionar o
     * método 'reverse' que inverte o texto e retornamos o resultado.
     */
    public static String reverseTextV2(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        return stringBuilder.reverse().toString();
    }
}
