### M-Graph Coloring

Problem Statement - 
Given an undirected graph and a number m, determine if the graph can be coloured with at most m colours such that no two adjacent vertices 
of the graph are colored with the same color. Here coloring of a graph means the assignment of colors to all vertices. 

#### Input: 

A 2D array graph[V][V] where V is the number of vertices in graph and graph[V][V] is an adjacency matrix representation of the graph. 
A value graph[i][j] is 1 if there is a direct edge from i to j, otherwise graph[i][j] is 0.
An integer m is the maximum number of colors that can be used.

#### Output:

An array color[V] that should have numbers from 1 to m. color[i] should represent the color assigned to the ith vertex. 
The code should also return false if the graph cannot be colored with m colors.

#### Example

graph = {0, 1, 1, 1},</br>
        {1, 0, 1, 0},</br>
        {1, 1, 0, 1},</br>
        {1, 0, 1, 0}</br>
Output: </br>
Solution Exists: </br>
Following are the assigned colors
 1  2  3  2
Explanation: By coloring the vertices 
with following colors, adjacent 
vertices does not have same colors
