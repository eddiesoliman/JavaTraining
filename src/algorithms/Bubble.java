package algorithms;

public class Bubble {

	public static void main(String[] args) {
		
		int[] numbers = {1, 33, 85, 99, 12, 123, 57, 2, 234, 77, 23};
		
		for (int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println();

		boolean swapped;
		
		do {
			swapped = false;
			for (int i = 0; i < numbers.length-1; i++) {
				if (numbers[i] > numbers[i+1]) {
					int temp = numbers[i];
					numbers[i] = numbers[i+1];
					numbers[i+1] = temp;
					swapped = true;
				}
			}
		} while (swapped == true);
		
		for (int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

}
