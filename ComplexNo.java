//doubt
import java.util.*;
public class ComplexNo {
    public static void main(String args[]){
        C c = new C(4,5);
        C d =new C(4,5);
        C e = C.add(c,d);
        C f =  C.diff(c,d);
        C g =  C.product(c,d);
        e.printComplex();
        f.printComplex();
        g.printComplex();

     
    }
}
class C{
    int real ;
    int imag ;
    public C(int r, int i){
        real = r;
        imag = i;
    }
   
   public static C add(C a, C b){
     return new C((a.real+b.real),(a.imag+b.imag));
   }

   public static C diff(C a, C b){
     return new C((a.real-b.real),(a.imag-b.imag));
   }
   public static C product(C a, C b){
    return new C(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
   }
   
   public void printComplex(){
    if(real==0 && imag!=0){
        System.out.println(imag+"i");
    }
    else if(imag==0 && real!=0){
        System.out.println(real);
    }
    else{
        System.out.println(real+"+"+imag+"i");
    }
   }
    
}
