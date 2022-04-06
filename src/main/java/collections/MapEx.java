package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {
		// testHashMap();
	//	testSortedMap();
		testTreeMap();
	}

	public static void testHashMap() {
		Map<Character, Integer> mymap = new HashMap<Character, Integer>();
		String input = "aabbccadf";
		char[] charArray = input.toCharArray();
		for (char letter : charArray) {
			if (mymap.putIfAbsent(letter, 1) != null) { // putifabsent() returns null key is not present
				mymap.put(letter, mymap.get(letter) + 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : mymap.entrySet()) {
			System.out.print(entry.getKey() + " " + entry.getValue() + "\n");
		}

	}

	public static void testSortedMap() {
		SortedMap<Integer, String> sortedMap = new TreeMap<>();
		String[] values = { "Test", "Sai", "Hello" };

		for (int i = values.length - 1; i >= 0; i--) {
			sortedMap.put(i, values[i]);
		}

		for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
			System.out.print(entry.getKey() + " " + entry.getValue() + "\n");
		}

		SortedMap<Integer, String> subMap = sortedMap.subMap(0, 1);
		for (Map.Entry<Integer, String> entry : subMap.entrySet()) {
			System.out.print(entry.getKey() + " " + entry.getValue() + "\n");
		}

	}

	public static void testTreeMap() {
		TreeMap<Integer, String> bbst = new TreeMap<Integer, String>();
		String[] values = { "Test", "Sai", "Hello" };

		for (int i = values.length - 1; i >= 0; i--) {
			bbst.put(i, values[i]);
		}
		
		System.out.println(bbst.higherKey(1));
		System.out.println(bbst.lowerKey(1));
		System.out.println(bbst.ceilingKey(1));
		System.out.println(bbst.floorKey(1));
		
		System.out.println(bbst.higherEntry(1).getValue());
		System.out.println(bbst.lowerEntry(1).getValue());
		System.out.println(bbst.ceilingEntry(1).getValue());
		System.out.println(bbst.floorEntry(1).getValue());
	}

}
