# Author: Naveen US
# Titile: Product except self.

# Time complexity: O(n)
# Space complexity: O(1)
# Did the code run on leetcode: Yes

# The product except self can be treated as the product of product of elements to the right of the element and the product of elements to the left 
# of the elements. We first find the left products of all the elements then find their right product and multply them to get the result.


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
      rp,result=1,[1 for i in range(len(nums))]
      # Left pass
      for i in range(1,len(nums)): # Miss the first element
          rp=rp*nums[i-1]
          result[i]=(rp)
      # Right pass 
      rp=1
      for i in range(len(nums)-2,-1,-1): # Miss the last element 
          rp=rp*nums[i+1]
          result[i]=result[i]*rp
      return result
