package edu.br.principal;

import java.util.Scanner;

		public class Operacoes {

				    public static void main(String[] args) {
				        Scanner scanner = new Scanner(System.in);

				        
				        System.out.print("Digite o primeiro número: ");
				        double num1 = scanner.nextDouble();

				        System.out.print("Digite o segundo número: ");
				        double num2 = scanner.nextDouble();

				       
				        System.out.println("\nEscolha a operação:");
				        System.out.println("1 - Média entre os números digitados");
				        System.out.println("2 - Diferença do maior pelo menor");
				        System.out.println("3 - Produto entre os números digitados");
				        System.out.println("4 - Divisão do primeiro pelo segundo");
				        System.out.print("Opção: ");
				        int opcao = scanner.nextInt();

				        double resultado;

				        
				        if (opcao == 1) {
				            resultado = (num1 + num2) / 2;
				            System.out.println("Média = " + resultado);

				        } else if (opcao == 2) {
				            if (num1 > num2) {
				                resultado = num1 - num2;
				            } else {
				                resultado = num2 - num1;
				            }
				            System.out.println("Diferença do maior pelo menor = " + resultado);

				        } else if (opcao == 3) {
				            resultado = num1 * num2;
				            System.out.println("Produto = " + resultado);

				        } else if (opcao == 4) {
				            if (num2 != 0) {
				                resultado = num1 / num2;
				                System.out.println("Divisão do primeiro pelo segundo = " + resultado);
				            } else {
				                System.out.println("Erro: divisão por zero não é permitida.");
				            }

				        } else {
				            System.out.println("Opção inválida. Programa encerrado.");
				        }

				        scanner.close();
				    }
				}



