public class Pattern {
    public static void basicPattern(){
        for (int line = 1; line <=4; line++){
            for(int star = 1; star<=4; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void halfPyramid(){
        for ( int line = 1; line <=5; line++){
            for( int star = 1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
           
            }
    }

    public static void invertHalfPyramid1(){
     
        for (int line = 1; line <=4; line++){
            for(int star = 4; star>=line; star--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertHalfPyramid2(){
        for (int line = 1; line <=7; line++){
            for(int star = line; star<=7; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }   
        
    public static void letsThink(){
            int line = 1;
            int star;
            for (line = 1; line <=5; line++){
                for( star = 1; star<=line; star++){
                    System.out.print("*");
                }
                System.out.println();
               
                }
                if( line==6){
                    for(line = 6; line<=10;line++){
                        for(star =line;star<=10; star++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
         }
         public static void halfNumberPyramid(){
         //   1
//   12
//   123
//   1234  pattern will be output
int star;
 for ( int line = 1; line <=5; line++){
    for(  star = 1; star<=line; star++){
        System.out.print(star);
    }
    System.out.println();
   
    }
 }
 public static void characterPyramid(){
    int n = 4;
    char ch = 'A';
    for(int line =1; line<=n;line++){
        for(int alp = 1; alp<=line;  alp++ ){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
}
   

 
    public static void main(String args[]){
        basicPattern();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        halfPyramid();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        invertHalfPyramid1();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        invertHalfPyramid2();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        letsThink();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        halfNumberPyramid();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        characterPyramid();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
      

    }
}