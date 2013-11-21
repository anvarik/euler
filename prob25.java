import java.math.BigInteger;

/*
 * http://projecteuler.net/problem=25
 */
public class prob25 {
	public static void main(String[] args) {
		BigInteger former = BigInteger.ONE;
		BigInteger later = BigInteger.ONE;
		long i = 2;
		while (later.toString().length() < 1000) {
			BigInteger inner = later;
			later = later.add(former);
			former = inner;
			i++;
		}
		System.out.println(i++);
	}
}
