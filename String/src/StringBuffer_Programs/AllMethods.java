package StringBuffer_Programs;

public class AllMethods
{
	public static void main(String[] args)
	{
		StringBuffer str=new StringBuffer("WELCOME");
		System.out.println(str);
		str.append(" JAVA");
		System.out.println(str);
		System.out.println(str.insert(7," TO"));
		System.out.println(str.length());
		System.out.println(str.delete(7,10));
		str.reverse();
		System.out.println(str);
		System.out.println(str.reverse());
		System.out.println(str.replace(3, 6, "Hi"));
		System.out.println(str.replace(3, 6, "COME"));
		System.out.println(str.substring(3));
		System.out.println(str.indexOf("COME"));
		System.out.println(str.charAt(5));
		System.out.println(str.subSequence(2,5));
		System.out.println(str);
	}

}
