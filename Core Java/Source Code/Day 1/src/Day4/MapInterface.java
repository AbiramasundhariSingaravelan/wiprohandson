package Day4;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> map=new TreeMap<>();
		map.put(100,"aa");
		map.put(200, "bb");
		map.put(300, "cc");
		map.put(400, "dd");
		map.put(500, "ee");	
		System.out.println("Initial Values: "+map);
		map.remove(100);
		System.out.println("After removing 100: "+map);
		map.remove(400,"dd");
		System.out.println("After removing d:"+map);
		for(Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+ " - " +m.getValue());
		}
	}

}
