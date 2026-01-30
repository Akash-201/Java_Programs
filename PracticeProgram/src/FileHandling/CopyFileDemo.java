package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream r=new FileInputStream("C:\\Users\\AKAKASH\\OneDrive\\Desktop\\FileHandling.txt");
		FileOutputStream w=new FileOutputStream("C:\\Users\\AKAKASH\\OneDrive\\Desktop\\copyFile.txt");

		int i;
		while((i=r.read())!=-1)
		{
			w.write((char)i);
		}
		System.out.println("Data copied successfully...");

	}
}
