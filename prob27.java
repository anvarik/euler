import java.util.ArrayList;

/*
 * http://projecteuler.net/problem=26
 */
public class prob27 {

	private static ArrayList<Integer> primes = new ArrayList<Integer>();

	public static void main(String[] args) {
		 poly();
	}
	
	private static void poly(){
		findPrimesUnder1000();
		int maxCount = 0;
		int bigA = 0;
		int bigB = 0;
		for(int a = -999; a<1000; a++){
			for(int b : primes){
				int count = 0;
				for (int n=0; n<1000; n++){
					int num = n*n + a*n + b;
					if(num>0 && isPrime(num))
						count++;
					else 
						break;
				}
				if(count > maxCount){
					maxCount = count;
					bigA = a;
					bigB = b;
					System.out.println("max: " + maxCount + " a: " + bigA + " b: " + bigB + "mult : " + bigA*bigB);
				}
					
			}
		}
	}

	private static void findPrimesUnder1000() {
		for (int i = 3; i < 1000; i++) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}
	}

	private static boolean isPrime(int num) {
		if (num == 2)
			return true;
		else if (num % 2 == 0)
			return false;
		else {
			for (int i = 3; i * i < num; i += 2) {
				if (num % i == 0)
					return false;
			}
			return true;
		}
	}

}
