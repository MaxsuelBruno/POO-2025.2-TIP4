package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double Cont, Num1, Num2, Media, total_alunos, total_exame, total_reprovados;
        double media_class, total_class;
        total_class = 0;
        total_alunos = 0;
        total_exame = 0;
        total_reprovados = 0;
        for (Cont=1;Cont<=6;Cont ++) {
            Num1 = 4 + Cont;
            Num2 = 2 + Cont;
            Media = (Num1+Num2)/2;
            System.out.print("média: "+Media+" - ");
            if (Media<=3) {
                total_reprovados += 1;
                System.out.print("Reprovado\n");
            }
            else if (Media>3 & Media<7) {
                total_exame	 += 1;
                System.out.print("Exame\n");
            }
            else if (Media >= 7) {
                total_alunos += 1;
                System.out.print("Aprovado\n");
            }
            total_class += Media;
        }
        System.out.println("total_reprovados: "+total_reprovados);
        System.out.println("total_exame: "+total_exame);
        System.out.println("total_alunos: "+total_alunos);
        media_class = total_class/6;
        System.out.println("média da classe: "+media_class);
    }
}


		

	