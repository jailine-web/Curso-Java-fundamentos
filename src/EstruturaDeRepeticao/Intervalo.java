package EstruturaDeRepeticao;

import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n = ler.nextInt();
		int inter = 0;
		int out = 0;
		int numero =0;
		
		for(int i = 0; i<n; i++) {
			System.out.println("Digite os números!");
			numero = ler.nextInt();
			if(numero>10 && numero<20) {
				inter ++;
				
			}else
				out ++;
		}
		System.out.println(inter +" in");
		System.out.println(out +" out");
	}
}
