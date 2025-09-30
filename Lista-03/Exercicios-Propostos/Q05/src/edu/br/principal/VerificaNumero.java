package edu.br.principal;

import java.util.Scanner;

public class VerificaNumero {
    public static void verificarNumero(int numero) {
        if (numero > 0) {
            System.out.println("O número " + numero + " é positivo.");
        } else if (numero < 0) {
            System.out.println("O número " + numero + " é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int valor = scanner.nextInt();

        
        verificarNumero(valor);

        scanner.close();
    }
}