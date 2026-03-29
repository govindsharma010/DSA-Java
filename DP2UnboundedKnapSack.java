public class DP2UnboundedKnapSack {
    public static int unboundedKnapsack(int val[], int wt[], int W){
    int n = val.length ;
    int dp[][] = new int[n+1][W + 1];

    for(int i=0; i<n; i++){ // initializing  0th column from 0
      dp[i][0] = 0;
    }
    for(int j=0; j<dp[0].length; j++){//initializing 0th row from 0
        dp[0][j] = 0;
    }

    for(int i=1; i<n+1; i++){
        for(int j=1; j<W+1; j++){
          int v = val[i-1]; // ith item val i.e curr item
          int w = wt[i-1]; // ith item wt i.e curr item wt
          if(w <=j){ // if curr wt is less than knapsack capacity it means valid case
            int incProfit = v + dp[i][j-w]; // again looking in i items for the max profit as we can include same item again and again
            int excProfit = dp[i-1][j];
            dp[i][j] = Math.max(incProfit , excProfit);
          }
          else{
           // invalid : curr wt is grater than bag capacity
           int excProfit = dp[i-1][j];
           dp[i][j] = excProfit;
          }
        }
    }
     print(dp);
    return dp[n][W]; // last cell of dp matrix i.e dp[5][7];
}
public static void print(int dp[][]){
    for(int i=0; i<dp.length; i++){
        for(int j=0; j<dp[i].length; j++){
            System.out.print(dp[i][j] + "  ");
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    int val[]  = {15, 14, 10, 45, 30};
    int wt []=  {2, 5, 1, 3, 4};
    int W = 7;
     System.out.println(unboundedKnapsack(val, wt, W));
}
}
