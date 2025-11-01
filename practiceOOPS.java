public class practiceOOPS {
    public static void main(String args[]){
    Vehicle obj1 = new Car();
    obj1.print();
    // obj1.printl();

    Vehicle obj2 = new Vehicle();
    obj2.print();
    }
}
class Vehicle{
    void print(){
        System.out.println("Base class");

    }
}
 class Car extends Vehicle{
    void print(){
        System.out.println("Derived class");
    }
 }

 // Due to function overriding print of car function will call through obj of vehicle.