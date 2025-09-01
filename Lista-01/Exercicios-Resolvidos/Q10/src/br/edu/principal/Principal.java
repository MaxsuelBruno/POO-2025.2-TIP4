package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double raio, area;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do raio: ");
		raio = sc.nextDouble();
		
		sc.close();
		
		area = 3.1415 * raio * raio;
		System.out.println("A area do circulo é: " + area);


	}

}
