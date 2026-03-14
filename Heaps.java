import java.util.*;
public class Heaps {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            // add at last index
            arr.add(data);

            int childIdx = arr.size() - 1;
            int parentIdx  = (childIdx - 1)/2;
            while(arr.get(childIdx) < arr.get(parentIdx)){
                // swap 
                int temp = arr.get(childIdx);
                arr.set(childIdx, arr.get(parentIdx));
                arr.set(parentIdx, temp);
            
                // update indexes to fix the min heap
                childIdx = parentIdx;
                parentIdx = (childIdx - 1)/2;

            }

        }
        // print heap
        public void printHeap(){
            System.out.println(arr);
        }
        // peek
        public int peek(){
            return arr.get(0);
        }

        // remove- heapify O(logn)
        private void heapify(int i){
            int left = 2*i + 1;
            int right = 2*i + 2;
            int minIdx = i; // taking node with min data. and assigning its index as minIdx. (assuming root is min)

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }
            
            if(minIdx != i){ // it heap is not fixed so we will fix it now
              // swap
              int temp = arr.get(i);
              arr.set(i, arr.get(minIdx));
              arr.set(minIdx, temp);

              heapify(minIdx); // noe fixing heap below min Idx

            }
        }

        public int remove(){
            int data = arr.get(0);

            //step 1 swap firsrt and last node
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //step 2 delete last
            arr.remove(arr.size()-1);

            //step 3 fix heap i.e. heapify

            heapify(0);
            return data;

        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {
        Heap pq = new Heap();// it is known that java uses heaps for priority queue implementation
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);
       while(!pq.isEmpty()){  // this process is called as heap sort.
        System.out.println(pq.peek());
        pq.remove();
       }

    }
}

