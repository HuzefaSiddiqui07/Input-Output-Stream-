// Write the file using File Writer class

package com.inputoutputstream;

import java.io.FileWriter;

public class FileWriter01 {

	public static void main(String[] args) {
		
		// Try & Catch
		try {
			FileWriter fileWriter = new FileWriter("C:\\Users\\Stars\\Desktop\\JavaWorkSpace\\Java.txt");
			fileWriter.write("Stream\r\n" + 
					"A stream is a sequence of data. In Java, a stream is composed of bytes. \r\n" + 
					"In Java, 3 streams are created for us automatically. All these streams are attached with the console.\r\n" + 
					"1) System.out: This is the standard output stream that is used to produce the result of a program on an output device like the computer screen.\r\n" + 
					"2) System.in: This is the standard input stream that is used to read characters from the keyboard or any other standard input device.\r\n" + 
					"3) System.err: This is the standard error stream that is used to output all the error data that a program might throw, on a computer screen or any standard output device.Let's see the code to print output and an error message to the console.\r\n" + 
					"");
			fileWriter.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Sucess...!!!");

	}

}
