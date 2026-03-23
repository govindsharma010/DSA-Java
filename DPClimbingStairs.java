import java.util.Arrays;

public class DPClimbingStairs {
    public static int countWays(int n){ // O(2^n)
        if(n == 0){
            return 1;

        }
        if(n <0){
            return 0;
        }
        return countWays(n-1) + countWays(n -2);
    }

    // memoization
    public static int countWays2(int n, int countW[]){
        if(n == 0){
            return 1;
        }
        if(n <0){
            return 0;
        }
        if(countW[n] != -1){ //  already calculated 
            return countW[n];
        }
        countW[n] = countWays(n-1) + countWays(n -2);
        return countW[n];
    } 

    // tabulation
    public static int countWaysTab(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
  // tabulation loop
        for(int i=1; i<=n; i++){
            if(i == 1 ){
                dp[i] = dp[i-1] + 0;

            } else{
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int countW[] = new int[n+1];
        Arrays.fill(countW, -1);
        System.out.println(countWaysTab(n));
      System.out.println(countWays2(n, countW));
        System.out.println(countWays(n));
       
       

    }
}
