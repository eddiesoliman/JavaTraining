package basics;

public class FibonaciApp {

	public static void main(String[] args) {
		// sum of the 2 previous fibonaci numbers
		// fib(0) = 0
		// fib(1) = 1
		// fib(2) = fib(1) + fib(0) = 1
		// fib(3) = fib(2) + fib(1) = 1 + 1 = 2
		// fib(4) = fib(3) + fib(2) = 2 + 1 = 3
		
		System.out.println(fib(6));

	}
	
	public static int fib(int n) {
		if (n == 0 ) {
			return 0;
		}
		else if (n == 1 ) {
			return 1;
		}
		
		return (fib(n-1) + fib(n-2));
	}
}
