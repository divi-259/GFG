/*
Author : Divyanshi Dixit
Date : Nov 4, 2023
Problem : Top K Frequent Elements in Array 
Difficulty : Easy

Problem Link: https://www.geeksforgeeks.org/problems/top-k-frequent-elements-in-array/1

Problem Statement: Given a non-empty array nums[] of integers of length N, find the top k elements which have the highest frequency in the array. 
If two numbers have same frequencies, then the larger number should be given more preference.

Solution Approach: 
First, sort the input array nums in ascending order to group numbers with the same count together.
Use a HashMap to count the occurrences of each number in the sorted array.
Create a PriorityQueue (pq) to store counts in descending order.
Iterate through the keys in the pq, retrieve the corresponding numbers with that count, and add the top k numbers to the result array.
Ensure the selected numbers are sorted in descending order within their respective count groups.
Return the result array containing the top k numbers based on their counts.
This code effectively finds the top k numbers with the highest counts in the input array.
*/

/* ------------CODE---------------- */

class Solution {
    public int[] topK(int[] nums, int k) {
        // Sort the array to group numbers with the same count together.
        Arrays.sort(nums); 
        
        // Initialize the result array.
        int ret[] = new int[k];
        
        // Create a HashMap to store counts of each number.
        HashMap<Integer, List<Integer>> hmap = new HashMap<>();
        
        // Iterate through the sorted array to count occurrences of each number.
        for(int i=0; i<nums.length; ) {
            int count = 0;
            int num = nums[i];
            while(i<nums.length && nums[i]==num) {
                count++;
                i++;
            }
            
            // Store numbers in a list based on their counts.
            if(!hmap.containsKey(count)) {
                List<Integer> temp = new ArrayList<>();
                hmap.put(count, temp);
            }
            hmap.get(count).add(num);
        }
        
        // Create a PriorityQueue for counts in descending order.
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(hmap.keySet());
        
        // Build the result array by selecting the top k numbers.
        for(int i=0; i<k;) {
            List<Integer> temp = hmap.get(pq.remove());
            temp.sort(Collections.reverseOrder());
            for(int num : temp) {
                if(i<k)
                ret[i++] = num;
                else break;
            }
        }
        return ret;
    }
}

/*
Time Complexity: O(nlogn)
Space Complexity: O(n)
*/
