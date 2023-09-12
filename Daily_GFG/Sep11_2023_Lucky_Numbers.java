/*
Problem Link: https://practice.geeksforgeeks.org/problems/lucky-numbers2911/1

Problem Statement: Lucky numbers are subset of integers. Rather than going into much theory, let us see the process of arriving at lucky numbers,
Take the set of integers
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,……
First, delete every second number, we get following reduced set.
1, 3, 5, 7, 9, 11, 13, 15, 17, 19,…………
Now, delete every third number, we get
1, 3, 7, 9, 13, 15, 19,….….
Continue this process indefinitely……
Any number that does NOT get deleted due to above process is called “lucky”.

You are given a number N, you need to tell whether the number is lucky or not. If the number is lucky return 1 otherwise 0.

Solution Approach: 
Keep updating n which will be the new position of n in the series of number after deleting every 2nd, then every 3rd and so on numbers.
*/

/* ------------CODE---------------- */

class Solution
{
    // Complete the function
    // n: Input n
    // Return True if the given number is a lucky number else return False
    public static boolean isLucky(int n)
    {
        // Your code here
        int count = 2;
        while(count<=n) {
            if(n%count==0) 
            return false;
            
            n = n- n/count; // this will be the position of n after removal of numbers in this iteration
            count++;
        }
        
        return true;
    }
}
/*
Time Complexity: O(n)
Space Complexity: O(1)
*/
