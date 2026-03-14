import java.util.*;
public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);
    
        // iterate 
        Set<String> keys = hm.keySet();
        System.out.println(keys);
  // loop on key set not on hashmap
        for(String k : keys){
            System.out.println("key=" +k+ ",value =" + hm.get(k));
        }
//also for pair can use entrySet()
    }
}
