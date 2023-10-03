public class NossaClasse {

    // Método 1: Calcular a soma de uma lista de números inteiros.
    public int somarNumeros(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    // Método 2: Verificar se um número é par.
    public boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    // Método 3: Calcular o fatorial de um número inteiro positivo.
    public int calcularFatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("O número deve ser não negativo.");
        }
        if (numero == 0 || numero == 1) {
            return 1;
        }
        int fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    // Método 4: Verificar se uma string é um palíndromo (lê-se igual de trás para frente).
    public boolean ehPalindromo(String texto) {
        texto = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int esquerda = 0;
        int direita = texto.length() - 1;
        while (esquerda < direita) {
            if (texto.charAt(esquerda) != texto.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }
        return true;
    }

    // Método 5: Calcular o n-ésimo termo da sequência de Fibonacci.
    public int calcularFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O índice deve ser não negativo.");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int fib1 = 0;
        int fib2 = 1;
        int resultado = 0;
        for (int i = 2; i <= n; i++) {
            resultado = fib1 + fib2;
            fib1 = fib2;
            fib2 = resultado;
        }
        return resultado;
    }
}
