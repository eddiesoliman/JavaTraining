package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		
		bookTitle = "Lord of the Rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word: " + wordChoice);
		}

		String browser = "Chrome";
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("Chrome!");
		}
		
		String firstName = "Eddie";
		String lastName = "Soliman";
		String SSN = "123456789";
		
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 1));
		System.out.println(SSN.substring(5, 9));
		
		System.out.println(SSN.length());


	}

}
