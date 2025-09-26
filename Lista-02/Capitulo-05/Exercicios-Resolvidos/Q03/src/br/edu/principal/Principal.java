package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("N: ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("Num" + i + ": ");
            int numero = sc.nextInt();
            double fat = 1;
            for (int j = 1; j <= numero; j++) {
                fat = fat * j;
            }
            
            System.out.println(fat);
            
        }
	}
}