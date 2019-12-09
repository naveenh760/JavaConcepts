package misc;

//Java program to demonstrate Upper Bounded Wildcards 
import java.util.Arrays; 
import java.util.List; 

class WildcardDemo 
{ 
	public static void main(String[] args) 
	{ 
		
		//Upper Bounded Integer List 
		List<Integer> list1= Arrays.asList(4,5,6,7); 
		
		//printing the sum of elements in list 
		System.out.println("Total sum is:"+sum(list1)); 

		//Double list 
		List<Double> list2=Arrays.asList(4.1,5.1,6.1); 
		
		//printing the sum of elements in list 
		System.out.print("Total sum is:"+sum(list2) + "\n"); 
		
		printOnlyIntegerClassorSuperClass(list1); 
		printlist(list1);
	} 

	//Upper bounded wildcard
	private static double sum(List<? extends Number> list) 
	{ 
		double sum=0.0; 
		for (Number i: list) 
		{ 
			sum+=i.doubleValue(); 
		} 

		return sum; 
	} 
	
	//lower bounded wildcard
	public static void printOnlyIntegerClassorSuperClass(List<? super Integer> list) 
    { 
        System.out.println(list); 
    } 
	
	private static void printlist(List<?> list)  
    { 
        System.out.println(list); 
    } 
} 
