package ContaBancaria;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Conta conta = new Conta(3435, "jo�o");
		System.out.println(conta + "\n");
		conta.deposito();
		
		System.out.print("Digite o valor de deposito: ");
		double valor = ler.nextDouble();
		conta.depositar(valor);
		System.out.println("Valor do saldo ap�s o dep�sito: R$ " +conta.getValorInicial());
		
		System.out.print("\nDigite o valor de saque:");
		valor = ler.nextDouble();
		conta.saque(valor);
		System.out.println("Valor do saldo ap�s o saque: R$ "+conta.getValorInicial());
				
		
	}
}
