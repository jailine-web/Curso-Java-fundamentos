package Condicionais;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner ler = new Scanner(System.in);
		
		numero = ler.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("N�mero par");
		}else {
			System.out.println("N�mero impar");
		}
		
	}
}
