package ComandosBasicosJava;

import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {
	public static void main(String[] args) {
		
		double raio;
		double area;
		double PI = 3.14159;
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		raio = ler.nextDouble();
		area = PI * Math.pow(raio, 2);
		
		System.out.printf("A= %.4f" , area);
		
	}

}
