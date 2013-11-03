package euler;
/*
 * http://projecteuler.net/problem=4
 */
public class prob4 {

	public static void main(String[] args) {

		for (int i = 9; i >= 0; i--) {
			for (int j = 9; j >= 0; j--) {
				String s = "9" + i + j + j + i + "9";
				long palyndrome = Long.valueOf(s);
				if (isDivisible(palyndrome)) 
					System.out.println(palyndrome);
			}
		}
	}
	
	public static boolean isDivisible(long num) {
		for (int i = 999; i > 99; i--) {
			if (num % i == 0 && Long.toString(num / i).length() == 3) {
				return true;
			}
		}
		return false;
	}

}
