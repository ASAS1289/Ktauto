package Selenium;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataDrivenByCSV {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis= new FileInputStream("C:\\Users\\advit\\Desktop\\Ktraining\\sushma\\reader.txt");
		//@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new InputStreamReader(fis)); 
		String value = br.readLine();
		System.out.println("" + value);
	}

}
