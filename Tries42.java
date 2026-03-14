public class Tries42 {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        // constructor
        Node(){
            // initialize array with null
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        // jitne letter honge word me utne hi level form honge
        for(int lvl = 0; lvl<word.length(); lvl++){
            int idx = word.charAt(lvl) - 'a' ;
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        //as word reaches to end
        curr.eow = true;
    }
    public static  boolean search(String key){
        Node curr = root;
        for(int lvl = 0; lvl<key.length(); lvl++){
            int idx = key.charAt(lvl) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        // finally if all letter exists then
        return curr.eow == true; // check where words ends is exist in array ie eow is true or not
    }
    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any", "thee"};
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        System.out.println(search("thee"));
          System.out.println(search("an"));
    }
}
