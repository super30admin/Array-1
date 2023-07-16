Problem 1
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english: Took left running products and right running products and by multiplying them, we can get product of left and right neighbours.

// Your code here along with comments explaining your approach

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        rp = 1
        res = [0]*n
        res[0] = 1
        i = 1
        #left running product
        while(i<n):
            rp = rp*nums[i-1]
            res[i] = rp
            i+=1
        #right running product
        rp = 1
        i = n-2
        while(i>=0):
            rp = rp*nums[i+1]
            res[i] = res[i]*rp
            i-=1
        return res

  Problem 2
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english:  
  
// Your code here along with comments explaining your approach
