package Set;

import java.util.HashSet;
import java.util.TreeSet;

public class Basic
{
	public static void main(String[] args) {
		System.out.println("Start Coding...");
		
		HashSet<Double> set= new HashSet<>();
		set.add(24.45);
		set.add(456.23);
		set.add(34.00);
		set.add(45.45);
		
		
		System.out.println("HashSet "+set);
		
		TreeSet<Double> tset=new TreeSet<>();
		tset.addAll(set);
		System.out.println("TreeSet "+tset);
		
	}

}
