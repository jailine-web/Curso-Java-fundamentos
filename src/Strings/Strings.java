package Strings;

public class Strings {

	public static void main(String[] args) {
		
		String original = "abcxd WSEWDE ABCAS bc DFEFRG  -";
		String minuscula = original.toLowerCase();
		String maiuscula = original.toUpperCase();
		String tiraEspacosIniciaisFinais = original.trim();
		String montarStringAPartir = original.substring(2);
		String recortarNoIntervalo = original.substring(2, 9);
		String trocarValores = original.replace('a', 'x');
		String trocarValoresSub = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original:     --> "+ original);
		System.out.println("Lower case:   --> "+ minuscula);
		System.out.println("Upper case:   --> "+ maiuscula);
		System.out.println("Trim:         --> "+ tiraEspacosIniciaisFinais);
		System.out.println("Substring(2): --> "+ montarStringAPartir);
		System.out.println("Substring(2,9) --> "+ recortarNoIntervalo);
		System.out.println("Replace(a-x): --> "+ trocarValores);
		System.out.println("Replace(substr): --> "+ trocarValoresSub);
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		
		//Split
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		System.out.println("\nMétodo Split");
		System.out.println("\n"+word1);
		System.out.println(word2);
		System.out.println(word3);

	}
}
