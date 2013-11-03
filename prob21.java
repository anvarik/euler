import java.util.ArrayList;

/*
 * http://projecteuler.net/problem=21
 */
public class prob21 {

	public static void main(String[] args) {
		long sum = 0;
		for (long i = 1; i < 10000; i++) {
			if (isAmic(i))
				sum += i;
		}
		System.out.println(sum);
	}

	static long d(long n) {
		ArrayList<Long> arr = new ArrayList<Long>();
		for (long i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				arr.add(i);
			}
		}
		long sum = 0;
		for (Long l : arr) {
			sum += l;
		}
		return sum;
	}

	static boolean isAmic(long a) {
		long b = d(a);
		if (d(b) == a && a != b)
			return true;
		else
			return false;
	}
}
