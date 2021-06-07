# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Calculating product first and keeping track of zeros if zeros cross one then everything will be zero else everything will be zero
# except for the valuje zero element
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        zero = 0
        prod = 1
        for i in range(len(nums)):
            if nums[i] != 0:
                prod *= nums[i]
            else:
                zero += 1
        for i in range(len(nums)):
            if nums[i] != 0:
                if zero == 0:
                    nums[i] = prod // nums[i]
                else:
                    nums[i] = 0
            else:
                if zero == 1:
                    nums[i] = prod
                else:
                    nums[i] = 0
        return nums
            
        