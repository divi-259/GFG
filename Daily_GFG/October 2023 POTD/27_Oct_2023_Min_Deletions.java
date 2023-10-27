/*
Author : Divyanshi Dixit
Date : Oct , 2023
Problem : Minimum Deletions
Difficulty : Medium

Problem Link: https://practice.geeksforgeeks.org/problems/minimum-deletitions1648/1 

Problem Statement: Given a string of S as input. Your task is to write a program to delete the minimum number of characters from the string so that the resultant string is a palindrome.
Note: The order of characters in the string should be maintained.

Solution Approach: 
Using DP's LCS approach, take the string and its reverse and find the longest common subsequence in both of that.
Return the n-len of LCS as the answer.

*/

/* ------------CODE---------------- */


class Solution{
    static int minimumNumberOfDeletions(String s1) {
        //your code here
        
        // get the longest common substring of the reverse of the string with itself
        
        StringBuilder sb = new StringBuilder(s1);
        String s2 = sb.reverse().toString();
        int n = s1.length();
        
        // dp matrix to find the LCS
        int dp[][] = new int[n+1][n+1];
        
        for(int i=1; i<n+1; i++) {
            for(int j=1; j<n+1; j++) {
                if(s1.charAt(i-1)==s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return n-dp[n][n];
    }
}
/*
Time Complexity: O(n^2)
Space Complexity: O(n^2)
*/
