import java.math.BigDecimal;

/*
 * http://projecteuler.net/problem=16
 */
public class prob16 {

	public static void main(String[] args) {

		final BigDecimal Power = new BigDecimal(Math.pow(2, 1000));
		String pw = Power.toString();
		char[] chrArray = pw.toCharArray();
		int sum = 0;
		for (int a = 0; a < chrArray.length; a++) {
			sum += Integer.parseInt(String.valueOf(chrArray[a]));
		}
		System.out.println(sum);
	}

}
