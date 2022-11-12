package EstruturaDeRepeticao;

import java.util.Scanner;

public class Controle {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel= 0;
		int cod = 0;
		
		while(cod != 4) {
			System.out.println("Qual o tipo de combustível?");
			System.out.println("Digite 1 para álcool");
			System.out.println("Digite 2 para gasolina");
			System.out.println("Digite 3 para diesel");
			System.out.println("Para encerrar digite 4");
			cod = ler.nextInt();
			if(cod == 1) {
				alcool += 1;
			}
			else if(cod ==2) {
				gasolina += 1;
			}
			else if(cod == 3) {
				diesel += 1;
			}
			
		}
		System.out.println("Muito obrigado");
		System.out.println("Alcool: "+ alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diesel: "+diesel);
	}
}
