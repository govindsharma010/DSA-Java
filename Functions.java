import java.util.*;
public class Functions {
   
  
  public static /*int*/ void printHelloWorld(){
        System.out.println("Hello World");
        /*return 1; */ return;
     }
     public static int  calculateSum(int num1, int num2){//parameters or formal parameters
        int sum  = num1 + num2;
        System.out.println(sum);
        return sum;
     }
     public static void Swap(int a, int b){
      int temp = a;
      a = b;
      b = temp;
      System.out.println("a = " +a);
      System.out.println("b = " +b);
     }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

      //   int a = sc.nextInt();
      //   int b = sc.nextInt();
      //   int sum = calculateSum(a,b)/*arguments or actual parameters*/ ;//this sum variable is different from sum variable in calculateSum function
      //   System.out.println("Sum is :" + sum);
      //   // calculateSum(a,b); //OR store it to a another variable and sum function se sum return karwa lo or use variable me store karwa lo main me
      // //printHelloWorld();

    int a = 5;
    int b = 10;
    Swap(a,b);

    }
}
