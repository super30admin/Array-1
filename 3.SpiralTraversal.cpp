// Time Complexity : o(m*n)
// Space Complexity : o(n) for storing answer
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& nums) {
        int n = nums.size();
        int m = nums[0].size();
        int count = n*m;
        
        vector<int> ans;
        int sr=0,sc=0,er=n-1,ec=m-1;
        while(count > 0) {
            for(int i=sc;i<=ec;i++) {
                ans.push_back(nums[sr][i]);
                count--;
            }
            sr++;
            if(count>0) {
                for(int i=sr;i<=er;i++) {
                    ans.push_back(nums[i][ec]);
                    count--;
                }
                ec--;
            }
            
            if(count>0) {
                for(int i=ec;i>=sc;i--) {
                    ans.push_back(nums[er][i]);
                    count--;
                }
                er--;
            }
            
            if(count>0) {
                for(int i=er;i>=sr;i--) {
                    ans.push_back(nums[i][sc]);
                    count--;
                }
                sc++;
            }
        }
        return ans;
    }
};