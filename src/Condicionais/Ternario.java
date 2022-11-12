package Condicionais;

public class Ternario {
	
	public static void main(String[] args) {
		
		double desconto;
		double preco= 34.5;
		desconto = (preco < 20) ? preco*0.1: preco*0.05;
		System.out.println(desconto);
	}

}
