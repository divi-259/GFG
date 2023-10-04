/*
Problem Link: https://practice.geeksforgeeks.org/problems/count-number-of-hops-1587115620/1

Problem Statement: A frog jumps either 1, 2, or 3 steps to go to the top. In how many ways can it reach the top of Nth step. 
As the answer will be large find the answer modulo 1000000007.

Solution Approach: Easy dp approach

*/

/* ------------CODE---------------- */
class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    static long countWays(int n)
    {
        // add your code here
        int mod = 1000000007;
        
        if(n==1) return 1;
        if(n==2) return 2;
        if(n==3) return 4;
        
        long dp[] = new long[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i=4; i<=n; i++) {
            dp[i] = ((dp[i-1]%mod + dp[i-2]%mod)%mod + dp[i-3]%mod)%mod;
        }
        return dp[n];
    }
    
}



/*
Time Complexity: O(n)
Space Complexity: O(n)
*/
