public class StringUpperCase {
   public static  String toUpperCase(String str){
    StringBuilder sb = new StringBuilder("");
    char c = Character.toUpperCase(str.charAt(0));
    sb.append(c);
    
    for(int i=1; i<str.length(); i++){
    if(str.charAt(i)==' ' & i<str.length()){
        sb.append(str.charAt(i));
        i++;
        sb.append(Character.toUpperCase(str.charAt(i)));
        
    }
    else{
     sb.append(str.charAt(i));
    }
    }
    return sb.toString();
   } 
   public static void main(String args[]){
   String str = "hi i am shraddha";
   System.out.println(toUpperCase(str));
   }
}
