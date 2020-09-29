//time complexity:O(n)
//space complexity:O(n)
//executed on leetcode: yes
//approach:using hashmap
//any issues faced? no
class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int>res;
        if(matrix.size()==0)
            return res;
        int t=0;
        int l=0;
        int b=matrix.size()-1;
        int r=matrix[0].size()-1;
        int s=matrix.size()*matrix[0].size();
        while(res.size() < s)
        {
            for(int i=l; i<=r && res.size() < s; i++)
                res.push_back(matrix[t][i]);
            t++;
            for(int i=t; i<=b && res.size() < s; i++)
                res.push_back(matrix[i][r]);
            r--;
            for(int i=r; i>=l && res.size() < s; i--)
                res.push_back(matrix[b][i]);
            b--;
            for(int i=b; i>=t && res.size() < s; i--)
                res.push_back(matrix[i][l]);
            l++;
        }
        return res;
    }
};