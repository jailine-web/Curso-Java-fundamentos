package ExerciciosVetor;

import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantos n�meros deseja digitar? ");
		int n = ler.nextInt();
		double[] num = new double[n];
		double media = 0;
		
		//Leitura do vetor e m�dia
		for(int i = 0; i<num.length; i++) {
			System.out.print("Digite um n�mero:");
			num[i] = ler.nextDouble();
			media += num[i]/num.length;
		}
		
		System.out.printf("\nA m�dia do vetor �: %.3f" , media);
		
		System.out.print("\nN�meros abaixo da m�dia: ");
		for(int i = 0; i<num.length; i++) {
			if(num[i]< media) {
				num[i] = num[i];
				System.out.println(num[i]);
			}
		}
		
	}
}
