#include<iostream>
#include<vector>
#include <math.h> 
using namespace std;
// Time Complexity : O(N) for Both Approaches
// Space Complexity : O(N) for Approach1 ,O(1) for Approach 2
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
vector<int> productExceptSelf(vector<int>& nums) {
    int size = nums.size();
    vector<int> output(size);
    vector<int> left(size);
    vector<int> right(size);

    left[0] =1;
    for(int i = 1; i < size; i++){
        left[i] = left[i -1] * nums[i - 1];
    }
    right[size - 1] =1;
    for(int i = size - 2; i >= 0; i--){
        right[i] = right[i + 1] * nums[i + 1];
    }
    for(int i =0; i < size; i++){
        output[i] = left[i] * right[i];
    }
    return output;

}

vector<int> productExceptSelf2(vector<int> & nums){
       int size = nums.size();
        vector<int> output(size,1);
        int temp = 1;
        for(int i =0; i < size; i++){
            output[i] = temp;
            temp = temp * nums[i];
        } 
        temp = 1;
        for(int i = size - 1; i >= 0; i--){
            output[i] *= temp;
            temp *= nums[i];
        }
        return output;
}

vector<int> productExceptSelf3(vector<int>& nums) {
          int size = nums.size();
        vector<int> output(size,1);
        int temp = 1,rp =1;
        for(int i =0; i < size; i++){
            rp = rp * temp;
            output[i] = rp;
            temp = nums[i];
        } 
        temp = 1;
        rp = 1;
        for(int i = size - 1; i >= 0; i--){
            rp =  rp * temp;
            output[i] =  output[i] * rp;
            temp = nums[i];
        }
        return output;
    }

int main(){
    vector<int> arr;
    arr.push_back(1);
    arr.push_back(2);
    arr.push_back(3);
    arr.push_back(4);

    vector<int> out = productExceptSelf(arr);
    for(int i=0; i < out.size(); i++){
        cout<<out[i]<<endl;
    } 
    out = productExceptSelf2(arr);
    for(int i=0; i < out.size(); i++){
        cout<<out[i]<<endl;
    } 
    out = productExceptSelf3(arr);
    for(int i=0; i < out.size(); i++){
        cout<<out[i]<<endl;
    } 
    return 0;
}