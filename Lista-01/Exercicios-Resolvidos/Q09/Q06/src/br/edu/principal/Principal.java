package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário atual do funcionario:");
		double sal = sc.nextDouble();
		
		double grat = sal * 5/100;
		double imp = sal * 7/100;
		
		double salreceber = sal + grat - imp;
		
		System.out.println("O novo salário que o funcionario vai receber é: " + salreceber);
		
		

	}

}
