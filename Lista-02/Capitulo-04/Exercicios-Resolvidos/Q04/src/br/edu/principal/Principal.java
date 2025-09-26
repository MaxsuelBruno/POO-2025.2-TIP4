package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Insira o segundo número: ");
		double num2 = sc.nextDouble();
		
		System.out.println("Insira o terceiro número: ");
		double num3 = sc.nextDouble();
		
		if (num1<num2 && num1<num3 & num2<num3) {
			System.out.println("a ordem crescente é: " + num1 + " - " + num2 + " - " + num3);
		} 
		else if(num1<num2 && num1<num3 && num3<num2) {
			System.out.println("a ordem crescente é: " + num1 + " - " + num3 + " - " + num2);
			}
		else if(num2<num1 && num2<num3 && num1<num3) {
			System.out.println("a ordem crescente é: " + num2 + " - " + num1 + " - " + num3);
		}
		else if(num2<num1 && num2<num3 && num3<num1) {
			System.out.println("a ordem crescente é: " + num2 + " - " + num3 + " - " + num1);
		}
		else if(num3<num1 && num3<num2 && num1<num2) {
			System.out.println("a ordem crescente é: " + num3 + " - " + num1 + " - " + num2);
		}
		else {
			System.out.println("a ordem crescente é: " + num3 + " - " + num2 + " - " + num1);
		}
     }
}