// Time Complexity : O(n)
// Space Complexity : O(1) no extra space used result array isn't counted
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Diagonal Traverse

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        
        vector<int> result;
        int r = 0;
        int c = 0;
        int m = mat.size() - 1;
        int n = mat[0].size() - 1;
        int total = mat.size() * mat[0].size();
        int dir = 1;        // upwards initially
        
        for(int i = 0; i < total; i++){
            result.push_back(mat[r][c]);
            if(dir == 1){
                if(c == n){
                    r++;        // move down and change dir
                    dir = -1;
                }
                else if(r == 0){
                    c++;
                    dir = -1;
                }
                else{
                    r--;
                    c++;
                }
            }
            
            else {
                if(r == m){
                    c++;
                    dir = 1;
                }
                else if(c == 0){
                    r++;
                    dir = 1;
                }
                else{
                    r++;
                    c--;
                }
            }
        }
        
        return result;
    }
};