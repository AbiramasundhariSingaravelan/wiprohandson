package Day4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l=new ArrayList<String>();
		List<Integer> list1=new ArrayList<Integer>();
		l.add("one");
		l.add("two");
		l.add("three");
		l.add("four");
		l.add("five");
		l.add("six");
		l.add("seven");
		//list1.addAll(l);
		System.out.println("Printing List Methods");
		System.out.println("INDEX OF:" +l.indexOf("four"));
		System.out.println("LAST INDEX OF: "+l.lastIndexOf("five"));
		System.out.println("CONTAINS: "+l.contains("eleven"));
		System.out.println("REMOVE: "+l.remove("three"));
	}

}
