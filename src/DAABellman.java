public class DAABellman {
    static int n = 5;//no. of vertices
    static int INF = 999999;

    public static void s1(int[][] g, int d[]) {
        int [] prev=new int[n];
        for (int i = 0; i < n - 1; i++) {
            for (int u = 0; u < n; u++) {
                for (int v = 0; v < n; v++) {
                    if (d[u] != INF && (d[u] + g[u][v]) < d[v]) {
                        d[v] = d[u] + g[u][v];
                    }
                }
            }
        }

        //check for negative cycles
        for (int u = 0; u < n; ++u) {
            for (int v = 0; v < n; ++v) {
                if (d[u] != INF && d[u] + g[u][v] < d[v]) {
                    System.out.println("Graph contains negative weight cycle!");
                    return;
                }
            }
        }

        //display the shortest distances
        System.out.println("\n> SHORTEST DISTANCES from source:\nVertex\t\tDistance");
        for (int i = 0; i < n; ++i) {
            System.out.println(i + "\t\t\t" + d[i]);
            Path(prev, i);
            System.out.println();
        }
    }
    public static void Path(int[] pred, int v) {
        if (v == 0) {
            System.out.print(v);
        } else if (pred[v] == -1) {
            System.out.print("No path");
        } else {
            Path(pred, pred[v]);
            System.out.print(" -> " + v);
        }
    }


    public static void main(String[] args) {
        int d[];
        d = new int[n];
        int graph[][] = new int[][]{
                /*1 2 3 4 5 6 7
                1 0
                2
                3
                4
                5
                6
                7
                 */
                {INF, -1, 4, INF, INF},
                {INF, INF, 3, 2, 2},
                {INF, INF, INF, INF, INF},
                {INF, 1, 5, INF, INF},
                {INF, INF, INF, -3, INF},
        };
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0)
                    d[i] = 0;
                else
                    d[i] = INF;
            }
        }
        s1(graph, d);
    }
}
