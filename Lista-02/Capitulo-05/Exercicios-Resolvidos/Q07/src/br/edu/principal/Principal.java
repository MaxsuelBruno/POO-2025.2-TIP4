package br.edu.principal;
public class Principal {

	public static void main(String[] args) {
		  int Contador, Num1, Num2, RES;
	        Num1 = 0;
	        Num2 = 1;
	        System.out.print(Num1+" ");
	        System.out.print(Num2+" ");
	        for (Contador=3;Contador<=8;Contador++) {
	            RES = Num1+Num2;
	            System.out.print(RES+ " ");
	            Num1 = Num2;
	            Num2 = RES;

      }

	}

}


