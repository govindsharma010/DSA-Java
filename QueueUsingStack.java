import java.util.*;
// approach 1 add O(n). remove O(1);
// approach 2 add O(1), remove O(n);
public class QueueUsingStack {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
       // note: in Notebook
        public static boolean isEmpty(){
            return s1.isEmpty() && s2.isEmpty();
        }
        public static void add(int data){ // O(n)
            /* 
             //approach 1
            while(!s1.isEmpty()){
               s2.push(s1.pop());
            }
            s1.push(data);

           while(!s2.isEmpty()){
            s1.push(s2.pop());
           }*/
          
            //approach 2 add o(1)
            s1.push(data);
           
        }

        //remove (Note: here we are directly using inbuild method from jcf like pop for removing element 
        // because yaha hum stack se implement kar rahe q ko to ye batana padega usko ki kis stack ke element ko pop karna hai 
        // pop to karna hi hai aesaa
        // same for the push here this is add method for the push operation that using push method to add element is q )
        public static int remove(){ 
            /* 
             // approach 1 O(1)
            if(isEmpty()){
                System.out.println("q is empty");
                return -1;
            }
            return s1.pop();
            */
           //approach 2
           if(isEmpty()){
            System.out.println("Q is Empty");
            return -1;
           }

          if(s2.isEmpty()){
           while(!s1.isEmpty()){
            s2.push(s1.pop());
           }
        }
        return s2.pop();
        }
        public static int peek(){ 
            /*
            // for approach 1
             if(isEmpty()){
                System.out.println("q is empty");
                return -1;
            }
            return s1.peek();
            */
           //approach 2
           if(isEmpty()){
                System.out.println("q is empty");
                return -1;
            }
            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            return s2.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
         while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
         }
    }
}
