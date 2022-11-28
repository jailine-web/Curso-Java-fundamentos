package BoxingUnboxing;

public class Program {

	public static void main(String[] args) {

		//convers�o de tipo valor para tipo refer�ncia boxing
		int x = 20;
		//Object obj = x;
		Integer obj = x;
		
		System.out.println(obj);
		
		/*convers�o de tipo refer�ncia para tipo valor unboxing
		 � preciso fazer casting para n�o d� erro
		
		 --> desse jeito d� erro: 
		 	 int y = obj;
	
		--> jeito certo
			int y = (int) obj;
			System.out.println(y);
		*/
		
		//com wraper sem casting 
		int y = obj;
		System.out.println(y);
		
	}

	//wraper classes dos tipos primitivos
}
