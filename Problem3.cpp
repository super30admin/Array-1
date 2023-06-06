/*

// Time Complexity : O(m*n) - > number of rows * number of columns
// Space Complexity : O(1) -> no auxillary space
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

We will take 4 pointers for spiral that define our intial boundary cordinates.
for top row we will go from left to right , and then increment top
for right column we will go from top to bottom and then decrement right
for bottom column we will go from right to left and then decrement bottom 
for left column we will go from bottom to top and the increment left

All of these will be applied only untill the range m*n is not exceeded.

// Your code here along with comments explaining your approach

*/





#include<iostream>
#include<vector>

using namespace std;


class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int m{static_cast<int>(matrix.size())};
        int n{static_cast<int>(matrix.at(0).size())};
        vector<int> arr(m*n);

        int left{0},right{n-1},top{0},bottom{m-1},idx{0};

        while(idx<(m*n)){
            //top
            for(int i{left};i<=right;i++){
                arr.at(idx++) = matrix.at(top).at(i);
            }
            ++top;

            if(idx >= (m*n)) return arr;

            //right
            for(int i{top};i<=bottom;i++){
                arr.at(idx++) = matrix.at(i).at(right);
            }
            --right;

            if(idx >= (m*n)) return arr;

            //bottom
            for(int i{right};i>=left;i--){
                arr.at(idx++) = matrix.at(bottom).at(i);
            }

            bottom--;

            if(idx >= (m*n)) return arr;

            //left
            for(int i{bottom};i>=top;i--){
                arr.at(idx++) = matrix.at(i).at(left);
            }
            ++left;
        }

        return arr;

    }
};