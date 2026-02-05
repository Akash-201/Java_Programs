package FileHandling;

import java.io.File;

public class ReNameFileDemo 
{
	public static void main(String[] args) {
		File f= new File("C:\\Users\\AKAKASH\\OneDrive\\Desktop\\fileHandling.txt");
		File r= new File("C:\\Users\\AKAKASH\\OneDrive\\Desktop\\FileHandling.txt");

		if(f.exists())
		{
			System.out.println(f.renameTo(r));
		}
		else
		{
			System.out.println("File Doesn't Exits...");
		}
	}

}
