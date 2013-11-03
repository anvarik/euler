package euler;
import java.util.ArrayList;

/*
 * http://projecteuler.net/problem=1
 */
public class prob1 {

	public static void main(String[] args) {
		getDivisions(1000);
	}

	public static void getDivisions(int n) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (i % 3 == 0) {
				sum += i;
			} else if (i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("Sum is : " + sum);

	}

}
