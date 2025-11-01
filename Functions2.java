public class Functions2 {
    public static void binToDec(int binNum){
        int origNum = binNum;//Store original bin number to another variable 
        int pow = 0;
        int decNum = 0;
        while(binNum>0){
            int lastdigit = binNum%10;
            decNum+= (int)lastdigit*Math.pow(2,pow);
            pow++;
            binNum = binNum/10;
        }
        System.out.println("Decimal form of " +origNum+"is :" + decNum);
    }

    // DEcimal to Binary Function
    public static void decToBin(int decNum){
        int origNum = decNum;
        int binNum = 0;
        int pow = 0;
        while(decNum>0){
            int reminder = decNum%2;
            binNum+= reminder*Math.pow(10,pow);
            pow++;
            decNum/= 2;
        }
        System.out.println("Binary form of " + origNum + " is:" + binNum);
    }
    // Even number checker
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
 
    //Palindrome checker
    public static void Palindrome(int n){
        int origNum = n;
        int rev = 0;
        while(n>0){
            int lastdigit = n%10;
            rev = (rev*10) + lastdigit;
            n = n/10;
        }
        if(rev==origNum){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
    public static void main(String args[]){
        // binToDec(10001);
        // decToBin(17);
        // System.out.println(isEven(1));
        Palindrome(131);
    }
} 
 