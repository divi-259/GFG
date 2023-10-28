/*
Author : Divyanshi Dixit
Date : Oct , 2023
Problem : Bleak Numbers
Difficulty : Medium

Problem Link: https://practice.geeksforgeeks.org/problems/bleak-numbers1552/1

Problem Statement: Given an integer, check whether it is Bleak or not.

A number n is called Bleak if it cannot be represented as sum of a positive number x and set bit count in x, i.e., 
x + countSetBits(x) is not equal to n for any non-negative number x.

Solution Approach: 
Check all the numbers which are less than n-(max number of set bits possible in n) till n-1,
if any number is such that number+setBitsCount(number)==n, that means the given n is a bleak number.

*/

/* ------------CODE---------------- */
class Solution
{
    public int is_bleak(int n)
    {

        if(n==1)
            return 1;
        if(n==2)
            return 0;
        // we can check from n-(max setbits in n) till n-1 to find if the n is bleak or not
         
        int setBits = maxSetBits(n);
        for(int i=n-setBits ; i<n; i++) {
            if(i+countSetBits(i) == n)
                return 0;
        }
        
        return 1;
    }
    
    int maxSetBits(int n ) {
        int count = 0;
        while(n>0) {
            count++;
            n = n>>1;
        }
        return count;
    }
    
    int countSetBits(int n) {
        int count = 0;
        while(n>0) {
            if((n & 1) == 1)
            count++;
            n = n>>1;
        }
        return count;
    }

}

/*
Time Complexity: O(logn) - loop does not require much iterations, max 32 iterations posssible
Space Complexity: O(1)
*/
