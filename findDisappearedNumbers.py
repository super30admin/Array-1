# Time Complexity : O(n), where n is the length of the input array
# Space Complexity : O(1), ignoring the output list (modifies input in-place)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach

class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        # Mark the index corresponding to each number as negative
        for num in nums:
            index = abs(num) - 1
            nums[index] = -abs(nums[index])

        # Indices with positive values indicate missing numbers
        result = []
        for i in range(len(nums)):
            if nums[i] > 0:
                result.append(i + 1)

        return result
