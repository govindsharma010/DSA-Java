import java.util.HashMap;

public class HashMapSubArrayProb {
    public static void main(String[] args) {
       int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
    HashMap<Integer, Integer> map = new HashMap<>();
    // sum, indx
    
    int sum =0;
    int len = 0;
    for(int i=0; i<arr.length; i++){
        sum += arr[i];
        if(map.containsKey(sum)){
            len = Math.max(len, i-map.get(sum)); // i - indx is the sub array length who contributes 0
        }
        else{
            map.put(sum, i);
        }
    }
   System.out.println("Largest subarray with sum as 0 =>"+ len);   
    }
   }
