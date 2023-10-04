/*
Problem Link: https://practice.geeksforgeeks.org/problems/largest-number-possible5028/1

Problem Statement: Given two numbers 'N' and 'S' , find the largest number that can be formed with 'N' digits and whose sum of digits should be equals to 'S'. 
Return -1 if it is not possible.

Solution Approach: Keep adding "9" in the stringbuilder if sum S is greater than 9, and then if it is less than 9
add that number and make the sum 0, and add 0 for the remaining places.
If there is a sum value left even after filling all digit places, then return -1 else return the string that is formed.

*/

/* ------------CODE---------------- */
class Solution{
    static String findLargest(int N, int S){
        // code here
        
        StringBuilder sb = new StringBuilder();
        if(N>1 && S==0)
            return "-1";
        
        // we need N digits in the string
        for(int i=0; i<N; i++) {
            if(S > 9) // we can add a 9
                {
                    sb.append('9');
                    S-=9;
                }
            else {
                sb.append((char)(S+'0'));
                S=0;
            }
            
        }
        if(S==0)
            return sb.toString();
        else return "-1";
    }
}

/*
Time Complexity: O(N)
Space Complexity: O(1)
*/
