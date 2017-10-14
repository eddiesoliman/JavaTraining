package basics;

public class NumbersCalc {
	
	public static void main(String[] args) {
		
		System.out.println("Program is starting");
		printName();
		
		int numA = 10;
		int numB = 20;
		addNumbers(numA,numB);
		System.out.println("The product of A & B is " + multiplyNumbers(numA, numB));
	}
	
	static void printName() {
		System.out.println("My name is Eddie");
	}
	
	static void addNumbers(int numberA, int numberB) {
		int sum = numberA + numberB;
		System.out.println("The sum of A and B is " + sum);
	}
	
	static int multiplyNumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		return  product;
		
	}

}
