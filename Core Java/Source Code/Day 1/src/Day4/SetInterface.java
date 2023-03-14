package Day4;

import java.util.Iterator;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s1=new EntrySet<String>();
		s1.add("list");
		s1.add("set");
		s1.add("set");
		s1.add("Map");
		s1.add("Queue");
		Iterator itr=s1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
