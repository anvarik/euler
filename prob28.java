/*
 * http://projecteuler.net/problem=28
 */
public class prob28 {

	public static void main(String[] args) {
		long squareSum = 0;
		long con = 1;
		for (long i = 0; i <= 500; i++) {
			squareSum += Math.pow(con,2);
			if(i!=0){
				long temp1 = (long) Math.pow(con,2);
				long temp2 = 2*i;
				squareSum += temp1 - temp2;
				squareSum += temp1 - 2*temp2;
				squareSum += temp1 - 3*temp2;
			}
			con += 2;
		}
		System.out.println(squareSum);
	}

}
