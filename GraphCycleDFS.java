import java.util.*;
public class GraphCycleDFS {
    static class Edge{
        int src; 
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;

        }
    }
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        //directed graph where prev approach wont work
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));
    }

    public static boolean isCycle(ArrayList<Edge> []graph){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length]; // it is needed to check if the negihbour has been visited in the current path or not

    // to check all components of the graph
    for(int i=0; i<graph.length; i++){
        if(!vis[i]) {
            if(isCycleUtil(graph, i, vis, stack)){
                return true;
            }
        }
    }
    return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], boolean stack[]){
        vis[curr] = true;
        stack[curr]= true; // node is present in stack of curr recursion

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(stack[e.dest]){ // if the neighbour is already present in the stack of curr recursion then there is a cycle
                return true;
            }
            if(!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)){
                return true;// if the neighbour is not visited and there is a cycle in the neighbour then there is a cycle in the graph
            }
        }
        stack[curr] = false; // remove the node from the stack of curr recursion
        // means curr visited to ho gaya lekin yaha se cycle exist nhi karti hai
        return false;


    }
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(isCycle(graph));
    }
}
