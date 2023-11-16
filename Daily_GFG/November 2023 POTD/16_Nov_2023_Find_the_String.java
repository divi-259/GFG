/*
Author : Divyanshi Dixit
Date : Nov 16, 2023
Problem : Find the String
Difficulty : Hard

Problem Link: https://www.geeksforgeeks.org/problems/find-the-string/1

Problem Statement: 
Given two integers N and K, the task is to find the string S of minimum length such that 
it contains all possible strings of size N as a substring. 
The characters of the string should be from integers ranging from 0 to K-1.  

Solution Approach: 
This question seems tricky but it is not if you are familiar with backtracking.The Below diagram will give a better idea.

- Keep a set for all the unique strings you have encountered so far.

- Inital string should be of length n-1, with all 0s, so that only adding 1 char will make it the valid string of length n.

- To add the char to this string - follow backtrack method [take all the possible chars from "0" to "k-1" using a for loop.] 

- When calling recursive method - leave the first char of the current string, as we are going to add one char in the next call so as to keep the length of the string equal to n.

- when returning after the exploration of a node, add the char of that tree branch to a list.
*/

/* ------------CODE---------------- */

class Solution {
    // Helper function for depth-first search
    static void dfs(int k, String prev, Set<String> seen, List<Integer> edges) {
        // Loop through all the digits and add strings to the 'seen' set
        for (int i = 0; i < k; i++) {
            String cur = prev + (char) (i + '0');
            // If the current string is not seen before, explore further
            if (!seen.contains(cur)) {
                seen.add(cur); // Add to the set
                // Recursively explore with the substring of the current string
                dfs(k, cur.substring(1), seen, edges);
                // Add the edge when coming back after exploring a path
                edges.add(i);
            }
        }
    }

    // Main function to find the string
    public String findString(int n, int k) {
        // The collection of seen strings so far
        Set<String> seen = new HashSet<>();

        // String length should be n, initializing a string like - "000...0"
        char arr[] = new char[n - 1];
        Arrays.fill(arr, '0');
        String startingNode = new String(arr);

        List<Integer> edges = new ArrayList<>();
        // Start DFS from the starting node
        dfs(k, startingNode, seen, edges);

        StringBuilder ret = new StringBuilder();
        int l = (int) Math.pow(k, n);
        // Build the final string using the list of edges
        for (int i = 0; i < l; i++) {
            ret.append(edges.get(i));
        }
        ret.append(startingNode);
        return ret.toString();
    }
}

/*
Time Complexity: 
Space Complexity: 
*/
