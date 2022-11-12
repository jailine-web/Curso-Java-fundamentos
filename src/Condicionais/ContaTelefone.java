package Condicionais;

import java.util.Scanner;

public class ContaTelefone {

	public static void main(String[] args) {
		
		double min;
		double CONTA = 50;
		
		Scanner ler = new Scanner(System.in);
		min = ler.nextDouble();
		
		if(min> 50) {
			CONTA += (min -100) *2;
			
		}
		System.out.printf("Conta R$: %.2f", CONTA);
		ler.close();
	}
}
