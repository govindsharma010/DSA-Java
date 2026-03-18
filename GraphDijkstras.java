import java.util.ArrayList;
import java.util.PriorityQueue;

public class GraphDijkstras {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));
 
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    static class Pair implements Comparable<Pair>{
        int v;
        int dist;
        Pair(int v , int dist){
            this.v = v;
            this.dist = dist;
        }

        @Override
        public int compareTo(Pair p2){
            return this.dist - p2.dist; // -ve value pehle , ascending order

        }
    }
    public static void dijkstra(ArrayList<Edge> graph[], int src){
        int dis[] = new int[graph.length];
        boolean vis[] = new boolean[graph.length];

        for(int i=0; i<dis.length; i++){
            if(i != src){
                dis[i] = Integer.MAX_VALUE; // + infinity
            }
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.v]){
                vis[curr.v] = true;

                // neighbours
                for(int i=0; i<graph[curr.v].size(); i++){
                Edge e = graph[curr.v].get(i);
                int u = e.src; 
                int v = e.dest;
                int wt = e.wt;
                if(dis[u] + wt < dis[v]){
                    dis[v] = dis[u] + wt;
                }
                pq.add(new Pair(v, dis[v]));
            }
            }
            
           
        }
        for(int i=0; i<dis.length; i++){
                System.out.print(dis[i] + " ");
            }
            System.out.println();
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        dijkstra(graph, 0);
    }
}
