package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
        double Cont_time, cont_jogador, idade;
        double peso, altura, qtde, media_idade, media_altura, porc, tot80;
        qtde = 0;
        tot80 = 0;
        media_altura = 0;
        for (Cont_time = 1;Cont_time<= 5; Cont_time ++) {
            media_idade = 0;
            for (cont_jogador = 1;cont_jogador<= 11;cont_jogador ++) {
                idade = 17;
                peso = cont_jogador*Cont_time + 50;
                altura = (160 + 4 * cont_jogador)/100;
                if (idade<18) {
                    qtde += 1;
                    media_idade += idade;
                    media_altura += altura;
                }
                if (peso > 80) {
                    tot80 += 1;
                }
                
            }
            media_idade = media_idade/11;
            System.out.println("média idade: "+media_idade);
        }
        System.out.println("qtde: "+qtde);
        media_altura = media_altura/55;
        System.out.println("média da altura: "+media_altura);
        porc = tot80 * 100/55;
        System.out.println("porc: "+porc);
        
    }
}

