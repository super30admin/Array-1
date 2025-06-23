# Time Complexity : O(n) n-> length of input array
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english:
# 1. In first pass I am calculating the prefix product for each element (product of all elements to the left).
# 2. In second pass from the right multiplies each element with the suffix product (product of all elements to the right).
# 3. The result is the product of all elements except the one at the current index.

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        length = len(nums)
        answer = [0] * length
        answer[0] = 1

        for i in range(1, length):
            answer[i] = nums[i-1] * answer[i-1]

        R = 1
        for i in reversed(range(length)):
            answer[i] = answer[i] * R
            R *= nums[i]
        return answer