/*
Author : Divyanshi Dixit
Date : Nov , 2023
Problem : Shortest Common Supersequence
Difficulty : Medium

Problem Link: https://www.geeksforgeeks.org/problems/shortest-common-supersequence0322/1

Problem Statement: Given two strings X and Y of lengths m and n respectively, find the length of the smallest string which has both, X and Y as its sub-sequences.
Note: X and Y can have both uppercase and lowercase letters.

Solution Approach: 
It is a DP approach question, similar to LCS approach. Read notes.
*/

/* ------------CODE---------------- */
class Solution {
    // Function to find the length of the shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String X, String Y, int m, int n) {
        // Initialize a 2D array to store the length of the common subsequence
        int dp[][] = new int[m + 1][n + 1];

        // Initialize the first row and column with zeros
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <= n; i++) {
            dp[0][i] = 0;
        }

        // Fill the DP array to find the length of the common subsequence
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // The length of the shortest common supersequence is given by:
        // m + n - length of the longest common subsequence
        return m + n - dp[m][n];
    }
}


/*
Time Complexity: O(m*n)
Space Complexity: O(m*n)
*/
