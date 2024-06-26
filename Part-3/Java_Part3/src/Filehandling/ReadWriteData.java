package Filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadWriteData 
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr=new FileReader("c:\\programs\\example1.txt");
		BufferedReader br=new BufferedReader(fr);
		
		FileOutputStream fos=new FileOutputStream("c:\\programs\\example2.txt");
		PrintWriter pw=new PrintWriter(fos);
		String str=br.readLine();
		
		while(str!=null)
		{
			pw.println(str);
			str=br.readLine();
		}
		pw.flush();
		System.out.println("Data Written");
		
	}

}
