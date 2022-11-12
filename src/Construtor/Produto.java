package Construtor;
/*Sobrecarga: Dispoponibilizar mais de uma vers�o da mesma opera��o
 * contendo diferen�a apenas na lista de par�metros
 * 
 */

public class Produto {

	public String nome;
	public double preco;
	public int qtd;
	
	public Produto(String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	//Construtor padr�o nesse caso tbm � sobrecarga 
	public Produto() {
		
	}
	
	//Sobrecarga
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	
	public double totalEmEstoque() {
		return preco * qtd;
	}
	
	public void adicionaProdutos(int qtd) {
		this.qtd += qtd; //Por causa da ambiguidade dos nomes do atributo e do paramentro do m�todo 
						// utiliza-se a palavra reservada "this" que se refere ao atributo da classe.
	}
	
	
	public void removeProdutos(int valor) {
		this.qtd -= valor;
	}
	
}
