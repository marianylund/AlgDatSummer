package assignments;

public class Recursion {
	
	public static int sumOfSquares(int n) {
		if(n == 1) {
			return n;
		}
		return n*n + sumOfSquares(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(sumOfSquares(4));
	}


}
