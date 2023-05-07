// Executed on leetcode : yes
// TC:O(m*n) SC:O(1)
// Aprroach is to maintain 4 pointers for tecaking the direction top bottom left and right 
// and moving accordingly, while condition is important at each step as we are incrementing pointers within the
// loop ,trying to implement that condition at each point maintain the




class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int m=matrix.size();
        int n=matrix[0].size();
        vector<int>ans;
        int top=0;
        int bottom=m-1;
        int left =0;
        int right=n-1;

        while(top<=bottom && left<=right)
        {
             for(int i=left;i<=right;i++)
             {
                 ans.push_back(matrix[top][i]);
             }
             top++;

             for(int i=top;i<=bottom;i++)
             {
                 ans.push_back(matrix[i][right]);
             }
             right--;
            //  check
             if(top<=bottom)
             {
                for(int i=right;i>=left;i--)
                {
                    ans.push_back(matrix[bottom][i]);
                }
                bottom--;
             }
            //   check
             if(left<=right)
             {
                for(int i=bottom;i>=top;i--)
                {
                    ans.push_back(matrix[i][left]);
                }
                left++;
             }
        }
        return ans;
        
    }
};