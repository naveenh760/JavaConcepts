package utility;

import java.util.*;

public class SortMap {

    public static LinkedHashMap<String, Integer> sortMapByValue(HashMap<String,Integer> map){
        ArrayList<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,Map.Entry.comparingByValue());
        LinkedHashMap<String,Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<String,Integer> entry: list){
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}
