package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois numeros: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("O menor numero é " + num2);
		}
		
		if (num2 > num1) {
			System.out.println("O menor numero é " + num1);
		}

	}

}
	


