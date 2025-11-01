import java.util.*;
public class BitManipulation {
    public static void oddEven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0 ){
            //even
            System.out.println("Number is Even");
            
        }
        else{
            //odd when n&bitmask ==1
            System.out.println("Number is odd");
        }

    }
    public static int getIthBit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask)==0){
            return 0;
        }
        else{
            //if o/p comes 1&1 = 1 
            return 1;
        }
    }

    public static int setIthBit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask ;
    }

    public static int updateIthBit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return clearIthBit(n, i);
        // }
        // else{
        //     return setIthBit(n, i);
        // }

        //OR
        n = clearIthBit(n,i);
        int BitMask = newBit<<i;
        return n | BitMask; 
    }

    public static int clearLastIthBit(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
   
    public static int clearBitsinRange(int n, int i, int j){
        int  a = ((~0)<<(j+1));
        int  b = (1<<i)-1;
        int bitMask = a | b ;
        return n & bitMask ;
    }

    public static boolean checkPowerOfTwo(int n){
        return (n & (n-1))== 0;
    }
     
    public static int countSetBits(int n){
        int count = 0;
        int copy = n; int i=0;
        while(n>0){
            if((n & 1 ) != 0){
                count++ ; 
            }
            n = n>>1;

        }
        return count ;
    } 
 

    // Fast Exponentiation
    public static void main(String[] args) {
        // oddEven(3);
        // oddEven(0);
        // oddEven(12);
        // oddEven(1);
    //    System.out.println(getIthBit(10,2));
    //    System.out.println(setIthBit(10,2));
    //    System.out.println(clearIthBit(10,1));
    //    System.out.println(updateIthBit(10, 2, 0));
    //    System.out.println(clearLastIthBit(15, 2));
       System.out.println(clearBitsinRange(10, 2, 7));
       System.out.println(checkPowerOfTwo(16));
       System.out.println(countSetBits(16));
    }
}