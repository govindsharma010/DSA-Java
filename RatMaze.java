public class RatMaze {
    public static boolean ratInMaze(int board[][], int row, int col, int n, int m){
        //base case 
        if(row == n || col ==m){
            return false;
        }

        else if (row<0 || col < 0  ){
            return false;
        }
        
         if(board[row][col] == 0){
            return false;
        }
        

        if(row == n-1 && col == m-1){
            count++;
            return true;
          }
        
        // work
        if(ratInMaze(board, row, col+1, n, m)){
            return true;
        }
        if(ratInMaze(board, row+1, col, n, m)){
            return true;
        }

        if(ratInMaze(board, row-1, col, n, m)){
          return true;
        }

        if(ratInMaze(board, row, col-1, n, m)){
            return true;
        }
        
    return false;
    }

    static int count = 0;
    public static void main(String [] args){
        int board[][] = {
            {1,1,1,1},
            {0,1,0,1},
            {1,1,1,1},
            {1,0,1,1}
        };
         
        if(ratInMaze(board, 0, 0, 4, 4 )){
             System.out.println(count);
        }
      
    }
}
