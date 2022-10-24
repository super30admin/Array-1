// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();
        vector<int> ret;
        
        int rs = 0, re = m-1;
        int cs = 0, ce = n-1;
        
        //general dir - R D L U
        
        while(ret.size() != m * n) {
        
            //R - fix rs
            for (int i = cs; i <= ce; i++) {
                ret.push_back(matrix[rs][i]);
            }
            ++rs;
            
           //D - fix ce
            for(int j = rs; j <= re; j++) {
                ret.push_back(matrix[j][ce]);
            }
            --ce;
            
            //L - fix re
            if (rs <= re) {
                for(int i = ce; i >= cs; i--) {
                    ret.push_back(matrix[re][i]);
                }
                --re;
            }    
            
            //U - fix cs
            if (cs <= ce) {
                for (int j = re; j >= rs; j--) {
                    ret.push_back(matrix[j][cs]);
                }
                cs++;
            }
        }
        
        return ret;
    }
};
