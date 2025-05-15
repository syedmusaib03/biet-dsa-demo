package BackTracking;

import java.util.Scanner;

public class RatInMaze {


    static boolean idPathSet(int[][] arr, int x, int y, int n) {
        return (x < n && y < n && arr[x][y] == 1);
    }

    static boolean ratinMaze(int[][] arr, int x, int y, int n, int[][] resultantArray) {
        //Base case
        //If the rat has reached the destination [n-1, n-1]


         if (x == n && y == n - 1) {
            resultantArray[x][y] = 1;
            return true;
        }

        //check if the rat can stand at the current cell (x,y)
        if (idPathSet(arr, x, y, n)) {
            //Move forward to find a path
            if (ratinMaze(arr, x + 1, y + 1, n, resultantArray)) {
                return true;
            }
            //we couldn't find a path, so we backtrack
            resultantArray[x][y] = 0; // BackTracking
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();

        //input array (maze) n x n
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();

            }
        }


    }

}
