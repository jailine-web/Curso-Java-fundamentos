package Problema01;

public class Produto {
	
	public String nome;
	public double preco;
	public int qtd;
	
	public double totalEmEstoque() {
		return preco * qtd;
	}
	
	public void adicionaProdutos(int qtd) {
		this.qtd += qtd ; //Por causa da ambiguidade dos nomes do atributo e do paramentro do método 
						// utiliza-se a palavra reservada "this" que se refere ao atributo da classe.
	}
	
	
	public void removeProdutos(int valor) {
		this.qtd -= valor;
	}
	

}
