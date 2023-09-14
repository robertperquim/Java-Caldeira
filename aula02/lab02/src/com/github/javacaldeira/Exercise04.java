package com.github.javacaldeira;

import java.util.Scanner;

public class Exercise04 {

    /**
     * Exercicio 04
     * Implemente uma calculadora, onde o usuário deve entrar com 2 números e escolher a operação que deseja realizar.
     * Durante a execução o programa deve perguntar ao usuário se ele deseja continuar,
     * se ele não quiser, deve digitar ‘n’ para o programa encerrar.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("***** CALCULADORA BÁSICA *****");

            System.out.println("Digite o primeiro número:");
            double firstNumber = scanner.nextDouble();
            System.out.println("Digite o segundo número:");
            double secondNumber = scanner.nextDouble();

            //Matar o bug da classe Scanner
            scanner.nextLine();

            System.out.println("Digite a operação que deseja executar:");
            System.out.println(" + para Adição ");
            System.out.println(" - para Subtração ");
            System.out.println(" * para Multiplicação ");
            System.out.println(" / para Divisão ");
            System.out.println("ou digite 'n' ou 'N' para encerrar. ");
            String option = scanner.nextLine().toLowerCase();
            double result;
            switch (option) {
                case "+" -> {
                    result = firstNumber + secondNumber;
                    System.out.println(firstNumber + " + " + secondNumber + " = " + result);
                }
                case "-" -> {
                    result = firstNumber - secondNumber;
                    System.out.println(firstNumber + " - " + secondNumber + " = " + result);
                }
                case "*" -> {
                    result = firstNumber * secondNumber;
                    System.out.println(firstNumber + " * " + secondNumber + " = " + result);
                }
                case "/" -> {
                    if (secondNumber != 0.0) {
                        result = firstNumber / secondNumber;
                        System.out.println(firstNumber + " / " + secondNumber + " = " + result);
                    } else {
                        System.out.println("Erro: Divisão por zero.");
                    }
                }
                case "n" -> {
                    System.out.println("Adeus");
                    keepGoing = false;
                }
                default -> System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}
