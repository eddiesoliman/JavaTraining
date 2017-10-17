 package Lab4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;

public class CreditCard {

	public static void main(String[] args) {

		ArrayList<String[]> data = new ArrayList<String[]>();
		String filename = "/Users/eddie/Desktop/creditCardStatement.csv";
		String transaction;
		Double balance = 0.00;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			while ((transaction = br.readLine()) != null) {
				String[] transactionInfo = transaction.split(",");
				data.add(transactionInfo);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (String[] transactionInfo : data) {
			String date = transactionInfo[0];
			String action = transactionInfo[1];
			String company = transactionInfo[2];
			double amount = Double.parseDouble(transactionInfo[3]);
			
			switch (action) {
			case "CREDIT":
			case "FEE":
				balance += amount;
				break;
			case "DEBIT":
				balance -= amount;
				break;
			default:
				System.out.println("Unsupported transaction: " + date + " " + action + " " + company + " " + amount );
			}
		}
		
		if (balance > 0) {
			double charge = balance * .1;
			balance += charge;
			System.out.println("A 10% charge of $" + charge + " has been added to your account. New balance: $" + (Math.round(balance*100)/100));
		}
		else if (balance == 0) {
			System.out.println("Thankyou for you payment! You have a balance of $0");
		}
		else {
			System.out.println("Thankyou for you payment! You have a credit of $" + (Math.round((0-balance)*100)/100));
		}
	}
}
