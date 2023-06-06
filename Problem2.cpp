/*

// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

First traverse the upward direction and then traverse the downward direction
For upward direction check the boundary condition either if j==n-1 or i==0
for downward direction check the boundary condition either if i==m-1 or j==0;

// Your code here along with comments explaining your approach

*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        //bool flag = true;
        int m{static_cast<int>(mat.size())};
        int n{static_cast<int>(mat.at(0).size())};
        vector<int> arr(m*n);
        int i{0},j{0},idx{};
        bool dir = true;// up
        while(idx<arr.size()){
            arr.at(idx++)=mat.at(i).at(j);
            cout<<mat.at(i).at(j)<<" ";
            if(dir){
                if(j==n-1){
                    ++i;
                    dir = false;
                }
                else if(i==0){
                    j++;
                    dir = false;
                }
                else{
                    --i;
                    ++j;
                }
            }
            else{
                if(i==m-1){
                    ++j;
                    dir = true;
                }
                else if(j==0){
                    ++i;
                    dir = true;
                }
                else{
                    ++i;
                    --j;
                }
            }
        }
        return arr;
    }
};