package br.edu.principal;

import java.util.Scanner;

public class SalarioFuncionario {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Digite o ano atual:");
	    int anoAtual = scanner.nextInt();

	    if (anoAtual < 2006) {
	        System.out.println("O ano deve ser 2006 ou posterior.");
	        scanner.close();
	        return;
	    }

	    double salarioInicial = 1000.0;
	    double salario = salarioInicial;
	    double percentual = 1.5 / 100;

	   
	    salario += salario * percentual;

	    
	    for (int ano = 2007; ano <= anoAtual; ano++) {
	        percentual *= 2;
	        salario += salario * percentual;
	    }

	    System.out.printf("O salário atual do funcionário em %d é: R$ %.2f\n", anoAtual, salario);
	    scanner.close();
	}


}