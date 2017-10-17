package Lab3;
	
public class NoNumberException extends Exception {
		
	public NoNumberException(String password) {
		System.out.println("Error: no number in password: " + password);
	}
}
