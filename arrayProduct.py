# Time Complexity: O(N) ,N = number of elements in array
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english: result[i] stores elements to the left of the target index.
# Product of all elements to the right and left are calculated and the answer array is updated.


class Solution:
    def productExceptSelf(self, nums: [int]):
        # edge case
        if nums == 0 or len(nums) == 0:
            return new[0]
        result = [0] * len(nums)

        # left
        result[0] = 1
        for i in range(1, len(nums)):
            result[i] = nums[i - 1] * result[i - 1]

        # right
        right = 1
        length = len(nums)
        for i in reversed(range(length)):
            result[i] = result[i] * right
            right *= nums[i]

        return result


r = Solution()
a = [1, 2, 3, 4]
print(r.productExceptSelf(a))