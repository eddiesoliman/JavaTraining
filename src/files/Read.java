package files;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Read {

	public static void main(String[] args) {
		String filename = "/Users/eddie/Desktop/fileToRead.txt";
		String text = null;
		
		//File file = new File(filename);
		
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(filename));
			text = br.readLine();
			br.close();
		} catch (FileNotFoundException e) {
			System.out.print("ERROR: File not found: " + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.print("ERROR: Cant' read data: " + filename);
			e.printStackTrace();
		} finally {
			System.out.print("Finished reading file");
		}
		
		System.out.println(text);
		

	}

}
