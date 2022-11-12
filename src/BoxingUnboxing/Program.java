package BoxingUnboxing;

public class Program {

	public static void main(String[] args) {

		//conversão de tipo valor para tipo referência boxing
		int x = 20;
		//Object obj = x;
		Integer obj = x;
		
		System.out.println(obj);
		
		/*conversão de tipo referência para tipo valor unboxing
		 É preciso fazer casting para não dá erro
		
		 --> desse jeito dá erro: 
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
