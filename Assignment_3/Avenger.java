import java.io.*;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.*;
class Avenger{
	String name;
	void getDetails(){
		FileInputStream fis = new FileInputStream("Data.txt");
		Properties p=new Properties();
		p.load(fis);
		name=p.getProperty("name");
		
		
	}
	void Display(){
		System.out.println(name);
	}
public static void main(String args[]) throws IOException{
	Avenger a=new Avenger();
	a.getDetails();
	a.Display();
			
}
}
		
		
		