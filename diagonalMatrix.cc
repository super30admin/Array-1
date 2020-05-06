// Time Complexity : O(nm) - number of rows n and m columns.
// Space Complexity : O(1) - Did not use extra space.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& matrix) {
        if(matrix.size() == 0) return vector<int>();
        int row = 0; // starting row
        int col = 0; // starting column
        int direction = -1; // we start by going upwards
        vector<int> results;
        int trav = 0;
        while(trav < matrix.size() * matrix[0].size()){
            results.push_back(matrix[row][col]);
            if(direction == -1){ //upward traversal
                if(col == matrix[0].size() - 1){
                    direction = 1;
                    row++;
                }
                else if(row == 0){
                    direction = 1;
                    col++;
                }
                else{
                    row--;
                    col++;
                }
                
            }
            else{ //downward traversal
                if(row == matrix.size() - 1){
                    direction = -1;
                    col++;
                }
                else if(col == 0){
                    direction = -1;
                    row++;
                }
                else{
                    row++;
                    col--;
                }
            }
            trav++;
        }
        return results;
    }
        
};