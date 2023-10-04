/*
Problem Link: https://practice.geeksforgeeks.org/problems/power-of-2-1587115620/1

Problem Statement: Given a non-negative integer N. The task is to check if N is a power of 2. 
More formally, check if N can be expressed as 2x for some integer x.

Solution Approach: We need to get the count of 1 in the binary rep of the number, if there is only one 1, then 
it will be power of 2, else not.

*/

/* ------------CODE---------------- */
class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        
        int count = 0;
        
        long temp = n;
        while(temp>0) {
            if((temp & 1)==1)
                count++;
            if(count>1)
                return false;
            temp = temp>>1;
        }
        if(count==1)
            return true;
        else return false;
        
    }
    
}

/*
Time Complexity: O(64) - the number of digits in the number
Space Complexity: O(1)
*/
