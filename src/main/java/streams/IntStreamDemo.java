package streams;

import java.util.stream.IntStream;

public class IntStreamDemo {

    public static void main(String[] args){
       IntStream stream = IntStream.rangeClosed(1,10);
       double avg = stream.average().orElse(0);
       System.out.println(avg);
    }
}
