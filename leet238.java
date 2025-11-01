public class leet238 {

    //#mine
    public static void q238(int num[]){
        int product[] = new int[num.length]; 
       
        for(int i=0;i<num.length;i++){
            int prod =1;
            for(int j=0;j<num.length;j++){
                if(i==j){
                    // num[j] = 1; it makes error
                    continue;
                }
                prod = prod* num[j];
            }
            product[i] = prod;
        } 
        for(int i=0;i<num.length;i++){
            System.out.print(product[i] + " ");
            
        }
    }
    //optimized solution prefix suffix matrix
    public static void q238P2(int nums[]){
        int n= nums.length; int res[] = new int [n];
        int prefix[] = new int [n];
        int suffix[] = new int [n];
        //prefix arrray
        prefix[0] = nums[0];
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1]*nums[i];
        }
        //suffix array
        suffix[n-1] = nums[n-1]; 
        for(int i=n-2; i>=0; i--){
            suffix[i] = suffix[i+1]*nums[i];
        }
        //loop
        for(int i=0;i<n;i++){
         if(i==0){
            res[i] = suffix[i+1];
         }
         else if(i==n-1){
            res[i] = prefix[i-1];
         }
         else{
            res[i]= prefix[i-1]*suffix[i+1];
         }
        }
    for(int i= 0; i<n; i++){
        System.out.print(res[i]+ " ");
    }
    }
    //problen 169 majority element #mine but complexity is o(n^2)
    public static void MajorityElement(int nums[]){
       
     for(int i =0;i<nums.length;i++){
        int count = 0;
        for(int j=0;j<nums.length;j++){
            if(nums[i]==nums[j]){
                count++;  
             }
         }
            if(count>(nums.length)/2){
                int  majority = nums[i];
                System.out.println(majority);
              } 
       

     }
    }
    //Q 169 with o(n)
   public static void MajorityElement2(int nums[]){
    int majority = nums[0]; int lead = 1;
    for(int i=1;i<nums.length;i++){
        if(nums[i]==majority){
            lead++;
        }
        else if (lead>0){
            lead--;                                                     
        }
        else{
            majority = nums[i];
            lead =1;
        }
    }
    System.out.println(majority);
   }

   //#leet 33 Rotated array
   public static int search(int nums[],int target){
    int n= nums.length;
    int left= 0; 
    int right = n-1;
    while(left<right){
         int mid = (left+right)/2;
        if(nums[mid]>nums[right]){
            left = mid+1;
        } else{
            right = mid;
        }
    }
    int shift = left;
    left= 0; right =n-1;
    while(left<=right){
        int mid = (left+right)/2;
        int realmid = (mid + shift)%n;
    if(nums[realmid] == target) {
        return realmid;
    }
    else if(nums[realmid]< target){
        left = mid+1;

    }
    else{
        right = mid -1;
    }  
    
}
return -1;

   }
    public static void main(String args[]){
    //     int nums[]= {-1,1,0,-3,3};
    //    q238(nums);
    //    System.out.println();
    //    q238P2(nums);
    int nums[] = {3,2,3};
    MajorityElement2(nums);

    

    }
    
}
