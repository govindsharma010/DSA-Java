public class DPRodCutting { // tc = O(n * totalRod)
 public static int rodCutting(int len[], int price[], int totRod){
    int n = price.length;
    int dp[][]  = new int[n+1][totRod + 1];
    
// initialization, 0th row and 0th column set to 0
// by default 0 

    for(int i=1; i<n+1; i++){
        for(int j=1; j<totRod+1; j++){
            if(len[i-1] <= j){// valid
              dp[i][j] = Math.max(price[i-1] + dp[i][j - len[i-1]], dp[i-1][j]);
            }else{ // invalid curr piece length > actual total Rod length (not possible)
                dp[i][j] = dp[i-1][j];
            }
 
        }
    }
        return dp[n][totRod];
 }
public static void main(String[] args) {
    int length[]  = {1, 2, 3, 4, 5, 6, 7, 8 }; // pieces length
    int price[]  = {1,5, 8, 9, 10, 17, 17 ,20 };
    System.out.println(rodCutting(length, price, 8));
}
}
