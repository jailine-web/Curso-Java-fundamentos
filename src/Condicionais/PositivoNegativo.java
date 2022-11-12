package Condicionais;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		int numero1;
		
		Scanner ler = new Scanner(System.in);
		
		/*Maneira direta de leitura.
		 * int numero1 = ler.nextInt();
		*/
		numero1 = ler.nextInt();
		
		if(numero1 >= 0) {
			System.out.println("Número é positivo");
		}else {
			System.out.println("Número negativo");
		}
		
	}

}
