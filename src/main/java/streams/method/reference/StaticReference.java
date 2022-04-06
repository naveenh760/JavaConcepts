package streams.method.reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StaticReference {
    public static int transformAndAdd(List<Integer> l,
                               Function<Integer, Integer> f) {
        int result = 0;
        for (Integer s : l)
            result += f.apply(s);

        return result;
    }

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4);
        int result = transformAndAdd(list, OpsUtil::doSquare);
        System.out.println(result);
        result = transformAndAdd(list, OpsUtil::doHalf);
        System.out.println(result);
    }

}
