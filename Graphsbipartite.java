import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graphsbipartite {

    public static class Edge{
        int src;
        int dest;
        

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
     }
     public static void createGraph(ArrayLst<Edge> [] graph){
        // graph acc to figure
        graph[0].add(new Edge(0, 1));
         graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
     }
    public static boolean isBipartite(ArrayList<Edge> [] graph){
        int col[] = new int[graph.length];
        for(int i=0; i<col.length; i++){
            col[i] = -1 ; // no color
        }

        //bfs
        Queue<Integer> q = java.util.new LinkedList<>();
        for(int i=0; i<graph.length; i++){
            if(col[i] == -1){//bsf
                q.add(i);
                col[i] =  0; // yellow
            while(!q.isEmpty()){
                int curr = q.remove();
                for(int j=0; j<graph[curr].size(); j++){
                    Edge e = graph[curr].get(j);
                    // 3cases for neighbour
                   if(col[e.dest] == -1){
                    int nextCol = col[curr] == 0 ? 1 : 0; 
                    col[e.dest] = nextCol;
                    q.add(e.dest);
                   }else if(col[e.dest] == col[curr]){
                    return false; // not bipartite
                   }
                }
            }
          }
        }
    }
    public static void main(String[] args) {
        // draw a visual pentagon graph and check if it is bipartite or not
       /*
       pentagon with 5 edges graph:

            0
            /\
           /  \
          /    \
          1     2
           \     \
            \     \
            3-------4

          */
        int V = 5;
    }
}
