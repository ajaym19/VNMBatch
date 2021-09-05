package FileHandlingDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		//readFile();
		writeFile();
		
	}
	
	public static void readFile() throws IOException {
		String filePath = "./src/FileHandlingDemo/TestData";
		FileReader reader = new FileReader(filePath);
		//System.out.println((char)reader.read());
		int i =0;
		while ((i = reader.read()) != -1) {
			System.out.print((char)i);
		}
		reader.close();
	}
	
	public static void writeFile() throws IOException {
		String filePath = "./src/FileHandlingDemo/TestData";
		FileWriter writer = new FileWriter(filePath);
		writer.write("Jyothi");
		writer.close();
		System.out.println("Completed writing to a file");
	}
}
