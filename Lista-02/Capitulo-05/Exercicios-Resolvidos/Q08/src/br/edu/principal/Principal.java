package br.edu.principal;
public class Principal {

	public static void main(String[] args) {
		int I, numero_termos, Num1, Num2, Num3;
        numero_termos = 17;
        Num1 = 2;
        Num2 = 7;
        Num3 = 3;
        System.out.print(Num1+" ");
        System.out.print(Num2+" ");
        System.out.print(Num3+" ");
        I = 4;
        while (I!=numero_termos) {
            Num1 *= 2;
            System.out.print(Num1+" ");
            I ++;
            if (I!=numero_termos) {
                Num2 *= 3;
                System.out.print(Num2+" ");
                I ++;
                if (I!=numero_termos) {
                    Num3 *= 4;
                    System.out.print(Num3+" ");
                    I ++;
                }
            }
        }		
	}
	}
	
		

