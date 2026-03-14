import java.util.*;
public class Graphs43 {
   static class Edge{
      int src;
      int dest;
      int wt;
      public Edge(int s, int d, int w){
         this.src  = s;
         this.dest = d;
         this.wt = w;
      }
   }
  public static void main(String[] args) {
   // graph digram
   /*
   
   0----(5)----1
              /\
        (1)  /  \ (3)
            /    \
           2------3
          /   (1)
   (2)   /
        /
       4  
   
   
   */
  int V = 5;
  //ex:  int  arr[] =  new int[size];
  ArrayList<Edge> graph[] = new ArrayList[V]; //array of sz V store arrayList
  // filhal null stored hai array me
  for(int i=0; i<V; i++){
   graph[i] = new ArrayList<>();
  }

  // 0 vertex
  graph[0].add(new Edge(0, 1, 5));

  // at 1 vertex
  graph[1].add(new Edge(1, 0, 5));
  graph[1].add(new Edge(1, 2, 1));
  graph[1].add(new Edge(1, 3, 3));

  // 2v vertex
  graph[2].add(new Edge(2,1,1));
  graph[2].add(new Edge(2,3,1));
  graph[2].add(new Edge(2,4,2));

  //3 vertex
  graph[3].add(new Edge(3,1,3));
  graph[3].add(new Edge(3,2,1));

  // 4th vertex
  graph[4].add(new Edge(4,2,2));

  // 2's neighbour
  for(int i=0; i<graph[2].size(); i++){
   Edge e = graph[2].get(i); // graph[2] => list => at each index edge ki info stored hai sourse se connected
   System.out.println(e.dest); // 2 se connected kon kon se vertex hai
  }
 }
}
