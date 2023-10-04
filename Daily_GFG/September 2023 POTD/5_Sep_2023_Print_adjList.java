/*
Problem Link: https://practice.geeksforgeeks.org/problems/print-adjacency-list-1587115620/1

Problem Statement: Given an undirected graph with V nodes and E edges, create and return an adjacency list of the graph. 0-based indexing is followed everywhere.

Solution Approach: Simply traverse the edges and create an adj list using list of list and sort the internal list for passing all the test cases.

*/

/* ------------CODE---------------- */
//User function Template for Java
class Solution {
    public List<List<Integer>> printGraph(int n, int edges[][]) {
        
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++) {
            ans.add(new ArrayList<>());
        }
        
        for(int i=0; i<edges.length; i++) {
            int src = edges[i][0];
            int dest = edges[i][1];
            ans.get(src).add(dest);
            ans.get(dest).add(src);
        }
        
        for(List<Integer> temp : ans) {
            Collections.sort(temp);
        }
        return ans;
        
    }
}

/*
Time Complexity: O(E) - Number of edges
Space Complexity: O(n*n) - graph may be dense
*/
