package datastructures;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCSV {

	public static void main(String[] args) {

		ArrayList<String[]> data = new ArrayList<String[]>();
		String filename = "/Users/eddie/Desktop/userPass.csv";
		String testRow;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			while ((testRow = br.readLine()) != null) {
				String[] line = testRow.split(",");
				data.add(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (String[] account : data) {
			for (String field : account) {
				System.out.print(field + " ");
			}
			System.out.println();
		}
	}

}
