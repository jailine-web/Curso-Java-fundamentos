package ExerciciosVetor;

import java.util.Scanner;

public class DadosPessoais {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantidade? ");
		int n = ler.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for(int i = 0; i<n; i++) {
			
			System.out.printf("Digite a altura da %d° pessoa: ", (i+1));
			altura[i] = ler.nextDouble();
			System.out.printf("Digite o genero da %d° pessoa: ", (i+1));
			genero[i] = ler.next().charAt(0);
			
		}
		double maiorA = 0, menorA = altura[0], mediaAlturaM = 0;
		
		for(int i = 0; i<n; i++) {
			
			if(altura[i]<menorA) {
				menorA = altura[i];
			}else if (altura[i]> maiorA) {
				maiorA = altura[i];
			}
		}
		
		System.out.print("\nMenor altura: "+ menorA);
		System.out.print("\nMaior altura: "+ maiorA);
		
		double contM = 0, soma = 0;
		int contH = 0;
		for(int i = 0; i<n; i++) {
			if(genero[i] == 'f') {
						contM ++;
				soma += altura[i];
			}
			else {
				 
				contH ++;
			}
		}
		mediaAlturaM = soma/contM;
		System.out.print("\nMédia da altura das mulheres: %.2f" + mediaAlturaM);
		System.out.print("\nQuantidade de homens: " + contH);
	}

}
