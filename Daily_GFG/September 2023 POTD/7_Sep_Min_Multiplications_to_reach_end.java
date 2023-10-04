/*
Problem Link: https://practice.geeksforgeeks.org/problems/minimum-multiplications-to-reach-end/1

Problem Statement: Given start, end and an array arr of n numbers. 
At each step, start is multiplied with any number in the array and then mod operation with 100000 is done to get the new start.
Your task is to find the minimum steps in which end can be achieved starting from start. 
If it is not possible to reach end, then return -1.

Solution Approach: end can be max 10^5-1, so create a dp array of 10^5 size and store -1 everywhere.
we have to find dp[end] for the ans, take a queue, and add start to it.
dp array is going to store the number of steps taken to reach till that dp index.
for every element popped out from queue, multiply it with all the array numbers, and fill the dp for the next number, 
also add the next number found by this to the queue, for futher iteration.
The catch is  - we are only adding to queue if the dp[next]==-1, otherwise we are not.

*/

/* ------------CODE---------------- */

class Solution {
    int minimumMultiplications(int[] arr, int start, int end) {

        // Your code here
        int mod = 100000;
        int n = arr.length;
        
        Queue<Integer> q = new LinkedList<>();
        
        int dp[] = new int[100001];Arrays.fill(dp, -1);
        dp[start] = 0;        
        q.offer(start%mod);
        
        while(!q.isEmpty()) {
            int curr = q.remove();

            if(curr==end)
                return dp[end];
            
            for(int j=0; j<n; j++) {
                int next = (curr*arr[j]) % mod;
                if(dp[next]==-1) {
                    dp[next] = dp[curr] + 1;
                    q.add(next);
                }
            }            
        }        
        return -1;        
    }
}

/*
Time Complexity: O(10^5)
Space Complexity: O(10^5)
*/
