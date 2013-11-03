package euler;
/*
 * http://projecteuler.net/problem=12
 */
public class prob12 {

	public static void main(String[] args) {
		double start = System.currentTimeMillis();
		int divs = 0;
		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			long tri = triangular(i);
			if (numOfDivs(tri) > 500) {
				System.out.println(tri);
				break;
			}
		}
		System.out.println("Time spent: " + (System.currentTimeMillis()-start) + " ms.");
	}

	static long triangular(int n) {
		long sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	static int numOfDivs(long n) {

		int counter = 0;
		for (long i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				counter++;
			}
		}

		return 2 * counter;
	}

}
