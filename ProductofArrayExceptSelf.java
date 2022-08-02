// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
    int n=nums.length;
    //we initiate a new array for storing the result.
    int[] answer=new int[n];
        
    //we traverse through from left to right first(during which it calculates the sum of the left elements from the particular element in the array)

    answer[0]=1;
      for(int i=1;i<n;i++){
          answer[i]=answer[i-1]*nums[i-1];
      } 
        
    // As we already have corresponding left sums of all the elements in the result array, now we create a variable r. r calculates and stores the sum of all the right elements of the array
    int r=1;
      for(int i=n-1;i>=0;i--){
          //here we mutiply the result array which contains left sum with the variable r , which is storing the corresponding right sums of the particular element in the loop.
          answer[i]=answer[i]*r;
          r*=nums[i];
      }  
    //Now we get the product of left sum and right sum using O(1) space compelxity.
      return answer;   
    }
}