package ExerciciosVetor;

import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int n = ler.nextInt();
		
		String[] nomes = new String[n];
		double[] primeiroBimestre = new double[n];
		double[] segundoBimestre  = new double[n];
		
		for(int i = 0; i<n; i++) {
			System.out.print("\nDigite o nome do aluno: ");
			nomes[i] = ler.next();
			System.out.print("Nota 1: ");
			primeiroBimestre[i] = ler.nextDouble();
			System.out.println("Nota 2: ");
			segundoBimestre[i] = ler.nextDouble(); 
			
		}
		
		System.out.println("\nAlunos aprovados:");
		
		for(int i = 0; i<n; i++) {
			if((primeiroBimestre[i] + segundoBimestre[i])/2 >=6) {
				System.out.println(nomes[i]);
			}
			
		}
		
		
	}

}
