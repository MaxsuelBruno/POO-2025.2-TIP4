package br.edu.principal;
import java.util.Scanner;
public class Principal {
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int grupo = 1; grupo <= 5; grupo++) {
            System.out.println("Grupo " + grupo + ":");

            System.out.print("Digite o valor A: ");
            int A = sc.nextInt();

            System.out.print("Digite o valor B: ");
            int B = sc.nextInt();

            System.out.print("Digite o valor C: ");
            int C = sc.nextInt();

            System.out.print("Digite o valor D: ");
            int D = sc.nextInt();

            System.out.println("Ordem original: " + A + " " + B + " " + C + " " + D);

            int x1 = A, x2 = B, x3 = C, x4 = D;


            System.out.println("Ordem crescente: " + x1 + " " + x2 + " " + x3 + " " + x4);

            System.out.println("Ordem decrescente: " + x4 + " " + x3 + " " + x2 + " " + x1);

            System.out.println("-----------------------------------");
        }
    }
}
