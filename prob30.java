/*
 * http://projecteuler.net/problem=30
 */
public class prob30 {
	public static void main(String[] args) {
		long result = 0;
		for (int i = 10; i < 2000000; i++) {
			int tot = 0;
			String str = String.valueOf(i);
			for (int j = 0; j < str.length(); j++) {
				int n = Character.getNumericValue(str.charAt(j));
				tot += Math.pow(n, 5);
			}
			if (tot == i)
				result += i;
		}
		System.out.println(result);
	}
}
