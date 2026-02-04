package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileRead 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileReader fr=new FileReader("C:\\Users\\AKAKASH\\OneDrive\\Desktop\\fileHandling.txt");

			try
			{
				int i;
				while((i=fr.read())!=-1)
				{
					System.out.print((char)i);
				}
			}
			finally 
			{

				fr.close();
			}


		} 
		catch (IOException i)
		{
			System.out.println("Exception Handling...");
		}
	}

}
