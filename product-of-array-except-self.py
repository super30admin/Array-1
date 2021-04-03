# Time Complexity : O(n), where n is the size of the array
# Space Complexity : O(1), since the space occupied by the output array doesn't count towards the space complexity
# continued: That is a requirement of the problem itself
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        arr = [1 for _ in range(len(nums))]

        # calculating product of elements to the left
        rp = 1

        for i in range(len(arr)):
            arr[i] = rp
            rp *= nums[i]

        # multiplying product of elements to the right with product of elements to the left
        rp = 1

        for i in range(len(arr) - 1, -1, -1):
            arr[i] = rp * arr[i]
            rp *= nums[i]

        return arr
