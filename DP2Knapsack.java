public class DP2Knapsack {
    // recursion 
public static int knapSack(int val[], int wt[], int W, int n){
    if(W == 0 || n == 0){
        return 0;

    }

    if(wt[n-1] <= W){
        // include
        int ans1 = val[n-1] + knapSack(val, wt, W-wt[n-1], n-1);

        // exclude
        int ans2 = knapSack(val, wt, W, n-1);

        return Math.max(ans1, ans2);
    }
    else{// not valid
        return knapSack(val, wt, W, n-1);  // exclude

    }
}

// memoization
public static int knapSack2(int val[], int wt[], int W, int n, int dp[][]){
    if(W == 0 || n == 0){
        return 0;

    }
    if(dp[n][W] != -1){
        return dp[n][W];
    }

    if(wt[n-1] <= W){
        // include
        int ans1 = val[n-1] + knapSack2(val, wt, W-wt[n-1], n-1, dp);

        // exclude
        int ans2 = knapSack2(val, wt, W, n-1, dp);

        dp[n][W] =  Math.max(ans1, ans2);
        return dp[n][W];
    }
    else{// not valid
        dp[n][W] =  knapSack2(val, wt, W, n-1, dp);
        return dp[n][W]; // exclude

    }
}
public static void main(String[] args) {
    int val[]  = {15, 14, 10, 45, 30};
    int wt []=  {2, 5, 1, 3, 4};
    int W = 7;
    int dp[][] = new int[val.length + 1][W +1];
    for(int i=0; i<dp.length; i++){
        for(int j=0; j<dp[0].length; j++){
            dp[i][j] = -1;
        }
    }
    System.out.println(knapSack2(val, wt, W, val.length, dp ));
}
}
