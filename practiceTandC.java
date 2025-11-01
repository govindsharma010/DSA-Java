// public class practiceTandC {
//     public static void main(String args[]){
//         Hello h = new Hello();
//         h.divide(8,4);
// }
// }
// class Hello{
//     int result;
//         void divide (int a, int b){
//         try{ result = a/b ;}
//      }
//     catch(Exception e){
//         System.out.println(result);
//     }
// }
public class practiceTandC {
    public static void main(String args[]){
        Hello h = new Hello();
        h.divide(8, 0);
    }
}

class Hello {
    int result;
    
    void divide (int a, int b) {
        try {
            result = a / b;
            System.out.println(result); // Print result here
        } catch (ArithmeticException e) { // Catch specific exception
            System.out.println("Cannot divide by zero");
        }
    }
}

