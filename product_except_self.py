# Time Complexity : O(n) because we are traversing the array twice separetely
# Space Complexity : O(1) because we are not using any extra space
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
"""
In this code we create the answer array by putting in the right of the element and then 
we traverse the array from the right to multiply the elements on the left.
"""


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        answer = [1 for i in range(len(nums))]

        temp = 1
        for index in range(len(nums)):
            answer[index] = temp
            temp = temp * nums[index]
        
        temp = 1
        for index in range(len(nums)-1, -1, -1):
            answer[index] = answer[index] * temp
            temp = temp * nums[index]

        return answer
