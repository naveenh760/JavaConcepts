package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		testArrayList();
		testLinkedList();
	}
	
	
	public static void testArrayList() {
		int n = 5;
		List<Integer> intList= new ArrayList<>(n);
		for(int i=0; i<n; i++) {
			intList.add(i*5);
		}
		
		intList.replaceAll((m) -> (m + 5));   // Add 5 to each element in list
		intList.forEach((m) -> System.out.print(m + " "));
		
	}
	
	public static void testLinkedList() {
		List<String> stringList = new LinkedList<String>();
		stringList.add("Hello");
		stringList.add("Sairam");
		System.out.println("\nBefore");
		for (String string : stringList) {
			System.out.print(string + " ");
		}
		
		stringList.removeIf(x -> (x.length() > 5));  //Remove all elements with length > 5
		System.out.println("\nAfter");
		stringList.forEach(x -> System.out.print(x + " "));
	}
	
}
