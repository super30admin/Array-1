#include<iostream>
#include<bits/stdc++.h>
#include<vector>
using namespace std;
/*
We use four boundaries: top, bottom, left, right to keep track of the spiral path.
At each step, we traverse right, down, left, then up while shrinking the boundaries.
We stop when the boundaries cross each other.
*/
class Solution{
public:
    //TC: O(row*col) , SC: O(1)
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> ans;
        int row=matrix.size();
        int col = matrix[0].size();

        int top=0,bottom=row-1, left=0, right=col-1;

        while(top<=bottom && left<=right){

            for(int i=left;i<=right;i++){
                ans.push_back(matrix[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                ans.push_back(matrix[i][right]);
            }
            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.push_back(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.push_back(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
};
