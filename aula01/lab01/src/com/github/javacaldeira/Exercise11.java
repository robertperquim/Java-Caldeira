package com.github.javacaldeira;

import java.util.Scanner;

public class Exercise11 {

    /**
     * Exercicio 11:
     * Peça ao usuário que digite uma palavra ou frase e conte quantas vogais
     * (a, e, i, o, u) estão presentes. Exiba o número de vogais na tela.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase:");

        /*
         Converter toda a entrada do usuário para letras minúsculas 'toLowerCase()'
         Dessa maneira, removemos cláusulas do if, na linha 28
        */
        String entrada = scanner.nextLine().toLowerCase();

        int vowelCounter = 0;

        for (int i = 0; i < entrada.length(); i++) {
            // Pega cada letra do texto, testa se é vogal e acumula
            char letter = entrada.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowelCounter++;
            }
        }

        System.out.println("O número de vogais na entrada é: " + vowelCounter);

        scanner.close();
    }
}
