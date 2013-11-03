import java.math.BigInteger;

/*
 * http://projecteuler.net/problem=20
 */
public class prob20 {

	public static void main(String[] args) {
		BigInteger bigtot = BigInteger.ONE;
		for(int i = 2; i<=100;i++){
			bigtot = bigtot.multiply(BigInteger.valueOf(i));
		}
		String s = bigtot.toString();
		int tot = 0;
		for(int i = 0; i<s.length(); i++)
			tot += Integer.valueOf((String) s.subSequence(i, i+1));
		System.out.println(tot);	
	}

}
