package oop;

public class BankAccount implements IRate {
	String accountNumber;
	static final String routingNumber = "5678";
	String name;
	String ssn;
	String type;
	double balance;
	
	BankAccount() {
	
		System.out.println("New Bank account created - no info!");
	}



	BankAccount(String aNumber, String aName, String aSsn, String aType) {
		accountNumber = aNumber;
		name = aName;
		ssn = aSsn;
		type = aType;
		balance = 0;
		System.out.println("Bank account created for " + name);

	}
	
	BankAccount(String aNumber, String aName, String aSsn, String aType, double initialBalance) {
		accountNumber = aNumber;
		name = aName;
		ssn = aSsn;
		type = aType;
		balance = initialBalance;
		
		System.out.println("Bank account created for " + name + " with balance: " + balance);

	}
	
	void deposit() {
		
	}
	
	void withdraw() {
		
	}
	
	void checkBalance() {
		
	}
	
	void getStatus() {
		
	}
	
	public String toString() {
		return "toString Override!!!!";
	}


	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void increateRate() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void decreaseRate() {
		// TODO Auto-generated method stub
		
	}

}
