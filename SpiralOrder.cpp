// Time Complexity : O(M*N) where N=Number of anagrams each having length K
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> res;
        if(matrix.size()==0)
            return res;
        int m=matrix.size(),n=matrix[0].size();
        int left =0,right =n-1;
        int top = 0, bottom =m-1;

       while(left<=right && top<=bottom){
               for(int i=left;i<=right;i++)
               {
                   res.push_back(matrix[top][i]);
               }
            top++;
           if(left<=right)
           {
               for(int i=top;i<=bottom;i++)
               {
                   res.push_back(matrix[i][right]);
               }
               right--;
           }
           if(top<=bottom)
           {
               for(int i=right;i>=left;i--)
               {
                   res.push_back(matrix[bottom][i]);
               }
               bottom--;
           }
           if(left<=right)
           {
               for(int i=bottom;i>=top;i--)
               {
                   res.push_back(matrix[i][left]);
               }
               left++;
           }

           }
        return res;
       }
};
