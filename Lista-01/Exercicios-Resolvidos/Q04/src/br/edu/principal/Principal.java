package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite seu salário atual: ");
		double sal = sc.nextDouble();
		
		double novosal = sal + sal * 25/100;
		
		System.out.println("Seu novo salário é: " + novosal);
  }

}