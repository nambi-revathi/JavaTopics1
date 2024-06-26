package Filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class WriteData {

	public static void main(String[] args) throws FileNotFoundException
	{
		FileOutputStream fos=new FileOutputStream("c:\\programs\\example1.txt");
		PrintWriter pw=new PrintWriter(fos);
		pw.println("An exception is something that is left out or not done on purpose");
		pw.flush();
		System.out.println("data written");
		

	}

}
