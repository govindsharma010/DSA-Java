import java.util.*;
public class GraphBFS {
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
  public static void createGraph(ArrayList<Edge> graph[]){
  //keep it unweighted graph by taking wt = 1;
    // 0 to 1  and 2 
    graph[0].add(new Edge(0, 1, 1));
    graph[0].add(new Edge(0, 2, 1));

    // 1 to 0 and 3
    graph[1].add(new Edge(1, 0, 1));
    graph[1].add(new Edge(1, 3, 1));

    // 2 to 0 and 4
    graph[2].add(new Edge(2, 0, 1));
    graph[2].add(new Edge(2, 4, 1));

    // 3 to 1, 4, 5
    graph[3].add(new Edge(3, 1, 1));
    graph[3].add(new Edge(3, 4, 1));
    graph[3].add(new Edge(3, 5, 1));

    // 4 to 2,3,5
    graph[4].add(new Edge(4, 2, 1));
    graph[4].add(new Edge(4, 3, 1));
    graph[4].add(new Edge(4, 5, 1));

    // 5 to 3, 4, 6, 5
    graph[5].add(new Edge(5, 3, 1));
    graph[5].add(new Edge(5, 4, 1));
    graph[5].add(new Edge(5, 6, 1));

    // 6 to 5
    graph[6].add(new Edge(6, 5, 1));
    
  } 
  // edit traversing for different components of graph 
 
  public static void dfsUtil(ArrayList<Edge>[] graph){
  boolean vis[] = new boolean[graph.length];
  for(int i=0; i<graph.length; i++){
    dfsUtil(graph, i, vis);  
  }
  }

  public static void dfsUtil(ArrayList<Edge> [] graph, int curr, boolean vis[] ){
    //visit
    System.out.println(curr + "");
    vis[curr] = true;
    for(int i=0; i<graph[curr].size(); i++){
        Edge e = graph[curr].get(i);
        if(!vis[e.dest]){
            dfsUtil(graph, e.dest, vis);
        }
    }
  }
  public static void bfs(ArrayList<Edge>[] graph){
    boolean vis[] = new boolean[graph.length];
    for(int i=0; i<graph.length; i++){
        if(!vis[i]){
            bfsUtil(graph, vis);
        }
    }
  }
  public static void bfsUtil(ArrayList<Edge> [] graph, boolean vis[]){// O(V+E)
    Queue<Integer> q = new java.util.LinkedList<>();
    q.add(0); // source 0

    while(!q.isEmpty()){
        int curr = q.remove();

        if(!vis[curr]){ // visit curr
            System.out.print(curr + " ");
            vis[curr] = true;
            // add curr neighbours
            for(int i=0; i<graph[curr].size(); i++){
                Edge e  = graph[curr].get(i); // pickup each edge of curr
                q.add(e.dest); // adding neighbour
            }
        }
    }
  }
 
  public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest , boolean vis[]){
    if(src == dest){
        return true;
    }
   vis[src] = true;
  for(int i=0; i<graph[src].size(); i++){
    Edge e = graph[src].get(i);
    // e.dest = neighbour
    if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)){
        return true;
    }
  }
  return false;
  }


  public static void main(String[] args) {
    int V = 7;
    @SuppressWarnings("unchecked") // generic array creation
    ArrayList<Edge> [] graph = new ArrayList[V];
    // initialize each adjacency list before use
    for (int i = 0; i < V; i++) {
        graph[i] = new ArrayList<>();
    }

    createGraph(graph);
    // bfs(graph);
    // dfs(graph, curr, new boolean[V]);
    System.out.println(hasPath(graph, 0, 8, new boolean[V]));
  }
}
