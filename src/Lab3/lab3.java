package Lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class lab3 {

	public static void main(String[] args) {

		String filename = "/Users/eddie/Desktop/passwordFile.txt";
				
		File file = new File(filename);	
		BufferedReader br = null;
		String[] passwords = new String[13];
		
		try {
			br = new BufferedReader(new FileReader(filename));
			for (int i = 0; i < 13; i++) {
				passwords[i] = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.print("ERROR: File not found: " + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.print("ERROR: Cant' read data: " + filename);
			e.printStackTrace();
		} finally {
			System.out.println("Finished reading file");
		}
		
		for (String word : passwords ) {
			boolean passwordNumeric = false;
			boolean passwordLetter = false;
			boolean passwordSpecial = false;
			
			for (int i = 0; i < word.length(); i++) {
				
				char c = word.charAt(i);

				// Check if password has a number
				if (Character.isDigit(c)) {
					passwordNumeric = true;
				}
				// Check if password has a letter
				if (Character.isLetter(c)) {
					passwordLetter = true;
				}
					
				// Check if password has a special character
				if ((c == '!') || (c == '@') || (c == '#')) {
					passwordSpecial = true;
				}
			}
				
			try {
				if (passwordNumeric == false) {
					throw new NoNumberException(word);
				}
				if (passwordLetter == false) {
					throw new NoLetterException(word);
				}
				if (passwordSpecial == false) {
					throw new NoSpecialException(word);
				}
			} catch (NoNumberException p) {
			} catch (NoLetterException p) {
			} catch (NoSpecialException p) {
			}
		}
	}
}