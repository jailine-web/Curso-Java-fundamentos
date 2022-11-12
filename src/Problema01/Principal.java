package Problema01;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		Produto produto1 = new Produto();
		
		System.out.print("Digite os dados do produto\n");
		System.out.print("Nome: ");
		produto1.nome = ler.next();
		System.out.print("Preço: ");
		produto1.preco = ler.nextDouble();
		System.out.print("Quantidade: ");
		produto1.qtd = ler.nextInt();
		
		System.out.println("Nome " + produto1.nome + ", " + produto1.preco + ", "+produto1.qtd);
		ler.close();
		
	}
}
