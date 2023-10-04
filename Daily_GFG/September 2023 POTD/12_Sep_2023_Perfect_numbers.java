/*
Problem Link: https://practice.geeksforgeeks.org/problems/perfect-numbers3207/1

Problem Statement: Given a number N, check if a number is perfect or not. A number is said to be perfect if sum of all its factors excluding the number itself is equal to the number. 
Return 1 if the number is Perfect otherwise return 0.

Solution Approach: 
Check the numbers from 2 to sqrt(n), and keep adding the numbers which divide n, and also add its divisor as well,
only check if the divisor and number is same for any number.


*/

/* ------------CODE---------------- */
class Solution {
    static int isPerfectNumber(long N) {      

        long sum = 1;        
        if(N==1)
            return 0;
        
        for(int i=2; i<=Math.sqrt(N); i++) {
            if(N%i==0)
            {
                sum+=i;
                if(i*i!=N) {
                    sum = sum+N/i;
                }
            }
        }        
        if(sum==N)
            return 1;        
        else return 0;
    }
}

/*
Time Complexity: O(sqrt(n))
Space Complexity: O(1)
*/
