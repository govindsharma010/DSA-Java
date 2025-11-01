public class String_compressor {
  public static String Compress(String str){
    StringBuilder sb = new StringBuilder("");
   
    for( int j=0;j<str.length();j++){
        Integer count=1;
        //* how I applied while loop vs how shraddha mam applied */
      //     while(j<str.length()){
      //      if(str.charAt(j)==str.charAt(j+1)){
      //          count++;
     //        }
     //        j++;
      //    }

      while(j<str.length()-1 && str.charAt(j)==str.charAt(j+1)){
           count++;
           j++;
        }
        sb.append(str.charAt(j));
       if(count>1){
         sb.append(count.toString());
        }
        
    }
    
    return sb.toString();
  }
  public static void main(String args[]){
     String str = "aabbbbbbbcccccd";
     System.out.println(Compress(str));
  }
    
}
