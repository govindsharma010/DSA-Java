public class RecursionPracSheet {

    //Q.1
    public static int allOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            System.out.println(i);
          return  allOccurence(arr, key, i+1);
        }
        return allOccurence(arr, key, i+1);
    }

    //Q.2
    //mine approach
    // public static String converter( int arr[], int i,  String ans){
    //     String curr = "";
    //     if(i == arr.length){
    //         return ans;
    //     }
    //       int c = arr[i];
    //         switch (c) {
    //             case 0: 
    //                 curr = "Zero";
    //                 break;
    //             case 1: 
    //                 curr = "One";
    //                 break;
    //             case 2: 
    //                 curr = "Two";
    //                 break;
    //             case 3: 
    //                 curr = "Three";
    //                 break;
    //             case 4: 
    //                 curr = "Four";
    //                 break;
    //              case 5: 
    //                 curr = "Five";
    //                 break;
    //              case 6: 
    //                 curr = "Six";
    //                 break;
    //              case 7: 
    //                 curr = "Seven";
    //                 break;
    //             case 8: 
    //                 curr = "Eight";
    //                 break;
    //              case 9: 
    //                 curr = "Nine";
    //                 break;
    //              default:
    //              break;
                      
    //         }
    
    //      ans+= curr;
    //      ans+= " ";
    //      return converter(arr, i+1, ans);
             

    //     }
        //OR 
        static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eigth", "nine"} ;

        public static void converterpartwo(int number){
        if(number == 0){
            return;
        }
        int lastDigit = number%10;
        converterpartwo(number/10);

       System.out.print(digits[lastDigit]+ " ");
        }
    
    //Q3 doubt
    public static int stringLength(String str, int i, int count){
        if(str.charAt(i) == ' '){
            return count ;
        }
       return  stringLength(str, i+1, count+1);
    }
    //Q.4
     
    public static void subString(String str, int si, int ei, String s, int count){
        if(si == str.length()){
            System.out.println(count);
           return;
        }
        while( ei < str.length()){
            s+=str.charAt(ei);
            // System.out.print(s+ " ");
            if(si< s.length() && ei<s.length() && s.charAt(si) == s.charAt(ei)){
               count++;
               System.out.println(s);
            }
            ei++;
        }
        System.out.println();
        
        subString(str, si+1, si+1, "", count);
    }  
    
    public static void main(String[] args) {
        // int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
    //   allOccurence(arr, 2, 0);

//    int arr[] ={2,0,1,9};
//     String ans = "";
//   System.out.println(converter(arr, 0, ans ));

// converterpartwo(2019);

String str = "abcab";
// System.out.println(stringLength(str, 1, 0));

subString(str, 0, 0, "", 0);
    }
}
