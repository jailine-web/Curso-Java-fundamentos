package estaticos;

import java.util.Scanner;

public class Principal {
	
	public static double valorPagar;
	public static double vd;
	 
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual � o valor do dolar? ");
		vd =  ler.nextDouble();
		System.out.println("Qual a quantidade que ser� comprada? ");
		valorPagar =  ler.nextDouble();
		System.out.printf("O total a pagar em reais �: %.2f"
					, CurrencyConverter.conversao(vd, valorPagar));
		
	}
}
