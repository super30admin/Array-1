# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Calculating product first and keeping track of zeros if zeros cross one then everything will be zero else everything will be zero
# except for the valuje zero element
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if len(nums) <= 1:
            return nums
        left  = [1]*len(nums)
        right = [1]*len(nums)

        for i in range(1,len(nums)):
            left[i] = nums[i-1]*left[i-1]
        for i in range(len(nums)-2,-1,-1):
            right[i] = nums[i+1]*right[i+1]
        
        left = left * right

        return left

a = Solution()
print(a.productExceptSelf([1,2,3,4,5,6]))
        