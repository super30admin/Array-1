// Time Complexity : O(m*n), where m is number of rows and n is number of cols.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES 
class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& matrix) {
        if(matrix.size()==0){
            return {};
        }
        int row_size = matrix.size();
        int col_size = matrix.at(0).size();
        int i=0;
        int r=0;
        int c=0;
        int dir = 1;  //UP. 0 is DOWN.
        vector<int> result;
        while(i<row_size*col_size){
            result.push_back(matrix.at(r).at(c));
            if(dir == 1){
                if(c==col_size-1){
                    dir = 0;
                    r++;
                }
                else if(r == 0){
                    dir = 0;
                    c++;
                }
                else{
                    c++;
                    r--;
                }
            }
            else{
                if(r==row_size-1){
                    dir = 1;
                    c++;
                }
                else if(c == 0){
                    dir = 1;
                    r++;
                }
                else{
                    c--;
                    r++;
                }
            }
            i++;
        }
        return result;
    }
};