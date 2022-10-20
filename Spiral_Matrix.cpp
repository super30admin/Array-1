/*
Time Complexity: O(m*n)
Space Complexity: O(m*n)
Did this code successfully run on Leetcode :yes
Any problem you faced while coding this : no
*/
class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> ans;
        int m = matrix.size(), n = matrix[0].size();
        int rs = 0, re = m-1, cs = 0, ce = n-1;
        
        while(ans.size()!=m*n){
            //right
            for(int i = cs; i<= ce; i++){
                ans.push_back(matrix[rs][i]);
            } rs++;
            //down
            for(int j = rs; j<=re; j++){
                ans.push_back(matrix[j][ce]);
            } ce--;
            //left
            if(rs<=re){
            for(int i = ce; i>=cs; i--){
                ans.push_back(matrix[re][i]);
            } re--;
            }
            //up
            if(cs<=ce){
            for(int j = re; j>=rs;j--){
                ans.push_back(matrix[j][cs]);
            } cs++;
            }
        }
        return ans;
    }
};