package ExercicioLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		List<Funcionarios> funcionarios = new ArrayList<>();
		
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("\nQuantos funcionários deseja digitar? ");
		int n = ler.nextInt();
		
		for(int i = 0; i<n; i++) {
			
			System.out.printf("\nFuncionário #%d", (i +1));
			System.out.print("\nId: ");
			Integer identificador = ler.nextInt();
			
			while(idExistente(funcionarios, identificador)) {
				System.out.print("Id já existe, tente novamente: ");
				identificador = ler.nextInt();
				
			}
			
			System.out.print("Nome: ");
			ler.nextLine();
			String nome = ler.nextLine();
			System.out.print("Salário: ");
			Double sal = ler.nextDouble();
			
			Funcionarios fun  = new Funcionarios(identificador, nome, sal);
			
			funcionarios.add(fun);
			
		}
		
		System.out.println();
		System.out.print("Qual o id do funcionário? ");
		int idS = ler.nextInt();
		Integer posicao = posicaoId(funcionarios, idS);
		if(posicao == null) {
			System.out.println("Este id não corresponde a nenhum funcionário");
		}
		else {
			System.out.print("Entre com o valor do acréscimo: ");
			double porcentagem = ler.nextDouble();
			funcionarios.get(posicao).incrementaSalario(porcentagem);
		}
		
		System.out.println();
		
		System.out.println("Funcionários: ");
		
		/* 1° forma de exibir os itens da lista
		 * for(int i = 1; i<n; i++) {
			System.out.println(funcionarios);
		}*/
		
		for(Funcionarios f : funcionarios) {
			System.out.println(f);
		}
		
		ler.close();
	}
	
	public static Integer posicaoId(List<Funcionarios> func, int id) {
		
		for(int i = 0; i<func.size(); i++) {
			if(func.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	public static boolean idExistente(List<Funcionarios> list, int id) {
		Funcionarios fu = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return fu != null;
	}
}
