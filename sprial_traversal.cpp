// Time Complexity : O(n)
// Space Complexity :  O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this - 

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        
        int i = 0;
        int j = 0;
        vector<int> ret_vect;
        
        int m = matrix.size();
        int n = matrix[0].size();
        
        int mb = n; // Top Right End
        int nr = m; // Bottom Right End
        int nl = 0; // Bottom Left End
        int mt = 1; // Top Left End
        
        // The above pointers get updated with every iteration

        while( !((i == m/2) && (j == n/2)) )
        {
            // --->
            while(j < mb)
            {
                ret_vect.push_back(matrix[i][j]);
                j++;
            }
            j--; i++;
            mb -= 1;
            
            if(ret_vect.size() == m*n)
                break;
            
            // |
            // |
            // V Traversal
            while(i < nr)
            {
                ret_vect.push_back(matrix[i][j]);
                i++;
            }
            i--; j--;
            nr -= 1;

            if(ret_vect.size() == m*n)
                break;
        
            // <--- Traversal
            while(j >= nl)
            {
                ret_vect.push_back(matrix[i][j]);
                j--;
            }
            j++; i--;
            nl += 1;
            
            // ^
            // |
            // | Traversal
            if(ret_vect.size() == m*n)
                break;
            
            while(i >= mt)
            {
                ret_vect.push_back(matrix[i][j]);
                i--;
            }
            i++; j++;
            mt += 1;
            
            if(ret_vect.size() == m*n)
                break;
        }
        
        // Remaining element case
        if(ret_vect.size() < m*n)
        {
            ret_vect.push_back(matrix[(m/2)][(n/2)]);
        }
        
        return ret_vect;
    }
};