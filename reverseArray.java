public class reverseArray {
    public static void reverse(int num[]){
        int first = 0; int last = num.length-1;
        while(first<last){
            int temp = num[first];
            num[first] = num[last];
            num[last] = temp;
            first++;
            last--;

        }
        for(int i= 0 ;i <num.length; i++){
        System.out.println( num[i]  +" ");
        }

       }  
       
       
       //pairs in array (MINE)
        public static void pairsInArray(){
            int mat [] ={2,4,6,8,10};
            for(int i= 0; i<mat.length;i++){
                for(int j=i+1;j<mat.length; j++){
                    System.out.print("(" + mat[i] + "," + mat[j] + ") ");
                }
                System.out.println();
            }
        }

        //SUBARRAYS
        public static void subArray(){
            int mat [] ={2,4,6,8,10};
            int ts=0; //int sum=0;
            // int Max = Integer.MIN_VALUE;
            // int Min = Integer.MAX_VALUE;

            for(int i=0; i<mat.length;i++){
             int start =i;
           
             for(int j =i;j<mat.length;j++){
                int end = j;
                 
                for(int k=i;k<=j;k++){
                    System.out.print(mat[k] + " ");
                    
                }
                ts++;
                System.out.println();
            }
            }
            System.out.println( "total no of subarrays are:" +ts);
        }

        //max subarrays sum

        public static void maxSubArraySum(){
            int mat [] ={1,-2,6,-1,3};
            //int sum=0;
            int maxSum = Integer.MIN_VALUE;
            int minSum = Integer.MAX_VALUE;

            for(int i=0; i<mat.length;i++){
             int start =i;
          
             for(int j =i;j<mat.length;j++){
                int end = j;
                 int currSum =0; 
                for(int k=i;k<=j;k++){
                    currSum  =currSum+mat[k];
                }
                System.out.println("Sum of the sub arrays is:" +currSum);
                if(currSum>maxSum){
                    maxSum = currSum;
                }
                if(currSum<minSum){
                   minSum = currSum;
                }
                System.out.println();
            
            }
        }
            System.out.println("Max sum of the above sub array is :"+ maxSum);
            System.out.println("Min sum of the above sub array is :"+ minSum);
        }

        //prefix matrix #mine
        public static void prefixMat(){
            int num[] = {2,4,6,8,10};
            int prefix[] = new int [num.length];
            int sum =0;
            prefix[0] =num[0];
            for(int i=1;i<prefix.length;i++){
                // sum= sum +num[i];{in this case start from i=0}
                // prefix[i]= sum;
                prefix[i] = prefix[i-1] + num[i]; 

             
            }
            for(int i=0;i<num.length;i++){
                System.out.print(prefix[i] + " ");
            }
        }

        //max subarrray sum 2nd method 
        public static void maxSubarraySum(int num[]){
            int currSum = 0;
            int maxSum = Integer.MIN_VALUE;
            int prefix[] = new int[num.length];

            prefix[0] = num[0];
            for(int i=1;i<prefix.length;i++){
                prefix[i] = prefix[i-1] + num[i];
            }           
        

        for(int i=0;i<num.length;i++){
            int start =i;
            for(int j=i; j<num.length;j++){
                int end = j;
                currSum = start==0 ? prefix[end] : prefix[end]-prefix[start-1];

                if(maxSum<currSum){
                    maxSum  = currSum;
                }
             
            }
        }
        System.out.println("max sum = " +maxSum);
    }

// method no 3 KADANES ALGORITHM
public static void kadanes(int num[]){
    int cs = 0;
    int ms = Integer.MIN_VALUE;
    for(int i=0;i<num.length;i++){
        cs = cs + num[i];
        if(cs<0){
            cs = 0;
        }
        ms = Math.max(cs,ms);


    }
    System.out.println("Our max subarray sum is = " + ms);

}
    // max subArray sum for a matrix whose all elements are negative
    //mine dont know the approach is right or wrong but the o/p for negative matrix will always right
    public static void negKedanes(int num[]){
        boolean negMat = false;
        int ms = Integer.MIN_VALUE;
        for(int i= 0;i<num.length;i++){
            if(num[i]<0){
                negMat = true;
            }
            else{
                negMat= false;
                break;
            }
        }
        if(negMat){
            for(int i=0;i<num.length;i++){
                ms = Math.max(num[i],ms);

            }
            System.out.println("Max sum is"+ ms);
        }
        else{
            System.out.println("Not a negative matrix");
        }
      

    }

    public static void main(String args[]){
        // int num[]= {2,45,23,676,32};
        // reverse(num);
        // System.out.println(num.length);
        // pairsInArray();
        // subArray();
        // maxSubArraySum();
        // prefixMat();
        // int num[] = {1,-2,6,-1,3};
        // maxSubarraySum(num);
        // int num[] = {-2,-3,4,-1,-2,1,5,-3};
        // kadanes(num);
        int num[] = {-4,3,-2,-1};
        negKedanes(num);

    }
}
