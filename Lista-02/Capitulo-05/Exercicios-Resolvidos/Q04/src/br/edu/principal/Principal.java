package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int cont, codigo, numero_veiculos, numero_acidentes;
	        int maior, cidade_maior, menor, cidade_menor;
	        int media_veiculo, soma_veiculo, media_acidente;
	        int soma_acidente, contagem_acidente;
	        soma_veiculo = 0;
	        soma_acidente = 0;
	        contagem_acidente = 0;
	        maior = 0;
	        menor = 0;
	        cidade_maior = 0;
	        cidade_menor = 0;
	        
	        for (cont = 1; cont <= 5; cont ++) {
	            System.out.println("Código da cidade: ");
	            codigo = sc.nextInt();
	            System.out.println("Número de veiculos: ");
	            numero_veiculos = sc.nextInt();
	            System.out.println("Número de acidentes: ");
	            numero_acidentes = sc.nextInt();
	            System.out.println();
	            if (cont == 1) {
	                maior = numero_acidentes;
	                cidade_maior = codigo;
	                menor = numero_acidentes;
	                cidade_menor = codigo;
	            }
	            else {
	                if (numero_acidentes > maior) {
	                    maior = numero_acidentes;
	                    cidade_maior = codigo;
	                }
	                else if (numero_acidentes < menor) {
	                    menor = numero_acidentes;
	                    cidade_menor = codigo;
	                }
	            }
	            soma_veiculo += numero_veiculos;
	            if (numero_veiculos < 2000) {
	                soma_acidente += numero_acidentes;
	                contagem_acidente += 1;
	            }
	        }
	        System.out.println("Um maior número de acidentes: " + maior + "\nCódigo da cidade: " + cidade_maior);
	        System.out.println("Um menor número de acidentes: " + menor + "\nCódigo da cidade: " + cidade_menor);
	        media_veiculo = soma_veiculo/5; 
	        System.out.println("Média dos veículos: " + media_veiculo);
	        if (contagem_acidente == 0) {
	            System.out.println("Não foi digitado nenhuma cidade com menos de 2000 veículos");
	        }
	        else {
	            media_acidente = soma_acidente/contagem_acidente;
	            System.out.println("Média dos acidentes " + media_acidente);
	        } 
	}
}