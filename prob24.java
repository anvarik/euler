import java.util.Collections;
import java.util.LinkedList;

/*
 * http://projecteuler.net/problem=24
 */
public class prob24 {

	private static LinkedList<Long> arr = new LinkedList<Long>();

	public static void main(String[] args) {
		permutation("1234567890");
		Collections.sort(arr);
		System.out.println(arr.get(999999));
	}

	public static void permutation(String str) {
		permutation("", str);
	}

	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			arr.add(Long.valueOf(prefix));
		else {
			for (int i = 0; i < n; i++) {
				String passed = str.substring(0, i) + str.substring(i + 1, n);
				permutation(prefix + str.charAt(i), passed);
			}
		}
	}
}
