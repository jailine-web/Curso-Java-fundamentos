package EstruturaDeRepeticao;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int senha= ler.nextInt();
		
		while(senha!= 2002) {
			System.out.println("Senha: inválida!");
			senha = ler.nextInt();
		}
		
		System.out.println("Acesso permitido");
		ler.close();
	}
}
