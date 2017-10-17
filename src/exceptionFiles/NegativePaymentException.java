package exceptionFiles;

public class NegativePaymentException extends Exception {
	
	double payment;
	
	public NegativePaymentException(double payment) {
		System.out.println("Error: negative payment");
		this.payment = payment;
	}
	
	@Override
	public String toString() {
		return "ERROR: can't enter negative number " + payment;
	}

}
