package Graphs;

import java.util.Scanner;


public class graphMatrix {
    public static void main(String[] args) {
        // n -> nodes
        // m -> edges
        // we cover all nodes ? Time Complexity - > O(n)

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] adjMatrix = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            //unidirected   i  <----->
            adjMatrix[u][v] = 1;
            adjMatrix[u][v] = 1; // Don't do this for directed

        }

        for(int i = 1 ; i <=n ; i++) {
            for(int j = 1 ; j<=n;j++) {
                System.out.print(adjMatrix[i][j] +" ");

            }
            System.out.println();
        }

    }
}
