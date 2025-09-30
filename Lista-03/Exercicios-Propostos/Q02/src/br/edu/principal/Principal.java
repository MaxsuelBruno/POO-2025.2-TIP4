package br.edu.principal;
import java.util.Scanner;
import br.edu.util.MinhasFuncoes;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Digite as horas: ");
                int horas = scanner.nextInt();

                System.out.print("Digite os minutos: ");
                int minutos = scanner.nextInt();

                System.out.print("Digite os segundos: ");
                int segundos = scanner.nextInt();

                int total = MinhasFuncoes.converterParaSegundos(horas, minutos, segundos);

                System.out.println("O total em segundos é: " + total);

                scanner.close();
            }
        }
