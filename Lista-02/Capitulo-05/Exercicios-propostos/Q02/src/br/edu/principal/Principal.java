package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        double preco = 5.0;
        int ingressos = 120;
        double despesa = 200.0;

        double lucro;
        double lucroMaximo = 0;
        double precoLucroMaximo = 0;
        int ingressosLucroMaximo = 0;
        boolean primeiro = true;

        System.out.println("Preço    Ingressos    Lucro");

        while (preco >= 1.0) {
            lucro = (preco * ingressos) - despesa;

            System.out.print("R$ ");
            System.out.print(preco);
            System.out.print("    ");
            System.out.print(ingressos);
            System.out.print("           R$ ");
            System.out.println(lucro);
            if (primeiro || lucro > lucroMaximo) {
                lucroMaximo = lucro;
                precoLucroMaximo = preco;
                ingressosLucroMaximo = ingressos;
                primeiro = false;
            }

            preco = preco - 0.5;
            ingressos = ingressos + 26;
        }

        System.out.println();
        System.out.println("=== Resultado do maior lucro ===");
        System.out.print("Lucro máximo: R$ ");
        System.out.println(lucroMaximo);
        System.out.print("Preço do ingresso: R$ ");
        System.out.println(precoLucroMaximo);
        System.out.print("Quantidade de ingressos vendidos: ");
        System.out.println(ingressosLucroMaximo);
    }
}
