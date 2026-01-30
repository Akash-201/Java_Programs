package FileHandling;

import java.io.File;

public class FileInfo 
{
	public static void main(String[] args)
	{
		File f=new File("C:\\Users\\AKAKASH\\OneDrive\\Desktop\\fileHandling.txt");

		if(f.exists())
		{
			System.out.println("File Name "+f.getName());
			System.out.println("File Location "+f.getAbsolutePath());
			System.out.println("File Writeble "+f.canWrite());
			System.out.println("File Readble "+f.canRead());
			System.out.println("File Size "+f.length());
		}
		else
		{
			System.out.println("File Doesn't Exits");
		}
	}

}
