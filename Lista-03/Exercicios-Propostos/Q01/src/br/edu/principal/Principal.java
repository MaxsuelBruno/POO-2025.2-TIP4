package br.edu.principal;
import java.util.Scanner;
import br.edu.util.MinhasFuncoes;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro e positivo: ");
        int numero = scanner.nextInt();

        if (numero >= 1) {
            int resultado = MinhasFuncoes.somarDeUmAteN(numero);
            System.out.println("A soma de 1 até " + numero + " é: " + resultado);
        } else {
            System.out.println("Número inválido. Digite um número maior ou igual a 1.");
        }

        scanner.close();
    }
}
