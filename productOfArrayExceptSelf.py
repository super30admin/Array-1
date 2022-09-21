#Time complexity: O(n)
#Space complexity: O(n)
#Did it run on Leetcode: Yes

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        left = []
        right = []
        leftprod = 1
        rightprod = 1
        for ele in nums:
            leftprod = leftprod*ele
            left.append(leftprod)
        index = len(nums) - 1
        while index >= 0:
            rightprod = rightprod*nums[index]
            right.append(rightprod)
            index -= 1
        right = right[::-1]
        result = []
        for index in range(len(nums)):
            if index - 1 < 0 and index + 1 == len(nums):
                result.append(1)
            elif index - 1 < 0:
                result.append(right[index+ 1])
            elif index+ 1 == len(nums):
                result.append(left[index - 1])
            else:
                result.append(left[index-1]*right[index + 1])
        return result