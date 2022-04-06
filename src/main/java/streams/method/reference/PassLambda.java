package streams.method.reference;

import java.util.function.Function;

public class PassLambda {

    public static void main(String[] args){
        Function<Integer, Integer> squareFunction = number -> (number * number);
        Function<Integer, Integer> doubleFunction = number -> (number * 2);
        int square = transformNumber(5, squareFunction);
        int doubleValue = transformNumber(5, doubleFunction);
        System.out.println(square);
        System.out.println(doubleValue);

    }

    private static int transformNumber(int number, Function<Integer, Integer> function) {
        return function.apply(number);
    }


}
