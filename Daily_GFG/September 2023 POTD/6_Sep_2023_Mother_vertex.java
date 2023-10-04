/*
Problem Link: https://practice.geeksforgeeks.org/problems/mother-vertex/1

Problem Statement: Given a Directed Graph, find a Mother Vertex in the Graph (if present). 
A Mother Vertex is a vertex through which we can reach all the other vertices of the Graph.

Solution Approach: Use DFS to find out the node after which all the nodes get visited in the graph, 
after that again call DFS with this node to make sure we are able to reach every other node from this.
If we are then return this node value, else return -1.

*/

/* ------------CODE---------------- */
class Solution
{
    //Function to find a Mother Vertex in the Graph.
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
    {
       boolean[] visited = new boolean[V];
        int v = -1;
        for(int i = 0; i < V; i++)
        {
            if (!visited[i])
            {
                DFSUtil(adj, i, visited);
                v = i;
            }
        }

        boolean[] check = new boolean[V];
        DFSUtil(adj, v, check);
        for(boolean val : check)
        {
            if (!val)
            {
                return -1;
            }
        }
        return v;
    }
    
    static void DFSUtil(ArrayList<ArrayList<Integer>> g,int v,boolean[] visited)
     {
        visited[v] = true;
        for(int x : g.get(v))
        {
            if (!visited[x])
            {
                DFSUtil(g, x, visited);
            }
        }
     }
}

/*
Time Complexity: O(V) - traversing all the nodes 
Space Complexity: O(V)
*/
