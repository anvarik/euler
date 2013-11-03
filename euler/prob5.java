package euler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/*
 * http://projecteuler.net/problem=5
 */
public class prob5 {

	public static void main(String[] args) {

		HashMap<Integer, Integer> total = dividers(20);

		for (Integer num : total.keySet()) {
			System.out.println(num + " : " + total.get(num));
		}

		long tot = 1;
		for (Integer num : total.keySet()) {
			tot *= Math.pow(num, total.get(num));
		}
		System.out.println(tot);
	}

	static HashMap<Integer, Integer> findPrimeFactors(int n) {
		HashMap<Integer, Integer> primeFactors = new HashMap<Integer, Integer>();
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				if (primeFactors.containsKey(i)) {
					int num = primeFactors.get(i);
					num++;
					primeFactors.put(i, num);
				} else {
					primeFactors.put(i, 1);
				}
				n /= i;
				i--;
			}
		}
		return primeFactors;
	}

	static HashMap<Integer, Integer> dividers(int n) {
		HashMap<Integer, Integer> primesTot = new HashMap<Integer, Integer>();
		for (int i = n; i * i > n; i--) {
			HashMap<Integer, Integer> primeFactors = findPrimeFactors(i);
			for (Integer num : primeFactors.keySet()) {
				int valSingle = primeFactors.get(num);
				if (primesTot.containsKey(num)) {
					int valTot = primesTot.get(num);
					if (valTot < valSingle) {
						primesTot.put(num, valSingle);
					}
				} else {
					primesTot.put(num, valSingle);
				}
			}
		}
		return primesTot;
	}

}
