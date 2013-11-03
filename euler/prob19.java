package euler;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/*
 * http://projecteuler.net/problem=19
 */
public class prob19 {

	public static void main(String[] args) {
		Calendar start = new GregorianCalendar(1901, 00, 06);
		Calendar end = new GregorianCalendar(2000, 11, 31);

		int counter = 0;
		for (Date date = start.getTime(); !start.after(end); start.add(
				Calendar.DATE, 7), date = start.getTime()) {
			if (start.get(Calendar.DAY_OF_WEEK) == 1
					&& start.get(Calendar.DAY_OF_MONTH) == 1) {
				counter++;
			}
		}

		System.out.println(counter);

	}

}
