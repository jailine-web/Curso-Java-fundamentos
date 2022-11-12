package VetorComOO;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.print("Qual a quantidade que será digitada? ");
		int qtdLida = ler.nextInt();
		double mediaAltura = 0, menoresDezesseis = 0;
		Pessoa[] p = new Pessoa[qtdLida];
		String[] nomes = new String[qtdLida];
		
		for(int i = 0; i <p.length; i++) {
			ler.nextLine();
			System.out.print("\nDigite o nome: ");
			String nome = ler.next();
			System.out.print("Digita a idade: ");
			int id = ler.nextInt();
			System.out.print("Digita a altura: ");
			double alt = ler.nextDouble();
			p[i] = new Pessoa(nome, id,alt);
			mediaAltura += alt/p.length;
			if(id<16) {
				menoresDezesseis ++;
				nomes[i] = nome;
			}
		
			
		}
		menoresDezesseis = (menoresDezesseis / qtdLida)* 100;
		for(int i = 0; i<p.length; i++) {
			System.out.println(p[i].toString());
			
		}
		
		System.out.println("\nA média das alturas é: " + mediaAltura);
		System.out.printf("A porcentagem de pessoas menores que 16 anos é: %.2f" , menoresDezesseis);
		
		System.out.println("\nMenores de 15: ");
		for(int i = 0; i<p.length; i++) {
			System.out.println(nomes[i]);
			
		}
		
	}

}
