package codegym.maptree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DemoTreeMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "Duyệt");
        map.put(4, "Long");
        map.put(2, "Tuấn");
        map.put(3, "Khải idol");


        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        for (Integer key: map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
        
    }
}