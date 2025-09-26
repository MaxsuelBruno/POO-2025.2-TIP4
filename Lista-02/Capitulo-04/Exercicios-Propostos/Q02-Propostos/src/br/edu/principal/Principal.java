package br.edu.principal;
import java.util.Scanner;
public class Principal {
    
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Média: " + media);

        if (media >= 0 && media < 3) {
            System.out.println("Reprovado");
            
        } else if (media >= 3 && media < 7) {
            System.out.println("Exame");
            
        } else if (media >= 7 && media <= 10) {
            System.out.println("Aprovado");
            
        } else {
            System.out.println("Média inválida!");
            
        }
    }
}
