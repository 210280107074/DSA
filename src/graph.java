import java.util.ArrayList;

public class graph {
    static class edge {
        int src;
        int dest;

        public edge(int s, int d) {
            src = s;
            dest = d;
        }
    }

    public static void CreateGraph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<edge>();
        }
        graph[0].add(new edge(0,1));
        graph[0].add(new edge(0,1));
        
        graph[1].add(new edge(1,5));
        graph[1].add(new edge(1,0));

        graph[2].add(new edge(2,0));
        graph[2].add(new edge(2,4));        

        graph[3].add(new edge(3,1));
        graph[3].add(new edge(3,5));

        graph[4].add(new edge(4,5));
        graph[4].add(new edge(4,2));

        graph[5].add(new edge(5,3));
        graph[5].add(new edge(5,4));
        graph[5].add(new edge(5,6));

        graph[6].add(new edge(6,5));
    }
    public static void printNeighbors(ArrayList<edge> graph[],int val){
        for(int i=0;i<graph[val].size();i++){
            edge e = graph[val].get(i);
            System.out.println(e.dest);
        }

    }

    public static void main(String[] args) {
        int v=6;
        ArrayList<edge> graph[] = new  ArrayList[v];
        CreateGraph(graph);
        printNeighbors(graph,2);

    }
}
