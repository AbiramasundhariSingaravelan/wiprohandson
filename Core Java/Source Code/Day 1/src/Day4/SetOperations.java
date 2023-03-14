package Day4;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> s1=new HashSet<Integer>();
		Set<Integer> s2=new HashSet<Integer>();
		s1.add(100);
		s1.add(200);
		s1.add(300);
		s1.add(400);
		s1.add(500);
		s2.add(100);
		s2.add(600);
		s2.add(300);
		s2.add(800);
		s2.add(900);
		Set<Integer> intersect=new HashSet<Integer>();
		intersect.addAll(s1);
		intersect.retainAll(s2);
		Set<Integer> union=new HashSet<Integer>();
		union.addAll(s1);
		union.addAll(s2);
		Set<Integer> diff=new HashSet<Integer>();
		diff.remove(s2);
		System.out.println("Intersection" +intersect);
		System.out.println("Union"+union);
		System.out.println("Difference"+s1.removeAll(s2));
	}

}
