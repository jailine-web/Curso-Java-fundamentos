package Composicao;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import Enum.NivelFuncionario;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner ler = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Digite o nome do departamento: ");
		String dep = ler.nextLine();
		
		System.out.println("Entre com os dados do funcionario: ");
		
		System.out.print("Nome: ");
		
		String nomeFuncionario = ler.nextLine();
		System.out.print("Nível: ");
		String nivel = ler.nextLine();
		System.out.print("Salário base: ");
		double sb = ler.nextDouble();
		Funcionario funcionario = new Funcionario(nomeFuncionario, NivelFuncionario.valueOf(nivel), sb, new Departamento(dep));
		
		System.out.print("Quantos contratos esse funcionário terá? ");
		int n = ler.nextInt();
		
		for(int i=1; i< n; i++) {
			System.out.println("Digite a data do " +i+ "° contrato: ");
			System.out.println("Data no formato (DD/MM/YYYY)");
			java.util.Date dataContrato = sdf.parse(ler.next());
			System.out.println("Valor hora: ");
			double valorHo = ler.nextDouble();
			System.out.println("Duração em horas: ");
			int horas = ler.nextInt();
			Contrato contrato = new Contrato((Date) dataContrato, valorHo, horas);
			funcionario.addContract(contrato);
		
		}
		
		System.out.println("Entre com o mes e ano para calcular o salário: ");
		String mesEano = ler.next();
		int mes = Integer.parseInt(mesEano.substring(0, 2));
		int ano = Integer.parseInt(mesEano.substring(3));
		System.out.println("Nome: "+ funcionario.getNome());
		System.out.println("Departamento: "+funcionario.getDepartamento());
		System.out.println("Calculo do salario "+ mesEano +": "+ String.format("%.2f", funcionario.income(ano, mes)));
		
		
		ler.close();
		
	}

}
