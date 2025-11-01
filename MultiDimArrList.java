import java.util.ArrayList;

public class MultiDimArrList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer> > mainList = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
         list.add(1);  list.add(2);
        mainList.add(list);

        ArrayList<Integer> list2  = new ArrayList<>();
         list2.add(3); list2.add(4);
        mainList.add(list2);

        // Print list
        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);

            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
          System.out.println();
        }


        // OR
    //     for(int i=0; i<mainList.size(); i++){
    //         for(int j=0; j<mainList.get(i).size(); j++){
    //             System.out.print(mainList.get(i).get(j) + " ");
    //         }
    //         System.out.println();
    //     }
    // 
    System.out.println(mainList);
  }
}
