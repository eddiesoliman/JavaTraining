package Lab3;

public class NoSpecialException extends Exception {
		
	public NoSpecialException(String password) {
		System.out.println("Error: no special character in password: " + password);
	}
}
