import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson",31);
        hashMap.put("Lewis",29);
        hashMap.put("Cook",29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        TreeMap<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending by key (alphabet order)");
        System.out.println(treeMap);

        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>(hashMap);
        System.out.println("\n The age for " + "Lewis is " + linkedHashMap.get("Lewis"));

        TreeMap<String,Integer> treeMap1 = new TreeMap<>(linkedHashMap);
        System.out.println("Display entries in ascending by key (alphabet order)");
        System.out.println(treeMap1);
    }
}
