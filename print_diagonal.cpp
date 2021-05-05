// Time complexity-O(n*m)
// space complexity O(1);
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

// We can choose a directions flag to determine which direction we are moving. Up = 1 and down = -1
// When we are moving up.
// If we overshoot the array from last column then we should change direction and increase row.
// If we overshoot the array from first column then we should change direction and increase. Then we need to increase columns. However its a common mistake if we make a check on row == 0 before column == last. In that case we will end up increasing column by 1 and it might end up taking us to last column.
// If we are not overshooting then simply increase column by 1 and decrease row by 1.
// Repeat the similar algo when we are moving down. i.r dir = -1


using namespace std;
#include <vector>
#include <iostream> 
class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& matrix) {
        if( matrix.size() == 0) return {};
       int m = matrix.size();
       int n = matrix[0].size();
      
        vector<int>result;
        result.resize(m*n);
       int r = 0, c = 0;
       int i = 0;
       int dir = 1;
       while(i < m*n){
           result[i] = matrix[r][c];
           if(dir == 1){ 
               if(c==n-1) {
                   r++;
                   dir = -1;
               } else if (r==0) { 
			   //common mistake if r == 0 is checked before c== n-1
                   c++;
                   dir = -1;
               } else{
                   r--; 
                   c++;
               }
           } else {
               if(r == m-1) {
                   c++;
                   dir = 1;
               } else if(c==0) {
                   r++;
                   dir = 1;
               } else {
                   r++; c--;
               }
           }
           i++;
       }
       return result;
    }
};