package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite Nota 1: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Digite Nota 2: ");
		double n2 = sc.nextDouble();
		
		System.out.println("Digite Nota 3: ");
		double n3 = sc.nextDouble();
		
		System.out.println("Digite Nota 4: ");
		double n4 = sc.nextDouble();
		
		double soma = n1 + n2 + n3 + n4;
		
		System.out.println("O resultado da soma é: " + soma );
		

	}

}
