/*
Author : Divyanshi Dixit
Date : Nov 9, 2023
Problem : Predict the column
Difficulty : Easy

Problem Link: https://www.geeksforgeeks.org/problems/predict-the-column/1

Problem Statement: Given a matrix(2D array) M of size N*N consisting of 0s and 1s only. The task is to find the column with maximum number of 0s. If more than one column exists, 
print the one which comes first. If the maximum number of 0s is 0 then return -1.

Solution Approach: 
Calculate the number of zeros in column wise fashion, and keep saving index which has the largest number of 0s.

*/

/* ------------CODE---------------- */
class Solution
{
    int columnWithMaxZeros(int arr[][], int n)
    {
        // code here 
        int maxZeros = 0;
        int index = -1;
        for(int j=0; j<n; j++) {
            int count = 0;
            for(int i=0; i<n; i++) {
                if(arr[i][j]==0)
                    count++;
            }
        if(count> maxZeros) {
            index = j;
            maxZeros = count;
        }
        }
        return index;
    }
}

/*
Time Complexity: O(n*n)
Space Complexity: O(1)
*/
