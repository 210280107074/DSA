import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class graph {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 5));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 5));
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static void printNeighbors(ArrayList<Edge> graph[], int val) {
        for (int i = 0; i < graph[val].size(); i++) {
            Edge e = graph[val].get(i);
            System.out.println(e.dest);
        }
    }

    public static void BFS(ArrayList<Edge> graph[], int v) {
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[v];
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    q.add(graph[curr].get(i).dest);
                }
            }
        }
    }

    public static void DFS(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        System.out.print(curr + " ");
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                DFS(graph, e.dest, vis);
            }
        }
    }

    public static void solve(String path, boolean vis[], int curr, int target, ArrayList<Edge> graph[],
            ArrayList<ArrayList<String>> allPaths) {
        if (curr == target) {

            allPaths.add(new ArrayList<>(List.of(path.split(" "))));
            return;
        }

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                vis[curr] = true;
           
                solve(path + " " + e.dest, vis, e.dest, target, graph, allPaths);
                vis[curr] = false;
            }
        }
    }

    public static void printAllPath(String path, boolean vis[], int curr, int target, ArrayList<Edge> graph[]) {
        if (curr == target) {
            System.out.println(path + " ");
            return;
        }
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                vis[curr] = true;
                printAllPath(path + " " + e.dest, vis, e.dest, target, graph);
                vis[curr] = false;
            }
        }
    }

    public static void main(String[] args) {
        int v = 7; // Corrected the number of vertices to 7
        ArrayList<Edge> graph[] = new ArrayList[v];
        boolean vis[] = new boolean[v];
        createGraph(graph);
        // printNeighbors(graph, 2);
        // BFS(graph, v);
        // DFS(graph,0,vis);
        printAllPath("0", vis, 0, 5, graph);
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        solve("0", vis, 0, 5, graph, result);

        // Printing all paths
        for (ArrayList<String> path : result) {
            System.out.println(path);
        }
    }
}
