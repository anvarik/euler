package euler;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * http://projecteuler.net/problem=18
 */
public class prob18 {

	public static void main(String[] args) throws IOException {
		double start = System.currentTimeMillis();
		int[][] arr = arrayCreator();
		int size = arr[0].length;

		for (int y = size - 1; y > 0; y--) {
			for (int x = 0; x < size - 1; x++) {

				int left = arr[y][x];
				int right = arr[y][x + 1];
				arr[y - 1][x] += Math.max(left, right);

			}
		}

		System.out.println(arr[0][0]);
		System.out.println("Time spent: " + (System.currentTimeMillis()-start) + " ms.");
	}

	static int[][] arrayCreator() throws IOException {

		File file = new File("prob18.txt");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			System.out.println("Cannot read the file: " + e);
		}

		String line = "";
		ArrayList<String> lines = new ArrayList<String>();
		while ((line = br.readLine()) != null) {
			lines.add(line);
		}
		int size = lines.size();
		int[][] arr = new int[size][size];
		int counter = 0;
		for (String s : lines) {
			String[] pieces = s.split(" ");
			for (int i = 0; i < pieces.length; i++) {
				arr[counter][i] = Integer.valueOf(pieces[i]);
			}
			counter++;
		}
		return arr;
	}

}
