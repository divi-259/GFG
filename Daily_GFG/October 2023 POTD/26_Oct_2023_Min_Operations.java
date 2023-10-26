/*
Author : Divyanshi Dixit
Date : Oct 26, 2023
Problem : 
Difficulty : Easy

Problem Link: https://practice.geeksforgeeks.org/problems/find-optimum-operation4504/1 

Problem Statement: Given a number N. Find the minimum number of operations required to reach N starting from 0. You have 2 operations available:

1. Double the number
2. Add one to the number

Solution Approach: Take the number and go in reverse manner to make it 0, check how many operations it will take.

*/

/* ------------CODE---------------- */

class Solution
{
    public int minOperation(int n)
    {
        int count = 0;
        while(n!=0) {
            if(n%2==0)
                n=n/2;
            else n=n-1;
            count++;
        }
        return count;
    }
}
/*
Time Complexity: O(logn) - we are dividing the number by 2
Space Complexity: O(1)
*/
