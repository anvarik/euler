package euler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * http://projecteuler.net/problem=22
 */
public class prob22 {

	public static void main(String[] args) {
		File file = new File("names.txt");
		BufferedReader br = null;
		String line = "";
		ArrayList<String> arr = new ArrayList<String>();
		try {
			br = new BufferedReader(new FileReader(file));
			while ((line = br.readLine()) != null) {
				arr.addAll(Arrays.asList(line.split("\",\"|\"")));
			}
		} catch (Exception ex) {
			System.out.println("Nope: " + ex);
		}
		Collections.sort(arr);
		getTotalVal(arr);
	}

	public static void getTotalVal(ArrayList<String> names) {
		long totalSum = 0;
		for (int i = 0; i < names.size(); i++) {
			long localSum = 0;
			for (char c : names.get(i).toCharArray()) {
				localSum += c - 64;
			}
			localSum *= i;
			totalSum += localSum;
		}
		System.out.println(totalSum);
	}

}
