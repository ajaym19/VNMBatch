package FileHandlingDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderDemo {
	static String filePath = "./src/FileHandlingDemo/TestData";
	static String csvFilePath = "./src/FileHandlingDemo/AutomationPractise.csv";
	public static void main(String[] args) throws IOException {
		//readFile();
		readCSVFile(csvFilePath);
		
	}
	
	public static void readFile() throws IOException {
		FileReader reader = new FileReader(filePath);
		BufferedReader br = new BufferedReader(reader);
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		reader.close();
		br.close();
	}
	
	
	public static void writeFile() throws IOException {
		FileWriter writer = new FileWriter(filePath);
		BufferedWriter bw = new BufferedWriter(writer);
	}
	
	public static void readCSVFile(String path) throws IOException {
		FileReader reader = new FileReader(path);
		BufferedReader br = new BufferedReader(reader);
		//System.out.println(br.readLine());
		
		/*
		 * Problems:
		 * 1. We are also reading headers
		 * 2. we are getting name and id together as a data
		 */
		br.readLine(); //to read the headers
		String line;
		while ((line = br.readLine()) != null) {
			String[] words = line.split(",");
			for(String a : words) {
				System.out.println(a);
			}
			
			//string is ajay,neha, jyothi
			//op [ajay, neha, jyothi]
			//Hw: read data from CSV File and store all the username in an ArrayList
			
		}
		
	}
}
