//Time Complexity = O(M*N)
//Space Complexity = O(1)
//Here the Time complexity is O(1) because the extra space (vector<int> ans) which we are using is the same which we are returning.

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        int m=mat.size();
        int n=mat[0].size(),r=0,c=0,i=0,dir=1;
        vector<int> ans;
        while(i<m*n)
        {
            ans.push_back(mat[r][c]);
            if(dir)                                                     //when traversing bottom to top diagonally.
            {
                if(c==n-1)                                              //The order of if-else here matters a lot.
                {
                    r++;
                    dir=0;
                }
                else if(r==0){
                    c++;
                    dir=0;
                }
                else
                {
                    r--;
                    c++;
                }
            }
            else                                                         //when traversing top to bottom diagonally.
            {
                if(r==m-1){                                              //The order of if-else here matters a lot.
                    c++;
                    dir=1;
                }
                else if(c==0){
                    r++;
                    dir=1;
                }
                else{
                    r++;
                    c--;
                }
            }
            i++;
        }
        return ans;
    }
};
