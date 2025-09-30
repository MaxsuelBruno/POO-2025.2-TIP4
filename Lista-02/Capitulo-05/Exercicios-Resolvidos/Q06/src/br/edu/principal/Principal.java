package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        final double salarioMinimo = 450.0;

	        for (int i = 1; i <= 10; i++) {
	            System.out.println("\nFuncionário " + i);

	           
	            System.out.print("Código do funcionário: ");
	            int codigo = scanner.nextInt();

	            System.out.print("Número de horas trabalhadas no mês: ");
	            double nht = scanner.nextDouble();

	            
	            String turno;
	            do {
	                System.out.print("Turno de trabalho (M/V/N): ");
	                turno = scanner.next().toUpperCase();
	            } while (!turno.equals("M") && !turno.equals("V") && !turno.equals("N"));

	            
	            String categoria;
	            do {
	                System.out.print("Categoria (O/G): ");
	                categoria = scanner.next().toUpperCase();
	            } while (!categoria.equals("O") && !categoria.equals("G"));

	           
	            double valorHora = 0;
	            if (categoria.equals("G")) {
	                if (turno.equals("N")) {
	                    valorHora = salarioMinimo * 0.18;
	                } else {
	                    valorHora = salarioMinimo * 0.15;
	                }
	                if (turno.equals("N")) {
	                    valorHora = salarioMinimo * 0.13;
	                } else {
	                    valorHora = salarioMinimo * 0.10;
	                }
	            }

	            double salarioInicial = nht * valorHora;

	            double auxilio;
	            if (salarioInicial <= 300) {
	                auxilio = salarioInicial * 0.20;
	            } else if (salarioInicial < 600) {
	                auxilio = salarioInicial * 0.15;
	            } else {
	                auxilio = salarioInicial * 0.05;
	            }
	            double salarioFinal = salarioInicial + auxilio;
	            System.out.printf("Código: %d\n", codigo);
	            System.out.printf("Horas trabalhadas: %.2f\n", nht);
	            System.out.printf("Valor da hora trabalhada: R$ %.2f\n", valorHora);
	            System.out.printf("Salário inicial: R$ %.2f\n", salarioInicial);
	            System.out.printf("Auxílio alimentação: R$ %.2f\n", auxilio);
	            System.out.printf("Salário final: R$ %.2f\n", salarioFinal);
	        }
	    }
	

		

	}


