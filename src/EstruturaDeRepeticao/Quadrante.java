package EstruturaDeRepeticao;

import java.util.Scanner;

public class Quadrante {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int x = ler.nextInt();
		int y = ler.nextInt();
		
		while(x!= 0 || y != 0) {
			
			if(x>0 && y>0) {
				System.out.println("Primeiro quadrante");
			}
			else if(x>0 && y<0) {
				System.out.println("Quarto");
			}
			else if(x<0 && y<0) {
				System.out.println("Terceiro");
			}
			else {
				System.out.println("Segundo");
			}
			x = ler.nextInt();
			y = ler.nextInt();
		}
		
		ler.close();
	}
}
