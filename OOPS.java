public class OOPS {
     public static void main(String args[]){
   Pen p1 = new Pen();
   p1.setColor("Blue");
   System.out.println(p1.getColor());
   p1.setTip(5);
   System.out.println(p1.getTip());
   p1.setColor("Yellow");
   System.out.println(p1.getColor());
}
}

class Pen{
    private String color;
     private int tip;
//setter
    void setColor(String newColor){
        color = newColor;
    }
    //getter
    String getColor(){
     return this.color;
    }

    //setter  
    void setTip(int newTip){
        tip = newTip;
    }

    //getter
   int getTip(){
    return this.tip;
   }
}
