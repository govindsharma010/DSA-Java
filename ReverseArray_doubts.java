public class ReverseArray_doubts {
    // public static void Reverse1(int old[],int New[]){
    //     int i= old.length;
    //     int j= 0;
    // while(i>=0){
    //     New[j]= old[i];
    //     i--;
    //     if(j<=old.length){
    //     j++;
    //     }
    // }

    // for(int k= 0;i<5;i++){
    //     System.out.println(old[k]);
    // }
    // for(int k= 0;i<5;i++){
    //     System.out.println(New[k]);
    // }
    // }
    

    // Reverse Array in same Array
    public static void Reversing(int num[]){
        for(int i= 0;i<=(num.length)/2;i++){
        int j= num.length-i;
         int temp = num[i];
         num[i] = num[j];
         num[j] = temp;
        }
        for(int i= 0; i<=num.length;i++){
            System.out.println(num[i]);
        }
    }
    
    public static void main(String args[]){
    // int old[] = {2,4,6,8,10};
    // int New[] = new int[old.length];
    // Reverse1(old,New); 
    int num[] = {2,4,5,6,7};
    Reversing(num);
    }
}
