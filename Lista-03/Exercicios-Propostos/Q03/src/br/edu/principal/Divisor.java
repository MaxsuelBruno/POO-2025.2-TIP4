package br.edu.principal;

import java.util.Scanner;

public class Divisor {

		
		public static int proximoDivisor(int num1, int num2) {
	
	        if (num1 % num2 == 0) {
	            return 0;
	        }

	        for (int i = num2 + 1; i <= num1; i++) {
	            if (num1 % i == 0) {
	                return i;
	            }
	        }

	        return -1; 
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o primeiro número: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Digite o segundo número: ");
	        int num2 = scanner.nextInt();

	        int resultado = proximoDivisor(num1, num2);

	        if (resultado == 0) {
	            System.out.println(num1 + " é divisível por " + num2);
	        } else if (resultado == -1) {
	            System.out.println("Nenhum divisor maior que " + num2 + " encontrado para " + num1);
	        } else {
	            System.out.println("Próximo divisor de " + num1 + " maior que " + num2 + " é: " + resultado);
	        }

	        scanner.close();
	    }
	}



