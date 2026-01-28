package FileHandling;

import java.io.File;

public class CreateFile
{
	public static void main(String[] args) {
		File f=new File("C:\\Users\\AKAKASH\\OneDrive\\Desktop\\fileHandling.txt");

		try {
			if(f.createNewFile())
			{
				System.out.println("File is created...");
			}
			else
			{
				System.out.println("File already exits...");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
