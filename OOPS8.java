// STATIC KEYWORD

public class OOPS8 {
    public static void main(String args[]){
   Student s1 = new Student();
   s1.setName("Govind");
   Student.schoolName = "JNV";//or s1.schoolName= "JNV";
   s1.getName();
   System.out.println(s1.schoolName);
   Student s2 = new Student();
   s2.setName("Jhala");
   s2.getName();
   System.out.println(s2.schoolName);
   s1.getName();
   s2.schoolName = "Chirayu";
   System.out.println(s1.schoolName);
   s2.getName();
   System.out.println(s2.schoolName);
   System.out.println(Student.ReturnPercentage(33,33,33));


    }
}
 class Student{
    String name;
    int roll;
    static String schoolName;
    static int ReturnPercentage(int math, int phy, int chem ){
        return (math+phy+chem)/3;
    }

    void setName(String name){
        this.name = name;
    }
    void getName(){
        System.out.println(this.name);
    }
 }