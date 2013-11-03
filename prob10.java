package euler;
/*
 * http://projecteuler.net/problem=10
 */
public class prob10 {

	public static void main(String[] args) {
		long sum = 0;
		for (long i = 2; i < 2000000; i++) {
			if (isPrime(i))
				sum += i;
		}
		System.out.println(sum);
	}

	static boolean isPrime(long n) {
		if (n == 2)
			return true;
		else if (n % 2 == 0)
			return false;
		for (long i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
