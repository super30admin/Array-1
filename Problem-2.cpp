// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english
class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {

        //rows
        int n = mat.size();

        //columns
        int m = mat[0].size();

        vector<int> vect(m*n);

        int r=0, c=0;
        bool flag = true;

        for(int idx = 0; idx < vect.size(); idx++) {

            vect[idx] = mat[r][c];
            //up direction
            if(flag) {
                if(c == m-1){
                    flag = false;
                    r++;
                }else if(r==0){
                    flag = false;
                    c++;
                }else{
                    r--; c++;
                }
            }else { //down

                if(r == n-1){
                    flag = true;
                    c++;
                }else if(c==0){
                    flag = true;
                    r++;
                }else{
                    r++; c--;
                }
            }
        }

        return vect;
        
    }
};