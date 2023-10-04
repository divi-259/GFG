/*
Problem Link: https://practice.geeksforgeeks.org/problems/subset-sum-problem2014/1

Problem Statement: Given an array arr[] of size N, 
check if it can be partitioned into two parts such that the sum of elements in both parts is the same

Solution Approach: 
Use dp array to find out.

*/

/* ------------CODE---------------- */

class Solution{
    static int equalPartition(int n, int arr[])
    {
        // code here
        
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum+=arr[i];
        }
        if(sum%2!=0)
            return 0;
        sum = sum/2;
        
        boolean dp[][] = new boolean[n+1][sum+1];
        for(int i=0; i<n; i++) {
            dp[i][0] = true;  // sum 0 is always possible
        }
        
        // now filling the remaining dp array
        for(int i=1; i<n+1; i++) {
            for(int j=1; j<sum+1; j++) {
                if(arr[i-1]<=j)
                dp[i][j] = (dp[i-1][j-arr[i-1]] || dp[i-1][j]);
                else
                dp[i][j] = dp[i-1][j];
            }
        }
        
        return dp[n][sum]==true? 1 : 0;
        
    }
}
/*
Time Complexity: O(n*sum)
Space Complexity: O(n*sum)
*/
