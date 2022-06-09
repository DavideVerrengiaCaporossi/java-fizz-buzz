package Jana60;

public class javafizzbuzz {
		public static void main(String[] args) {
			
				//creazione for che conti e stampi fino a 100
				for (int i = 1; i <= 100; i++) {
					System.out.println( i );
					//creazione if se i e divisibile per 3 stampa fizz
					if(i % 3 == 0) {
					System.out.println("Fizz");
					 }//creazione else if se i e divisibile per 5 stampa fizz
					else if(i % 5 == 0) {
						System.out.println("FizzBizz");
					}
	
				}
		}
}