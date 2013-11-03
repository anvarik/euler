/*
 * http://projecteuler.net/problem=7
 */
public class prob7 {

	public static void main(String[] args) {
		int counter=0;
		int itr = 1;
		while(counter <10001){
			itr++;
			if(isPrime(itr))
				counter++;
		}
		System.out.println(itr);
	}

	static boolean isPrime(long n) {
		if(n==2) return true;
		else if (n%2==0) return false;
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}
