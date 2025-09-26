package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Insira o segundo número: ");
		double n2 = sc.nextDouble();
		
		if (n1 > n2) {
			System.out.println("O maior número vai ser: " + n1);
		}
		else if(n2 > n1) {
			System.out.println("O maior número vai ser: " + n2);
		}
		else {
			System.out.println("Os números serão iguais.");
		}
	}
}