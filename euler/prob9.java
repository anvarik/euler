package euler;
/*
 * http://projecteuler.net/problem=9
 */
public class prob9 {

	public static void main(String[] args) {

		for (int i = 1; i < 1000; i++) {
			for (int j = 1; j < 1000; j++) {
				double k = Math.sqrt(i * i + j * j);
				if (i + j + k == 1000) {
					long m = (long) (i*k*j);
					System.out.println("Multiplication: " + m );
				}
			}
		}
	}
}
