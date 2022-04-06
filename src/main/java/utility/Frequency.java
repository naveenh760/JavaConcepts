package utility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Frequency {

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,1,2,2,3);
        System.out.println(getFrequency(list));

        String str = "abcabcd";
        Map<Integer,Long> freq = getFrequency(list);

    }

    public static Map<Integer, Long> getFrequency(List<Integer> input){
        Map<Integer,Long> frequency = input.stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
        return frequency;
    }

    public static void getFrequency(List<Integer> input, Map<Integer,Integer> freqMap){
        for (Integer num : input) {
            freqMap.merge(num, 1, Integer::sum);
        }
    }

    public static Map<Character,Long> getFrequency(String input){
       Stream<Character> charStream = input.chars().mapToObj(c -> (char) c);
       return charStream.collect
               (Collectors.groupingBy
                       (Function.identity(),Collectors.counting()));
    }

    Map<Integer, Long> getFrequency1(List<Integer> input){
        Map<Integer, Long> freqMap = new HashMap<Integer,Long>();
        int n = input.size();
        for(int i = 0; i < n; i++){
            int number = input.get(i);
            if(freqMap.containsKey(number)){
                freqMap.put(number, freqMap.get(number) + 1);
            }
            else{
                freqMap.put(number,1L);
            }
        }
        return freqMap;
    }


}
