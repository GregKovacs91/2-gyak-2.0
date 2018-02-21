
public class Piertek {

	public static void main(String[] args) {
		//Wallis formula számítás
		double pi = 1;
		double darab = 1000;
		
		for (double i = 1; i<= darab; i++){
			pi *= 2.0 *i / (2 * i - 1);
			pi *= 2.0 *i / (2 * i + 1);
			
		}
		
		System.out.println("Wallis formula: ");
		System.out.println("pi/2 értéke: "+ pi);
		System.out.println("pi: " + pi *2);
		
		//Leibniz féle sor
		
		pi = 0;
		darab *= 4;
		int elojel = 1;
		for (double i=1; i<=darab; i +=2){
			pi += elojel * 1.0 / i;
			elojel *= elojel * -1;
		}
		System.out.println("Leibniz féle sor: ");
		System.out.println("pi/4 értéke: "+ pi);
		System.out.println("pi: " + pi *4);
		
	}

}
