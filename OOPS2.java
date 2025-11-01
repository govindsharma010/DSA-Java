//CONSTRUCTOR

public class OOPS2 {
    public static void main(String args[]){
        Student s1 = new Student();
        // System.out.println(s1.name);
        Student s2 = new Student("GOVIND");
        Student s3 = new Student(123);

    }
}
class Student {
    String name;
    int roll;

    //Non-Parametrizzed constructor
    Student(){
        System.out.println("Constructor is called......");
    }

   //PArametrized constructor
    Student( String name){
        this.name = name;
      
    }

    Student(int roll){
        this.roll = roll;
    }
}
