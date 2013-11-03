import java.util.ArrayList;

/*
 * http://projecteuler.net/problem=15
 */
public class prob15 {
	public static void main(String[] args) {
		ArrayList<Long> in = new ArrayList<Long>();
		in.add((long) 1); in.add((long) 4); in.add((long) 10); in.add((long) 20);
		
		for (int i = 3; i < 20; i++) {
			for (int j = 1; j <= in.size(); j++) {
				if (j == 1)
					in.set(j, in.get(j) + 1);
				else if (j == in.size()) {
					in.add(in.get(j - 1) * 2);
					break;
				} else {
					in.set(j, in.get(j - 1) + in.get(j));
				}
			}
		}
		System.out.println(in);
	}

// recursive too slow
//	static int path(int x, int y) {
//		if (x == 0 && y == 0)
//			return 1;
//		int count = 0;
//
//		if (x > 0)
//			count += path(x - 1, y);
//		if (y > 0)
//			count += path(x, y - 1);
//		return count;
//
//	}

}
