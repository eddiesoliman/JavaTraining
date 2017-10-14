package StudenDB;

public class StudentDBApp {

	public static void main(String[] args) {

		StudentDB student1 = new StudentDB("Eddie", "123121234");
		System.out.println(student1.toString());
		
		String[] courses = {"math", "biology", "band"};
		student1.enroll(courses);
		student1.showCourses();
		student1.deposit(200);
		student1.checkBalance();
		student1.pay(50);
		student1.checkBalance();
		student1.setPhone("4083482888");
		student1.setCity("San Jose");
		student1.setState("CA");
		System.out.println(student1.toString());
	}

}
