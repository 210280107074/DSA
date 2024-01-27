import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

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
                printAllPath(path + " " + graph[curr].get(i).dest, vis, e.dest, target, graph);
                vis[curr] = false;
            }
        }
    }
    public static ArrayList<ArrayList<Integer>> printAllPath2(ArrayList<Edge> graph[],int start,int v,int target){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        boolean[] vis = new boolean[v];
        solve2(graph,result,path,vis,start,target);
        return result;
    }
    public static void solve2(ArrayList<Edge>[] graph, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> path, boolean[] vis, int curr, int target) {
        path.add(curr);
        if (curr == target) {
            result.add(new ArrayList<>(path));
        } else {
            vis[curr] = true;
            for (Edge e : graph[curr]) {
                if (!vis[e.dest]) {
                    solve2(graph, result, path, vis, e.dest, target);
                }
            }
            vis[curr] = false;
        }
        path.remove(path.size() - 1);
    }
    public static boolean cycle(ArrayList<Edge> graph[],boolean vis[],boolean rec[],int curr){
        rec[curr]= true;
        vis[curr]= true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(rec[e.dest]){
                return true;
            } 
            else if(!vis[e.dest]){
                if(cycle(graph, vis, rec, e.dest)){
                        return true;
                }
            }
        }
        rec[curr] = false;
        return false;
    }
    public static void topologicalSortUtil(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer> s){
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[curr]){
                topologicalSortUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }
    public static ArrayList topologicalSort(ArrayList<Edge> graph[],int v){
        boolean vis[] = new boolean[v];
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<v;i++){
            if(!vis[i]){
                topologicalSortUtil(graph, i, vis, s);
            }
        }
        while(!s.empty()){
            list.add(s.pop());
        }
        return list;
    }

    public static void main(String[] args) {
        int v = 7; // Corrected the number of vertices to 7
        ArrayList<Edge> graph[] = new ArrayList[v];
        boolean vis[] = new boolean[v];
        createGraph(graph);
        // printNeighbors(graph, 2);
        // BFS(graph, v);
        // DFS(graph,0,vis);
        // ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        // result = printAllPath2(graph,0,7,5);
        // Printing all paths
        // System.out.println(result);
        // boolean rec[] = new boolean[7];
        // System.out.println(cycle(graph, vis, rec, 0));
        System.out.println(topologicalSort(graph, v));
    }
}
