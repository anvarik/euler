/*
 * http://projecteuler.net/problem=14
 */
public class prob14 {

	public static void main(String[] args) {
		for (long n = 2; n < 1000000; n++) {
			long collatz = collatzNum(n);
			if (collatz == 525)
				System.out.println(n);
		}
	}

	static long collatzNum(long n) {
		long counter = 1;
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
			counter++;
		}
		return counter;
	}

}
