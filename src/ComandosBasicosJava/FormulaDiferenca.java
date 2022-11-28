package ComandosBasicosJava;

import java.util.Scanner;

public class FormulaDiferenca {

	public static void main(String[] args) {
		
		int A;
		int B;
		int C;
		int D;
		int resultado = 0;
		//+
		Scanner ler = new Scanner(System.in);
		
		A = ler.nextInt();
		B = ler.nextInt();
		C= ler.nextInt();
		D = ler.nextInt();
		
		resultado = (A*B - C*D);
		
		System.out.println("Diferença = "+ resultado);
	}
}
