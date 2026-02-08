import java.util.*;
public class ValidStrStack {
    public static boolean isValid(String str){
    Stack<Character> s = new Stack<>();

    for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
       
        if(ch == '(' ||  ch == '[' ||  ch =='{') {
            // opening brackets
            s.push(ch);
        }
        else{
            // closing 
           if(s.isEmpty()){ // if sare hi openning brackets rahe to that's why check
             return false;
           }
           if((s.peek() == '(' && ch == ')') // ()
             || (s.peek() == '{' && ch == '}') // {}
             || (s.peek() == '[' && ch == ']')){ // []
              s.pop();  
             } else{
                return false;
             }
        }
    }
    if(s.isEmpty()){
        return true;
    }
    else{
        return false;
    }
    }

    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

         for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            if(curr != ')'){
                s.push(curr);

            }
            else{
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true; // duplicate exist 
                }
                else{
                    s.pop(); // opening pair deleted
                }
            }
         }
         return false;
    }
    public static void main(String[] args) {
        String str = "((a+b) + (c+d))";
        // System.out.println(isValid(str));
        System.out.println(isDuplicate(str));
    }
}
