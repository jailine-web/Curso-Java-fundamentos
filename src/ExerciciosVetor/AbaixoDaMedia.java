package ExerciciosVetor;

import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantos números deseja digitar? ");
		int n = ler.nextInt();
		double[] num = new double[n];
		double media = 0;
		
		//Leitura do vetor e média
		for(int i = 0; i<num.length; i++) {
			System.out.print("Digite um número:");
			num[i] = ler.nextDouble();
			media += num[i]/num.length;
		}
		
		System.out.printf("\nA média do vetor é: %.3f" , media);
		
		System.out.print("\nNúmeros abaixo da média: ");
		for(int i = 0; i<num.length; i++) {
			if(num[i]< media) {
				num[i] = num[i];
				System.out.println(num[i]);
			}
		}
		
	}
}
