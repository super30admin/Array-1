// Time Complexity : O(m*n) m->number of rows n-> number of cols)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        
        int m = mat.size();
        int n = mat[0].size();
        
        vector<int> result(m*n,0);
        int k=0;
        int i=0;
        int j=0;
        int dir = 1;
        
        while(k<m*n){
        
        result[k]=mat[i][j];
        k++;
	//for upward direction
        if(dir==1){
            if(j==(n-1)){ // if col reaches n-1th col
                i++;dir=-1;
            }else if(i==0){ //if row reached 0th row
                j++;dir=-1;
            }else{
                i--;j++;
            }
        }else { //for downward direction
            if(i==(m-1)){ // if row reaches m-1th row
                j++;dir=1;
            }else if(j==0){ // if col reached -th col
                i++;dir=1;
            }else{
                j--;i++;
            }
        }    
        }
        return result;
    }
};


