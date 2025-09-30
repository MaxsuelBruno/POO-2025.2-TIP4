package br.edu.util;
public class MinhasFuncoes {
    public static int somarDeUmAteN(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
    }
}
