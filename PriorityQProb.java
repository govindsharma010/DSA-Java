import java.util.PriorityQueue;

public class PriorityQProb {
    public static void main(String[] args) {
        // CONNECT N ROPES WITH MIN COST
        int ropes[] = {2,3,3,4,6};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<ropes.length; i++){
            pq.add(ropes[i]);
        }
        int cost = 0;
        while(pq.size() > 1){
            int n1 = pq.remove(); // as  pq always return min value;
            int n2 = pq.remove();
            int currCost = n1 + n2;
            cost+= currCost;
            pq.add(currCost);
        }
        System.out.println("cost of connecting n ropes : " + cost);
    }
}
