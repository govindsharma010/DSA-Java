import java.util.*;
public class QueueUsingJCF {
    public static void main(String[] args) {
         Queue<Integer> q = new java.util.LinkedList<>();
         // java.util.LinkedList written in this way because my local LinkedList class is creating conflict with actual LinkedList class of java.util pacakage
        // Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
