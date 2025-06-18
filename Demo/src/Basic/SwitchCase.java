package Basic;

public class SwitchCase
{
	public static void main(String[] args)
	{
		String day="WED";

		switch(day)
		{
		case "MON" :
			System.out.println("It is Monday");	
			break;

		case "TUE" :
			System.out.println("It is Tuesday");
			break;

		case "WED" :
			System.out.println("It is Wednesday");
			break;

		default :
			System.out.println("Invalid Day!");
		}
	}

}
