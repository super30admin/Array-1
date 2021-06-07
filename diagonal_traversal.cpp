// Time Complexity : O(n)
// Space Complexity :  O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this - 

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        
        int m = mat.size();
        int n = mat[0].size();
        vector<int> ret_vect;
        int i = 0; 
        int j = 0;
        
        while( !(i == m-1 && j == n-1) )
        {
            // Upward, Rightward Traversal
            while(i >= 0 && j < n)
            {
                ret_vect.push_back(mat[i][j]);
                i -= 1;
                j += 1;
            }            
            i += 1; j -= 1;
            
            //Update the iterators
            if(j < n-1)
                j++;
            else if(i < m-1)
                i++;
            

            // Downward, Leftward Traversal
            while(i < m && j >= 0)
            {
                ret_vect.push_back(mat[i][j]);
                i += 1;
                j -= 1;
            }
            
            i -= 1; j += 1;
            
            //Update the iterators
            if(i < m-1)
                i++;
            else if(j < n-1)
                j++;
        }

        // Add the Last remaining element 
        if(ret_vect.size() < (m*n))
            ret_vect.push_back(mat[m-1][n-1]);
        
        return ret_vect;
    }
};