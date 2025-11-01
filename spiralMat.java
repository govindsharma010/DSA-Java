import java.util.*;
public class spiralMat {
    public static void Spiral(int mat[][]){
       // further solve this question on leet code after study array list
        int n= mat.length; int m = mat[0].length;
        int lastRow=n-1;//3
        int column = m-1;
         int row=0;
        while(lastRow>=row /*apply this condition in every loop as it(spiral matrix) can end in between the loop */ )
        //for better understanding there should be column specified variable and row sopecified variables seperately 
        // and also more reducing loop run we have to add column condition also in the while loop as mam taught in their code 
        {
            // top part
            for(int i=row;i<=column;i++){
                System.out.print(mat[row][i]+ " ");
            }
            //last column i.e right part
           
            for(int j=row+1;j<=lastRow;j++){
                System.out.print(mat[j][column]+ " ");
            }
            //last row i.e bottom part
             for(int k=column-1;k>=row ;k--){
                System.out.print(mat[lastRow][k]+ " ");
             }
             //column==row i.e left part
            for(int l= lastRow-1;l>row;l--){
                System.out.print(mat[l][row]+ " ");
            }
            row++;
            column--;
            lastRow--;

        }
    }
    public static int diagonalsSum(int mat[][]){
        int i=0,j=0; int Row = mat.length-1; int Col =mat[0].length-1;
        // int primSum=0, secSum=0; 
        int sum =0;
        System.out.println("Hello");
        while(i<=Row && j<=Col){

            //primary sum

            // primSum+=mat[i][j];
            sum+= mat[i][j];

         //secSum

        //  if(mat[i][j] != mat[i][Col-j])
        // 1 test case failed in case of all elements of a matrix are equal so dont compare element instead compare or check the position for secondary sum to avoid adding common index

        if(j!= Col-j)
         {
        //    secSum+= mat[Row-i][Col-j]; 
        sum+= mat[i][Col-j];
         }
         i++;
         j++;
        }
        // int totalSum = primSum + secSum;
        // System.out.println("Total sum is "+primSum+ "+" +secSum+ "=" + totalSum);
        return sum;

    }
    //OR 
    public static int diagonalsSum2(int mat[][]){
        int sum=0;
        for(int i=0;i<mat.length;i++){
            //pd
            sum+= mat[i][i];
            //sd
            if(i!= mat.length-1-i)
               sum+= mat[i][mat.length-1-i];
        }
        return sum;
    }

    public static void main(String args[]){
   /*  
   int mat[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
    Scanner sc =new  Scanner(System.in);
    for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            mat[i][j] = sc.nextInt();
        }
    
     Spiral(mat);
    */
    int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
    // System.out.println("Sum is:"+diagonalsSum(mat));
    // System.out.println("Sum is:"+diagonalsSum2(mat));
    Spiral(mat);
    }
    
}
