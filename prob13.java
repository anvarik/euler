import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * http://projecteuler.net/problem=13
 */
public class prob13 {

	public static void main(String[] args) throws IOException {

		File file = new File("prob13.txt");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		long sum = 0;
		String line = "";
		while ((line = br.readLine()) != null) {
			sum += Long.valueOf(line.substring(0, 15));
		}
		
		System.out.println(String.valueOf(sum).substring(0, 10));

	}

}
