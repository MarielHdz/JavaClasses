package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFilesWithExceptionHandling {

	
	/*
	 * important packages in java for reading and writing to file.
	 * 
	 * java.io
	 * java.nio
	 * 
	 * more examples in ReadFilesWithExceptionHandling project. 
	 */
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileReader fr = new FileReader("./ReadFilesWithExceptionHandling/Numbers.txt"); //reads a file
		BufferedReader br = new BufferedReader(fr); //reads the contents of a file line by line
	}
}
