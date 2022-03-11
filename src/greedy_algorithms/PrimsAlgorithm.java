package greedy_algorithms;

import java.util.Arrays;
import java.util.Scanner;

public interface PrimsAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        Graph g = new Graph(n);
        for(int i=0;i<e;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            g.addEdge(u,v,w);
        }
        g.primsAlgo();
    }

}

class Graph{
    private int adjMat[][];
    private int nodes;
    public Graph(int n){
        nodes = n;
        adjMat = new int [n][n];
    }
    void addEdge(int u, int v, int w){
        adjMat[u][v] = w;
        adjMat[v][u] = w;
    }

    void primsAlgo(){
        int result[] = new int [nodes];
        Arrays.fill(result, -1);
        boolean mst[] = new boolean[nodes]; //Minimum Spanning Tree True or False
        int minimumWt[] = new int[nodes];
        Arrays.fill(minimumWt, Integer.MAX_VALUE);
        for(int i=0;i<nodes-1;i++){
            int minV = minWt(minimumWt, mst);
            mst[minV] = true;
            for(int j=0;j<nodes;j++){
                if(adjMat[minV][j]>0 && !mst[j]){
                    if(minimumWt[j]>adjMat[minV][j]){
                        result[j] = minV;
                        minimumWt[j] = adjMat[minV][j];
                    }
                }
            }
        }
        for(int i=1;i<nodes;i++){
            System.out.println(result[i]+" to "+i);
        }
    }
    private int minWt(int[] minimumWt, boolean[] mst) {
        int index= -1;
        for(int i=0;i<nodes;i++){
            if(!mst[i] && (index==-1 || minimumWt[index] > minimumWt[i]))
                index=i;
        }
        return index;
    }
}

/*
7 12
0 1 1
0 2 4
1 2 3
2 3 5
1 3 7
1 4 6
2 5 2
3 4 10
3 5 8
4 5 3
4 6 9
5 6 11

0 to 1
1 to 2
2 to 3
5 to 4
2 to 5
4 to 6
*/