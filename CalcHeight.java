import java.util.*;
public class CalcHeight {
     static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }
    public static int count(Node root){
        if(root == null){
            return 0;
        }
        
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount +1;
        }

    // FUNCTION FOR CALCULATING DIAMETER OF TREE   O(n^2)
    public static int calcDiam(Node root){
        if(root == null){
            return 0;
        }

        int lDiam = calcDiam(root.left);
        int rDiam = calcDiam(root.right);
        int lheight = height(root.left);
        int rheight = height(root.right);
        int selfDiam = lheight + rheight +1;
        return Math.max(selfDiam, Math.max(lDiam, rDiam));
    }
    // optimized approach o(n)
      static class Info{
        int diam;
        int ht;
        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
      }
     public static Info diameter(Node root){
        if(root == null){
            return new Info(0,0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        return new Info(diam,ht);
     }

    public static boolean isIdentical(Node node, Node subRoot){
     // rather than checking each node data for identical check for non Identical
     if(node == null && subRoot == null){
        return true;
     } else if(node == null || subRoot == null || node.data != subRoot.data){
        return false;
     }

      // if(!isIdentical(node.left, subRoot.left)){
        //     return false;
        // }
        //  if(!isIdentical(node.right, subRoot.right)){
        //     return false;
        // }
        
        // return true;

        // or
      
     return isIdentical(node.left, subRoot.left) && isIdentical(node.right, subRoot.right);
    }
    
    public static boolean isSubtree(Node root, Node subRoot){
        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }
        
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }


    // top view of a tree  by concept of horizontal distance
    public static class Detail {
        Node node;
        int hd;
    
      public Detail(Node node, int hd){
        this.node = node;
        this.hd = hd;
      }
    }
    public static void topView(Node root){
        // level Order traversal
        Queue<Detail> q =  new java.util.LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0; int max = 0;
        q.add(new Detail(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            Detail curr = q.remove();
            if(curr == null){
             if(q.isEmpty()){
                break;
             }else{
                q.add(null);
             }

            }
            else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node);
                }
                if(curr.node.left != null){
                    q.add(new Detail(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }
                if(curr.node.right != null){
                    q.add(new Detail(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);

                }
            }
        }
        for(int i = min; i<= max; i++){
            System.out.print(map.get(i).data + " ");
        }
    }

    // print Kth level of a tree
    // 1st way iterative
    public static void kLevel(Node root, int k){
        int lvl  = 1;
        Queue<Node> q = new java.util.LinkedList<>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
           
            Node curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);// As null is found and q is not empty change the level
                    lvl++;
                }
            }
            else{
                if(lvl == k){
                    System.out.print(curr.data + " ");  
                } // if we are at our desired level then we do not need to traverse the upcoming level so after 2 , 3 , null 
                // at level 2  no further insertion takes place and as null appear in q break the loop
                else{
                   if(curr.left != null){
                      q.add(curr.left);
                    }
                    if(curr.right != null){
                      q.add(curr.right);
                    }
                }

                
            }
        }
    }

    // 2nd approach recursiv e approach
    public static void kLevel2(Node root, int level , int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data + " ");
            return;
        }
        kLevel2(root.left, level+1, k);
        kLevel2(root.right, level+1, k);
        
    }

    
    // Least Common Ancestor
    public static boolean getPath(Node root, int n, ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
      boolean foundLeft = getPath(root.left, n, path);
      boolean foundRight = getPath(root.right, n, path);

      if(foundLeft || foundRight){
        return true;
      }
      path.remove(root);
      return false;
    }

    public static Node lca(Node root, int n1, int n2){

        // find the path for each node n1 and n2
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getPath(root, n1, path1);
        getPath(root, n2, path2);

        // last common ancestor
        int i=0;
        for(; i<path1.size() && i<path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        // last Equal node
        Node lca = path1.get(i-1);
        return lca;

    }

    // approach 2 for lca 
    public static Node lca2(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        if(leftLca == null){
            return rightLca;
        }
        if(rightLca == null){
            return leftLca;
        }

        return root;
    }
    // min distance betwen 2 nodes

    public static int lcaDist(Node root , int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }else if(leftDist == -1){
            return rightDist + 1;
        }else{
            return leftDist + 1;
        }
    }
   public static int minDist(Node root, int n1, int n2){
    Node lca  = lca2(root, n1, n2);
    int dist1 = lcaDist(lca , n1);
    int dist2 = lcaDist(lca,n2);
    return dist1 + dist2;
   }
   public static int KAncestor(Node root, int n, int k){
    if(root == null){
        return -1;
    }
    if(root.data == n){
        return 0;

    }
    int leftDist = KAncestor(root.left, n, k);
    int rightDist = KAncestor(root.right, n, k);

    if(leftDist == -1 && rightDist == -1){
        return -1;
    }
    
    // calculating distance from the subtree where node exist or where it didnt return -1
    int max = Math.max(leftDist, rightDist);
    if(max+1 == k){
        System.out.println(root.data);
    }

    //otherwise
    return max +1; //(return increased distance)

   }

    public static void main(String[] args) {
    //     Node root = new Node(1);
    //     root.left = new Node(2);
    //     root.right = new Node(3);
    //     root.left.left = new Node(4);
    //     root.left.right = new Node(5);
    //     root.right.left = new Node(6);
    //     root.right.right = new Node(7);
    //    //  root.right.right.right = new Node(8);
    //    //System.out.println(height(root));
    //    //System.out.println(count(root));
    //    System.out.println(diameter(root).diam);

    // checking for subtree
    Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
      //  root.left.left.left = new Node(6);
      root.right.left = new Node(6);
        root.right.right = new Node(7);
    /* 
    // subtree
     Node subRoot = new Node(2);
     subRoot.left = new Node(4);
     subRoot.right = new Node(5);
*/
    // System.out.println(isSubtree(root, subRoot));
    //topView(root);

    // k th lvl print
    //kLevel(root, 5);
    // kLevel2(root, 1, 3);

    // lca 
    //System.out.println(lca(root, 4, 5).data);

    // lca 2
    //System.out.println(lca2(root, 4, 5).data);

    // MIN DISTANCE
    System.out.println(minDist(root, 4, 6));
    }
}
 