package mediaAluno;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno:");
		aluno.nome = ler.next();
		System.out.print("Digite a nota 1: ");
		aluno.nota1 = ler.nextDouble();
		System.out.print("Digite 1a nota 2: ");
		aluno.nota2 = ler.nextDouble();
		System.out.print("Digite a nota 3: ");
		aluno.nota3 = ler.nextDouble();
		aluno.resultado();
	}
}
