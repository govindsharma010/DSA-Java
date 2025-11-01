import java.util.ArrayList;
import java.util.Arrays;
public class ArrListPracQ {
    public boolean isMonotonic(ArrayList<Integer>list){
        boolean inc = true;
        boolean dec=  true;
        for(int i = 0; i<list.size()-1; i++){
            if(list.get(i)<list.get(i+1)){
                dec = false;
            }
            if(list.get(i)>list.get(i+1)){
               inc = false;
            }
        }

        return inc || dec;
    }

    // q.2 lonely number edit:- but O(n^2) edit+1: optimized
    public static ArrayList<Integer> lonelyNum(int nums[]){
       Arrays.sort(nums);
      ArrayList<Integer> list = new ArrayList<>();
      
        for(int i=1; i<nums.length-1; i++){
            /* if(isExist(nums[i], nums)){
                result.add(nums[i]);
            }
        }
        return result; 
        */
           if(nums[i-1] + 1 < nums[i] && nums[i]+1 < nums[i+1]){
            list.add(nums[i]);
             }
        
        }
        if(nums.length == 1){
            list.add(nums[0]);
        }
        if(nums.length>1){
            if(nums[0]+1 < nums[1]){
              list.add(nums[0]);
            }
        
           if(nums[nums.length-2]+1 < nums[nums.length-1]){
            list.add(nums[nums.length-1]);
            }
            
        }
      return list;
    }
    //isExist function 
    // public static boolean isExist(int num, int [] nums){
    //     int count = 0;
    //     for(int i=0; i<nums.length; i++){
    //         if (nums[i] == num){
    //             count ++;
    //             if(count > 1){
    //                 return false;
    //             }
    //         }
    //         if(nums[i] == num+1 || nums[i] == num - 1){
    //            return false;
            
    //     }
    //   }
    //   return true;
    // }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
    /*q.1 
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);

        
    ArrListPracQ q = new ArrListPracQ(); // this is when we did diclare a method statically then we have to create
                                      // an object to call the method otherwise create it statically which we do every time

    System.out.println(q.isMonotonic(list));

    */

    // lonely no
    int nums[] = {1,3,3,5,7,6,8};
    System.out.println(lonelyNum(nums));
    }
}
