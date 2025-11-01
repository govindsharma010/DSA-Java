// ABSTRACTION

public class OOPS6 {
    public static void main(String args[]){
    // Horse h1 = new Horse();
    // h1.eats();
    // h1.walk();

    // Chicken c1 = new Chicken();
    // c1.eats();
    // c1.walk();

    Mustang myHorse = new Mustang();
    //Animal->Horse->Mustang
    // System.out.println(myHorse.color);
    
  }
}
 abstract class Animal{
  String color;
  Animal(){
    System.out.println("Animal constructor called");
    color = "brown";
}

  void eats(){
    System.out.println("Eats");
  }
  abstract void walk();
 }

  class Horse extends Animal{

    Horse(){
        System.out.println("Horse constructor called");
        color = "dark brown";
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("Walk on 4 legs");
      }
  }

  class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
        color = "Black";
    }
  }

  class Chicken extends Animal{
    void walk(){
        System.out.println("Walk on 2 legs");
      }
  }
