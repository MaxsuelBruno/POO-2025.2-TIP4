package br.edu.principal;
import java.util.Scanner;
import br.edu.util.MinhasFuncoes;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int SEG;
		
		System.out.println("insira quantos segundos você deseja");
		SEG = sc.nextInt();
		MinhasFuncoes.convi(SEG);
	}
}
