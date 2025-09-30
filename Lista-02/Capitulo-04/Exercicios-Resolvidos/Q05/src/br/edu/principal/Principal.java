package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três numeros em ordem crescente: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		System.out.println("Digite um numero (fora de ordem): ");
		int num4 = sc.nextInt();
		
		if (num4 > num3) {
			System.out.println("A ordem decrescente é: "+ num4+"-"+num3+ "-"+num2+ "-"+num1);
		}
		if (num4 > num2 && num4 < num3) {
			System.out.println("A ordem decrescente é: " +num3+"-"+num4+"-"+num2+ "-"+num1);
		}
		if (num4 > num1 && num4 < num2) {
			System.out.println("A ordem decrescente é: "+ num3+"-"+num2+"-"+num4+ "-"+num1);
		}
		if (num4 < num1) {
			System.out.println("A ordem decrescente é: "+ num3+"-"+num2+"-"+num1+ "-"+num4);
		}
}
}
