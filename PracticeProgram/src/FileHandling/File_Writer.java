package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_Writer
{
	public static void main(String[] args)
	{
		try 
		{
			FileWriter f=new FileWriter("C:\\Users\\AKAKASH\\OneDrive\\Desktop\\fileHandling.txt");

			try {
				f.write("Java is most famous programming language...");
			} 
			finally
			{
				f.close();
			}
			System.out.println("Successfully Data store in file... ");

		} 
		catch (IOException i)
		{
			System.out.println(i);
		}


	}

}
