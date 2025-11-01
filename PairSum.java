import java.util.ArrayList;

public class PairSum {
  // for different combination of element ot reach the pair sum
// not fully covered all element combinations but I will got it later 

  /*
    public static void question2(ArrayList<Integer> list, int tSum){
    for(int i=0; i<list.size()-1; i++){
        int sum = list.get(i);
      if(sum == tSum){
        System.out.println( i);
      }
      for(int j=i+1; j<list.size()-1; j++){
        sum = sum + list.get(j);
      if(sum == tSum){
        System.out.println("(" + i + "," + j + ")");
      }
      else if(sum > tSum){
        sum=- list.get(j);
      }
      }
    }
   } 

   */
  // For only check there exist any pair to get target sum
  // brute force approach
   public static boolean pairSum1(ArrayList<Integer> list, int target){
    // for(int i=0; i<list.size(); i++){
    //   for(int j=0; j<list.size(); j++){
    //     if(list.get(i) + list.get(j) == target){
    //       return true;
    //     }
    //   }
    // }
    //  return false;

    // two pointer approach O(n) optimised
    int lp = list.get(0);
    int rp = list.get(list.size()-1);
    
    while(lp != rp){
      int sum = lp + rp;

      //case 1
    if(sum == target){
      return true;
    }
    // case2 
    if(sum>target){
      rp--; // decrease sum -> decrease rp
    }

    // case 3
    else{
      lp++; // increase lp to increase sum
    }
  }
   return false;
   }

   // pairSum2
   // two pointer approach
   public static boolean pairSum2(ArrayList<Integer> list, int target){
    int bp = -1; // breaking point 
    int n = list.size();
     for(int i=0; i<list.size(); i++){
      if(list.get(i)>=list.get(i+1)){
        bp  = i;
        break;
       }
     }
    int rp = bp;
    int lp = bp + 1; // or lp + 1 or i + 1
    while(lp!= rp){
      //case 1
      if(list.get(lp) + list.get(rp) == target){
        return true ;
      }
      //case 2
      else if(list.get(lp) + list.get(rp) > target) {
        // rp--
        rp = (n + rp -1) % n;
      }
      //case 3
      else{
        // lp ++ 
        lp = (lp + 1 ) % n ;
      }
    }
     return false;

   }

   public static void main(String[] args) {
     ArrayList<Integer> list = new ArrayList<>();
    //  list.add(1);
    //  list.add(2);
    //  list.add(3);
    //  list.add(4);
    //  list.add(5);
    //  list.add(6);
  //  System.out.println(pairSum1(list,11));

     list.add(11);
     list.add(15);
     list.add(6);
     list.add(8);
     list.add(9);
     list.add(10);
     System.out.println(pairSum2(list, 16));
   }
}
