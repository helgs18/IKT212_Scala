import java.util.*;

public class stack
{
	public static void main(String[] args)
	{
		List<String> list = new LinkedList<>();
		list.add("42");
		list.add("10");
		list.add("20");
		list.add("22");
		Iterator<Integer> iter = list.iterator();

		while(iter.hasNext())
			System.out.printf(iter.next() + " " );

		System.out.println();
	}
}
