package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		

		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Digite o ano atual: ");
		        int anoAtual = scanner.nextInt();

		        
		        double salarioInicial = 1000.0;
		        double percentual = 1.5 / 100; 
		        double novoSalario = salarioInicial + (percentual * salarioInicial);

		       
		        for (int ano = 2007; ano <= anoAtual; ano++) {
		            percentual *= 2; 
		            novoSalario += novoSalario * percentual;
		        }

		        
		        System.out.printf("O salário atual do funcionário em %d é: R$ %.2f\n", anoAtual, novoSalario);

		       
		    }
		}

	


