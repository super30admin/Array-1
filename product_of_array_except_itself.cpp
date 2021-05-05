// Time complexity-O(n)
// space complexity O(n);
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


// create an array to store all the products to the left of the elements of that index
// create an array to store all the products to the right of the elements of that index
// multiply both arrays together  to get the result.


using namespace std;
#include <vector>
#include <iostream> 
#include <unordered_map> 

// 2 4 5-  1    1
vector<int> product(vector<int>nums){
    vector<int>left_products;
    vector<int>right_products;
    vector<int>result;
    int n =nums.size()-1;
    left_products[0]=1;
    right_products[n-1]= 1;
   // multiply all numbers to the left
   for (size_t i = 1; i < nums.size(); i++)
   {
       
       left_products[i]= nums[i-1] * left_products[i-1];
   }

   // multiply all numbers to the right
   
    for (size_t i = nums.size()-2; i >= 0; i--)
   {
       
       right_products[i]= nums[i+1] * right_products[i+1];
   }
   for (size_t i = 0; i < result.size(); i++)
   {
       result[i]= left_products[i ]* right_products[i];
   }
//** ************************************************************************************************************************//
   // to this in constant space 
   // replace the left product with result 
   // use a variable to represent right product
   // multiply the variable with result array at each position
//      for (size_t i = 1; i < nums.size(); i++)
//    {
       
//       result[i]= nums[i-1] * result[i-1];
//    }
//     int r=1;
//     for (size_t i = nums.size()-1; i >= 0; i--)
//    {
       
//        result[i]=result[i] * r;
//        r=r* nums[i];
//    }

   

     return result;
 
 }





int main(){

 
    return 0;
}