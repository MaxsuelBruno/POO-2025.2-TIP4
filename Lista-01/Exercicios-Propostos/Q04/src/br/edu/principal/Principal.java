package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma nota (peso 2): ");
		double n1 = sc.nextDouble();
		
		System.out.println("Diggite a segunda nota (peso 3): ");
		double n2 = sc.nextDouble();
		
		double m = (n1 * 2 + n2 * 3) / (2+3);
		
		System.out.println("A media ponderada vai ser: " + m);

	}

}
