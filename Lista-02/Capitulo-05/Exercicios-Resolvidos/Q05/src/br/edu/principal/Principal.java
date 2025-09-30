package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	      
	        System.out.print("Digite o número de termos da série: ");
	        int numTermos = scanner.nextInt();

	        System.out.print("Digite um valor positivo para X: ");
	        double x = scanner.nextDouble();

	        if (x <= 0 || numTermos <= 0) {
	            System.out.println("X e número de termos devem ser positivos.");
	            scanner.close();
	            return;
	        }

	        double s = 0;
	        int denominador = 1;
	        int direcao = 1; 

	        for (int i = 1; i <= numTermos; i++) {
	            int expoente = i + 1;

	            
	            int fat = 1;
	            for (int j = 1; j <= denominador; j++) {
	                fat *= j;
	            }

	            
	            double termo = Math.pow(x, expoente) / fat;
	            if (expoente % 2 == 0) {
	                s -= termo;
	            } else {
	                s += termo;
	            }

	            if (denominador == 4) {
	                direcao = -1;
	            } else if (denominador == 1) {
	                direcao = 1;
	            }
	            denominador += direcao;
	        }

	        System.out.printf("O valor da série é: %.4f\n", s);
	        scanner.close();
	    }
	


	}


