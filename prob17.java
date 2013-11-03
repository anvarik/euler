/*
 * http://projecteuler.net/problem=17
 */
public class prob17 {

	public static void main(String[] args) {

		int totalSum = 0;
		for (int i = 1; i < 1000; i++) {
			String s = String.valueOf(i);
			if (s.length() < 3) {
				System.out.println(s + " : two : " + twoDigitCounter(s));
				totalSum += twoDigitCounter(s);
			} else {
				System.out.println(s + " : three : " + threeDigitCounter(s));
				totalSum += threeDigitCounter(s);

			}
		}
		System.out.println(totalSum + 11); // one thousand
	}

	static int threeDigitCounter(String s) {
		String first = s.subSequence(0, 1).toString();
		String second = s.subSequence(1, 3).toString();
		int sum = 0;
		sum += twoDigitCounter(second);

		if (first.equals("1")) { // onehundredand
			if (second.equals("00"))
				sum += 10;
			else
				sum += 13;
		} else if (first.equals("2")) {
			if (second.equals("00"))
				sum += 10;
			else
				sum += 13;
		} else if (first.equals("3")) {
			if (second.equals("00"))
				sum += 12;
			else
				sum += 15;
		} else if (first.equals("4")) {
			if (second.equals("00"))
				sum += 11;
			else
				sum += 14;
		} else if (first.equals("5")) {
			if (second.equals("00"))
				sum += 11;
			else
				sum += 14;
		} else if (first.equals("6")) {
			if (second.equals("00"))
				sum += 10;
			else
				sum += 13;
		} else if (first.equals("7")) {
			if (second.equals("00"))
				sum += 12;
			else
				sum += 15;
		} else if (first.equals("8")) {
			if (second.equals("00"))
				sum += 12;
			else
				sum += 15;
		} else if (first.equals("9")) {
			if (second.equals("00"))
				sum += 11;
			else
				sum += 14;
		}

		return sum;
	}

	static int twoDigitCounter(String s) {

		int num = Integer.valueOf(s);
		int sum = 0;
		if (num < 20) {
			sum = oneDigitCounter(s);
		} else {
			String first = s.subSequence(0, 1).toString();
			String second = s.subSequence(1, 2).toString();
			if (first.equals("2")) // twenty
				sum = sum + 6;
			else if (first.equals("3")) // thirty
				sum = sum + 6;
			else if (first.equals("4")) // forty
				sum = sum + 5;
			else if (first.equals("5")) // fifty
				sum = sum + 5;
			else if (first.equals("6")) // sixty
				sum = sum + 5;
			else if (first.equals("7")) // seventy
				sum = sum + 7;
			else if (first.equals("8")) // eighty
				sum = sum + 6;
			else if (first.equals("9")) // ninety
				sum = sum + 6;
			else
				sum = sum + 0;

			sum += oneDigitCounter(second);
		}
		return sum;
	}

	static int oneDigitCounter(String s) {
		int i = Integer.valueOf(s);
		s = String.valueOf(i);
		if (s.equals("1")) // one
			return 3;
		else if (s.equals("2")) // two
			return 3;
		else if (s.equals("3")) // three
			return 5;
		else if (s.equals("4")) // four
			return 4;
		else if (s.equals("5")) // five
			return 4;
		else if (s.equals("6")) // six
			return 3;
		else if (s.equals("7")) // seven
			return 5;
		else if (s.equals("8")) // eight
			return 5;
		else if (s.equals("9")) // nine
			return 4;
		else if (s.equals("10")) // ten
			return 3;
		else if (s.equals("11")) // eleven
			return 6;
		else if (s.equals("12")) // twelve
			return 6;
		else if (s.equals("13")) // thirteen
			return 8;
		else if (s.equals("14")) // fourteen
			return 8;
		else if (s.equals("15")) // fifteen
			return 7;
		else if (s.equals("16")) // sixteen
			return 7;
		else if (s.equals("17")) // seventeen
			return 9;
		else if (s.equals("18")) // eighteen
			return 8;
		else if (s.equals("19")) // nineteen
			return 8;
		else
			return 0;
	}
}
