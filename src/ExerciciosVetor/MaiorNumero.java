package ExerciciosVetor;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		//+
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Quantos n�meros deseja digitar? ");
		int n = ler.nextInt();
		
		double[] num = new double[n];
		double maior = 0;
		
		System.out.println();
		int i;
		int pos = 0;
		for(i = 0; i<num.length; i++) {
			System.out.print("Digite um n�mero: ");
			num[i] = ler.nextDouble();
			if(num[i]> maior) {
				maior = num[i];
				pos = i;
			}
		}
		
		System.out.println("\nO maior n�mero digitado foi: "+ maior + "na posi��o: "+ pos);
		
	}

}
