 // Read a file line by line using Scanner class

package com.inputoutputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileReader01 {

	public static void main(String[] args) {
		
		// Try & Catch 
		
		try {
			// the file to be opened for reading  
			FileInputStream fileReader = new FileInputStream ("C:\\Users\\Stars\\Desktop\\JavaWorkSpace\\Java.txt");
			
			// Create Scanner Object
			Scanner scan = new Scanner (fileReader);
			
			//returns true if there is another line to read  
			
			while (scan.hasNextLine()) {
				//returns the line that was skipped  
				System.out.println(scan.nextLine());
			}
			scan.close(); //closes the scanner  
			
		}
		catch (IOException e) {
			
			System.out.println(e);
			
		}

	}

}
