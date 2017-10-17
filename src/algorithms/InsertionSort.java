package algorithms;

public class InsertionSort {

	public static void main(String[] args) {

		int[] numbers = {1, 33, 85, 99, 12, 3456, 0, 123, 57, 2, 234, 77, 23};
		
		
		for (int i = 1; i < numbers.length; i++) {
			for (int j = i; j > 0; j--) {
				if (numbers[j] < numbers[j-1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j-1];
					numbers[j-1] = temp;
				}
			}
		}
		
		for (int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println();

	}

}
