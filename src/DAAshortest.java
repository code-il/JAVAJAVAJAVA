public class DAAshortest {
    static int n=7;//no. of vertices
    static int INF= Integer.MAX_VALUE;
    public static int s1(int [][]g){
        int d[]=new int[n];
        for (int i=n-2;i>=0;i--){
            d[i]=INF;
            for(int j=i;j<n;j++){
                if(g[i][j]==INF){
                    continue ;
                }
                else {
                    d[i] = Math.min(d[i], g[i][j] + d[j]);
                }
            }
        }
        return d[0];
    }
    public static void main(String[] args){
        int graph[][]=new int[][]{
                /*1 2 3 4 5 6 7
                1 0
                2
                3
                4
                5
                6
                7
                 */
                { INF, 9, 7, 2, INF, INF, INF},
                { INF, INF, INF, INF, 4, 2,INF },
                { INF, INF, INF, INF, 2, 7,INF },
                { INF, INF, INF, INF, INF,14, INF },
                { INF, INF, INF, INF, INF, INF, 6 },
                { INF, INF, INF, INF, INF, INF, 3 },
                { INF, INF, INF, INF, INF, INF, INF }
        };
        System.out.println("Shortest path for given Graph is: "+s1(graph));
    }
}
