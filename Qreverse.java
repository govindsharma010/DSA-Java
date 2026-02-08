import java.util.*;
public class Qreverse {
    public static void reverse(Queue<Integer> q){
      if(q.isEmpty()){
        return;
      }
        int front = q.remove();
        reverse(q);
        q.add(front);
    }
    public static void main(String[] args) {
      
        //Queue<Integer> q = new LinkedList<>();
        // using this gives error because: The compiler is picking up your own non-generic LinkedList class in the project,
        //  so new LinkedList<>() resolves to that local class (non-generic) and the diamond <> can't be inferred.
        //  Fix by referencing the JCF class explicitly or renaming your local class.
        Queue<Integer> q = new java.util.LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverse(q);
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }
}
