// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if nums==None or len(nums)==0 :
              return[]
        left=[]

        temp=1
        for i in nums:            //compute left product
            left.append(temp)
            temp*=i

        temp=1
        for i in range(len(nums)-1,-1,-1):        //multiply right product to left product to find total product
            left[i]*=temp
            temp= temp*nums[i]

        return left
        
