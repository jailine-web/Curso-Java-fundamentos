package ForEach;

public class Main {

	public static void main(String[] args) {

		String[] vetor = new String[] {"Ju", "Anna", "Pietro"};
		
		//Leitura do vetor com for normal
		
		for(int i = 0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		/*Leitura com o for each. Estrutura --> for (Tipo apelido: coleção)
		 * a variavel "valores" equivale ao vetor[i] no for normal
		Definição: Para cada valor/obj contido no vetor "nome do vetor" faça:
		*/
		System.out.println("\n###------- ### ------ ### -------");
		for (String valores: vetor) {
			System.out.println(valores);
		}
	}

}
