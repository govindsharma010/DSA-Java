import java.util.PriorityQueue;
import java.util.Comparator;

public class PQueue {
    // p q for storing objects
    static class Student implements Comparable<Student>{ // overriding
        int rank;
        String name;
        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }

    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
       // to print in reverse order (least priority element first)
      //  PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
     /* 
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove(); //O(logn)
        } 
     */
    pq.add(new Student("A", 4));
    pq.add(new Student("B", 5));
    pq.add(new Student("C", 2));
    pq.add(new Student("D", 12));

    while(!pq.isEmpty()){
            System.out.println(pq.peek().name + "->" + pq.peek().rank); // O(1)
            pq.remove(); //O(logn)
        } 
       
    }
}

