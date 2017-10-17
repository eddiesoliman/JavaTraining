package StudenDB;

public class StudentDB {
	private String name;
	private String ssn;
	private String email;
	private static String staticID = "101";
	private String userID;
	private String phone;
	private String city;
	private String state;
	private String[] courses;
	private double balance = 0;
	
	
	StudentDB(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		email = name + "@bestSchool.org";
		userID = genUserID();
		System.out.println("New student DB created for " + name);
	}
	
	private String genUserID() {
		
		int randNum = 1000 + (int) ((Math.random() * 100000) % 8000);
		return staticID  + randNum + ssn.substring(5, 9);
	}

	public void enroll(String[] courses) {
		this.courses = courses;
	}
	
	public void pay(double amount) {
		balance = balance - amount;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void checkBalance() {
		System.out.println("Balance is $" + balance);
	}
	
	public void showCourses() {
		System.out.print("Courses:");
		for (String course : courses)
			System.out.print(" " + course);
		System.out.println();
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "name:" + name + " ssn:" + ssn + " email:" + email + " userID:" + userID + " phone:" + phone + " city:" + city + " state:" + state;
	}
	
}
