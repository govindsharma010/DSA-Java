// N-Queens Problem: Place N queens on an N x N chessboard such that no two queens threaten each other.

public class NQueens {


    public static void nQueens(char Board[][], int row){
        //base case 
        if(row == Board.length){
            // printBoard(Board);
            count++;
            return;
        }

        //column loop 
        for(int j=0; j<Board.length; j++){
            if(isSafe(Board, row,j)){
            Board[row][j] = 'Q';
            nQueens(Board, row+1);
            
            //backtraking step
            Board[row][j] = 'X';
            }  
           
        }
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
               Board[i][j] = 'X';       }
            System.out.println();
        }
        nQueens(Board,0);
        System.out.println(count);
    }
}
