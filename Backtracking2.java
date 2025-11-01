public class Backtracking2 {
    public static void findSubsets(String str, int i, /*String ans*/StringBuilder ans ){
        if(i == str.length()){
            if(ans.length() == 0){
            System.out.println("null");
            
        } else{
            System.out.println(ans);
        }
        return;
    }
    // findSubsets(str, i+1, ans+str.charAt(i));
    // findSubsets(str, i+1, ans);

   /*if we use string builder  */ 
     findSubsets(str, i+1, ans.append(str.charAt(i)));

     findSubsets(str, i+1, ans.deleteCharAt(ans.length()-1));
}
public static void main(String[] args) {
    String str = "abc";
    findSubsets(str, 0, /* "" */new StringBuilder(""));
}
}
