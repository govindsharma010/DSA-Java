public class OOPSpracticeq
{
    public static void main(String[] wheels) { 
        final Car car = new ElectricCar(); 
        System.out.print(car.drive()); 
    }
}
    class Automobile {
         private String drive() { 
        return "Driving vehicle";
     } 
    } 
    class Car extends Automobile {
         protected String drive() {
             return "Driving car"; 
            } 
        }
      class ElectricCar extends Car { 
        @Override 
        public final String drive() {
         return "Driving electric car";
         }
          
    /* here error occur beacause of final keyword we cannot override any method or class who declared final
    class Ola extends ElectricCar{
        public String drive(){
            return "Driving electric car";
        }
     }
    */ 
        }


