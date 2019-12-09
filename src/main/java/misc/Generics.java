package misc;

public class Generics {

	public static void main(String[] args) {
		System.out.println("Hello");
		testGenerics();

	}
	
	public static void testGenerics() {
		Integer [] ints = {1,2,3,4};
		String[] strings = {"hello","sai", "ram"};
		printArray(ints);
		printArray(strings);
	}
	
	public static <E> void printArray(E[] array) {
		for (E e : array) {
			System.out.print(e + " ");
		}
		System.out.println();
	}


}
