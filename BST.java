import java.util.ArrayList;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val < root.data){
            // inserting in left subtree
         root.left =  insert(root.left, val);// this fn insert node in left subtree at suitable location and return that node
        }
        else{
            // inserting in right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //searching // O(height of tree)
    public static boolean search(Node root , int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(key < root.data){
        return search(root.left, key); // return to the parent from here whatever returned from left subtree 
        }
       else{
        return  search(root.right, key); // return whateever returned from right subtre
        }
        /*
        wrong approach 
         if(key < root.data){
        boolean left = search(root.left, key); // return to the parent from here whatever returned from left subtree 
        }
       else{
        boolean right = search(root.right, key); // return whateever returned from right subtre
        }
        return left || right

        wrong because traverse to the whole tree it used in B tree wher O(n) is t c 
         */
    }


    public static Node delete(Node root , int val){

        if(val < root.data){
            root.left = delete(root.left, val);
        }
        else if(val > root.data){
            root.right = delete(root.right, val);
        }
        else{
            // when reaches at the node whixh to be deleted
            // 3 cases

            // 1 if it is leaf node
            if(root.left == null && root.right == null){
                return null;
            }
            
            // 2nd case contains single child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            // 3rd case if contains 2 child, look for the inorder successor
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }

        if(root.data>=k1 && root.data<= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }

        else if(root.data < k1){
            printInRange(root.left, k1, k2);
        }
        
        else{
            printInRange(root.right, k1, k2);
        }
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
         System.out.print( path.get(i) + "->");  
        }
        System.out.println("Null");
    }
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null ){
            printPath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size()-1);

    }

    // validate tree
   
    public static boolean isValidBST(Node root, Node min, Node max){
       // min and max used to maintain the data of previous node so that we can compare easily

        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }

        else if(max != null && root.data > max.data){
            return false;
        }

         return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);    
        
        
       
    }
    public static Node mirrorBST(Node root){
        if(root == null){
            return null;
        }
        // leaf node 
        // if(root.left == null && root.right == null){
        //     return root;
        // }
       /* 
        //flaw in these lines is that when we are exploring right subtree and storing in left , then we are losing the left subtree. 
        //  mistakes :    
        root.left = mirrorBST(root.right);//exploring right subtree and storing in left
            root.right = mirrorBST(root.left);//exploring left subtree and storing in right
             */
        //correction
        Node leftMirror = mirrorBST(root.left);
        Node rightMirror = mirrorBST(root.right);

        root.left = rightMirror;
        root.right = leftMirror;
        
        return root;
    }
    public static void main(String[] args) {
        int values[] = {8,5,10,3,6,11};
        Node root = null;
        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
       inorder(root);
       System.out.println();
    //searching 
    /* 
    if(search(root, 100)){
       System.out.println("Found");
    }
    else{
       System.out.println("Not Found");
    }
    */
    

    //deletion
    /*inorder(root);
    System.out.println();

    root = delete(root, 5);
    System.out.println();

    inorder(root);
    */
     
     // range
    //printInRange(root, 5, 12);
    /* 
    // print path to  leaf
    printRoot2Leaf(root, new ArrayList<>());

    // 
    if(isValidBST(root, null, null)){
        System.out.println("Valid");
    }
    else{
          System.out.println("Not Valid");
    }
          */
     mirrorBST(root);
     inorder(root);

    }
}
