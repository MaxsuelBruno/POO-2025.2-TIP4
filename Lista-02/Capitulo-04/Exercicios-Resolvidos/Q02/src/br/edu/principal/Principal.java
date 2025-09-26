package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Insira a segunda nota: ");
		double n2 = sc.nextDouble();
		
		System.out.println("Insira a terceira nota: ");
		double n3 = sc.nextDouble();
		
		double media = (n1+n2+n3)/3;
		
		System.out.println("Média aritmética: "+ media);
		
		if(media >= 0 && media < 3) {
			System.out.println("Reprovado");
		} 
		else if(media >=3 && media<7) {
			System.out.println("Exame");
			double nota_exame = 12 - media;
			System.out.println("Deverá tirar uma nota " + nota_exame + " para ser aprovado.");
		} 
		else if (media >=7 && media<=10) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Digite as notas que são válidas, entre 0 a 10.");
		}
	}
}