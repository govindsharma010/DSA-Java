// COPY CONSTRUCTOR

public class OOPS3 {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name  = "Govind";
        s1.roll = 169;
        s1.pass = "abcd";

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
       Student s2 = new Student(s1);
       s2.pass = "xyz";

       s1.marks[2] = 100;//change is also is seen in s2.marks but it should not.
    //    System.out.println(s1.marks[2]);
       for(int i=0;i<3;i++){
        System.out.println(s2.marks[i]);
       }
    // System.out.println(s2.marks[2]);
     
      
    }
}
class Student{
 String name;
 int roll;
 String pass;
 int marks[];

 // shallow copy constructor:- changes  reflected in s2
 Student(Student s1){
    System.out.println("SHALLOW COPY");
    marks = new int[3];
    this.name = s1.name;
    this.roll = s1.roll;
    this.marks = s1.marks;
 }

//DEEP copy constructor :- Chnages dont  reflected
//  Student(Student s1){
//     System.out.println("DEEP COPY:-");
//     marks = new int[3];
//     this.name = s1.name;
//     this.roll = s1.roll;
//     for(int i=0;i<3;i++){
//         this.marks[i] = s1.marks[i];
//     }
//  }
 Student(){
    marks = new int[3];
    System.out.println("Hello");
 }

 Student( String name){
    this.name = name;
  
}

Student(int roll){
    this.roll = roll;
} 
}