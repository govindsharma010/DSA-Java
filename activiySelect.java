import java.util.*;

public class activiySelect {
    static class Pair implements Comparable<Pair>{
        int start;
        int end;
        Pair(int start, int end){
            this.start= start;
            this.end = end;

        }
        @Override
        public int compareTo(Pair p2){
            return this.end - p2.end;
        }

    }
    public static ArrayList<Pair> getAns(Pair activities[]){
        ArrayList<Pair> ans = new ArrayList<>();
        ans.add(activities[0]);
        Pair p = ans.get(0);
      for(int i = 1; i<activities.length; i++){
        
         Pair curr = activities[i];
         if(curr.start >= p.end){
            ans.add(curr);
            p = curr;
         }
      }
      return ans;
    }
    public static void main(String [] args){
       Pair activities [] = { new Pair(1,3), new Pair(2, 5), new Pair(3, 9), new Pair(6, 8), new Pair(8, 10)};
       Arrays.sort(activities);
       ArrayList<Pair> finalans = getAns(activities);
    
       for(int i=0; i<finalans.size(); i++){
        Pair a = finalans.get(i);
       System.out.println(a.start + " " + a.end);
       }
    }
}
