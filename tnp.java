import java.util.*;
public class tnp {
    public static String createPass(String oldPass){
      int i = 0, j = oldPass.length()-1;
      String newPass = "";
      while(i<=j){
      if(i == j){
          newPass+= i;
         break;
      }
      else{
        if(i%2 == 0){
            int sum  = i+j;
            newPass += sum;
            i++; j--;
        }
        else{
            int sub = j-i;
            newPass += sub;
            i++; j--;
        }
      }
    }
    return newPass;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password string");
        String oldPass = sc.nextLine();
        System.out.println(createPass(oldPass));
    }
}

