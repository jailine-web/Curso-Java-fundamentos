package Condicionais;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int x = ler.nextInt();
		String dia;
		
		switch(x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabádo";
			break;
		default:
			dia = "dia inválido";
			break;
		}
		ler.close();
		
		System.out.printf("Dia: %s", dia);
			
	}
}
