package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		String filename = "/Users/eddie/Desktop/fileToWrite.txt";
		String message = "Data to be put into file";
		
		File file = new File(filename);
		
		FileWriter fw;
		
		try {
			fw = new FileWriter(file);
			fw.write(message);
			fw.close();
		} catch (IOException e) {
			System.out.println("Can't write file: " + filename);
			e.printStackTrace();
		} finally {
			System.out.println("Closing the file writer");
		}
	
	}

}
