public class fractionalKnapsack2 {
     static class Item {
        int val; 
        int wt; 
        Item(int val, int wt){
            this.val = val; 
            this.wt = wt;
        }
        double getRatio(int val , int wt){
            return (double) (val / wt);
        }
     }
    public static void sort(Item item[]){
        for(int i=0; i<item.length; i++){
            for(int j=i+1; j<item.length; j++){
                if(item[i].getRatio(item[i].val, item[i].wt) < item[j].getRatio(item[j].val, item[j].wt)){
                    Item temp = item[i];
                    item[i] = item[j];
                    item[j] = temp;
                }
            }
        }
    }
    public static double getMax(Item item[], int cap){
          sort(item);
          int i=0;
         int ans = 0;
          while(cap > 0 && i < item.length){
          if(item[i].wt <= cap){
            cap = cap - item[i].wt;
            ans += item[i].val;
            i++;
          }else{
            // 100 > 60
            ans += item[i].getRatio(item[i].val, item[i].wt)*(cap);
            cap = 0;
            break;
          }
          }
          return ans;
    }
    public static void main(String[] args) {
      Item item [] = {new Item(60, 10),
        new Item(100, 20),
        new Item(120, 30)
    }  ;
    
    System.out.println(getMax(item, 50));
     
    }
}
