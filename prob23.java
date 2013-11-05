import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
 * http://projecteuler.net/problem=23
 */
public class prob23 {

	public static void main(String[] args) {
		notSumOfTwoAbundants();
	}

	static void notSumOfTwoAbundants() {
		ArrayList<Integer> absOut = findAllAbundants();
		ArrayList<Integer> absIn = new ArrayList<Integer>();
		absIn.addAll(absOut);
		Set<Integer> fin = new HashSet<Integer>();
		for (int i : absOut) {
			for (int j : absIn) {
				int locSum = i + j;
				if (locSum <= 28213)
					fin.add(locSum);
			}
			absIn.remove(new Integer(i));
		}
		long sum = 0;
		for(int i = 1; i<=28213; i++){
			if(!fin.contains(i))
				sum+=i;
		}
		System.out.println(sum);
	}

	static ArrayList<Integer> findAllAbundants() {
		ArrayList<Integer> abs = new ArrayList<Integer>();
		for (int i = 1; i < 28123; i++) {
			if (isAbundant(i))
				abs.add(i);
		}
		return abs;
	}

	static boolean isAbundant(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++)
			if (n % i == 0)
				sum += i;
		if (sum > n)
			return true;
		else {
			return false;
		}
	}
}
