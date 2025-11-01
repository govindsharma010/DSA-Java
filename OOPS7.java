// Interfaces

public class OOPS7 {
    public static void main(String args[]){
    // Queen q = new Queen();
    // q.moves();
    // }

    Bear b= new Bear();
    b.eatGrass();
}
}
interface ChessPlayer{
    void moves();
}

// class Queen implements ChessPlayer{
//  public   void moves(){
//    System.out.println("up,down,left,right,diagonally in all direct.");
//     }
// }

 class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("upp,down,left,right,diagonal(by 1 step)");
    }
}
class Camel implements ChessPlayer{
    public void moves(){
        System.out.println("diagonally in all direction");

    }
}


//MULTIPLE INHERITANCE

interface Herbivore{
    void eatGrass();
}
interface Carnivore{
    void eatMeat();
}
class Bear implements Herbivore, Carnivore{
   public  void eatGrass(){
        System.out.println("Eats grass");
    }
    public void eatMeat(){
        System.out.println("Eats meat");
    }
}