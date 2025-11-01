
public class LinkedList {
    public static class Node{
        int data;
        Node next;

        //costructor
       public  Node(int data ){
          this.data = data;
          this.next = null;
        } 
    }

    public static Node head;
    public static Node tail;
    public static int size ;

    public void addFirst(int data){

           // step1 create new node
        Node newNode = new Node(data);
        size++;

        if(head == null){
           head  = tail = newNode;
           return;
        }
     
        // step 2 new node next = head
        newNode.next = head; // link

        // step 3 set head to new node
         head = newNode;
    }

    public void addLast(int data){
        Node newNode  = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }
    // step 2
      tail.next = newNode;
    // step 3
      tail = newNode;

    }

    public void print(){
       
        if( head == null){
            System.out.println("LL is empty");
            return;
        }
      Node temp = head; // creation and assign head to new node temp

        while(temp!= null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }
    // can add node anywhere in first last or in middle
    public void addMiddle(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return; 
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < idx -1 ){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // remove operations 
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0; // decreasing size
            return val;
        }
        
            int val = head.data;
            head = head.next;
            size--;
            return val;
    }
    // remove last 
    public int removeLast(){
        if(size == 0){
           System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if( size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
            
            Node prev = head; // prev ko size -2 pr lana hai 
            
            for(int i=0; i< size-2; i++){
                prev = prev.next;
            }
           //  int val = tail.data; // it will return second last node data if size is not decreased properly so always use that pointer on jo hamare control me ho like prev wala pointer 
             // so do prev.next.data will point to last node which is about to delete
            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            size--;
            return val;
         
    }
    // remove at any index //
    public int removeAtAny(int idx){
        if(size == 0){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        if(idx<0 || idx>= size){
            System.out.println("Invalid index");
            return Integer.MIN_VALUE;

        }
        if(idx == 0){
            return removeFirst();
        }
         Node prev = head;
        for(int i=0; i<idx-1; i++){
          prev = prev.next;

        }
        int val = prev.next.data;
        // last node to delete 
        if(idx == size -1){
            prev.next = null;
            tail = prev;
        }
        else{
             //  prev.next.next = null; // it makes further nodes to null 
             prev.next = prev.next.next;
             
        }
        size--;
        return val;
    }
    public static int itrSearch(int key){ // O(n)
        int idx = 0;
        Node temp = head;
        while(temp!=null){
            if(temp.data == key){
                System.out.println("Key exist");
                return idx;
            }
            else {
                temp = temp.next;
                idx++;
            }

        }
        System.out.println("key doesnt exist");
        return -1;
    }
    
    public void reverseItr(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next  = prev;
            prev = curr;
            curr = next;
        }
        head = prev; // at last curr point to null
    }

    //wrong code of mine
    // public ListNode reverseListRecursive(ListNode head){
    //     if(head == null || head == tail){
    //         return head;
    //     }
    //     if(get.next == null){
    //         curr = tail;
    //         return curr;
    // }
    //      Node curr = head;
    //     Node get = reverseListRecursive(head.next);
    //     get.next = curr;
    //     return get.next;
        
    // }

    public void delNthFromEnd(int n ){
        Node temp = head;
        int sz = 0;
        while(temp != null){
          temp = temp.next;
          sz++;
        }
        if(n == sz){// remove last from end i.e  first from start
            head = head.next;
            return;
        }
        
        Node prev = head;
        for(int i=1; i<sz-n; i++){ // till prev points to prev of deleting node
            prev = prev.next;
        }
         prev.next = prev.next.next;
        return;
    }
   public Node findMidNode(Node head){
    Node slow = head;
    Node fast = head;
     // fast null hoga even nodes ke case me
     // fast.next null hoga odd nodes ke case me
    while(fast != null && fast.next!= null){
        slow = slow.next; // 1 jump 
        fast = fast.next.next; // 2 jumps
    }
    return slow; // slow becomes mid node

   }

   public boolean checkPalindrome(){
    if(head == null || head.next == null){
        // either ll is empty of single node is present 
        return true;
    }
    // step 1 calculate middle 
    Node midNode = findMidNode(head);

    // step 2 reverse ll from mid i.e 2nd half
    // for reversing ->3 var 4 steps
    Node prev = null;
    Node curr = midNode;
    Node next;
    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    Node right = prev; // point to last of right part  0 
    Node left = head; // point to 1st Node
    // step 3 check palindrome by checking left and right half
    while(right != null){
    // as in both case even or odd nodes right keep going to next and at the  end point to null 
    if(left.data != right.data){
        return false;
    }
    left = left.next; 
    right = right.next;

   }
   return true;
}
 // check for cycle in Linked list 
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){// same as in  linear linked list tracking to when we find mid
            slow = slow.next;
            fast= fast.next.next;
            if(slow == fast){
                return true; // cycle is exist
            }
        }
        return false; // doesnt exist
    }
    // remove cycle 
    public static void removeCycle(){
        // detect cycle
        Node fast = head;
        Node slow = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
           if(fast == slow){
            cycle = true;
            break;
          }
        } 
        if(cycle == false){
            return ;
        }
         // step 2 find meeting point again
         slow = head;
         Node prev = null; // want to point it to last node
        while(slow != fast){
            prev = fast;
             slow  = head;
             fast = fast.next;
             slow = slow.next;
        }
            // step 3 remove cycle -> last.next = null
            prev.next = null;
    }

    // Merge sort on LL 
    public static Node mergeSort(Node head){  // left part--------right part
        if(head == null || head.next == null){
            return head;
        }
        // find mid
        Node mid = findMid(head);
        // left and right ms
        Node rightHead = mid.next;
         mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
 
        // merge
       return  merge(newLeft, newRight);

    }

    public static Node findMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next; 
        }
         return slow; // mid node
    }
    private static Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2!= null){
            if(head1.data <= head2.data){
                temp.next = head1; // put data to the temp ke next wali node me 
                head1 = head1.next; // point head to current node ke next me 
                temp = temp.next; // point temp to jisme abhi data dala i.e current  node
            }
            else{
                temp.next = head2; 
                head2 = head2.next;
                temp = temp.next;
            }
        }
      while(head1 != null ){
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;

      }
      while(head2 != null){
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
      }

      return mergedLL.next;
    }
    public static void zigZagLL(Node head){
        // find mid 
         Node slow = head;
         Node fast = head.next;
         while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
         }
        Node mid = slow;
        // reverse  right half of LL
        Node curr = mid.next;
        mid.next = null;
        Node prev = mid.next; 
        Node next;
        while(curr!= null){
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next; 
        }
        // at the end prev point to last of the right half means right half get reversed
        Node left =  head; // this b/m leftHead
        Node right = prev; // this becomes right head
        Node nextL, nextR;

        // linking in zigzag pattern
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            
            // update 
            left = nextL;
            right = nextR;
        }
          
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.print();
        // ll.addFirst(2);
        //  ll.print();
        // ll.addFirst(1);
        //  ll.print();
        // ll.addLast(3);
        //  ll.print();
        // ll.addLast(4);
        //  ll.print();
        // ll.addMiddle(2, 9);
        // ll.print();
        // ll.addMiddle(5, 5);
        //  ll.print();
        // ll.addMiddle(0, 0);
        //  ll.print();
        //  System.out.println(size);
        //  System.out.println(ll.removeFirst());
        //  System.out.println(ll.removeLast());
        //  ll.print();
    //   System.out.println(ll.removeAtAny(0));
    //   ll.print();
    //   System.out.println(ll.itrSearch(size));
    //   ll.reverseItr();
    //   ll.print();
    //   ll.delNthFromEnd(4);
    //   ll.print();
  
    // ll.addLast(1);
    // ll.addLast(2);
    // ll.addLast(2);
    // ll.addLast(2);
    // ll.addLast(1);
    // System.out.println(ll.checkPalindrome());

/**
    // check merge sort 
    ll.addLast(5);
    ll.addLast(4);
    ll.addLast(3);
    ll.addLast(2);
    ll.addLast(1);
    ll.print();
    ll.head = mergeSort(head); // returns new head after sorting
    ll.print();
 */
  // form zigzag ll 
   ll.addFirst(6);
   ll.addFirst(5);
   ll.addFirst(4);
   ll.addFirst(3);
   ll.addFirst(2);
   ll.addFirst(1);
   ll.print();
   zigZagLL(head);
   ll.print();
   

    }
}
