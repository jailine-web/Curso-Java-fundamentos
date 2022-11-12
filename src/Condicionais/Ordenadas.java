package Condicionais;

import java.util.Scanner;

public class Ordenadas {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		Scanner ler = new Scanner(System.in);
		
		x = ler.nextInt();
		y = ler.nextInt();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
		else if (x == 0) {
			System.out.println("Eixo x");
		}
		else if (y == 0) {
			System.out.println("Eixo y");
		}
		else if(x>0 && y>0) {
			System.out.println("Q1");
		}
		else if(x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else if(x < 0 && y < 0) {
			System.out.println("Q3");
		}else {
			System.out.println("Q4");
		}
	}
}
