import java.util.*;
public class HashSets {
    public static void main(String[] args) {
        /*
          HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        // Iterator it = cities.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        // or
        for(String city : cities){
            System.out.println(city);
        }
     // cities in order
        LinkedHashSet<String> cities2 = new LinkedHashSet<>();
        cities2.add("Delhi");
        cities2.add("Mumbai");
        cities2.add("Noida");
        cities2.add("Bengaluru");
        for(String city : cities2){
           System.out.println(city);

        }

      TreeSet<String> cities3 = new TreeSet<>();
       cities3.add("Delhi");
        cities3.add("Mumbai");
        cities3.add("Noida");
        cities3.add("Bengaluru");
        for(String city : cities3){
           System.out.println(city);

        }

        */
       // union and intersection of arr

    int arr1[] = {7, 3, 9};
    int arr2[] = {6, 3, 9, 2, 9, 4};
    HashSet<Integer> set = new HashSet<>();
    // union
    for(int element : arr1){
        set.add(element);
    }
    for(int i=0; i<arr2.length; i++){
        set.add(arr2[i]);
    }

    System.out.println("Union = " + set.size());
  

    // intersection
    set.clear();
    for(int i=0; i<arr1.length; i++){
        set.add(arr1[i]);
    }
     int count = 0;
    for(int i=0; i<arr2.length; i++){
        if(set.contains(arr2[i])){
            count++;
            set.remove(arr2[i]);
        }
    }
    System.out.println("Intersection = " + count );


    }
}
