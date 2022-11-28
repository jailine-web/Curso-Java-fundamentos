package Construtor;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

			Locale.setDefault(Locale.US);
			Scanner ler = new Scanner(System.in);
			
			
			System.out.print("Digite os dados do produto\n");
			System.out.print("Nome: ");
			String nome = ler.next();
			System.out.print("Preço: ");
			double preco = ler.nextDouble();
			System.out.print("Quantidade: ");
			int qtd = ler.nextInt();
			
			Produto produto1 = new Produto(nome, preco, qtd);
			System.out.println("Nome " + produto1.nome + ", " + produto1.preco + ", "+produto1.qtd);
			//produto1.adicionaProdutos(5);
			//System.out.println(produto1.qtd);
			//produto1.removeProdutos(3);
			//System.out.println(produto1.qtd);
			System.out.println("Total em dinheiro no estoque: " + produto1.totalEmEstoque());
			ler.close();
			
		}
	}