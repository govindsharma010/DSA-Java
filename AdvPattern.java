public class AdvPattern {
    

    //***********PRINTING PATTERN USING SAME FOR LOOP BY APNA CLG PRACTIECE SESSION */ 1 to 4
//1.
public static void lowerTriangle(){
    for(int i= 1; i<=5;i++){
     for(int j =1; j<=5; j++){
        if(j>=i){
            System.out.print("*");
        }
       
     }
     System.out.println();
    }
}

// 2.

public static void topLeftTriangle(){
    int n = 10;
    for(int row = 1; row<=n; row++){
        for(int col = 1; col<=n; col++){
         if(row+col>=n+1){
            System.out.print("*");
         }
         else{System.out.print(" ");}
         
        }
        System.out.println();
    }
}

// 3.X pattern

public static void Xpattern(){
    int n= 5;
    for(int row = 1; row <=n;row++){
        for(int col = 1; col<=n; col++){
            if(row==col /*or row-col==0*/|| row+col ==n+1 ){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }

        }
        System.out.println();
    }
}

// 4.Floyds Triangle

public static void FloydsTriangle(){
    int  n = 10;
    int number = 1;
  
    for(int row =1;row<=n; row++){
        //int val= row;
        for(int col=1;col<=n;col++){
            if(row>=col){
             System.out.print(/*val*/number + " ");
             //val++;
             number++;
            }
            else{System.out.print(" ");}

        }
        System.out.println();
    }
}

// Advanced pattern by shraddha mam 
//# by mine
    
//ulta pyramid pattern is rinted but logic is not good or clear
//edit: my logic was same as shraddha mam with a bit modification GOOD JOB GOVIND!
public static void RotatedHalfPyramid(){
    int n=5;
    //outer
    for (int line = 1; line <=n; line++){
        //spaces
        for(int star = 1; star<=n-line; star++){
            System.out.print(" ");
        }
        //star
        for(int star =1; star<=line;star++){
        System.out.print("*");
        }
        System.out.println();
    }
}   

 //hollow rwectangle # by mine
 public static void hollowRec(int Row,int Col){
        
    for(int row = 1;row<=Row;row++){
        for(int col = 1; col<=Col; col++){
            if(row==1||row==Row){
             System.out.print("*");
            }

            else if(col==1 || col==Col){ //or we can put this condition also in if with OR operator
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            
        }
        System.out.println();
    }
}
// inverted half pyramid by me in number Note: in notebook 2nd vesion of code by mam
public static void Chul(int n){
    for(int i =1; i<=n;i++){
       int count = 1;
        for(int j=i;j<=n;j++){
            System.out.print(count);
            count++;

        }
        System.out.println();
        
    }
}

// floyds triangle
//butterfly pattern
public static void Butterfly(int n){
    
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int k=1;k<=2*(n-i);k++){
            System.out.print(" ");
        }
        // for(int j=n;j>=n-i+1; j-- ){
        //     System.out.print("*");
        // }
        ///OR
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

      for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int k=1;k<=2*(n-i); k++){
            System.out.print(" ");
        }
        // for(int j=n;j>=n-i+1; j-- ){
        //     System.out.print("*");
        // }
        ///OR
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    
}

//Rhombus 
public static void SolidRhombus(int n){
    for(int i=1;i<=n;i++){
        // for(int j=i;j<n;j++)  OR
         for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int j= 1;j<=n; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void HollowRhombus(int n ){
    int j;
  for(int i=1;i<=n;i++){
            if(i==1&&i==n){
        for( j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for( j=1;j<=n;j++){
            System.out.print("*");
        }
       
    }

    else{
        for( j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        if(j==n-i+1||j==n-i+1+(n+2)){
            System.out.print("*");
        }

        for( j=1;j<=n-2;j++){
            System.out.print(" ");
        }
    


    System.out.println();
    }  
}
}
public static void main(String args[]){
// Chul(5);
// Butterfly(10);
// SolidRhombus(5);
HollowRhombus(5);
}

}
