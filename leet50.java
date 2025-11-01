// unsolved 
public class leet50 {
    public static double myPow(double x, int n) { 
        if(n<0){
         x = 1/x;
         n = -n;
        }
        return myPow(x,n);
     }
        public  static double power( double x, int n){
         if(n == 0){
              return 1;
         }
 
          double halfp = power(x, n/2);
          long halfpSq = halfp * halfp;
 
          if( n % 2 == 0){
           halfpSq = a * halfpSq;
         } 
 
          return halfpSq;
 
         }

    public static void main(String [] args){
        System.out.println(myPow(2, -1));
    }
      
     }

