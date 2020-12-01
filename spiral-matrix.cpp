//Time complexity - O(nm)
//Space complexity - O(nm)

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int r = matrix.size();
        vector<int> ret;
        if(r==0) return ret;
        int c = matrix[0].size();
        
        vector<vector<int>> dir = {{0,1},{1,0},{0,-1},{-1,0}};
        
        vector<int> steps = {c,r-1};
        int idr = 0,ir = 0, ic = -1;
        while(steps[idr%2]){
            for(int i=0;i<steps[idr%2];i++){
                ir += dir[idr][0];
                ic += dir[idr][1]; 
                
                ret.push_back(matrix[ir][ic]);
            }        
            
            steps[idr%2]--;
            idr = (idr+1)%4;
        }
        
        return ret;
        
    }
};