package ForEach;

public class Main {

	public static void main(String[] args) {

		String[] vetor = new String[] {"Ju", "Anna", "Pietro"};
		
		//Leitura do vetor com for normal
		
		for(int i = 0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		/*Leitura com o for each. Estrutura --> for (Tipo apelido: cole��o)
		 * a variavel "valores" equivale ao vetor[i] no for normal
		Defini��o: Para cada valor/obj contido no vetor "nome do vetor" fa�a:
		*/
		System.out.println("\n###------- ### ------ ### -------");
		for (String valores: vetor) {
			System.out.println(valores);
		}
	}

}
