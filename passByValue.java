public class passByValue {
    public static /*int*/ void changeA(int a){
        a = 10;
        //return a;

        // System.out.println(a); // value of a will 10
 } 
 public static int Factorial(int n){
      int fact = 1;
      for(int i= 1; i<=n;i++){
        fact = fact*i;
      }
      System.out.println(n+"!"+ "=" + fact);
      return fact;
 }
 public static int binCoef(int n, int r){
     int nfact = Factorial(n);
     int rfact = Factorial(r);
     int fact_nmr = Factorial(n-r);
   ///  int binCoef = nfact/(rfact*(fact_nmr));
     return nfact/(rfact*(fact_nmr)); //or return bincoef
 }
 public static boolean isPrime(int n){
   
   for(int i= 2; i<n;i++){
    if(n/i==0){
     
      return false;
     
    
    }
    break;
  
  }
   return true;
 }

    public static void main(String args[]){
        //Question 1
      /* int a = 5;
        changeA(a);
        System.out.println(a); //o/p value of a will 10 in this case either when return is void or int because the change is done inn copy of argument in function not in main function
        */


      /*
       // Question2
       // int n = 5;
       // Factorial(5); 
       System.out.println(Factorial(5)); // for this we have to change function return type from void to main
      */  


    /* 
      //Question3 To calculate binomial coefficient
      //nCr = n!/(r!*(n-r)!)

    //  int n = 5;
    //  int r = 2;
    //  int nfact = binCoef(n);
    //  int rfact = binCoef(r);
    //  int Nfact = binCoef(n-r);
    //  int ans = nfact/(rfact*Nfact);

     System.out.println( binCoef(5,2));
     */

     // Prime  no using function
      System.out.println(isPrime(15));
       
    }
}
 