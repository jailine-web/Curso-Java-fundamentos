package ContaBancaria;

import java.util.Scanner;

public class Conta {

	private int numeroConta;
	private String nome;
	private char resp;
	private double valorInicial;
	
	Scanner ler = new Scanner(System.in);
	
	public Conta(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		
	}
	
	/*public Conta(int numeroConta, String nome, double valorInicial) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.valorInicial = valorInicial;
		
	}*/

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorInicial() {
		return valorInicial;
	}
	
	public double deposito() {
		
		System.out.println("Deseja efetuar um deposito inicial? ");
		resp = ler.next().charAt(0);
		if(resp=='s') {
			System.out.println("Digite o valor inicial a ser depositado: ");
			valorInicial = ler.nextDouble();
			}
		
		return valorInicial;
	}
	
	public double depositar(double valor) {
		return valorInicial += valor;
	}
	public double saque(double valor) {
		return valorInicial -= valor + 5 ;
	}
	
	public String toString() {
		return "\nNúmero da conta: " + numeroConta
				+ "\nCorrentista: "+ nome;
	}
}
