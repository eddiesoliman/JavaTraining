package Lab3;

public class NoLetterException extends Exception {
		
	public NoLetterException(String password) {
			System.out.println("Error: no letter in password: " + password);
	}
}
