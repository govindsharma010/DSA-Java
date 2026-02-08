import javax.sql.rowset.spi.SyncResolver;

public class StackUsingQ {
    static class Stack{
        Queue<Integer> q1 = new LinkedList<>();
        Queue <Integer> q2 = new LinkedList<>();
        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        // add in O(1)
        public static void dalo(int data){
            if(!q1.isEmpty()){ // jo bhi non empty hoga usme add karenge
            q1.add(data);
            }
            else{
                q2.add(data);
            }
        }
        // remove O(n)
        public static int nikaloo(){
            if(isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            int top = -1; 
            // case 1;

            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                     top = q1.remove();
                     if(q1.isEmpty()){
                        break; // top is the last element so return it
                     }
                     // ex ; 1,2,3 in q1
                     // 1,2 stored in q2 
                     // at top = 3 return 3
                    // nahi to
                     q2.add(top); 
                }
            }
            else{
                //case 2 jb tk q2 empty na ho
                while(!q2.isEmpty()){
                  top = q2.remove();
                  if(q2.isEmpty()){
                    break;
                  }
                  // nahi to
                  q1.add(top);
                }
            }
                return top;

        }

        public static int peek(){
            // same condition as in niakloo but a bit modification
             if(isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            int top = -1; 
            // case 1;

            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                     top = q1.remove();
                    //  if(q1.isEmpty()){
                    //     break; 
                    //  }
                 // 1,2,3 in q1 
                 // top = 3
                 // top return 
                     q2.add(top); 
                }
            }
            else{
                //case 2 jb tk q2 empty na ho
                while(!q2.isEmpty()){
                  top = q2.remove();
                //   if(q2.isEmpty()){
                //     break;
                //   }
                  q1.add(top);
                }
            }
                return top;

        }  
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.dalo(1);
        s.dalo(2);
        s.dalo(3);

        // hamari defined method is tarike se dalega ki stack jese output aaye
        while(!s.isEmpty()){
        // hamari defined method is tarike se nikalegi ki stack jese output aaye
            System.out.println(s.peek());
            s.nikaloo();
        }
    }
}
