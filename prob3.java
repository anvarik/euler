package euler;
/*
 * http://projecteuler.net/problem=3
 */
public class prob3 {
	public static void main(String[] args) {
		largestPrimeSmart(100);
	}
	
	public static void largestPrimeSmart(long n){
		int i;
		for(i=2; i<=n; i++) {
			if(n%i==0){
				n /= i;
				i--;
			}
		}
		System.out.println(i);
	}

//	public static void largestPrime(long n) {
//		for (long i = Math.round(n / 2) - 1; i > 2; i--) {
//			if (n % i == 0 && isPrime(i)){
//				System.out.println("number: " + i);
//				break;
//			}
//		}
//	}
//
//	static boolean isPrime(long n) {
//		if (n % 2 == 0)
//			return false;
//		for (int i = 3; i * i <= n; i += 2) {
//			if (n % i == 0)
//				return false;
//		}
//		return true;
//	}
}
