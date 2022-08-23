package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Testvariables {
	public static void main(String[] args) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\ragha\\Study\\TestAutomation\\GlobalEnvVariables\\src\\data.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos = new FileOutputStream("C:\\Users\\ragha\\Study\\TestAutomation\\GlobalEnvVariables\\src\\data.properties");
		
		prop.store(fos, null);
		//System.out.println("Hi I am from INDIA and updated the code");
		System.out.println("Hi I am from USA and updated the code on top code from India");
		
		
	}
}
