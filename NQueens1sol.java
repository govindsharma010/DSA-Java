 public class NQueens1sol{
    public static boolean nQueens(char board[][], int row){
        // base caase 
        if(row == board.length){
            printBoard(board);
            count++;
            return true;
        }
        
        //
        for(int col=0; col<board.length; col++){
            if(isSafe(board,row,col)){
                board[row][col] = 'Q';
                if(nQueens(board, row+1)){
                    return true;
                }
                // backtracking step: if we cant able to place queen to the next column then come back and replace the current queen
                board[row][col] = 'X';   
            }
        }
        return false;
    }

     public static boolean isSafe(char Board[][], int row, int col){
        // check column i.e vertical up
        for(int i=row-1; i>=0; i--){
            if(Board[i][col]== 'Q'){
                return false;
            }
        }
        // check left diagonal
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j-- ){
            if(Board[i][j] == 'Q'){
                return false;
            }
        }
        // check right up diagonal
        for(int i=row-1, j=col+1; i>=0 && j<Board.length; i--,j++ ){
            if(Board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
        }
     
         public static void printBoard(char Board[][]) {
        System.out.println("-----chess board---");
         for(int i=0; i<Board.length; i++){
            for(int j=0; j<Board.length; j++){
                System.out.print(Board[i][j]);
            }
            System.out.println();
        }
    }
     static int count = 0;
    public static void main(String[] args) {
        int n = 8;
        char Board[][] = new char[n][n];
        
        // initialising board 
        for(int i=0; i<Board.length; i++){
            for(int j=0; j<Board.length; j++){
               Board[i][j] = 'X'; 
             }
            System.out.println();
        }
        if(nQueens(Board,0)){
            System.out.println("Solution is possible");
              System.out.println(count);
        }
        else{
            System.out.println("Solution is not possible");
        }
      
    }


}