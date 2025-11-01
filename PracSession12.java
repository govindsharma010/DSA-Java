// mine thinking out of the box (OTB thinking) using the concept of JACKED ARRAY Or ARRAY OF POINTERS

import java.util.*;
public class PracSession12{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //column size not defined
        int mat[][] = new int [4][];
        for(int i =0; i<4; i++){

            //IN every row column size is assigned 
            mat[i]= new int [i+1];
            //set the column array values in each row
        
            for(int j=0;j<mat[i].length;j++){
                mat[i][j] = sc.nextInt();
            }
         
        }
        //print array
        for(int i=0;i<mat.length;i++){

            for(int j=0; j<mat[i].length; j++){
                //traversing each column upto each row array length i.e. mat[i].length

                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
            

        }
        

    }
}