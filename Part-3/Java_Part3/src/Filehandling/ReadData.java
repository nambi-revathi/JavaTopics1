package Filehandling;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadData
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fin=new FileInputStream("c:\\programs\\example.txt");
			try 
			{
				int ch=fin.read();
				while(ch!=-1)
				{
					System.out.println(ch);
					ch=fin.read();
				}
			}
			catch(IOException e)
			{
				System.out.println("Exception handled");
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not existing!!!");
		}	

	}

}
