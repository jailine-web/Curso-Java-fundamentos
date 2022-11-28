package EstruturaDeRepeticao;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int n = ler.nextInt();
		double resultado = 0;
		
		for(int i= 0; i<n; i++) {
			double a = ler.nextDouble();
			double b = ler.nextDouble();
			
			if(b == 0) {
				System.out.println("Divisão impossível");
			}else {
				resultado = a/b;
				System.out.println(resultado);
			}
		}
	}

}
