package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount("123", "Ed", "098765432", "Checking");
		BankAccount acc2 = new BankAccount();
		BankAccount acc3 = new BankAccount("123", "Homer", "098765432", "Checking", (float) 3748.87);

	
		System.out.println(acc1.toString());
		
		CDAccount cd1 = new CDAccount();
		
		cd1.balance = 3243243.33;
		cd1.compound();

	}

}
