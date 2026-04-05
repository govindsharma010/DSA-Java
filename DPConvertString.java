public class DPConvertString {
    public static int minOperations(String s1, String s2){
        int n  = s1.length();
        int m = s2.length();
        int dp[][] = new int[n+1][m+1];
        // innitialization
        for(int i=0; i<n+1; i++){ // 0th column
            dp[i][0] = i; 
        }
        for(int j=0; j<m+1; j++){ // 0th row
            dp[0][j] = j; 
        }

        // fill table
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
             if(s1.charAt(i-1) == s2.charAt(j-1)){
              dp[i][j] = dp[i-1][j-1]; // imagine it from traversing back 

              }else{
             // eg str1  = a b c d e f 
             // str2 =  b d  e g
              int addChar = dp[i][j-1] ;  //match for remainig chars of string 2 with string 1. ie str1 = abcdefg str 2 = bdeg  as g added in string 1 and matched with last char of string 2
              int deleteChar = dp[i-1][j] ;  // length of curr string reduced now match to string 2, str 1 = abcde  str2 = bdeg
              int replaceChar = dp[i-1][j-1] ; // replace char of string 1 with char of string 2 and match remaining chars, str 1 = abcdeg str 2 = bdeg
              dp[i][j] =  1 + Math.min(addChar, Math.min(deleteChar, replaceChar)); // add 1 for the operation performed

            }
         }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String word1 = "intention";
        String word2 = "execution";
        System.out.println(minOperations(word1, word2));
    }
}
