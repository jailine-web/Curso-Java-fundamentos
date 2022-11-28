package salarioFuncionario;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o nome do funcionário: ");
		f1.nome = ler.next();
		System.out.println();
		System.out.print("qual o valor do salário bruto do funcionário: ");
		f1.salarioBruto = ler.nextDouble();
		System.out.println();
		System.out.println("Taxa:");
		f1.taxa = ler.nextDouble();
		
		
		System.out.println("Funcionário: "+ f1.nome +" R$: "
							+ f1.salariosemAcrescimo());

		System.out.print("Digite o valor da taxa de acréscimo: ");
		f1.desconto = ler.nextDouble();
		System.out.println("Salário atualizado: "+ f1.salarioLiquido() );
		
		
	}

}
