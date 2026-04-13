
public class Solution {
    class Node {
    int data;
    Node left;
    Node right;
     }
   static  boolean checkBST(Node root) {
    return checkBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
}

static boolean checkBSTUtil(Node root, int min, int max) {
    if (root == null) {
        return true;
    }
    
    if (root.data <= min || root.data >= max) {
        return false;
    }
    return checkBSTUtil(root.left, min, root.data) &&
           checkBSTUtil(root.right, root.data, max);
}
}
