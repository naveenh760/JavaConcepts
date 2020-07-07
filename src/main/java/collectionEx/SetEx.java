package collectionEx;

import java.util.HashSet;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
	 //	testHashSet();
		testTreeSet();
	}
	
	
	static void testHashSet() {
		HashSet<String> set = new HashSet<String>();
		set.add("Naveen");
		set.add("Sai");
		set.remove("Sai");
		System.out.println(set);
	}
	
	
	static void testTreeSet() {
		TreeSet<Integer> bbst = new TreeSet<Integer>();
		bbst.add(10);
		bbst.add(5);
		bbst.add(15);
		bbst.remove(5);
		System.out.println(bbst);
		System.out.println(bbst.floor(15));
		System.out.println(bbst.ceiling(15));
		System.out.println(bbst.headSet(15));
		System.out.println(bbst.higher(15));
		System.out.println(bbst.subSet(10, 15));
		
	}

}
