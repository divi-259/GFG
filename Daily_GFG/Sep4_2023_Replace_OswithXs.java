/*
Problem Link: https://practice.geeksforgeeks.org/problems/replace-os-with-xs0052/1 

Problem Statement: Given a matrix mat of size N x M where every element is either 'O' or 'X'. Replace all 'O' or a group of 'O' with 'X' that are surrounded by 'X'.

A 'O' (or a set of 'O') is considered to be surrounded by 'X' if there are 'X' at locations just below, just above, just left and just right of it.

Solution Approach: The O's or the set of Os which are at the edges of matrix can not be made to X, so just apply DFS to these Os and make them Z's for some time,
then traverse the matrix again, and convert all the remaining Os to Xs and Zs back to Xs, this will be our answer.

*/

/* ------------CODE---------------- */
class Solution{
    static void dfs (int i, int j, int n, int m, char ans[][])
    {
        if(i >= n || i < 0 || j >= m || j < 0 || ans[i][j] != 'O')
            return;
            
        ans[i][j] = 'Z';
        
        int dx[] = new int[] {1, 0, -1, 0};
        int dy[] = new int[] {0, 1, 0, -1};
        
        for(int k=0; k<4; k++)
            dfs(i + dx[k], j + dy[k], n, m, ans);
    }
    
    static char[][] fill(int n, int m, char a[][])
    {
        char ans[][] = new char[n][m];
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
                ans[i][j] = a[i][j];
        }
        
        for(int i=0; i<m; i++)
        {
            if(ans[0][i] == 'O')
                dfs(0, i, n, m, ans);
            if(ans[n-1][i] == 'O')
                dfs(n-1, i, n, m, ans);
        }
        
        for(int i=0; i<n; i++)
        {
            if(ans[i][0] == 'O')
                dfs(i, 0, n, m, ans);
            if(ans[i][m-1] == 'O')
                dfs(i, m-1, n, m, ans);
        }
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(ans[i][j] == 'O')
                    ans[i][j] = 'X';
                else if(ans[i][j] == 'Z')
                    ans[i][j] = 'O';
            }
        }
        return ans;
    }
}

/*
Time Complexity: O(m*n)
Space Complexity: O(m*n)
*/
