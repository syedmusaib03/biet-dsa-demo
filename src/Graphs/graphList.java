package Graphs;

import java.util.*;

public class graphList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //Adjacency list representation
        List<List<Integer>> adj = new ArrayList<List<Integer>>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        //read the edges and update the list
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);//undirected
        }

        //print the Adjacency list
        for (int i = 1; i < n; i++) {
            System.out.print("Node -->"+i+"Neighbour");
            for (int v : adj.get(i)) {
                System.out.print(" "+v);
            }
            System.out.println();
        }
        sc.close();
    }
}