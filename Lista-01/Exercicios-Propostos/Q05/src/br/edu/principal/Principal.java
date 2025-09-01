
package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double produto;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o preço do produto:");
		double preco = sc.nextDouble();
		
		double desconto = preco*0.10;
		double novopreco = preco - desconto;
		
		System.out.println("preco original:"+ preco);
		
		System.out.println("novo preco com desconto:"+ novopreco);

	}

}
