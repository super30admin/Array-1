# Time complexity : O(n)
# Space complexity : O(1)

# The code ran on Leetcode

# Initialize an output array with 1s. Iterate over the input array once to get product of all elements to the left of 
# a current element in the array. Then iterate over the array again to get product of elements to the right.

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        # Output array
        n = len(nums)
        res = [1]* n

        # Product of element sto the left of index i
        rp = nums[0]
        for i in range(1, n):
            cur = nums[i]
            res[i] = rp
            rp *= cur

        # Product of elements to the right of element at index i
        rp = nums[-1]
        for i in range(n-2, -1, -1):
            cur = nums[i]
            res[i]*=rp
            rp*=cur
        return res