package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro numero: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Digite o segundo numero (diferent de 0): ");
		double n2 = sc.nextDouble();
		
		double result = n1 / n2;
		
		System.out.println("O resultado da divisão é: " + result);
		
	}

}
