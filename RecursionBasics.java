public class RecursionBasics {
public static void printDec(int n ){
    if(n == 1){
        System.out.println(n);
        return ;

    }
    System.out.print(n + " ");
    printDec(n-1);
}
public static void printInc(int n){
    if(n == 1){
        System.out.print(n + " ");
        return;
    }
    printInc(n-1);
    System.out.print(n + " ");
}
public static int fact(int n){
    if( n == 0){
        return 1;
    }
    int fnm1 = fact(n-1);// or can avoid this line 
    int fn = n * fact(n-1);
    return fn;
}

public static int calcSum(int n){
    if(n == 1){
        return 1;
    }
    int Snm1 = calcSum(n-1);
    int Sn =   n + Snm1 ;
    return Sn ;
}

public static int fib(int n ){
    if(n == 0 || n == 1){
        return n;
    }
    
    int fnm1 = fib(n-1);
    int fnm2 = fib(n-2);
    int fn = fnm1 + fnm2 ;
    return fn;
}
 public static boolean isSorted(int arr[], int i){
    if(i == arr.length-1 ){
        return true;
    }
    if(arr[i] > arr[i+1]){
        return false;
    }

    return isSorted(arr, i+1);      
 } 
 
 public static int firstOccurance( int arr[], int key, int i){
    if(i == arr.length){
        return -1;
    }
    if(arr[i] == key){
         return i;
    }

    return firstOccurance(arr, key, i+1);
 } 

 public static int lastOccurance(int arr[], int key, int i){
    if(i == arr.length){
         return -1;
    }
    
    int isFound = lastOccurance(arr, key, i+1);
    if(isFound == -1 && arr[i] == key) {
         return i;
    }

    return isFound;
 }

 public static int power(int x, int n){
    if(n == 0){
        return 1;
    }
    
    // int xnm1 = power(x, n-1);
    // int xn = x* xnm1;
    // return xn;
                   // *************OR**************

     return x * power(x, n-1);
 }

 // Optimized x to the power n

 public static int optimizedPower(int a, int n){
    if(n == 0){
        return 1;
    }
    int halfPower = optimizedPower(a, n/2);
    int halfPowerSq = halfPower * halfPower;

    // n is odd
    if(n % 2 != 0){
        halfPowerSq = a * halfPowerSq;
    }

    return halfPowerSq;
 }
 //for n < 0 (leet 50)

//  public static double myPow(double x, int n) {;
//     if(n == 0){
//      return 1;
//     }
//     if(n<0){
//     double pnp1 = myPow(1/x, n+1);
//     return 1/x * pnp1;
//     }
//     double pnm1 = myPow(x, n-1);
//     return x * pnm1; 
//  }

public static int tillingProblem(int n ){
    //base case
    if(n == 0 || n == 1){
        return 1;
    }
    
    // kaam 
    // vertical choice
    int fnm1 = tillingProblem(n-1);

    //horizontal choice
    int fnm2 = tillingProblem(n-2);

    int twoWays = fnm1 + fnm2;
    return twoWays;
}

public static  void duplicateCutter( String str , int i, StringBuilder newStr, boolean map[]){
    // int map[] = new int[26];
    if(i == str.length()){
        System.out.println(newStr);
        return;
    } 
     //kaam
    char curr = str.charAt(i);
    // int index = curr - 'a'; 
   
        if(map[curr - 'a'] == true){
            duplicateCutter(str, i+1, newStr, map);
        }
        else{
         map[curr - 'a']  = true;
        duplicateCutter(str, i+1, newStr.append(curr), map);
        
        }
    }
    public static int friendPairing(int n ){
        if(n == 1 || n == 2){
            return n;
        }
        // single 
        int fnm1 = friendPairing(n-1);

        // pair
       int fnm2 = friendPairing(n-2);
       int pairWays = (n-1) * fnm2;

       //totalWays
       int totalWays = fnm1 + pairWays;
       return totalWays;
    
    }
   public static void printBinaryString(int n, int lastPlace, String str){
    //Base case
    if(n == 0){
        System.out.println(str);
        return;
    }

    // kaam
    /* 

     printBinaryString(n-1, 0, str.append("0"));

   if(lastPlace == 0){
    printBinaryString(n-1, 1, str.append("1"));
   }

    */
    
   // cant get proper asnwer due to string builder use 
   // instead of that we will use string now
 
   printBinaryString(n-1, 0, str+"0");

   if(lastPlace == 0){
    printBinaryString(n-1, 1, str+"1");
   }

   // if question change to no consequtive 0will occur then

//    printBinaryString(n-1, 1, str+"1");
//    if(lastPlace == 1){
//     printBinaryString(n-1, 0, str+"0");
//    }
}

   

public static void main(String[] args) {
    // int n = 5;
    // int arr[]= {5,5,5,5};
    // System.out.println(optimizedPower(2, -1));
    // System.out.println(tillingProblem(6));
    // String str = "appnnacollege";
    // Stringbuilder newStr = new StringBuilder(""); if this is written and then if I passed newStr in function call
    // then it show error of "StringBuilder cant be converted to stringBuilder"
    // int map[] = new boolean[26];
    // duplicateCutter(str, 0,new StringBuilder(""), new boolean[26]);
    // System.out.println(friendPairing(4-1));
    // printBinaryString(3, 1, "");

    int arr[] ={8, 3, 6, 9, 5, 10, 2, 5, 3};
    System.out.println(lastOccurance(arr, 5, 0));

}
}
