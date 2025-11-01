import java.util.*;

public class AtoZ {
 
    public static void findallSubString(String s, int end, int index, StringBuilder curr, List<String> res){
     // base case 
     if( index == end){
        return ;
     }
      curr.append(s.charAt(index));
      res.add(curr.toString()); // cuur is string builder cant add as it as stringbuilder so convert to string 
      findallSubString(s, end, index+1, curr, res);
    curr.deleteCharAt(curr.length()-1); // keep return and deleting last character so we have to hold at length = 0 taki nayi strings or bana paye

    // so 
    if(curr.length() == 0){
        findallSubString(s, end, index+1, curr, res);
    }
}
   public static void main(String args[]){
        String s = "govind";
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
      findallSubString(s, s.length(), 0, sb , list);
        for(String all : list){
            System.out.println(all);
        }

    }
}
// a b c 
// cat
// question on hackerrank 
List<Integer> res = new ArrayList<>();
        while(res.size()<arr.size()){
            d = d % arr.size();
            res.add(arr.get(d));
            d++;
        }
             return res;
