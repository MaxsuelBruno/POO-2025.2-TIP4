package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário atual do funcionario: ");
		double sal = sc.nextDouble();
		
		System.out.println("Digite o percentual de aumento: ");
		double perc = sc.nextDouble();
		
		double aumento = sal * (perc/100);
		
		double novosal = sal + aumento;
		
		System.out.println("O aumento foi de: " + aumento);
		System.out.println("O novo salário do funcionario será: " + novosal );
		
		
		
	}

}
