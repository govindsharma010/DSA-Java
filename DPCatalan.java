import java.util.Arrays;

public class DPCatalan{
    public static int findCatalan(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int Cn  = 0;
        // not passing Cn as parameter because we are calculating Cn in bottom up manner and we need to calculate Cn for all values from 0 to n
        for(int i=0; i<n; i++){
        Cn += findCatalan(i)*findCatalan(n-i-1);
        }
       return Cn;

    }
    
    public static int findCatalanMemoization(int n, int dp[]){
        if(n == 0 || n == 1){
            return  1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
          int ans = 0;
            for(int i=0; i<n; i++){
              ans += findCatalanMemoization(i, dp) * findCatalanMemoization(n-i-1, dp);
              
            }
        return dp[n] = ans;
    }
    public static int findCatTab(int n, int dp[]){ //n^2
        dp[0] = 1;
        dp[1] = 1;
        
       for(int i=2; i<=n; i++){
        int ans = 0;
          for(int j=0; j<i; j++){
           ans += dp[j]*dp[i-j-1]; // Ci = Cj * C(i-j-1) where j varies from 0 to i-1
          }
          dp[i] = ans;
        }
    return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(findCatalan(n));
       // System.out.println(findCatalanMemoization(n, dp));
       System.out.println(findCatTab(n, dp));
    }
}
