import java.util.*;
public class Arrays2d{
    public static void largest(int matrix[][]){
        int largest = Integer.MIN_VALUE; 
        for(int i=0;i<matrix.length;i++){
         for( int j=0;j<matrix[0].length; j++){
            if(matrix[i][j]>largest){;
                largest = matrix[i][j];

            }
        }
    }
  System.out.println("largest numbber is the given matrix is"+ largest );

    }
    public  static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length; j++){
                if(matrix[i][j]==key){
                    System.out.println("Key is found at("+i+ "," +j+ ") cell");
                    return true;
                }
            }
        }
        System.out.println("KEy not found");
        return false;
    }
public static void main(String [] args){
    int matrix[][] = new int[3][3];
    int n = matrix.length; int m = matrix[0].length;
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            matrix[i][j]  = sc.nextInt();
        }
    }
    //output
    for(int i=0;i<n;i++){
        for(int j=0; j<m;j++){
            System.out.print(matrix[i][j]+ " ");
        }
        System.out.println();
        }
        search(matrix, 5);
        largest(matrix);
}


}