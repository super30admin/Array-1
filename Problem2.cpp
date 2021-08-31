// Diagonal Traverse


// Time Complexity : O(m*n) 
// Space Complexity : O(1) // we only consider auxillary data structures 
// Did this code successfully run on Leetcode : Yes.
// Any problem you faced while coding this : Slight confusion but nothing too problematic


// Your code here along with comments explaining your approach
class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        int m = mat.size();
        int n = mat[0].size();
        vector<int> result(m*n);   // creating a result array of size m*n
        int dir = 1;   // while going upward direction is taken as 1 and while going downward it is taken as -1
        int r = 0, c=0, i =0;   
        while(i<(m*n))
        {
            result[i] = mat[r][c];
            i++;
            
            if(dir == 1)    // while going upward
            {
                if(c == (n-1)){      // if it is the last column
                    
                    r++;   // WE go to the next row
                    dir = -1;
                }
                else if(r == 0){
                    
                    c++;        // if it is the first row we go to the next column
                    dir = -1;
                }
                else{
                    
                    r--;   // normal case
                    c++;
                }
                
                
            }
            else{ // same as above, vice versa
                if(r == (m-1)){
                   
                    c++;
                    dir = 1;
                }
                else if(c == 0){
                   
                    r++;
                    dir = 1;
                }
                else{
                   
                    c--;
                    r++;
                }
                
                
                
            }
        }
        return result;  // return the resultant array
        
    }
};

#include<bits/stdc++.h>
using namespace std;

// int main(){
    
//     return 0;
// }