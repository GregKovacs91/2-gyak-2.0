
public class Piertek {

	public static void main(String[] args) {
		//Wallis formula sz�m�t�s
		double pi = 1;
		double darab = 1000;
		
		for (double i = 1; i<= darab; i++){
			pi *= 2 *i / (2 * i - 1);
			pi *= 2 *i / (2 * i + 1);
			
		}
		
		System.out.println("Wallis formula: ");
		System.out.println("pi/2 �rt�ke: "+ pi);
		System.out.println("pi: " + pi *2);
		
		
	}

}
