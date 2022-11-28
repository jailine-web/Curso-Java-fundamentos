package Condicionais;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		
		Scanner ler = new Scanner(System.in);
		
		numero1 = ler.nextInt();
		numero2 = ler.nextInt();
		
		if(numero1 % numero2 == 0 || (numero2 % numero1 == 0)) {
			System.out.println("Número multiplo");
		}else {
			System.out.println("Número não multiplo");
		}
	}

}
