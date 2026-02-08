public class QueueD {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class QueueUsingLL{
       static Node head = null;
       static Node tail  = null;
       
       public static boolean isEmpty(){
          return head == null && tail == null;
       }
    //    public static boolean isFull(){
    //     // no need as LL is of dynamic size
    //    }

       //add
       public static void add(int data){
        Node newNode = new Node(data);
        if(head == null){// ll is empty and adding first element
            head = tail = newNode;
        }
        //else  if already nodes are exist
        tail.next = newNode;
        tail = newNode;
       }

       //remove
       public static int remove(){
         if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
         }
         int front = head.data;
         if(head == tail){
            // single node exist
            head = tail = null;
         }
         else{
         head = head.next;
         }
         return front;

       }

       //peek
       public static int peek(){
        if(isEmpty()){
            System.out.println("q is empty");
            return -1;
        }
        return head.data;
       }
    }

    public static void main(String[] args) {
        // IMP NOTE as our classes are declared static we do not have to create an instance(but here we created) can directly call methods
        // with the class name that is QueueUsingLL.add(1) like

        QueueUsingLL q = new QueueUsingLL();
         q.add(1);
         q.add(2);
         q.add(3);
         q.add(4);
         q.add(5);
         int i =0;
         while(i != 10){
            System.out.println(q.peek());
            q.remove();
            i++;
         }
    }
}
