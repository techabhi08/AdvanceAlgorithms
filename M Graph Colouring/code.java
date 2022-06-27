package com.abhinaygarg.placement_2022_06_01;

public class GraphColoringProblem {
    public static void main(String[] args) {
        int graph[][] = {
                { 0, 1, 1, 1 },
                { 1, 0, 1, 0 },
                { 1, 1, 0, 1 },
                { 1, 0, 1, 0 },
        };
        int m = 3;
        graphColoring(graph, m);
    }

    private static boolean graphColoring(int[][] graph, int m) {
        int V = 4;
        int[] color = new int[V];
        for(int i = 0; i < V; i++){
            color[i] = 0;
        }

        if(!coloringGraphPossible(graph, m, color, 0, V)){
            System.out.println("Solution not possible");
            return false;
        }

        print(color, V);
        return true;

    }

    private static boolean coloringGraphPossible(int[][] graph, int m, int[] color, int v, int V) {
        if(v == V){
            return true;
        }

        for(int i = 0; i <= m; i++){
            if(isSafe(graph, color, i, v, V)){
                color[v] = i;

                if(coloringGraphPossible(graph, m, color, v + 1, V)){
                    return true;
                }
                color[v] = 0;
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] graph, int[] color, int i, int v, int V) {
        for(int j = 0; j < V; j++){
            if(graph[v][j] == 1 && color[i] == j){
                return false;
            }
        }
        return true;
    }

    public static void print(int[] color, int V){
        for (int i = 0; i < V; i++)
            System.out.print(" " + color[i] + " ");
        System.out.println();
    }

}
