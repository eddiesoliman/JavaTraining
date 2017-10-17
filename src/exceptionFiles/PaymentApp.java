package exceptionFiles;

import java.util.Scanner;

public class PaymentApp {

	public static void main(String[] args) {
		double payment = 0;
		boolean positivePayment;
		
		do {
			positivePayment = true;
			System.out.print("Enter the payment amount: ");
			Scanner in = new Scanner(System.in);
	
			try {
				payment = in.nextDouble();
				if (payment < 0) {
					throw new NegativePaymentException(payment);
				} 
			} catch (NegativePaymentException e) {
					System.out.println(e.toString());
					positivePayment = false;
			}
		} while (!positivePayment);
		
		System.out.print("Thanks for payment!!!!!");
	}

}
