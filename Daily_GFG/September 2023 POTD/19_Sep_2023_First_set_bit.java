/*
Problem Link: https://practice.geeksforgeeks.org/problems/find-first-set-bit-1587115620/1 

Problem Statement: Given an integer N. The task is to return the position of first set bit found from the right side in the binary representation of the number.
Note: If there is no set bit in the integer N, then return 0 from the function.

Solution Approach: get the first set bit position by right shifting the number till it becomes 0.

*/

/* ------------CODE---------------- */
class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        // Your code here
        if(n==0)
            return 0;
        
        int temp = n;
        int count = 1;
        while(temp>0) {
            if((temp & 1)==1)
                return count;
            count++;
            temp = temp >> 1;
        }
        
        return 0;
    }
}

/*
Time Complexity: O(1)
Space Complexity: O(1)
*/
