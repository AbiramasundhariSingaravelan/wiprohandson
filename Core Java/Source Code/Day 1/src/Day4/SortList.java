package Day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list1=new ArrayList<String>();
		list1.add("demo");
		list1.add("evaluate");
		list1.add("Welcome");
		list1.add("greet");
		Collections.sort(list1);
		for(String listt:list1)
		{
			System.out.println(list1);
		}
	}

}
