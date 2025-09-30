package br.edu.principal;

import java.util.Scanner;

public class VolumeEsfera {
		
		public static double calcularVolume(double raio) {
	        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o raio da esfera: ");
	        double raio = scanner.nextDouble();

	        double volume = calcularVolume(raio);

	        System.out.printf("O volume da esfera é: %.2f\n", volume);

	        
	    }
	

	}


