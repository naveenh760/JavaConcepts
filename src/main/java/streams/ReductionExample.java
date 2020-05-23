package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionExample {

	public static void main(String... args) {

		List<Integer> list = Arrays.asList(1, 3, 4, 10, 8);
		list.forEach(num -> System.out.print(num + " "));
		System.out.println();
		maxExample(list);
		addExample(list);
		multiplyExample(list);
	}

	public static void maxExample(List<Integer> list) {
		Optional<Integer> maxList = list.stream().reduce((a, b) -> Integer.max(a, b)); // Integer::max

		if (maxList.isPresent()) {
			System.out.println("Max = " +maxList.get());
		} else {
			System.out.println("empty");
		}
	}
	
	public static void addExample(List<Integer> list) {
		Integer sumList = list.stream()
							  .reduce(0, (a, b) -> (a + b));
		
		System.out.println("Sum = " + sumList);
		
	}
	
	public static void multiplyExample(List<Integer> list) {
		Integer productList = list.stream().reduce(1, (a , b) -> (a * b));
		System.out.println("product = " + productList);
	}
	

}
