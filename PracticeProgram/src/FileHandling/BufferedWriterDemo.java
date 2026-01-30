package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileWriter f=new FileWriter("C:\\Users\\AKAKASH\\OneDrive\\Desktop\\fileHandling.txt");

			BufferedWriter bw= new BufferedWriter(f);
			try {
				bw.write("This is java");
				bw.newLine();
				bw.write("File Handling is easy...");
			} 
			finally
			{
				bw.close();
			}
			System.out.println("Success");

		} 
		catch (IOException i)
		{
			System.out.println(i);
		}
	}

}
