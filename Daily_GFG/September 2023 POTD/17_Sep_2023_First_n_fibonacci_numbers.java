/*
Problem Link: https://practice.geeksforgeeks.org/problems/print-first-n-fibonacci-numbers1002/1

Problem Statement: Given a number N, find the first N Fibonacci numbers. The first two number of the series are 1 and 1.

Solution Approach: loop till n while filling the dp array.

*/

/* ------------CODE---------------- */
class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
        
        long[] dp = new long[n];
        dp[0] = 1;
        if(n==1)
            return dp;
        dp[1] = 1;
        
        for(int i=2; i<n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp;
        
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/
