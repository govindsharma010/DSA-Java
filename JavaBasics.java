import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Hello World");
        // int a =10;
        // System.out.println(a);
        // System.out.println("Enter your choice");

        // Boolean b = sc.nextBoolean();
        // //Type Casting********************
        // float x = 10.453f;
        // int y = (int)x;
        // System.out.println(y);
       //************************* 
 // Type casting and conversion
      /*  char ch  = (char)99;
 System.out.println(ch);
 */
//************************************ 
    //    char ch = 'a';
    //    int number = ch;
    //    System.out.println(number);
    //     // o/p = 97

    //===========OPERATORS============
    // int a = 10;
    // int b = ++a;
    // System.out.println(b);
    // System.out.println(a);
    // System.out.println("***********");
    //  int c = 10;
    // int d = c++;
    // int e = c;
    // System.out.println(d);
    // System.out.println(d);
    // System.out.println(c);
    // System.out.println(e);

    // check 
  // int j = 10 ;
  //  j--;
  //  System.out.println(j);
  //  int a = 0 + j;
  //  System.out.println(a);

  // question 
  int a =0;
  for(int i = 0; i<5 ; i++ /*or ++i */){
    for(int j  = 5; j>i; j--/*or --j */){
    a = a+i+j;
    }
  }
  System.out.println(a);

    // int x, y, z;x = y = z = 2;x += y;y -= z;z /= (x + y);
    // System.out.println(z);

  /*  
    System.out.println("Enter a ");
    int a = sc.nextInt();
    System.out.println("Enter b");
   int  b = sc.nextInt();
  System.out.println("Enter operation");  
  char oper = sc.next().charAt(0);
  switch(oper){
    case '+' :  System.out.println(a+b); break;
    case '-' :  System.out.println(a-b); break;
  }
*/
//*****************PAtTerN */
//  for( int  Line = 0 ; i<4  ; Line++){
//           System.out.println("****");
          
//         }

//==========RECVERSE OF A NUMBER=============
// System.out.println("Enter no");
// int n = 1234567890;
// while(n>0){
//   int lastdigit = n%10;
//   System.out.print(lastdigit);
//   n/=10;
// }

// reverse the number
// int n = 1234567890;
// int rev = 0;
// while(n>0){
//   int lastDigit = n%10;
//   rev = (rev*10) + lastDigit;
//   n/=10;

// }
// System.out.println(rev);

//===================================
/*  while(true){
  System.out.print("Enter your number");
  int n = sc.nextInt();
  if(n%10==0){
    continue;
  }
else{
  System.out.println(n);
}

 } */

 //===============================PRIME NO by me ======================
 /*System.out.println("*****************Prime no checker*************************");
 int i = 2;
 System.out.println("Enter the number");
 int n  = sc.nextInt();
 boolean isPrime = true;
        if(n==1){
          isPrime = false;
        }
        if(n==2){
          isPrime  = true;
        }
  while(i<=Math.sqrt(n)){
    if(n%i==0){
      System.out.println("Not a Prime Number");
      isPrime = false;
        break;
    }
    else{
      i++;
    }
    
  }
if(isPrime==true){
    System.out.println("Prime no!");
}
else{
  System.out.println(" Not a Prime no!");
}
  */
// Print sum of even and odd number of your entered number
/*  int ni,i;
 int evensum= 0;
 int oddsum = 0;
 
  for( i=1; i<=10; i++){
    System.out.println("Enter number" +i);
     ni = sc.nextInt();
     if(ni%2==0){
      evensum = evensum+ni;
    }
    else{
      oddsum += ni;
    }
  } 
  System.out.println("Sum of even number" +evensum);
  System.out.println("Sum of odd number" +oddsum);
  */
  
  /*[Learing
  //I wanna try ki 1 baar sare enter karwa liye now ab 1st no
  // se fir se check karo ki even ha ya odd but i forgot ki 
  // sath hi me check karte jao or store karwa lo print baad
   // me karwa lena!
   /*for(i = 1;i<=10;i++){
    if(ni%2==0){
      evensum = evensum+ni;
    }
    else{
      oddsum = oddsum+ni;
    }
}
    ]
    */
 // factorial of a number
  /* int n,i;
 int fact =1;

 System.out.println("Enter your number");
 n = sc.nextInt();
 
 for(i=1; i<=n; i++){
  fact = fact*i;
 }

 System.out.println("factorial of given number = " + fact);

 */
 
 }
}