package basics;

public class FactorialApp {
	public static void main(String[] args) {
		
	float[] floats = { 1, 2, 3, 4, 5, 6 };

	
	System.out.println("Sum: " + sum(5));
	System.out.println("Fact: " + factorial(4));
	System.out.println("min: " + min(floats));
	System.out.println("average: " + average(floats));
	System.out.println("max: " + max(floats));

	}	
	
	public static int sum(int n ) {
		
		int total = 0;
		for (int i = 1; i <= n; i++ ) {
			total += i;
		}
		return total;
	}
	
	public static int factorial(int n) {
		
		if (n == 1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}

	public static float min(float[] nums) {
		float min = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		
		return min;
	}
	
	public static float average(float[] nums) {
		int total = 0;
		for (int i = 0; i < nums.length; i++) {
			total += nums[i];
		}
		return total/nums.length;
	}
	
	public static float max(float[] nums) {
		float max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		
		return max;
	}
}
