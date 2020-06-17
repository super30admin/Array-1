// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& matrix) {
        vector<int> res;
        if(matrix.size()==0) return res;
        int i=0;//row
        int j=0;//column
        int dir=1;
        while(i<matrix.size() && j<matrix[0].size()){
            res.push_back(matrix[i][j]);
            if(dir==1){
                if(j==matrix[0].size()-1){
                    dir=-1;
                    i++;
                }
                else if(i==0){
                    dir=-1;
                    j++;
                }
                else{
                    i--;
                    j++;
                }
                
            }
            else if(dir==-1){
                if(i==matrix.size()-1){
                    dir=1;
                    j++;
                }
                else if(j==0){
                    dir=1;
                    i++;
                }
                else{
                    i++;
                    j--;
                }
            }
        }
        
        return res;
    }
};
