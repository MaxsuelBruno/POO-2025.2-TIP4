package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Digite o primeiro número: ");
		        int num1 = sc.nextInt();

		        System.out.print("Digite o segundo número: ");
		        int num2 = sc.nextInt();

		        int resultado = num1 - num2;

		        System.out.println("A subtração do primeiro pelo segundo é: " + resultado);

	}
}