package ComandosBasicosJava;

public class Main {

	public static void main(String[] args) {
	
		String product  = "Computer";
		String product2 = "Office desk";
		
		int age     = 30;
		int code    = 5290;
		char gender = 'F';
		
		double price   = 2100.0;
		double price2  = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f", product, price);
		System.out.printf("\n%s, which price is $ %.2f", product2, price2);
		System.out.printf("\n\n%d years old, code %d, and gender %s", age, code, gender);
		System.out.printf("\n\nMeasure with eight decimal places: %f "
				+ "\nRouded (three decimal place): %.3f "
				+ "\nUS decimal point: %.3f)", measure, measure, measure);
		
	}
}
