import java.util.ArrayList;
import java.util.Collections;;

public class Unit27 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        //add
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);
        // // get
        // System.out.println(list1.get(3));
        
        // //remove 
        // list1.remove(3);
        // System.out.println(list1);
        
        // //set
        // list1.set(3,4);
        //  System.out.println(list1);
        
        //  //contains
        // System.out.println(list1.contains(1));
        // System.out.println(list1.contains(11));

        // //add at any index 
        // list1.add(4,5);
        // System.out.println(list1);

        // // size 
        // System.out.println(list1.size());

        // for( int i=0; i<list1.size(); i++){
        //     System.out.print(list1.get(i) + " ");
        // }

        // swapping 
    //     int temp = list1.get(1);
    //     list1.set(1, list1.get(3)); // set value of index 3 at index 1 
    //     list1.set(3, temp);
    //     System.out.println(list1);
    // 
     // or
    //     int  indx1 = 1, indx2 = 3;
    //     swap(list1, indx1, indx2);
    //     System.out.println(list1);
    // }
    
    //   public static void swap( ArrayList<Integer> list1 , int indx1 , int indx2 ){
    //     int temp = list1.get(indx1);
    //     list1.set(indx1, list1.get(indx2));
    //     list1.set(indx2, temp);

        // sorting 

        Collections.sort(list1);
        System.out.println(list1);
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);
      }

} 
