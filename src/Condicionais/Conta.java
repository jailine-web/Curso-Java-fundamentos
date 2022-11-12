package Condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {
		
		double qtd;
		double cod;
		double total = 0;
		//+
		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		qtd = ler.nextDouble();
		cod = ler.nextDouble();
		
		if(cod == 1) {
			total = (qtd*4.00);
		}
		else if(cod == 2) {
			total = (qtd*4.50);
		}
		else if(cod == 3) {
			total = (qtd * 5.00);
		}
		else if(cod == 4) {
			total = (qtd *2);
		}else {
			total = (qtd*1.50);
		}
		
		System.out.printf("Total: %.2f", total);
		ler.close();
	}
}
