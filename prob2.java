/*
 * http://projecteuler.net/problem=2
 */
public class prob2 {

	public static void main(String[] args) {
		fib();
	}

	static void fib() {
		long sum = 0;
		long n_1 = 1, n_2 = 1;
		for (long i = 2; i <= Integer.MAX_VALUE; i++) {
			long n_new = n_1 + n_2;
			if (n_new > 4000000)
				break;
			if (n_new % 2 == 0)
				sum += n_new;
			n_1 = n_2;
			n_2 = n_new;
		}
		System.out.println("Sum:" + sum);
	}
}
