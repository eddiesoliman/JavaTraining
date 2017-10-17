package algorithms;

public class Demo {

	public static void main(String[] args) {

		int[] numbers = {1, 3, 5, 9, 12, 15, 23, 25, 30, 32, 45, 48, 53, 58, 80, 93, 112, 222 };
		
		System.out.println("index: " + search(numbers, 26));
	}
	
	static int search(int[] numbers, int target) {
		return binarySearch(numbers, target, 0, numbers.length - 1);
	}
	
	static int binarySearch(int[] numbers, int target, int start, int end) {
		
		if (start == end) {
			if (numbers[start] == target) {
				return start;
			}
			else {
				return -1;
			}
		}
		
		int middle = start + ((end-start)/2);

		if (target > numbers[middle]) {
			return binarySearch(numbers, target, middle+1, end);
		}
		else if (target < numbers[middle]) {
			return binarySearch(numbers, target, start, middle-1);
		}
		else {
			return middle;
		}
	}
}
