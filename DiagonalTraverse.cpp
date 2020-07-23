// Time Complexity : O(M*N) where N=Number of anagrams each having length K
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& matrix) {

        vector<int> res;
        if(matrix.size()==0)
            return res;
        int dir = 1,r=0,c=0;
        int m= matrix.size(),n=matrix[0].size();
        int i=0;

        while(i<m*n)
        {
            res.push_back(matrix[r][c]);
            if(dir==1)
            {
                if(c==n-1)
                {
                    dir = -1;
                    r++;
                }
                else if(r==0){
                    dir = -1;
                    c++;
                }

                else{
                    r--;
                    c++;
                }
            }
            else
            {
              if(r==m-1)
                {
                    c++;
                    dir = 1;
                }
                else if(c==0)
                {
                    dir = 1;
                    r++;
                }
                else{
                    r++;
                    c--;
                }
            }
            i++;
        }
        return res;
    }
};
