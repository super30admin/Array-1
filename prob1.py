#  Time Complexity : O(n)
# Space Complexity :O(1)
# Leet Code: Yes

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        lp = 1
        n = len(nums)
        # initialize array
        arr = [None for _ in range(n)]
        arr[0] = 1

        # do left product
        for i in range(1, n):
            lp *= nums[i-1]
            arr[i] = lp

        #do right product and save the output in the arr
        rp = 1
        for i in range(n-2, -1, -1):
            rp *= nums[i+1]
            arr[i] *= rp

        return arr


