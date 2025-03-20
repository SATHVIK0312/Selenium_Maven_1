package exercise2_day3;

import java.io.*;
import java.util.Properties;

public class reading_files {
	
	public static void main(String[] args) throws Exception{
		
		FileInputStream fis = new FileInputStream("D:\\DELOITTE INDIA\\ONLINE_INTERNSHIP\\Selenium_Java_Training\\eclipse-workspace\\seltest2_maven\\Test_data\\config.properties");
		
		// to read and perform other actions
		Properties prop = new Properties();
		
		prop.load(fis);
		
		
		System.out.println("read data from file, sampleApp: " + prop.getProperty("sampleApp"));
		System.out.println("read data from file, username: " + prop.getProperty("username"));
		System.out.println("read data from file, password: " + prop.getProperty("password"));
		
	}
}
