import java.util.*;
import java.util.LinkedList;
public class firstNonRepLtr {
    public static void printNonRep(String str){
        int freq [] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            //check
            while(!q.isEmpty() && freq[q.peek() - 'a'] >1){
             //   freq[q.peek() - 'a'] freq of character at top
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print("-1" + " ");
            }
           else{
            System.out.print(q.peek() + " ");
           }
            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRep(str);
        }
}
