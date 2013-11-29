import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/*
 * http://projecteuler.net/problem=29
 */
public class prob29 {
	public static void main(String[] args) {
		Set<BigInteger> list = new HashSet<BigInteger>();
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= 100; j++) {
				list.add(BigInteger.valueOf(i).pow(j));
			}
		}
		System.out.println(list.size());
	}

}
