package euler;
/*
 * http://projecteuler.net/problem=6
 */
public class prob6 {

	public static void main(String[] args) {
		long sqrsum = 0;
		long sumsqr = (long) Math.pow(5050, 2);
		for(int i = 1; i<101; i++){
			sqrsum += Math.pow(i, 2);
		}
		System.out.println(sumsqr - sqrsum);
	}
}
