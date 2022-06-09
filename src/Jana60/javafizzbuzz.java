package Jana60;

public class javafizzbuzz {
		public static void main(String[] args) {
			
				//creazione for 
				for (int i = 1; i <= 100; i++) {
					
					//creazione if in comune 3 e 5
					if(i % 3 == 0 && i % 5 == 0) {
					System.out.println("FizzBuzz");
					
					}
					//creazione if se i e divisibile per 3 stampa fizz
					else if(i % 3 == 0) {
					System.out.println("Fizz");
					 }//creazione else if se i e divisibile per 5 stampa fizz
					else if(i % 5 == 0) {
						System.out.println("Buzz");
					}
					//else che mi stampa i numeri rimanenti
					else {
						System.out.println( i );
					}
	
				}
		}
}