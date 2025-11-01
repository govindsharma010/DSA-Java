public class NPTEL {
   public static void main(String[] args) {
//    patternQ1(3);
//    factorsQ2(18);

   }
  //pattern question 
    
/* 
   public static void patternQ1(int n){
   /*
    for(int i =1; i<=n; i++){
        for(int j=i;j<=n;j++){
            System.out.print("*"+ " ");
        }
        System.out.println();
    }
    for(int i=n+1; i<=2*n-1; i++){
        for(int j=n; j<=i; j++){
            System.out.print("*"+ " ");
        }
        System.out.println();
    }
    
  // OR
  // optimized 
   
    for(int i=1; i<=2*n-1; i++){
        int stars = i<=n? n-i+1: i-n+1;
        for(int j=1; j<=stars; j++){
            System.out.print("*" + " ");
        }
        System.out.println();
      }
  
   }
   */
    
 
  //Q2 factors of a number
  /* 
   * public static void factorsQ2(int n){
    for(int i=1; i<=n; i++){
        if(n%i==0){
            System.out.print(i+ " ");
        }
    }
  }
  */
  
}

// week 7 last assignment

     
/*
 Implement a Simple Password Validator

In this task, you need to implement a password validation system using Java. The goal is to check if a given password meets the following conditions:

Minimum Length Requirement: The password must be at least 8 characters long.
Uppercase Letter Requirement: The password must contain at least one uppercase letter (A-Z).
Number Requirement: The password must contain at least one numeric digit (0-9).
If the password meets all three conditions, print "Valid Password". Otherwise, print "Invalid Password".

Input Format:

A single string representing the password (can contain alphabets, numbers, and special characters).
Output Format:

Print "Valid Password" if the password satisfies all the conditions.
Otherwise, print "Invalid Password".
Example Input:
Password123
Example Output:
Valid Password


 */
