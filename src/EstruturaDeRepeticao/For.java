package EstruturaDeRepeticao;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um n�mero");
		int x = ler.nextInt();
		
		for(int i = 0; i<=x; i++) {
			if (i %2 != 0) { 
				System.out.println(i);
			}
		}
		
	}
}
