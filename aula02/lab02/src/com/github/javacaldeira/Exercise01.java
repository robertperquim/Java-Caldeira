package com.github.javacaldeira;

import java.util.Scanner;

public class Exercise01 {

    /**
     * Exercicio 01
     * Crie um programa que determine e escreva os números primos compreendidos entre um intervalo fornecido
     * pelo usuário.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DETERMINA NUMEROS PRIMOS NO INTERVALO QUE VOCÊ QUISER: ");

        System.out.println("Digite o primeiro numero: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Intervalo escolhido [ " + firstNumber + " , " + secondNumber + " ]");
        System.out.println("Numeros primos encontrados: ");

        for (int i = firstNumber; i <= secondNumber; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }

    /**
     * Método para verificar se um número é primo
     * Número primo: Ele é maior do que 1 e possui exatamente dois divisores: 1 e ele mesmo.
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Versão otimizada do método acima:
     * Criamos um loop do numero 2 até a metade do número que recebemos por parâmetro
     * porque se encontramos qualquer divisor nesse intervalo quer dizer que o numero NÃO é primo.
     * Caso o contrário, podemos afirmar que o número É primo.
     * Para utilizar esse método, você precisa atualizar a linha 30, trocando o 'isPrime' por 'isPrimeUpgrade'
     */
    public static boolean isPrimeUpgrade(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Versão mais otimizada do método acima, utilizando o Teorema Fundamental da Aritmética:
     * A ideia é que, se um número NÃO é primo, ele deve ter pelo menos um divisor que seja
     * menor ou igual à sua raiz quadrada.
     * Por exemplo: Vamos verificar se o número 29 é primo, a raiz quadrada dele é aproximadamente 5.39.
     * Isso significa que, se não houver divisores até 5, podemos concluir com segurança que 29 é primo,
     * sem a necessidade de verificar divisibilidade com números maiores que 5.
     * (quem achou que programação não envolvia matematica se enganou bonito, não é mesmo?)
     * Para utilizar esse método, você precisa atualizar a linha 30, trocando o 'isPrime' por 'isPrimeUltimate'
     */
    public static boolean isPrimeUltimate(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
