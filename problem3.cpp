// Time Complexity : O(n)
// Space Complexity : O(1) as output array doesnot count as extra space.
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// We need to traverse in 4 directions , so  dir are 1,2,3,4. 
// we should update each time rL,rH,cL,cH as well along with changing the direction.


class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();
        vector<int>v;
        int rL = 1,rH = m-1, cL = 0, cH = n-1;
        int dir = 1;//1 for right, 2 for down , 3 for left, 4 for up
        int r=0,c=0;
        while(v.size() < m*n)
        {
            v.push_back(matrix[r][c]);
            if(dir==1){
                if(c==cH){
                    dir = 2;
                    r++;
                    cH--;
                }
                else{
                    c++;
                }
            }
            else if(dir == 2){
                if(r == rH){
                    dir = 3;
                    c--;
                    rH--;
                }
                else{
                    r++;
                }
            }
            else if(dir == 3){
                if(c == cL){
                    dir = 4;
                    r--;
                    cL++;
                }
                else{
                    c--;
                }
            }
            else{
                if(r == rL){
                    dir = 1;
                    c++;
                    rL++;
                }
                else{
                    r--;
                }
            }
        }
        return v;
    }
};