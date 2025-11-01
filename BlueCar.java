//DOUBT 

abstract class OOPSpracticeq2 {
    // abstract class Car{
       // code block
        static{
            System.out.print("1");
        }
        public OOPSpracticeq2(String name) {
            super();
            System.out.print("2");
        }
        {
            System.out.print("3");
        }
    }
    
  public   class BlueCar extends OOPSpracticeq2{
        {
            System.out.print("4");
        }
        public BlueCar() {
            super("blue");
            System.out.print("5");
        }
        public static void main(String[]gears) {
            new BlueCar();
 }
}

