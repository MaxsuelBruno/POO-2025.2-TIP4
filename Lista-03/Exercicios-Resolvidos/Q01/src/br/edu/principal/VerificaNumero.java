package br.edu.principal;

import java.util.Scanner;

public class VerificaNumero {
		
		public static int verifica(double num) {
			int res;
	       
	        if (num >= 0) {
	            res = 1;
	        } else {
	            res = 0;
	        }
	        return res;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        double num;
	        int x;

	        System.out.print("Digite um número: ");
	        num = scanner.nextDouble();

	        x = verifica(num);

	        if (x == 0) {
	            System.out.println("Número negativo");
	        } else {
	            System.out.println("Número positivo");
	        }

	        scanner.close();
	        
	    }
	}


