package ComandosBasicosJava;

import java.util.Scanner;

public class SalarioFuncionario {

	public static void main(String[] args) {
		
		int numeroFuncionario;
		double horasTrabalhadas;
		double valorHora;
		double salario = 0;
		
		Scanner ler = new Scanner(System.in);
		
		numeroFuncionario = ler.nextInt();
		horasTrabalhadas  = ler.nextDouble();
		valorHora 		  = ler.nextDouble();
		salario	= valorHora * horasTrabalhadas;
		
		System.out.printf("%d \nU$ %.2f", numeroFuncionario, salario);
	}
}
