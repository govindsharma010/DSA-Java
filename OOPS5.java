//POLYMORPHISM:- Mehtod overloading &overriding

public class OOPS5 {
public static void main(String args[]){
// Calculator calc = new Calculator();
// System.out.println(calc.sum(1,2));
// System.out.println(calc.sum(1,2,3));
// System.out.println(calc.sum((float)1.5,(float)2.8));
Deer d = new Deer();
d.eats();
}
}
 //Method overloading
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
//Method Overriding
class Animal{
    void eats(){
        System.out.println("Eats ");
    }

}
 class Deer extends Animal{
    void eats(){
        System.out.println("Eats Grass");
    }
 }