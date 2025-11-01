public class SpaceTimeComplx {
    //T.C = O(n)
    public static int power2(int a , int n){
        if(n == 0){
            return 1;
        }
        int halfPowerSq = power2(a, n/2)*power2(a, n/2);
        if(n%2 != 0){// n  is odd
            return a*halfPowerSq;
        }
       
         return halfPowerSq;
    }
    // more optimized O(logn)
    public static int power3(int a , int n){
        if(n == 0){
            return 1;
        }
        int halfPower = power3(a, n/2);
        int halfPowerSq = halfPower*halfPower;
        if(n%2 != 0){// n  is odd
            return a*halfPowerSq;
        }
       
         return halfPowerSq;
    }
}
