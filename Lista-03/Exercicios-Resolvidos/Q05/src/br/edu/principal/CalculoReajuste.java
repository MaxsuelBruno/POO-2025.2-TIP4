package br.edu.principal;

import java.util.Scanner;

public class CalculoReajuste {
	
	public static double calculoReajuste(double precoAntigo, double precoAtual) {
        double result;
        result = ((100 * precoAtual) - (100 * precoAntigo)) / precoAntigo;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precoAntigo, precoAtual, acrescimo;

        System.out.print("Digite o preço antigo: ");
        precoAntigo = scanner.nextDouble();

        System.out.print("Digite o preço atual: ");
        precoAtual = scanner.nextDouble();
        
        
        acrescimo = calculoReajuste(precoAntigo, precoAtual);

        System.out.printf("Acréscimo percentual: %.2f%%\n", acrescimo);

    }
}


