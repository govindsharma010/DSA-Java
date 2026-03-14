import java.util.*;
public class HashMapProb {
    public static String getStart( HashMap<String, String> map){
       HashMap<String, String> revMap = new HashMap<>();
        // for(int i=0; i<tickets.length; i++){
        //    revMap.put(tickets[i][1], tickets[i][0]); 
        // }
        // or 
        for(String key : map.keySet()){
            revMap.put(map.get(key), key);
        }

        for (String key : map.keySet()) {
             if(!revMap.containsKey(key)) {
                return key; // rev map ( "to" - "from" map) me check kar rahe hai 
                // in simple word aesi jagah se start (from) karni hai journey jis point pr kahi se reach (to)nhi kiya ja ske .
                //  taki vo point starting me hi cover ho jaye and all set
            }
                
        }
        return null;
    }
    public static void main(String[] args) {
     //   HashMap<Integer, Integer> map = new HashMap<>();
        /* 
         int arr[] = {1,3,2,5,1,3,1,3,5,1, 3};
        for(int i=0; i<arr.length; i++){
            /*
                    if(map.containsKey(arr[i])){
            map.put(arr[i], map.get(arr[i])+1);
        }
        else{
            map.put(arr[i], 1);
        } */
       /* 

        map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        // note map.get(key) if no value exist in map returns null, but if we want some default value then we can use above method
        // map.getOrDefault(arr[i], 0)  if key exist we get at arr[i] i.e its value otherwise we get 0
        }
     //Set<Integer> keySet = map.keySet();
     for (int key : map.keySet()) {
        if(map.get(key) > arr.length/3){
            System.out.println(key);
        }
     }
        */

     // Itenary Problem 
        String tickets[][] = {{"Chennai", "Bangalore"}, {"Bombay", "Delhi"}, {"Goa", "Chennai"}, {"Delhi", "Goa"}};
        HashMap<String, String> map = new HashMap<>();
        for(int i=0; i<tickets.length; i++){
            map.put(tickets[i][0], tickets[i][1]);
        }
      String start = getStart( map);
      
       System.out.print(start);
      for(String key : map.keySet()){// here looping on key is only for ki jitni keys hai utni bar loop chalana hai
       System.out.print("->" + map.get(start));
       start = map.get(start);


      }
      System.out.println();

       
    }
}
