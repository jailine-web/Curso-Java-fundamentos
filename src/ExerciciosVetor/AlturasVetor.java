package ExerciciosVetor;

import java.util.Scanner;

public class AlturasVetor {

	public static void main(String[] args) {

		String nome;
		double altura, media = 0;
		int idade;
		int numeroD;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o número de pessoas que será digitada: ");
		numeroD = ler.nextInt();
		
		double [] heigth = new double[numeroD];
		int    [] age = new int[numeroD];
		String [] name = new String [numeroD];
		
		for(int i = 0; i<numeroD; i++) {
			System.out.println("\nDados da "+(i+1)+"° pessoa");
			System.out.print("Nome: ");
			name[i] = ler.next();
			System.out.print("Idade: ");
			age[i] = ler.nextInt();
			System.out.print("Altura: ");
			heigth[i] = ler.nextDouble();
			System.out.println();
			
		}
		
		double menores = 0 ;
		
		System.out.println("\nDados digitados\n");
		
		for(int i = 0; i<numeroD; i++) {
			System.out.print("\nNome: ");
			System.out.print(name[i]);
			System.out.print("\nIdade: ");
			System.out.print(age[i]);
			System.out.print("\nAltura:  ");
			System.out.println(heigth[i]);
			media += heigth[i]/heigth.length;
			if(age[i]<16) {
				menores += 1;
			}
		
		}
		
		menores = (menores * 100)/numeroD;
		System.out.printf("\nAltura média: %.2f", media);
		System.out.printf("\nMenor que 16: %.2f%%", menores );
		System.out.println();
		
		for(int i= 0; i<numeroD; i ++) {
			if(age[i]< 16) {
				System.out.println(name[i]);
			}
		}
		
	}
	
}
