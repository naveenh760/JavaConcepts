package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
	//	mapTest();
    //    filterTest();
        predicateTest();
	}
	
	public static void mapTest() {
		List<Integer> numbers = Arrays.asList(2,3,4,5);
		List<Integer> squares = numbers.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println(squares);
	}

	
	public static void filterTest() {
		List<String> concepts = Arrays.asList("Stream", "IO", "OOPS", "Annotation");
		List<String> sConcepts = concepts.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		System.out.println(sConcepts);
		
		List<String> sorted = concepts.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
	}
	
	public static void predicateTest() {
		List<Integer> numbers = Arrays.asList(2,4,6,8);
		boolean isEvenList = numbers.stream().allMatch(number -> (number % 2 == 0));
		System.out.println(isEvenList);
	}
}
