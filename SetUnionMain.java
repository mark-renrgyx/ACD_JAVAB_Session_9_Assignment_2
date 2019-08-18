package week1.day9.assignment2;

import java.util.HashSet;
import java.util.Set;

public class SetUnionMain {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>();
		
		Set<String> s2 = new HashSet<String>();
		
		s1.add("Bill");
		s1.add("Bob");
		s1.add("Pat");
		s1.add("Corey");
		
		s2.add("Pat");
		s2.add("Corey");
		s2.add("Tina");
		s2.add("Jane");
		
		System.out.println("s1: " + s1.toString());
		System.out.println("s2: " + s2.toString());
		
		s1.addAll(s2);
		
		System.out.println("\nUnion: " + s1);
	}
}
