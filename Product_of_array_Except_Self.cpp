#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    //Time Complexity - O(N), N= size of input array
    //Space Complexity - O(N), N= size of input array
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> productVector(nums.size(),1);
        vector<int> rightProductVector(nums.size(),1);
        
        for(int i=1;i<nums.size();i++){
            productVector[i]=productVector[i-1]*nums[i-1];
        }
        
        productVector[nums.size()-1]*=rightProductVector[nums.size()-1];
        
        for(int i=nums.size()-2;i>=0;i--){
            rightProductVector[i]=rightProductVector[i+1]*(nums[i+1]);
            productVector[i]*=rightProductVector[i];
        }
        
        return productVector;
    }
    
    //Time Complexity - O(N), N= size of input array
    //Space Complexity - O(1)
    
    vector<int> productExceptSelf1(vector<int>& nums) {
           vector<int> productVector(nums.size(),1);
            
            for(int i=1;i<nums.size();i++){
                productVector[i]=productVector[i-1]*nums[i-1];
            }
         
            int temp=1;
            productVector[nums.size()-1]*=temp;
            for(int i=nums.size()-2;i>=0;i--){
                temp=nums[i+1]*temp;
                productVector[i]*=temp;
            }
            return productVector;
        }
};

int main(int argc, const char * argv[]) {
    Solution s;
    vector<int> nums{1,2,3,4};
    vector<int> output,output1;
    output=s.productExceptSelf(nums);
    output1=s.productExceptSelf1(nums);
    for(int i:output){
        cout<<i<<"\t";
    }
    cout<<endl;
    for(int i:output1){
        cout<<i<<"\t";
    }
     cout<<endl;
    return 0;
}
