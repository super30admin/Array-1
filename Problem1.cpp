/*

// Time Complexity : O(N) for foward running pass and backward running pas
// Space Complexity : O(1) for running product in the backwawrd pass and forward pass.
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

Calculate the left running product of the given array of each element
Calculate the right running product of the given array of each element

then calculate the product of left and right array.

// Your code here along with comments explaining your approach

*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {

public:

    // void display(vector<int> &nums){
    //     for(auto i:nums){
    //         cout<<i<<" ";
    //     }
    //     cout<<endl;
    // }

    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> arr_1(n,1);
        //vector<int> arr_2(n,1);
        //vector<int> arr_3(n,1);

        for(int i{1};i<n;i++){
            arr_1.at(i) = arr_1.at(i-1) * nums.at(i-1);
        }
        int temp{1};
        for(int i{n-1};i>=0;i--){
            arr_1.at(i) = arr_1.at(i)*temp;
            temp = temp*nums.at(i);
        }

        //display(nums);display(arr_1);display(arr_2);display(arr_3);

        return arr_1;

    }
};