public class DPLCS { // O(m*n)
    public static String lcs(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
         int dp[][] = new int[n+1][m+1]; 
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;

                }else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
          
        }
        
        //   return dp[n][m];
        String ans = buildLCS(dp, n, m, s1, s2);
        return ans;

           
    }
    public static String buildLCS(int dp[][], int n, int m, String s1, String s2){
        StringBuilder lcs = new StringBuilder();
         int i = n; int j = m;
        while(i > 0 && j > 0){
            if(s1.charAt(i-1) == s2.charAt(j-1)){
                lcs.append(s1.charAt(i-1)); // include character
                i--;
                j--;
            } else if(dp[i-1][j] > dp[i][j-1]){
                i--; // move up (move to the point where large lcs exist)
            } else {
                j--; // move left (move to the point where large lcs exist)
            }
        }
        return lcs.reverse().toString(); // reverse the string as we built it backwards

    }
    public static void main(String[] args) {
        String s1 = "abcdge";
        String s2 = "abedg";
        System.out.println(lcs(s1, s2));
      
    }
}
